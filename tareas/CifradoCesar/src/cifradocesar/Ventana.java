/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cifradocesar;

/**
 *
 * @author OmarA
 */

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Ventana extends JFrame{
    private FlowLayout layout;
    private JTextField desplazamiento, texto;
    private JLabel cifrado,mensaje1,mensaje2,mensaje3;
    private JButton cifrar;
    private String Mayus="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";//0-26,o sea 27 en total
    private String Min="abcdefghijklmnñopqrstuvwxyz";
    private int numero,posicion,desplazar,nuevaposicion;
    private String resultado="",mensaje;
   

    public Ventana() throws HeadlessException {
        this.setTitle("Programa De Cifrado Cesar");
        this.setSize(700,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        layout=new FlowLayout();
        this.setLayout(layout);
   
        mensaje1=new JLabel("Desplazamiento: ");
        desplazamiento=new JTextField(2);
        mensaje2= new JLabel("Texto: ");
        texto=new JTextField(15);
        mensaje3=new JLabel("Texto Cifrado: ");
        cifrado=new JLabel();
        cifrar=new JButton("Cifrar");
        
        this.getContentPane().add(mensaje1);
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(mensaje2);
        this.getContentPane().add(texto);
        this.getContentPane().add(cifrar);
        this.getContentPane().add(mensaje3);
        this.getContentPane().add(cifrado);
        this.setVisible(true);
       
        this.addWindowListener(new WindowAdapter() { 
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        
        this.cifrar.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                   mensaje=texto.getText();
                   numero=Integer.parseInt(desplazamiento.getText());
                   for(int i=0; i<mensaje.length(); i++){
                       if(Character.isUpperCase(mensaje.charAt(i))){
                           posicion=Mayus.indexOf(mensaje.charAt(i));
                           desplazar=posicion+numero;
                           if (posicion==-1){
                           resultado+=mensaje.charAt(i);
                           }
                           else if(desplazar>26){
                           nuevaposicion=desplazar-27;
                           resultado+=Mayus.charAt(nuevaposicion);
                           }
                           else{
                           resultado+=Mayus.charAt(desplazar);
                           }
                       }
                       else{
                           posicion=Min.indexOf(mensaje.charAt(i));
                           desplazar=posicion+numero;
                           if (posicion==-1){
                           resultado+=mensaje.charAt(i);}
                           else if(desplazar>26){
                           nuevaposicion=desplazar-27;
                           resultado+=Min.charAt(nuevaposicion);
                           }
                           else {
                           resultado+=Min.charAt(desplazar);
                           }
                       }
                       
                   }
                   cifrado.setText(resultado);
                }                 
             });
    }  
}