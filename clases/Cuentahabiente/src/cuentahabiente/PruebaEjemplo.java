/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author OmarA
 */
public class PruebaEjemplo {
    public static void main(String[] args) {
        Cuentahabiente[] personas = new Cuentahabiente[5];
        personas[0] = new Cuentahabiente(540, "Felipe", 20000);
        personas[1] = new Cuentahabiente(122, "Jose", 50000);
        personas[2] = new Cuentahabiente(117, "Mary", 47000);
        personas[3] = new Cuentahabiente(647, "Luis", 88200);
        personas[4] = new Cuentahabiente(801, "Ricardo", 99999);
        
        for (Cuentahabiente cuentahabiente : personas) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
    }
}