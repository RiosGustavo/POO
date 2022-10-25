/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Atributos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Metodos {

    Atributos sopa = new Atributos();
    Scanner leer = new Scanner(System.in);

    int n = 10;
    char Matriz[][] = new char[n][n];

    /**
     *
     */
    public void inicializandoMatriz() {
        Random ran = new Random();

        /// con este comando hacemos letras aleatoriamente para llenar la matriz
        char aleatorioCaracter = (char) (ran.nextInt(26) + 'a');

        // Asigno valores a la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                Matriz[i][j] = aleatorioCaracter = (char) (ran.nextInt(26) + 'a');

                sopa.setMatriz(Matriz);
            }

        }

    }

    public char[][] Palabra(Atributos[][] Matriz, int n) {
        
        /// con este comadno se hace una lista de palabras para agregar despues a
        /// una matriz
        ArrayList<String> nombreArrayList = new ArrayList<String>();
        
        
        int voc=0;
        
        String[] vocal = {"a","e","i","o","u"};
        for(int i=0;i<c1.getL();i++){
            for(int j=0;j<4;j++){
                if(c1.getFrase().substring(i,i+1).toLowerCase().equals(vocal[j])){
                    voc++;
                    
                    System.out.print(" -"+ vocal[j] +"- ");
        }

        
        
        
        // Añade el elemento al ArrayList en la posición 'n'
        nombreArrayList.add("carro");
        nombreArrayList.add("avion");
        nombreArrayList.add("casa");
        nombreArrayList.add("maleta");
        nombreArrayList.add("manizales");
        nombreArrayList.add("comedor");
        nombreArrayList.add("mujer");
        nombreArrayList.add("hijos");
        nombreArrayList.add("barco");
        nombreArrayList.add("programar");
        
        // Devuelve el numero de elementos del ArrayList
        nombreArrayList.size();
        
        // Pasa el ArrayList a un Array 
sopa.getMatriz()[][] = nombreArrayList.toArray.charAt(j); 
        
       
        sopa.getMatriz()[][]= {"casa", 2};
        Palabra(sopa.getMatriz()[][], "maleta", 3)
        Palabra(sopa.getMatriz()[][], "manizales", 4)
        Palabra(sopa.getMatriz()[][], "comedor", 5)
        Palabra(sopa.getMatriz()[][], "mujer", 6)
        Palabra(sopa.getMatriz()[][], "hijos", 7)
        Palabra(sopa.getMatriz()[][], "barco", 8)
        Palabra(sopa.getMatriz()[][], "programar", 9)
    
    
    
    
        return  = palabra;

    }

    public void agregarPalabra(char[][] Matriz, String palabra, int n) {
 

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {

                sopa.getMatriz()[i][j] = palabra.charAt(j);

            }

        }
    }

    public void mostrarMatriz() {

        // Muestro la matriz 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + sopa.getMatriz()[i][j] + "]");
                if (j != n - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }

}
