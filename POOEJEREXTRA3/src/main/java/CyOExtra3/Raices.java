/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CyOExtra3;

import Servicio.MetodosRaices;

/**
 *
 * @author portatil
 */
public class Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MetodosRaices raices = new MetodosRaices();
       
       raices.pedirCoeficientes();
       raices.getDiscriminante();
       raices.tieneRaices(0);
       raices.tieneRaiz(0);
       raices.obtenerRaices(true);
       raices.obtenerRaiz(true);
       
    }
    
}
