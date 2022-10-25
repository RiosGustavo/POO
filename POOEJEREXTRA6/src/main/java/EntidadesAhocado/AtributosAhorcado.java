
package EntidadesAhocado;

/**
 *
 * @author portatil
 */
public class AtributosAhorcado {
private char[] vector;
private String palabra;
private int cantidadLetrasEncontradas;
private int cantidadJugadasMaximas;

    public AtributosAhorcado() {
    }

    public AtributosAhorcado(char[] vector, String palabra, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.vector = vector;
        this.palabra = palabra;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

 
   

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }



}
