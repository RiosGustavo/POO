
package Entidades;

import java.util.Date;

/**
 *
 * @author portatil
 */
public class Vendedor {
    
    private String nombre;
    private Integer DNI;
    private double sueldoBasico;
    private double comisiones;
    private double sueldoMensual;
    private Date fechaInicio;
    
    
    /// constructor vacio

    public Vendedor() {
    }

    public Vendedor(String nombre, Integer DNI, double sueldoBasico, double comisiones, double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    
    // getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", DNI=" + DNI + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
}
