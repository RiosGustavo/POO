
package Entidades;

/**
 *
 * @author portatil
 */
public class Atributos {
    private char [][] Matriz;
     private String Palabra;

    public Atributos() {
    }

    public Atributos(char[][] Matriz, String Palabra) {
        this.Matriz = Matriz;
        this.Palabra = Palabra;
    }

    public char[][] getMatriz() {
        return Matriz;
    }

    public void setMatriz(char[][] Matriz) {
        this.Matriz = Matriz;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    

   
    
    
}
