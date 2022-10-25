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
package Servicio;

import Entidades.Atributos;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Metodos {

    Scanner leer = new Scanner(System.in);
;
    Atributos car = new Atributos();

    public Atributos CargarFichaAuto() {
        
        System.out.println("Por favor ingrese los siguientes datos "
                + "para crear su vehciulo en nuestra empresa");

        System.out.println("Nombre Completo del Dueño");
        car.setDueño(leer.nextLine());
        System.out.println("Ingrese Fecha vencimiento carnet");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        leer.nextLine();
        int mes = leer.nextInt();
        System.out.println("año");
        int año = leer.nextInt();

/// para el ingreso de fecha tenemos que importar date como hacemos con scanner        
        Date Fecha = new Date(año - 1900, mes - 1, dia);

        car.setFechaVencimientoCarnet(Fecha);

        System.out.println("Ingrese el color del vehiculo");
        leer.nextLine();
        car.setColorVehiculo(leer.nextLine());

        System.out.println("Ingrese Modelo del vahiculo");
        car.setModelo(leer.nextInt());

        return car;
    }

    public  void ModificarTitular() {

        System.out.println("Ingrese el Nombre del nuevo titular del vahiculo");
        car.setDueño(leer.nextLine());

    }

    public void trayectoRecorrido() {

        System.out.println("Ingrese Kilometraje Motor Vahiculo");
        car.setKmMotor(leer.nextInt() + 7500);

    }
    
    public void serviceVehiculo(){
        
        if(car.getKmMotor() > 10000){
            System.out.println("El kilometraje actual del motor es :"+car.getKmMotor()+" ya "
                    + "supero los 10.000 por lo cual se requiere realixzar un serivcio a su vehiculo");
        }else{
            System.out.println("aun no llega a los 10000 kilometros"
                    + "recuerde traer su vehiculo cuando supere este kilometraje");
        }
        
    }

}
