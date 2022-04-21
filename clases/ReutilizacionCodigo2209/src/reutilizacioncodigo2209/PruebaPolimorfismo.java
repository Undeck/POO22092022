/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 *
 * @author OmarA
 */
public class PruebaPolimorfismo {
    
    public static void main(String[] args) {
        
        System.out.println("Hola");
        Persona per1 = new Persona();
        per1.setNombre("Jose");
        per1.dormir();
        
        
       Alumno all = new Alumno();
         all.setNombre("Jose");
         all.dormir();
         
         
    }
}
