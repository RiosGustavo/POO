/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Atributos;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Metodos {
    Scanner leer = new Scanner(System.in);
     Atributos op = new Atributos();
     
     
    public Atributos CrearCircunferencia(){
       
        System.out.println("Ingrese el Radio de la Circunferencia");
        
        op.setRadio(leer.nextDouble());
        return op;
        
        
    }
    
    public void Area(){
        
        System.out.println("El area de la circunferenica Es: "+((Math.pow(op.getRadio(), 2)*Math.PI)));  
         
    }
    
    public void Perimetro(){
       System.out.println("El area de la circunferenica Es: "+(2*Math.PI*op.getRadio()));   
       
    }
    
}
