/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectTC;

import ProjectTC.Ayuda.lector_pdf;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author jess23
 */
public class MainClass {
    private static lector_pdf LexicoPDF;
    private static lector_pdf SintacticoPDF;
    
    
    public lector_pdf getLexPDF(){
        return MainClass.LexicoPDF;
    }
    
    public lector_pdf getSintPDF(){
        return MainClass.SintacticoPDF;
    }
    
    public static void main(String[] args) throws Exception{
        UIManager.put("OptionPane.background", new ColorUIResource(187,187,187));
        UIManager.put("OptionPane.messagebackground", new ColorUIResource(187,187,187));
        UIManager.put("Panel.background", new ColorUIResource(187,187,187));
        
        Load VerCarga = new Load(null,false);
        
        LexicoPDF  = new lector_pdf("src/Resources/Analizador Léxico.pdf");
        SintacticoPDF  = new lector_pdf("src/Resources/Analizador Sintáctico.pdf");
        String ruta1 = "src/ProjectTC/Analizador/AnalizadorLexico.flex"; 
        String ruta2 = "src/ProjectTC/Analizador/AnalizadorLex_Cup.flex";
        String[] rutaS = {"-parser", "Sintax", "src/ProjectTC/Analizador/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
        
        new MainMenu().setVisible(true);
        
        VerCarga.setVisible(false);
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(30);
                Load.NumCarga.setText(Integer.toString(row)+"%");
                Load.BarraDeCarga.setValue(row);
                if (row == 100) {
                   // new MainMenu().setVisible(true);
                }
            }
        } catch (InterruptedException e) {
        } 
    }
    
    
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("src/ProjectTC/Analizador/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("sym.java"), 
                Paths.get("src/ProjectTC/Analizador/sym.java")
        );
        Path rutaSin = Paths.get("src/ProjectTC/Analizador/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("Sintax.java"), 
                Paths.get("src/ProjectTC/Analizador/Sintax.java")
        );
    }
}
