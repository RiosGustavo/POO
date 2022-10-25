/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyO6;

import ServicioCafe.MetodosCafe;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosCafe Cafetera = new MetodosCafe();

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a su cafetera Nespresso");
        System.out.println("Por favor Indique que dese hacer");

        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar cafe");
            System.out.println("2. Servir una Taza de Cafe");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    
                    
                    Cafetera.agregarCafe();
                    Cafetera.llenarCafetera();
                    break;

                case 2:
                    Cafetera.servirTaza();
                    break;

                case 3:
                    Cafetera.vaciarCafetera();
                    break;

                case 4:
                    break;

            }

        } while (opcion != 4); 
          
    

    }

}
