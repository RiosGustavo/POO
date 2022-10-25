/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author portatil
 */
public class Atributos {
    private String palSecre;
    private String Palabra;

    public Atributos() {
    }

    public Atributos(String palSecre, String Palabra) {
        this.palSecre = palSecre;
        this.Palabra = Palabra;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

  

    public String getPalSecre() {
        return palSecre;
    }

    public void setPalSecre(String palSecre) {
        this.palSecre = palSecre;
    }
    
    
    
}
