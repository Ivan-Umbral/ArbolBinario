/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author ivanu
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol al =new Arbol(23);
       // Nodo nuevo = new Nodo(14);
        al.agregar(new Nodo(23),al.getRaiz());
        al.agregar(new Nodo(14),al.getRaiz());
        al.agregar(new Nodo(9),al.getRaiz());
        al.agregar(new Nodo(2),al.getRaiz());
        al.agregar(new Nodo(10),al.getRaiz());
        al.agregar(new Nodo(16),al.getRaiz());
        al.agregar(new Nodo(15),al.getRaiz());
        al.agregar(new Nodo(20),al.getRaiz());
        al.agregar(new Nodo(30),al.getRaiz());
        al.agregar(new Nodo(50),al.getRaiz());
        al.agregar(new Nodo(51),al.getRaiz());
        al.inorden(al.getRaiz());
        al.postorden(al.getRaiz());
        // TODO code application logic here
    }
    
}
