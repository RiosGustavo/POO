/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseObjeto;

import Servicio.Metodos;

/**
 *
 * @author portatil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos circulo = new Metodos();
        
        circulo.CrearCircunferencia();
        circulo.Area();
        circulo.Perimetro();
                
        
    }
    
}
