/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioPersona;

import EntidadesPersona.AtributosPersona;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetodosPersona {
                                    /// con este comando agregado al Scanner no da
                                    /// error de salto de renglon    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    AtributosPersona crear = new AtributosPersona();

    public AtributosPersona CrearPersona() {
        System.out.println("Por favor Ingrese los siguentes datos para crear el usurario:");

        System.out.println("ingrese Nombre :");
        crear.setNombre(leer.nextLine());

        System.out.println("Ingrese Edad :");
        crear.setEdad(leer.nextInt());

        System.out.println("Ingres sexo :");
        System.out.println("M - Masculino");
        System.out.println("F - Femenino");
        System.out.println("O - Otro");
        crear.setSexo(leer.nextLine());
        crear.setSexo(leer.nextLine());

        if (crear.getSexo().equalsIgnoreCase("M") || crear.getSexo().equalsIgnoreCase("F") || crear.getSexo().equalsIgnoreCase("O")) {
           
            
                
            
        }else{
            System.out.println("La Opcion de sexo introduccida no es la correcta por favor ingrese uno correcto");
            crear.setSexo(leer.nextLine());
        } 

        System.out.println("Ingrese su Peso en Kg :");
        crear.setPeso(leer.nextDouble());

        System.out.println("Ingrese su Altura en cms :");
        crear.setAltura(leer.nextDouble());
        
        return crear;
    }

    public double IMC() {

        double IMC =0;
        
       
            System.out.println("imc"+(crear.getPeso()/((crear.getAltura())*(crear.getAltura()))));
        if (crear.getPeso()/(crear.getAltura()*crear.getAltura()) < 20) {
            IMC = -1;
            System.out.println("Esta por debajo se su peso Ideal " + "(" + IMC + ")");
        }

        if (crear.getPeso()/(crear.getAltura()*crear.getAltura()) >= 20 && crear.getPeso()/(crear.getAltura()*crear.getAltura()) <= 25) {
            IMC = 0;
            System.out.println("Esta en su peso Ideal " + "(" + IMC + ")");
        }

        if (crear.getPeso()/(crear.getAltura()*crear.getAltura()) > 25) {
            IMC = 1;
            System.out.println("Esta por ensima su peso Ideal Tiene sobre peso" + "(" + IMC + ")");
        }
            
        
        
        return IMC;
    }

    public boolean esMayorDeEdad() {
       boolean MayorEdad;
       
       if (crear.getEdad() > 18){
           
           MayorEdad = true;
           }else{
           
           MayorEdad = false;
                   
                   }
        System.out.println("La persona es Mayor de Edad "+MayorEdad);
       
       return MayorEdad;
    }
}
