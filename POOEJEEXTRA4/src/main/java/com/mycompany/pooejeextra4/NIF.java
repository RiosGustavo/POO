/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooejeextra4;

import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class NIF {
    /// atributos
    private int DNI;
    private char letra;

    public NIF() {
    }

    public NIF(int DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void crearNif(){
        DNI =0;
        Scanner leer = new Scanner(System.in);
        
        // char[] vector = new char[22];
        
        System.out.println("Por favor ingres su DNI ");
       setDNI(leer.nextInt());
        
     
        
       int numero = getDNI()%23;
        
        System.out.println(""+numero);
         
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N'
                ,'J','Z','S','Q','V','H','L','O','K','E'};
         
      
        
        for (int i = 0; i < 22; i++) {
            
            letras[i] = letras[numero] ;
            setLetra(letras[i]);
           
        }
          
         
    }
    
    public void mostar(){
        
        System.out.println(""+getDNI()+"-"+getLetra());
        
    }
}
