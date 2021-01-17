package ProjectTC.Analizador;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */


public class Nodo {
    private String nombre;
    private String Color;
    private ArrayList<Nodo> hijos;
    private String valor;
    private int numNodo;
    
    public Nodo(String nombre, int numNodo)
    {
        this.nombre = nombre;
        hijos = new ArrayList<>();
        this.numNodo= numNodo;
        switch (nombre) {
            case "Sentencia":
                Color="#40b9e5";
                break;
            case "Declaración":
                Color="#FF0000";
                break;
            case "main":
                Color="#ffa500";
                break;
            case "IF":
            case "If-Else":
                Color="#FF8C00";
                break;
            case "For":
                Color="#009688";
                break;
            case "Condición":
                Color="#2345FF";
                break;
            case "Boole":
                Color="#e81e62";
                break;
            default:
                Color="#8A2BE2";
                break;
        }
    }
    
    public void addHijo(Nodo hijo)
    {
        hijos.add(hijo);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    public String getName(){
        return "\""+numNodo + " " + nombre + "\" ";
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getColor(){
        return Color;
    }

    /**
     * @param Color the nombre to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    /**
     * @return the hijos
     */
    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the numNodo
     */
    public int getNumNodo() {
        return numNodo;
    }

    /**
     * @param numNodo the numNodo to set
     */
    public void setNumNodo(int numNodo) {
        this.numNodo = numNodo;
    }
}
