/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectTC.Analizador;

/**
 *
 * @author joshg
 */
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageViewerClass extends JPanel {
    protected final AffineTransform zoomTransform = new AffineTransform();
    protected transient Image img = null;
    protected Rectangle imgrect; 
    protected transient ZoomHandler handler;
    protected transient DragScrollListener listener;

    protected ImageViewerClass() {
        super();
        setPreferredSize(new Dimension(1110, 619));
        setMinimumSize(new Dimension(1110, 619));
        
        try {
            //img = ImageIO.read(getClass().getResource("arbol.png"));
            img = ImageIO.read(new File("arbol.png"));
            
        } catch (IOException ex) {
            
        }
        this.imgrect = new Rectangle(img.getWidth(this), img.getHeight(this));
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(img, zoomTransform, this);
        g2.dispose();
    }

    @Override 
    public Dimension getPreferredSize() {
        Rectangle r = zoomTransform.createTransformedShape(imgrect).getBounds();
        return new Dimension(r.width, r.height);
    }

    @Override 
    public void updateUI() {
        removeMouseListener(listener);
        removeMouseMotionListener(listener);
        removeMouseWheelListener(handler);
        super.updateUI();
        listener = new DragScrollListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
        handler = new ZoomHandler();
        addMouseWheelListener(handler);
    }

    protected class ZoomHandler extends MouseAdapter {
        private static final double ZOOM_MULTIPLICATION_FACTOR = 1.2;
        private static final int MIN_ZOOM = -10;
        private static final int MAX_ZOOM = 10;
        private static final int EXTENT = 1;
        private final BoundedRangeModel zoomRange = new DefaultBoundedRangeModel(0, EXTENT, MIN_ZOOM, MAX_ZOOM + EXTENT);

        @Override 
        public void mouseWheelMoved(MouseWheelEvent e) {
            int dir = e.getWheelRotation();
            int z = zoomRange.getValue();
            zoomRange.setValue(z + EXTENT * (dir > 0 ? -1 : 1));
            if (z != zoomRange.getValue()) {
                Component c = e.getComponent();
                Container p = SwingUtilities.getAncestorOfClass(JViewport.class, c);
                if (p instanceof JViewport) {
                    JViewport vport = (JViewport) p;
                    Rectangle ovr = vport.getViewRect();
                    double s = dir > 0 ? 1d / ZOOM_MULTIPLICATION_FACTOR : ZOOM_MULTIPLICATION_FACTOR;
                    zoomTransform.scale(s, s);
                    // double s = 1d + zoomRange.getValue() * .1;
                    // zoomTransform.setToScale(s, s);
                    Rectangle nvr = AffineTransform.getScaleInstance(s, s).createTransformedShape(ovr).getBounds();
                    Point vp = nvr.getLocation();
                    vp.translate((nvr.width - ovr.width) / 2, (nvr.height - ovr.height) / 2);
                    vport.setViewPosition(vp);
                    c.revalidate();
                    c.repaint();
                }
            }
        }
    }
}

class DragScrollListener extends MouseAdapter {
    private final Cursor defCursor = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
    private final Cursor hndCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
    private final Point pp = new Point();

    @Override 
    public void mouseDragged(MouseEvent e) {
        Component c = e.getComponent();
        Container p = SwingUtilities.getUnwrappedParent(c);
        if (p instanceof JViewport) {
            JViewport vport = (JViewport) p;
            Point cp = SwingUtilities.convertPoint(c, e.getPoint(), vport);
            Point vp = vport.getViewPosition();
            vp.translate(pp.x - cp.x, pp.y - cp.y);
            ((JComponent) c).scrollRectToVisible(new Rectangle(vp, vport.getSize()));
            pp.setLocation(cp);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Component c = e.getComponent();
        c.setCursor(hndCursor);
        Container p = SwingUtilities.getUnwrappedParent(c);
        if (p instanceof JViewport) {
            JViewport vport = (JViewport) p;
            Point cp = SwingUtilities.convertPoint(c, e.getPoint(), vport);
            pp.setLocation(cp);
        }
    }

    @Override 
    public void mouseReleased(MouseEvent e) {
        e.getComponent().setCursor(defCursor);
    }
}