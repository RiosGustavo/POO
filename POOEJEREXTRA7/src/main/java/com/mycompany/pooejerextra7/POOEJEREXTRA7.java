/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento
carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo,
considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package com.mycompany.pooejerextra7;
import java.util.Date;
import Servicio.Metodos;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class POOEJEREXTRA7 {

    public static void main(String[] args) {
        Metodos vehiculo = new Metodos();
        Scanner leer = new Scanner(System.in);

        String op = "n";
        System.out.println("Bienvenido a su Taller Automotriz Mi Pichirilo");
        vehiculo.CargarFichaAuto();

       System.out.println("Menu");

        do {
            
            System.out.println("1. Modificar titular vahiculo");
            System.out.println("2. Ingrese kilometraje del vahiculo");
            System.out.println("3. salir");
            System.out.println("Elija una opcion");

            int opccion = leer.nextInt();

            switch (opccion) {

                case 1:

                    vehiculo.ModificarTitular();
                
                case 2:
                    vehiculo.trayectoRecorrido();
                    vehiculo.serviceVehiculo();
                
                case 3:
                    System.out.println("Salir s/n");
                    op = leer.next();

            }

        } while (op.equalsIgnoreCase("n"));

    }
}
