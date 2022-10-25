
package com.mycompany.pooeje12;

import Entidades.Persona;
import Servicio.PersonaServicio.PersonaServicio;

/**
 *
 * @author portatil
 */
public class POOEJE12 {

    public static void main(String[] args) {
        
        PersonaServicio person = new PersonaServicio();
        
        Persona per = person.CrearPersona();
        person.calcularEdad(per);
        person.menorQue(per);
        person.motrarPersona2(per);
        
    }
}
