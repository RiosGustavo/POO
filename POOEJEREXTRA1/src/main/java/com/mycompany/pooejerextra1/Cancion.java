/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooejerextra1;

/**
 *
 * @author portatil
 */
public class Cancion {
    
     private String Titulo;
        private String Autor;

    public Cancion() {
    }

    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

   

   

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    
}
