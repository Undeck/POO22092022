/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeliculaP;

import PeliculaComp.Actor;
import PeliculaComp.Director;
import PeliculaComp.Productora;

/**
 *
 * @author OmarA
 */
public class PeliculaP {
    private String nombre;
    private String pais;
    private Director director;
    private Productora productora;
    private Actor actor;

    public PeliculaP() {
        director = new Director(); 
        productora = new Productora(); 
        actor = new Actor(); 
    }
    
    public PeliculaP(String nombre, String pais, Director director, Productora productora, Actor actor) {
        this.nombre = nombre;
        this.pais = pais;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "PeliculaP{" + "nombre=" + nombre + ", pais=" + pais + ", director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
    
    
    
    
}