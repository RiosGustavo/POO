/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author portatil
 */
public class Atributos {
    private double Radio;
    
    public Atributos(double Radio) {
        this.Radio = Radio;
        
    }
    
    public Atributos(){
    
    }
    
      //  Metodo Getter mostramos el Radio
    public double getRadio() {
        return Radio;
    }

    
    
// Metodo Setter establecemos el Radio
      public void setRadio(double Radio) {
        this.Radio = Radio;
    
}
}