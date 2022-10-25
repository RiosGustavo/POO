package CYO;

import ServicioPersona.MetodosPersona;

public class Persona {

    public static void main(String[] args) {

        MetodosPersona Persona1 = new MetodosPersona();
        MetodosPersona Persona2 = new MetodosPersona();
        MetodosPersona Persona3 = new MetodosPersona();
        MetodosPersona Persona4 = new MetodosPersona();

        Persona1.CrearPersona();
        double im1 = Persona1.IMC();
        boolean edad1 = Persona1.esMayorDeEdad();

        Persona2.CrearPersona();
        double im2 = Persona2.IMC();
        boolean edad2 = Persona2.esMayorDeEdad();

        Persona3.CrearPersona();
        double im3 = Persona3.IMC();
        boolean edad3 = Persona3.esMayorDeEdad();

        Persona4.CrearPersona();
        double im4 = Persona4.IMC();
        boolean edad4 = Persona4.esMayorDeEdad();

        // Porcentaje IMC
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int m= 0;
        while(m !=4){
            if (im1 == 0 || im2 == 0 || im3 == 0 || im4 == 0) {
            contador1++;

        } else if (im1 == 1 || im2 == 1 || im3 == 1 || im4 == 1) {
            contador2++;
        } else if (im1 == -1 || im2 == -1 || im3 == -1 || im4 == -1) {
            contador3++;

        }
        m++;
            
        }
        

        System.out.println("porcentarje Personas con Peso Ideal es: " + (contador1 * 100 / 4));

        System.out.println("porcentaje Personas Por Debajo peso Ideal es: " + (contador2 * 100 / 4));

        System.out.println("porcentaje Personas con Sobre peso es: " + (contador3 * 100 / 4));

        //porcentaje Mayores de edad
        int contador4 = 0;
        int contador5 = 0;
        int n =0;
        while(n!=4){
        if (edad1 == true || edad2 == true || edad3 == true || edad4 == true) {
            contador4++;
        } else if (edad1 == false || edad2 == false || edad3 == false || edad4 == false) {
            contador5++;
        }
        n++;
}
        System.out.println("porcentaje Personas Mayores de Edad es: " + (contador4 * 100 / 4));
        System.out.println("porcentaje Personas Menores de Edad es: " + (contador5 * 100 / 4));

    }
}
