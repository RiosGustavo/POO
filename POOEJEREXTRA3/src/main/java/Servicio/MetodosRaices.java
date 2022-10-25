/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import EntidadesRaiz.AtributosRaices;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetodosRaices {

    AtributosRaices ra = new AtributosRaices();

    Scanner leer = new Scanner(System.in);

    public void pedirCoeficientes() {
        System.out.println("Ingrese el valor de los coeficiente de la ecuacion: ");
        System.out.println("Ingrese a :");
        ra.setA(leer.nextInt());
        System.out.println("Ingrese b");
        ra.setB(leer.nextInt());
        System.out.println("Ingrese c");
        ra.setC(leer.nextInt());

    }

    public double getDiscriminante() {

        double discriminante = (Math.pow(ra.getB(), 2) - 4 * ra.getA() * ra.getC());

        return discriminante;
    }

    public boolean tieneRaices(double discriminante) {

        boolean T2S;

        if (discriminante >= 0) {
            T2S = true;
        } else {
            T2S = false;
        }

        return T2S;
    }

    public boolean tieneRaiz(double discriminante) {

        boolean US;

        if (discriminante == 0) {
            US = true;
        } else {
            US = false;
        }
        return US;
    }

    public void obtenerRaices(boolean T2S) {

        if (T2S == true) {

            
            double x1 = (ra.getB() + Math.sqrt((Math.pow(ra.getB(), 2) - 4 * ra.getA() * ra.getC())) / (2 * ra.getA()));
            double x2 = (ra.getB() - Math.sqrt((Math.pow(ra.getB(), 2) - 4 * ra.getA() * ra.getC())) / (2 * ra.getA()));
            System.out.println(""+(Math.pow(ra.getB(), 2) - 4 * ra.getA() * ra.getC()));
            System.out.println("la primera solucion es X1 = "+x1);
            System.out.println("la primera solucion es X2 = "+x2);
        }

    }
    
    public void obtenerRaiz(boolean US){
        
        if (US == true){
             double x = (ra.getB() + Math.sqrt((Math.pow(ra.getB(), 2) - 4 * ra.getA() * ra.getC())) / (2 * ra.getA()));
              System.out.println("la  solucion es X = "+x);
        }
        
    }
    
   

}
