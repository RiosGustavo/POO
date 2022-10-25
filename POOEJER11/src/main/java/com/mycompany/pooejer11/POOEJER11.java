
package com.mycompany.pooejer11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class POOEJER11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
         System.out.println("Ingrese el dia ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes ");
        int mes = leer.nextInt();
        
         System.out.println("Ingrese el año ");
        int anio = leer.nextInt();
        
        
        /// con este linea inicializamos la clase date
         Date Fecha = new Date(anio-1900, mes-1,dia);
         
/// Con esta linea  asignamos una variable del tipo DATE (Date)
         Date  FechaInicio =Fecha;
         
          POOEJER11(FechaInicio);
          
         
    }

    public static void POOEJER11(Date FechaInicio) {
        
        /// con esta creamos el objetio de tipo Date
        Date fechaActual = new Date();
        
       
                int Años =  fechaActual.getYear()- FechaInicio.getYear();
                
                System.out.println("La cantidad de años de diferencia Es: "+Años);
    }
    
}
