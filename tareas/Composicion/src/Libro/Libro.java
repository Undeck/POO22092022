/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import librocomp.Autor;
import librocomp.Editorial;

/**
 *
 * @author OmarA
 */
public class Libro {
    //Atributos
    private String nombre;
    private int numPag;
    private Editorial editorial;
    private Autor autorlib;
    
    public Libro() {
        autorlib = new Autor();
        editorial = new Editorial();
    }

    public Libro(String nombre, int numPag, Autor autorlib, Editorial editorial) {
        this.nombre = nombre;
        this.numPag = numPag;
        this.autorlib = autorlib;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public Autor getAutorlib() {
        return autorlib;
    }

    public void setEscritor(Autor autorlib) {
        this.autorlib = autorlib;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", numPag=" + numPag + ", Autor=" + autorlib + ", editorial=" + editorial + '}';
    }
    
    
    
    
}