/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioAhorcado;

import EntidadesAhocado.AtributosAhorcado;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class MetodosAhorcado {

    AtributosAhorcado pal = new AtributosAhorcado();
    Scanner leer = new Scanner(System.in);

    public void crearJuego() {

        System.out.println("Vamos a Jugar Ahorcado");
        System.out.println("Por favor ingrese una palabra");
        pal.setPalabra(leer.nextLine());

        System.out.println("Por favor indiquenos la cantidad de jugadas maximas"
                + "que desea realizar");
        pal.setCantidadJugadasMaximas(leer.nextInt());

        // obtenemos la longitud de la palabra
        int longitudPalabra = pal.getPalabra().length();

        /// ingresamos la palabra en un vector
        char vector[] = new char[longitudPalabra];

        /// con este comando deletreamos la palabra para ingresarla letra por letra en el vector
        //for (int i = 0; i < longitudPalabra; i++) {
        ///   pal.getVector()[i] = pal.getPalabra().charAt(i);
        // }
        vector = pal.getPalabra().toCharArray();

        pal.setVector(vector);
        /// inicializamos letras encontradas en cero 
        pal.setCantidadLetrasEncontradas(0);

    }

    public void longitud() {
        System.out.println("La longitud de la palabra Es: " + pal.getVector().length);
    }

    public boolean buscarLetra(char caracter) {

        /// buscar la letra en  el vector palabra
        boolean bandera = false;
        for (int i = 0; i < pal.getVector().length; i++) {

            if (pal.getVector()[i] == caracter) {
                bandera = true;

            }
        }

        if (bandera = true) {
            System.out.println("La letra pertenece a la palabra");
        } else if (bandera = false) {
            System.out.println("La letra  NO pertenece a la palabra");
        }

        return bandera;
    }

    public boolean encontradas(char caracter) {

        boolean veri = false;
        for (int i = 0; i < pal.getVector().length; i++) {
            if (pal.getVector()[i] == caracter) {
                pal.setCantidadLetrasEncontradas(pal.getCantidadLetrasEncontradas() + 1);
                veri = true;
            } else {
                veri = false;
                pal.setCantidadJugadasMaximas(pal.getCantidadJugadasMaximas() - 1);

            }
        }

        int faltantes = pal.getVector().length - pal.getCantidadLetrasEncontradas();

        System.out.println("Numero de letras (encontradas, faltantes)" + "(" + pal.getCantidadLetrasEncontradas() + "," + faltantes + ")");

        /// retornamos un metodo el cual se llama de esta manera
        return buscarLetra(caracter);
    }

    public void intentos() {

        System.out.println("La cantidad de Intentos restantes Es: " + pal.getCantidadJugadasMaximas());
    }

    public void juego() {
        crearJuego();
        do {
            intentos();
            longitud();

            System.out.println("Ingrese una Letra que dese buscar en la Palabra ");
            char caracter = leer.next().charAt(0);

            encontradas(caracter);
            buscarLetra(caracter);

        } while (pal.getCantidadJugadasMaximas() != 0 && pal.getCantidadLetrasEncontradas() != pal.getPalabra().length());

        if (pal.getCantidadLetrasEncontradas() == pal.getPalabra().length()) {
            System.out.println("Encontro La palabra");
        } else {
            System.out.println("Palabra no encontrada");
        }

    }
}
