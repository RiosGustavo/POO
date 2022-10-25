/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioString;

import EntidadesStgring.AtributosCadena;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetodosCadena {

    Scanner leer = new Scanner(System.in);

    AtributosCadena palabra = new AtributosCadena();

    public void PedirFrase() {
        System.out.println("Por favor ingrese una frase o palaba lo que desee");
        palabra.setFrase(leer.nextLine());

        palabra.setLongitudFrase(palabra.getFrase().length());

    }

    public void mostrarVocales() {

        int contador = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        for (int i = 0; i < palabra.getLongitudFrase(); i++) {

            /// con este comando divido la frase en caracteres
            if ((palabra.getFrase().charAt(i) == 'a')) {
                contador++;

            } 

            if ((palabra.getFrase().charAt(i) == 'e')) {
                contador1++;

            }

            if ((palabra.getFrase().charAt(i) == 'i')) {
                contador2++;

            }

            if ((palabra.getFrase().charAt(i) == 'o')) {
                contador3++;

            }

            if ((palabra.getFrase().charAt(i) == 'u')) {
                contador4++;

            }

        }
        System.out.println("longitud frase" + palabra.getLongitudFrase());
        System.out.println("La frase tiene " + contador + " vocales  a");
        System.out.println("La frase tiene " + contador1 + " vocales  e");
        System.out.println("La frase tiene " + contador2 + " vocales  i");
        System.out.println("La frase tiene " + contador3 + " vocales  o");
        System.out.println("La frase tiene " + contador4 + " vocales  u");

    }

    public void InvertirFrase() {

        System.out.println("la frase invertidad es: ");
        
        // con esta linea invierto la frase
        for (int i = palabra.getLongitudFrase() - 1; i >= 0; i--) {

            System.out.print(palabra.getFrase().charAt(i));
            
        }

    }
public void desinvertir(){
    for (int i = palabra.getLongitudFrase() - 1; i >= 0; i--) {

            palabra.getFrase().charAt(i);
            
        }
    
}
    public void vecesRepetido() {

        int conta = 0;

        System.out.println("Ingrese un caracter que dese buscar en la frase");
        // convirto caracter a char  
        
        char caracter = leer.next().charAt(0);
           
        for (int i = 0; i < palabra.getLongitudFrase(); i++) {

            if ((palabra.getFrase().charAt(i) == caracter)) {
                conta++;
            }


        }
        
         System.out.println("La frase tiene " + conta+ " veces la letra "+caracter);
    }
    
    public void compararLongitud(){
        String NuevaFrase;
        // aca hice trampa creo puse dos veces el lleer la frase con uno solo no me lo tomaba
        System.out.println("Ingrese una nueva frase");
         NuevaFrase = leer.nextLine();
          NuevaFrase = leer.nextLine();
        
        if (palabra.getLongitudFrase() == NuevaFrase.length()){
            
            System.out.println("Las dos frases tienen la misma longitud "+palabra.getLongitudFrase());
            
        }else{
            System.out.println("las dos frases no tienen la misma longitu");
            System.out.println("la primera frase tiene lontidu "+palabra.getLongitudFrase());
            System.out.println("La segunda frase tiene longitu "+NuevaFrase.length());
        }
        
    }
    
    public void unirFrases (){
        
        String Nueva;
        
        System.out.println("Ingrese frase para unir a la ya existente");
        Nueva = leer.nextLine();
         
        
        System.out.println("la frase nueva contatenada es "+palabra.getFrase().concat(Nueva));
        
    }
    
    public void remplazar(){
        
        System.out.println("ingrese un caracater para reemplaar las letras a en la frase");
        char caracter = leer.nextLine().charAt(0);
        
        System.out.println("la palabra con la a reemplazada por el nuevo"
                + " caracter ingresado por el usuario usuario "+palabra.getFrase().replace('a', caracter));
    }
    
    public void contiene(){
    System.out.println("ingrese un caracater para comprobar si esta en la frase frase");
        String c = leer.nextLine();
        System.out.println(""+palabra.getFrase().contains(c)); 
}
    
}
