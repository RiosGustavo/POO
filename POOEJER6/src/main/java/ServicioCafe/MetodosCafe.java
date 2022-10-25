/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCafe;


import EntidadCafe.AtributosCafe;
import java.util.Scanner;


/**
 *
 * @author portatil
 */
public class MetodosCafe {

    Scanner leer = new Scanner(System.in);
    

    AtributosCafe llenar = new AtributosCafe();
    



   
    
    public void agregarCafe(){
        System.out.println("Por favor indique la cantidad de cafe "
                + "a añadir a la cafetera ");
        System.out.println("la pacacida max es de 60 onz");
        int op;
        
            System.out.println("Submenu llenado");
            System.out.println(" 20 onz minimo");
            System.out.println(" 40 onz medio");
            System.out.println(" 60 onz full");
                      
            llenar.setCantidadActual(leer.nextInt());
            System.out.println("la capacidad de la cafetera es "+llenar.getCantidadActual());
            
           
                        
       
        System.out.println("la Cafetera quedo llena con : "+llenar.getCantidadActual() );
        
    }
    
        //metodo llenar
    public void llenarCafetera() {
        
       
        llenar.setCapacidadMax(llenar.getCantidadActual());
        
        System.out.println("La cantidad de cafe en la cafetera Es: "+llenar.getCapacidadMax());
        
    }

    
     public void servirTaza() {

        System.out.println("De que tamaño desea su cafe");
        System.out.println("  4 onz "); 
        System.out.println("  8 onz ");
         System.out.println(" 12 onz ");
        
        
        int tamañoTaza = leer.nextInt();

        if (llenar.getCapacidadMax() > tamañoTaza) {

           llenar.setCapacidadMax(llenar.getCantidadActual() - tamañoTaza);

            System.out.println("Su Taza ya esta lista, por favor retirela y disfrute su cafe");
            System.out.println("la cafetera tiene ");
            
            System.out.println("La cantidad de cafe que queda Es: "+llenar.getCapacidadMax());
        }

        if (llenar.getCapacidadMax() < tamañoTaza) {

            tamañoTaza = llenar.getCantidadActual();

            System.out.println("Lo sentimos no se pudo llenar la taza con el tamaño requrido");
            System.out.println("se le sirvio una taza de tamaño " + tamañoTaza + " onz");
            System.out.println("Por Retirela y disfrute su cafe");
        }
      
    }
    
    public void vaciarCafetera(){
        
        llenar.setCapacidadMax(0);
       
    }
    
    
}
