/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioMatematica;

import EntidadesMatematica.AtributosMatematica;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetodosMatematica {
    
     Scanner leer = new Scanner(System.in);
     
     AtributosMatematica mat = new AtributosMatematica();
     
     Random ran = new Random();
     
     
     
     public AtributosMatematica IngresoNumeros(){
        
         /// creamos los numeros aleatorios
         
         mat.setNum1(ran.nextInt((int)(Math.random()*10+1)));
         
         mat.setNum2(ran.nextInt((int)(Math.random()*15+1)));
         
         return mat;
     }
    
    public void Mayor(){
        
        if (mat.getNum1()>mat.getNum2()){
            
            System.out.println("(El Numero 1) "+mat.getNum1()+" es mayor al (Numero 2) "+mat.getNum2());
        }else{
            System.out.println("(El Numero 2) "+mat.getNum2()+" es mayor al (Numero 1) "+mat.getNum1());
        }
        
    }
    public void calcularPotencia(){
    
        // redondeamos los numeros
        
        Math.round(mat.getNum1());
        Math.round(mat.getNum2());
        
        
      int comparacionMax =  Math.max(mat.getNum1(), mat.getNum2());
      
      int comparacionMin = Math.min(mat.getNum1(), mat.getNum2());
      
      double Potencia = Math.pow(comparacionMax, comparacionMin);
      
        System.out.println("la potencia del numero mayor "+comparacionMax+" elevado al numerno menor "+comparacionMin+" Es: "+Potencia);
        
    }
    
    public void calculaRaiz(){
        
        
      
      int comparacionMin = Math.min(mat.getNum1(), mat.getNum2());
        
        
        Math.abs(comparacionMin);
        
        double Raiz = Math.sqrt(comparacionMin);
        System.out.println("La Raiz Cuadrada del numero menor "+comparacionMin+" Es:"+Raiz);
    }
    
}
