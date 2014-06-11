/*
* Ventana donde se mostrará toda la información e imagenes de los juegos
*/

package elarcadelaballena;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author Pedro
 */

public class VentanaJuegos extends JFrame{
    
    Container panel;
    JLabel titulo, titulo2, genero, genero2, desarrolladora, 
            desarrolladora2, distribuidora, distribuidora2, 
            fechaSalida, fechaSalida2, SteamStore, SteamStore2;
    JLabel portada, imagen1, imagen2;
    JTextArea comentario;
    JButton botonFav;
    ImageIcon img;
    
    public VentanaJuegos(){
        // Llamamos al metodo para lanzar los elementos que conforman la ventana 
        iniciarComponentes();
        setTitle("Juegos Basllena - El arca de la ballena");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public void iniciarComponentes(){
        
        //Aqui declaramos dos fuentes diferentes, una en negrita (e) y otra normal(b)
        Font e = new java.awt.Font("Georgia", Font.BOLD,14);
        Font b = new java.awt.Font("Georgia", Font.PLAIN,14);
        
        
        panel = getContentPane();
        panel.setLayout(null);
        
        //Etiqueta de titulo
        titulo = new JLabel("Titulo:");
        titulo.setBounds(450, 60, 100, 20);
        titulo.setFont(e);
        //Titulo del juego
        titulo2 = new JLabel("Titulo mas largo");
        titulo2.setBounds(570, 60, 200, 20);
        titulo2.setFont(b);
        
        //Etiqueta Genero
        genero = new JLabel("Genero:");
        genero.setBounds(450, 100, 100, 20);
        genero.setFont(e);
        //Genero del juego
        genero2 = new JLabel("Genero mas largo");
        genero2.setBounds(570, 100, 200, 20);
        genero2.setFont(b); 
        
        //Etiqueta de desarrolladora
        desarrolladora = new JLabel("Desarrolladora:");
        desarrolladora.setBounds(450, 140, 150, 20);
        desarrolladora.setFont(e);
        //Desarrolladora del juego
        desarrolladora2 = new JLabel("Desarrollador mas largo");
        desarrolladora2.setBounds(570, 140, 200, 20);
        desarrolladora2.setFont(b);       
        
        //Etiqueta de distribuidora
        distribuidora = new JLabel("Distribuidora:");
        distribuidora.setBounds(450, 180, 150, 20);
        distribuidora.setFont(e);
        //Distribuidora del juego
        distribuidora2 = new JLabel("Distribuidor mas largo");
        distribuidora2.setBounds(570, 180, 200, 20);
        distribuidora2.setFont(b);           
        
        //Etiqueta de fecha de salida
        fechaSalida = new JLabel("Fecha de salida:");
        fechaSalida.setBounds(450, 220, 150, 20);
        fechaSalida.setFont(e);
        //Fecha de salida del juego
        fechaSalida2 = new JLabel("fecha de salida mas largo");
        fechaSalida2.setBounds(570, 220, 200, 20);
        fechaSalida2.setFont(b);      
        
        //Etiqueta de Steam Store
        SteamStore = new JLabel("Steam Store:");
        SteamStore.setBounds(450, 280, 150, 20);
        SteamStore.setFont(e);
        //Link a la pagina de Steam del juego
        SteamStore2 = new JLabel("<html><a href=\"http://www.google.com/\">Enlace</a></html>");
        SteamStore2.setBounds(570, 280, 400, 20);
        SteamStore2.setFont(b);      
        
        /*
        Comentario sobre el juego, se le quita el fondo para que sea igual al del fondo de la pantalla 
        y se le añade setLineWrap(false) para que al llegar al borde haga un salto de linea
        */
        comentario = new JTextArea("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        comentario.setBounds(800, 60, 400,250);
        comentario.setFont(b);
        comentario.setBackground(null);
        comentario.setEditable(false);
        comentario.setLineWrap(true);
        
        //Boton para añadir un juego a favoritos
        botonFav = new JButton("Añadir a Favoritos");
        botonFav.setFont(e);
        botonFav.setBounds(530, 380, 150, 20);
        
        //Imagen de la portada del juego
        portada = new JLabel();
        portada.setBounds(20, 40, 400, 600);
        //llamamos a la imagen en imgur.com
        String ruta="http://i.imgur.com/nKhrrDq.jpg"; 
        try {
            img = new ImageIcon(new URL(ruta));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar portada");        
        }
        //Le damos un tamaño a la imagen, no se autoescalará
        portada.setIcon(new ImageIcon(img.getImage().getScaledInstance(400, 550, Image.SCALE_SMOOTH)));
        
        //Imagen 1 del juego
        imagen1 = new JLabel();
        imagen1.setBounds(500, 455, 500, 200);
        String rutaim1="http://i.imgur.com/B555JPK.jpg"; 
        try {
            img = new ImageIcon(new URL(rutaim1));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar imagen1");    
        }
        imagen1.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH)));
        
        //imagen 2 del juego
        imagen2 = new JLabel();
        imagen2.setBounds(850, 455, 500, 200);
        String rutaim2="http://i.imgur.com/93BA9Om.jpg"; 
        try {
            img = new ImageIcon(new URL(rutaim2));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar imagen2");    
        }
        imagen2.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH)));
        
        
        //Por ultimo añadimos todo al panel 
        panel.add(titulo);
        panel.add(titulo2);
        panel.add(genero);
        panel.add(genero2);
        panel.add(desarrolladora);
        panel.add(desarrolladora2);
        panel.add(distribuidora);
        panel.add(distribuidora2);
        panel.add(fechaSalida);
        panel.add(fechaSalida2);
        panel.add(SteamStore);
        panel.add(SteamStore2);
        panel.add(comentario);
        panel.add(portada);
        panel.add(imagen1);
        panel.add(imagen2);
        panel.add(botonFav);
    }
}
