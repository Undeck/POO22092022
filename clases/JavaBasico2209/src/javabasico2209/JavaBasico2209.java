/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author OmarA
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double X = edad2.doubleValue();
        System.out.println(X);
        System.out.println(edad2.shortValue());
        System.out.println("-.-.-.-.-.-.-.-.-");
        // Convertir Strings a entero.
        String cadena = "99";
        int altura = Integer.parseInt(cadena); // Método miembro o método de clase
        Color c1 = Color.BLUE; // Atributo miembro o atributo de clase
        
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println("---------------------");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        System.out.println("Troncos de un arbol = " + tree1.tronco);
        System.out.println("Troncos de un arbol = " + tree2.tronco);
        System.out.println("Troncos de un arbol = " + tree3.tronco);
        
        Arbol.generarOxigeno();
        
        int edad3 = 20;
        // Validar si es mayor de edad
        String resultado = "";
        if(edad3 < 18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        
        // Acá haré el mismo algoritmo pero con operador ternario
        
        int edad4 = 30;
        String res = "";
        res = edad4 < 18? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println(res);
        
        // Cuando tengan una lógica así, pueden usar ternario
        // es muy elegante y ahorra líneas de código
        
        // Por último la versión mínima.
        int edad5 = 17;
        System.out.println( edad5 < 18? "Menor de edad 5": "Ya! el tequila");
        
        int val1 = 1;
        int val2 = 2;
      
        System.out.println(val1 | val2);
       
        int val3 = 1; // 0000...0001
        // int val4 << val3;
        // System.out.println( val3 <<= );
        int val4 = 0;
        val4 = val3 << 2; // El segundo valor es el número 
                          //de desplazamiento a la izquierda
        System.out.println( val4 ); // Tiene que dar 2                  
        
        System.out.println("----- ARREGLOS -----");
        int[] edades ; // Primero se declara que será un arreglo
        // en este punto aun no se reserva memoria...
        // El segundo paso es reservarlo, de un tamaño específico
        edades = new int[5];
        System.out.println(edades);
        // Ahora la usamos como siempre lo han hecho
        edades[0] = 10;
        System.out.println("La primera edad es: " + edades[0]);
        
        // Declarar e inicializar en una sola linea
        int [] estaturas = new int[5];
        // Ahora... al iguak que en C y C+++, puedes asignar valores
        int [] pesos = {86, 99, 56, 76, 77}; // en kilos
        // ok, este último veremos su contenido
        System.out.println( pesos[0]); // 86
        System.out.println( pesos[1]); // 99
        System.out.println( pesos[2]); // 56
        System.out.println( pesos[3]); // 76
        System.out.println( pesos[4]); // 77
        // Imprimiré lo mismo pero con menos líneas de código
        System.out.println("----- CON FOR -----");
        for(int i = 0; i < pesos.length; i++){
            System.out.println(pesos[i]);
        }
        // Inverso
        System.out.println("ORDEN INVERSO");
        for(int i = pesos.length - 1; i >= 0; i--){
            System.out.println( pesos[i] );
        }
        
        System.out.println("Con for each...");
        for(Alumno alumno : lista){
            System.out.println(alumno.evaluarDesempenio());
        }
    }
    
}
