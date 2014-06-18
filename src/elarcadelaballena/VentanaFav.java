/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elarcadelaballena;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;

/**
 *
 * @author DAM1_04
 */
public class VentanaFav extends JFrame implements ActionListener{
    
    Container panel;
    JLabel titulo;
    JTextArea texto;
    JButton volver, añadir;
    String nombre;
    
    public VentanaFav(String nombre){
        
        this.nombre=nombre;
        
    iniciarComponentes();
        setTitle("Añadir Favoritos - El arca de la ballena");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        ImageIcon ic = new ImageIcon(getClass().getResource("/imagen.png"));
        setIconImage(ic.getImage());        
    }
     public void iniciarComponentes(){
         
            Font e = new java.awt.Font("Georgia", Font.BOLD,16);
            Font b = new java.awt.Font("Georgia", Font.PLAIN,14);
            Font z = new java.awt.Font("Georgia", Font.BOLD,14);
         
            panel = getContentPane();
            panel.setLayout(null);
            
            titulo = new JLabel();
            titulo.setText("Añade un comentario sobre el juego "+nombre+".");
            titulo.setBounds(40, 40, 500, 20);
            titulo.setFont(e);
            
            texto = new JTextArea();
            texto.setFont(b);
            texto.setBounds(40, 90, 500, 200);
            texto.setLineWrap(true);
            
            volver = new JButton("Volver");
            volver.setFont(z);
            volver.setBounds(110, 320, 120, 20);
            volver.addActionListener(this);
            volver.setVisible(true);
            añadir = new JButton("Añadir");
            añadir.setFont(z);
            añadir.setBounds(350, 320, 120, 20);
            añadir.addActionListener(this);
            añadir.setVisible(true);
        
            panel.add(volver);
            panel.add(añadir);
            panel.add(titulo);
            panel.add(texto);
     }

    @Override
    public void actionPerformed(ActionEvent ev) {
        
        String opcion = String.valueOf(ev.getActionCommand());
        
        switch(opcion){
            case "Volver":
                this.setVisible(false);
                break;
                
            case "Añadir":
                break;
        }
        
    }
}
