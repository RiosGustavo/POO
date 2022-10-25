/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades2.AtributosPuntos;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetodosPuntos {

    AtributosPuntos pun = new AtributosPuntos();
    Scanner leer = new Scanner(System.in);

    public void crearpuntos() {

        System.out.println("Ingrese las coordenadas del primer punto ");
        System.out.println("ingre x para el primer punto");
        pun.setX1(leer.nextInt());

        System.out.println("ingre y para el primer punto");
        pun.setY1(leer.nextInt());

        System.out.println("Ingrese las coordenadas del primer punto ");
        System.out.println("ingre x para el segundo punto");
        pun.setX2(leer.nextInt());
        
        System.out.println("ingre y para el segundo punto");
        pun.setY2(leer.nextInt());
        
        

    }
    
    public void calculoDistancia(){
        
        
        double distancia = Math.sqrt(Math.pow((pun.getX2()-pun.getX1()), 2) + Math.pow((pun.getY2()-pun.getY1()), 2));
        System.out.println("La distancia entre  los dos puentos Es: "+distancia);
    }

}
