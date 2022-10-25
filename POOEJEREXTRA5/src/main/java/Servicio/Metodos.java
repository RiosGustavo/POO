/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Atributos;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Metodos {
    Atributos secre = new Atributos();
    Scanner leer = new Scanner(System.in);
   
    public void Secreta(){
        System.out.println("Vamos a divinar un mes secreto, introdusca "
                + "el mes que cree quye es en minuscula");
        secre.setPalabra(leer.nextLine());
        
        
      
        
    }
    
    public void Array(){
        
        
        String  meses [] = {"enero","febrero","marzo","abril", "mayo", "junio"
                ,"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      
        
        secre.setPalSecre(meses[9]);
       // System.out.println(""+secre.getPalSecre());
       int cont=0;
       // System.out.println(""+secre.getPalabra());
      while(cont!=3){
          
          secre.getPalabra();
          
            if(secre.getPalabra().equals(secre.getPalSecre())){
               System.out.println("Adivino el mes Es:  "+secre.getPalSecre());
                
            }else{
                 System.out.println("no lo adivino intente otra vez");
                secre.setPalabra(leer.nextLine());
                
            }
           cont++;
       }
        
       
        
        
    }
    
}
