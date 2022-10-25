/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyOString;


import ServicioString.MetodosCadena;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        MetodosCadena fra = new MetodosCadena();
        
        fra.PedirFrase();
        fra.mostrarVocales();
        fra.InvertirFrase();
        fra.desinvertir();
        fra.vecesRepetido();
        fra.compararLongitud();
        fra.unirFrases();
        fra.remplazar();
        fra.contiene();
        
    
}
}
