/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CyOMatematica;

import ServicioMatematica.MetodosMatematica;

/**
 *
 * @author portatil
 */
public class Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MetodosMatematica operaciones = new MetodosMatematica();
    
       
       operaciones.IngresoNumeros();
       operaciones.Mayor();
       operaciones.calcularPotencia();
       operaciones.calculaRaiz();
    }
    
}
