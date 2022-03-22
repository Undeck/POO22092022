/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librocomp;

/**
 *
 * @author OmarA
 */
public class Editorial {
    private String nombre;
    private String genero;

    public Editorial() {
    }

    public Editorial(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
    public void publica(){
        System.out.println("La editorial " + this.nombre + " publico un libro" );
    }
}
