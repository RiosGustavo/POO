package Servicio.PersonaServicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona CrearPersona() {

        Persona per = new Persona();
        System.out.println("Por favor Ingrese su nombre");
        per.setNombre(leer.nextLine());

        System.out.println("Ingrese dia nacimiento");
        int dia = leer.nextInt();

        System.out.println("Ingrese mes nacimiento");
        int mes = leer.nextInt();

        System.out.println("Ingrese año nacimiento");
        int anio = leer.nextInt();

        Date Fecha = new Date(anio - 1900, mes - 1, dia);

        per.setFechaNacimiento(Fecha);

        ////////////////////////////////
        per.getFechaNacimiento().getYear();

        System.out.println(" Ingrese su nombre");
        // name =leer.nextLine();

        leer.nextLine();

        per.setNombre1(leer.nextLine());

        System.out.println("Ingrese dia nacimiento");
        int d = leer.nextInt();

        System.out.println("Ingrese mes nacimiento");
        int m = leer.nextInt();

        System.out.println("Ingrese año nacimiento");
        int ani = leer.nextInt();

        Date Fe = new Date(ani - 1900, m - 1, d);
        // System.out.println(""+edad);

        per.setFechaNacimiento1(Fe);

        per.getFechaNacimiento1().getYear();

        return per;

    }

    public void calcularEdad(Persona per) {
        Date hoy = new Date(); 

        int edad = hoy.getYear() - per.getFechaNacimiento().getYear();

        System.out.println("la edad de " + per.getNombre() + " es: " + edad + " años");

    }

    public void menorQue(Persona per) {

        boolean veri;

        if (per.getFechaNacimiento().getYear() < per.getFechaNacimiento1().getYear()) {
            System.out.println(per.getNombre() + " es Mayor que " + per.getNombre1());
            veri = true;
            System.out.println("" + veri);
        } else if (per.getFechaNacimiento().getYear() > per.getFechaNacimiento1().getYear()) {
            System.out.println(per.getNombre() + " es Menor que " + per.getNombre1());
            veri = false;
            System.out.println("" + veri);

        }

    }

    public void motrarPersona2(Persona per) {

        System.out.println("" + per.getNombre1() + " con fecha de nacimiento" + per.getFechaNacimiento1());
    }
}
