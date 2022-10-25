/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviPass;

import entidadesPass.AtributosPass;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetdosPass {

    AtributosPass obj = new AtributosPass();
    Scanner leer = new Scanner(System.in);

    public void ingresoDatos() {

        String nombre = "gustavo rios";
        String contrasena = "guztavo275";

        int DNI = 75075116;

        obj.setNombre(nombre);

        obj.setDNI(DNI);

        obj.setPass(contrasena);

    }

    public void crearPass(String contrasena) {

        System.out.println("Por favor ingrese su password de 10 caracteres");
        obj.setPass(leer.nextLine());

        if (obj.getPass().length() > 10 && obj.getPass().equalsIgnoreCase(contrasena)) {
            
            System.out.println("contraseña ingresada correctamente");

        } else {
            

            System.out.println("contraseña supera el tamaño maximo");
            System.out.println("Ingrese contraseña tamaño correcto");
            obj.setPass(leer.nextLine());
        }

    }

    public void analizarPass() {
        int contador = 0;

        for (int i = 0; i < obj.getPass().length(); i++) {

            if (obj.getPass().charAt(i) == 'a') {
                contador++;
            }
        }

        if (obj.getPass().contains("z") == true) {
            System.out.println("Nivel de la contraseña MEDIO");

        } else if (obj.getPass().contains("z") == true && contador == 2) {

            System.out.println("Nivel de la contraseña ALTO");

        } else {

            System.out.println("Nivel de la contraseña BAJO");

        }

    }

    public void modificarDatos() {

        int conta = 0;
        System.out.println("Ingrese su password");
        

        String password = leer.nextLine();

        if (obj.getPass().equals(password)) {

            System.out.println("Bienvenido");
            System.out.println("Que desea modifica");
            System.out.println("1. DNI");
            System.out.println("2. Nombre");
            System.out.println("3. Salir");
            int op = leer.nextInt();

            do {
                switch (op) {
                    case 1:
                        System.out.println("Ingrese nuevo DNI");
                        obj.setDNI(leer.nextInt());
                        break;

                    case 2:
                        System.out.println("Ingrese nuevo Nombre");
                        obj.setNombre(leer.nextLine());
                        break;

                    case 3:
                        System.out.println("Fin");

                }

            } while (op != 3);

        } else {
            System.out.println("Contraseña incorrecta ingrese nuevamente");
            password = leer.nextLine();
            conta++;

        }

    }
    }
