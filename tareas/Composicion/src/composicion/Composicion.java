
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import librocomp.Autor;
import librocomp.Editorial;
import Libro.Libro;
import PeliculaComp.Actor;
import PeliculaComp.Director;
import PeliculaComp.Productora;
import PeliculaP.PeliculaP;

/**
 *
 * @author OmarA
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro();
        lib.setNombre("1984");
        lib.setEscritor(new Autor("George Orwell",24));
        lib.setEditorial(new Editorial("Herder","México"));
        lib.setNumPag(274);
        System.out.println(lib);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        PeliculaP pel = new PeliculaP();
        pel.setNombre("Back to the future");
        pel.setPais("Estados Unidos");
        pel.setDirector(new Director("Robert Zemeckis ",51));
        pel.setProductora(new Productora("Bob Gale","Neil Canton"));
        pel.setActor(new Actor("Michael J Fox",25));
        System.out.println(pel);
        
    }
    
}
