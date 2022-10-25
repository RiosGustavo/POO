/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pooejercicioextra9;

import java.util.Scanner;
import serviPass.MetdosPass;

/**
 *
 * @author portatil
 */
public class POOEJERCICIOEXTRA9 {

    public static void main(String[] args) {
        MetdosPass password = new MetdosPass();

        Scanner leer = new Scanner(System.in);

        password.ingresoDatos();
        String op="n";
        do {
            System.out.println("BIEVENIDO");
            System.out.println("MENU");
            System.out.println("A. Ingresar Contraseña");
            System.out.println("B. Modificar contraseña");
            System.out.println("C. Modificar Datos");
            System.out.println("    Modificar DNI o Nombre");
            System.out.println("D. Salir");
            char opccion = leer.next().charAt(0);

            switch (opccion) {

                case 'A':
                    password.crearPass("guztavo275");
                    password.analizarPass();
                    break;

                case 'B':
                    password.modificarDatos();
                    password.analizarPass();
                    break;

                case 'C':
                    password.modificarDatos();
                    break;

                case 'D':
                    System.out.println("salir s/n");
                    op = leer.next();

            }

        } while (op != "s");

    }
}
