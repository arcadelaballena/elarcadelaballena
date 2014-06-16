/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elarcadelaballena;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author DAM1_04
 */
public class VentanaVisualizar extends JFrame{
    
    /*
    Ventana visualizadora
    */
    
    Container panel;
    JLabel imagen;
    ImageIcon img;
    
    public VentanaVisualizar(ImageIcon img){
        this.img=img;
        
        iniciarComponentes();
        setTitle("Visualizar - El arca de la ballena");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 2));
        setVisible(true);
        
    }
    
    public void iniciarComponentes(){
        
        panel = getContentPane();
        panel.setLayout(null);
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
 
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount()==1){
                Cerrar();
                
            }
            
        }
        });
        
        
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH)));
        imagen.setBounds(0, 0, 1280, 720);
        
        panel.add(imagen);
        
    }
    public void Cerrar(){
        this.setVisible(false);
    }
    
}