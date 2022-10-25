/*
 * Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento
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
package Entidades;

import java.util.Date;

/**
 *
 * @author portatil
 */
public class Atributos {
    
    private String Dueño;
    private Date FechaVencimientoCarnet;
    private String ColorVehiculo;
    private int modelo;
    private int KmMotor;

    public Atributos() {
    }

    public Atributos(String Dueño, Date FechaVencimientoCarnet, String ColorVehiculo, int modelo, int KmMotor) {
        this.Dueño = Dueño;
        this.FechaVencimientoCarnet = FechaVencimientoCarnet;
        this.ColorVehiculo = ColorVehiculo;
        this.modelo = modelo;
        this.KmMotor = KmMotor;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public Date getFechaVencimientoCarnet() {
        return FechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(Date FechaVencimientoCarnet) {
        this.FechaVencimientoCarnet = FechaVencimientoCarnet;
    }

    public String getColorVehiculo() {
        return ColorVehiculo;
    }

    public void setColorVehiculo(String ColorVehiculo) {
        this.ColorVehiculo = ColorVehiculo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKmMotor() {
        return KmMotor;
    }

    public void setKmMotor(int KmMotor) {
        this.KmMotor = KmMotor;
    }

    
    
    
    
    
}
