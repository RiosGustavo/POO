/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioArrays;

import java.util.Random;

public class MetodosArrays {

    int[] vectorA = new int[n];

    int n = 20;

    public static void llenadoVector(double vectorA[], double vectorB[], int n, int m) {
        Random ran = new Random();
        /// llenado del vectorA 50 elemntos
        for (int i = 0; i < n; i++) {
            vectorA[i] = ran.nextDouble(60);
        }

        System.out.println("");
        /// llenado del vectorB 20 elementos
        for (int i = 0; i < m; i++) {
            vectorB[i] = ran.nextDouble(30);
        }

    }

    public static void mostrarVector(double vectorA[], double vectorB[], int n, int m) {
        /// mostramos el vectorA
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("");

        /// mostramos el vectorB
        for (int i = 0; i < m; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
        System.out.println("");

    }

    public static void ordenarVectorA(double vectorA[], double vectorB[], int n, int m) {

        double Aux;
        /// ordenado por el metodo burbuja
        ///con este se arregla el arreglo
        for (int i = 0; i < n - 1; i++) {
            /// cantidad de vueltas que debe dar el programa
            for (int k = 0; k < n - 1; k++) {
                if (vectorA[i] > vectorA[i + 1]) {
                    Aux = vectorA[i];
                    vectorA[i] = vectorA[i + 1];
                    vectorA[i + 1] = Aux;

                }
            }

        }
        /// mostar arreglo ordenado
        for (int i = 0; i < n - 1; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("");
        System.out.println("");
        /// otro metodo ordenamiento
        double menor;
        for (int i = 0; i < n - 1; i++) {
            menor = vectorA[0];
            if (vectorA[i] < menor) {
                menor = vectorA[i];

            } else {
                if (vectorA[i] > menor) {
                    menor = menor;

                }
            }

        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }

    }

    public static void iniciarVectorB(double vectorB[], int m) {

        double x = 0.5;
        for (int i = 0; i < m; i++) {
            vectorB[i] = x;
        }

    }

    public static void insercion(double vectorA[], double vectorB[], int n, int m) {

        //System.arraycopy(vectorB, 0, vectorA, 0, 10);
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        for (int i = 0; i < m; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
    }

}
