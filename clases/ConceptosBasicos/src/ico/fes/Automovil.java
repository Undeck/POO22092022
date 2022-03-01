/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author OmarA
 */
public class Automovil {
    private String Marca; // Los atributos van a estar en notacion lower camel case
    private String subMarca;    //lower cameo¿l case todas en minusculas y apartir 
    // de la segunda palabra la primer letra en mayuscula
    
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String Marca, String subMarca, int modelo, Color color) {
        this.Marca = Marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Marca=" + Marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
    
    
    
}
