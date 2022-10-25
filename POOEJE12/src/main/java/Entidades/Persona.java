
package Entidades;

import java.util.Date;

/**
 *
 * @author portatil
 */
public class Persona {
    private String nombre;
    private Date FechaNacimiento;
private String nombre1;
private Date FechaNacimiento1;
    
    public Persona() {
    }

    public Persona(String nombre, Date FechaNacimiento, String nombre1, Date FechaNacimiento1) {
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.nombre1 = nombre1;
        this.FechaNacimiento1 = FechaNacimiento1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public Date getFechaNacimiento1() {
        return FechaNacimiento1;
    }

    public void setFechaNacimiento1(Date FechaNacimiento1) {
        this.FechaNacimiento1 = FechaNacimiento1;
    }

    
    
}
