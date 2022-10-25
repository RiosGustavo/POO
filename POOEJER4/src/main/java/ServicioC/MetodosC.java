package ServicioC;

import EntidadC.Atributos;
import java.util.Scanner;

public class MetodosC {

    Scanner leer = new Scanner(System.in);
    Atributos CrearC = new Atributos();

    public Atributos IngresoParametros() {
        System.out.println("Ingres la Base del Rectangulo");
        CrearC.setBase(leer.nextInt());
        System.out.println("Ingres la Altura del Rectangulo");

        CrearC.setAltura(leer.nextInt());
        return CrearC;

    }

    public void Superficie() {
        System.out.println("La Superficie del Rectangulo Es: " + (CrearC.getBase() * CrearC.getAltura()));
    }

    public void Perimetro() {
        System.out.println("El Perimetro del rectangulo Es: " + (Math.pow((CrearC.getBase() + CrearC.getAltura()), 2)));

    }

    public void DibujarRectangulo() {

        if (CrearC.getBase() == CrearC.getAltura()) {

            //Parte de arriba del Rectangulo
            for (int i = 0; i <= CrearC.getBase() - 1; i++) {

                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();

            // lados del Rectangulo 
            for (int i = 2; i <= (CrearC.getAltura() - 1); i++) {
                System.out.print("*");
                System.out.print(" ");
                for (int j = 2; j <= (CrearC.getAltura() - 1); j++) {
                    System.out.print(" ");
                    System.out.print(" ");
                }
                System.out.println("*");

            }

            //Parte de abajo del Rectangulo
            for (int i = 0; i <= CrearC.getBase() - 1; i++) {
                System.out.print("*");
                System.out.print(" ");
            }

        }

        if ((CrearC.getBase() > CrearC.getAltura()) || (CrearC.getBase() < CrearC.getAltura())) {

            //Parte de arriba del Rectangulo
            for (int i = 0; i <= CrearC.getBase() - 1; i++) {

                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();

            // lados del Rectangulo 
            for (int i = 2; i <= (CrearC.getAltura() - 1); i++) {
                System.out.print("*");
                System.out.print(" ");
                for (int j = 2; j <= (CrearC.getBase() - 1); j++) {
                    System.out.print(" ");
                    System.out.print(" ");
                }
                System.out.println("*");

            }

            //Parte de abajo del Rectangulo
            for (int i = 0; i <= CrearC.getBase() - 1; i++) {
                System.out.print("*");
                System.out.print(" ");
            }

        }

    }

}
