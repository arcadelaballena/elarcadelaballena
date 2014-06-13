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
    
    Container panel;
    
    
    public VentanaVisualizar(){
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
    }
    public void Cerrar(){
        this.setVisible(false);
    }
    
}