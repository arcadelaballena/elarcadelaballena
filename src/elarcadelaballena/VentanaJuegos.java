/*
* Ventana donde se mostrará toda la información e imagenes de los juegos
*/

package elarcadelaballena;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URI;
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
            fechaSalida, fechaSalida2, SteamStore, SteamStore2,
            aumentar;
    JLabel portada, imagen1, imagen2;
    JTextArea comentario;
    JButton botonFav;
    ImageIcon img, img1, img2;
    String ititulo, igenero,  idesarrollador,  idistribuidor,  ifechaSalida,  icomentario,  ienlace, Ltitulo, Limagen1, Limagen2;
    
    
    
    public VentanaJuegos(String ititulo,String igenero, String idesarrollador, String idistribuidor, String ifechaSalida, String icomentario, String ienlace, String Ltitulo, String Limagen1, String Limagen2){
        
        this.ititulo=ititulo;
        this.igenero=igenero;
        this.idesarrollador=idesarrollador;
        this.idistribuidor=idistribuidor;
        this.ifechaSalida=ifechaSalida;
        this.icomentario=icomentario;
        this.ienlace=ienlace;
        this.Ltitulo=Ltitulo;
        this.Limagen1=Limagen1;
        this.Limagen2=Limagen2;
                
                
                
// Llamamos al metodo para lanzar los elementos que conforman la ventana 
        iniciarComponentes();
        setTitle("Juegos Basllena - El arca de la ballena");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
        titulo2 = new JLabel(ititulo);
        titulo2.setBounds(570, 60, 200, 20);
        titulo2.setFont(b);
        
        //Etiqueta Genero
        genero = new JLabel("Genero:");
        genero.setBounds(450, 100, 100, 20);
        genero.setFont(e);
        //Genero del juego
        genero2 = new JLabel(igenero);
        genero2.setBounds(570, 100, 200, 20);
        genero2.setFont(b); 
        
        //Etiqueta de desarrolladora
        desarrolladora = new JLabel("Desarrolladora:");
        desarrolladora.setBounds(450, 140, 150, 20);
        desarrolladora.setFont(e);
        //Desarrolladora del juego
        desarrolladora2 = new JLabel(idesarrollador);
        desarrolladora2.setBounds(570, 140, 200, 20);
        desarrolladora2.setFont(b);       
        
        //Etiqueta de distribuidora
        distribuidora = new JLabel("Distribuidora:");
        distribuidora.setBounds(450, 180, 150, 20);
        distribuidora.setFont(e);
        //Distribuidora del juego
        distribuidora2 = new JLabel(idistribuidor);
        distribuidora2.setBounds(570, 180, 200, 20);
        distribuidora2.setFont(b);           
        
        //Etiqueta de fecha de salida
        fechaSalida = new JLabel("Fecha de salida:");
        fechaSalida.setBounds(450, 220, 150, 20);
        fechaSalida.setFont(e);
        //Fecha de salida del juego
        fechaSalida2 = new JLabel(ifechaSalida);
        fechaSalida2.setBounds(570, 220, 200, 20);
        fechaSalida2.setFont(b);      
        
        //Etiqueta de Steam Store
        SteamStore = new JLabel("Steam Store:");
        SteamStore.setBounds(450, 280, 150, 20);
        SteamStore.setFont(e);
        //Link a la pagina de Steam del juego
        SteamStore2 = new JLabel("<html><a href="+ienlace+">"+"Enlace a la tienda de Steam"+"</a></html>");
        SteamStore2.setBounds(570, 280, 400, 20);
        SteamStore2.setFont(b);      
        SteamStore2.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(new URI(ienlace));
                }
                }
                } catch (Exception eb) {
                eb.printStackTrace();
                }
            }
        });
        
        /*
        Comentario sobre el juego, se le quita el fondo para que sea igual al del fondo de la pantalla 
        y se le añade setLineWrap(false) para que al llegar al borde haga un salto de linea
        */
        comentario = new JTextArea(icomentario);
        comentario.setBounds(800, 60, 400,250);
        comentario.setFont(b);
        comentario.setBackground(null);
        comentario.setEditable(false);
        comentario.setLineWrap(true);
        
        //Boton para añadir un juego a favoritos
        botonFav = new JButton("Añadir a Favoritos");
        botonFav.setFont(e);
        botonFav.setBounds(530, 380, 200, 20);
        
        //Comentario para aumentar la imagen
        aumentar=new JLabel("Haz click en las imagenes para aumentarlas");
        aumentar.setBounds(650, 440, 400, 20);
        aumentar.setFont(e);
        
        //Imagen de la portada del juego
        portada = new JLabel();
        portada.setBounds(20, 40, 400, 600);
        //llamamos a la imagen en imgur.com
        String ruta=Ltitulo; 
        System.out.println(Ltitulo);
        try {
            img = new ImageIcon(new URL(ruta));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar portada");        
        }
        //Le damos un tamaño a la imagen, no se autoescalará
        portada.setIcon(new ImageIcon(img.getImage().getScaledInstance(400, 550, Image.SCALE_SMOOTH)));
        
        //Imagen 1 del juego
        imagen1 = new JLabel();
        imagen1.setBounds(500, 490, 250, 125);
        String rutaim1=Limagen1; 
        try {
            img1 = new ImageIcon(new URL(rutaim1));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar imagen1");    
        }
        imagen1.setIcon(new ImageIcon(img1.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH)));
        imagen1.addMouseListener(new MouseListener() {
 
            @Override
            public void mouseClicked(MouseEvent me) {
        }

            @Override
            public void mousePressed(MouseEvent me) {
                VentanaVisualizar VV = new VentanaVisualizar(img1);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        
        //imagen 2 del juego
        imagen2 = new JLabel();
        imagen2.setBounds(850, 490, 250, 125);
        String rutaim2=Limagen2; 
        try {
            img2 = new ImageIcon(new URL(rutaim2));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar imagen2");    
        }
        imagen2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH)));
        imagen2.addMouseListener(new MouseListener() {
 
            @Override
            public void mouseClicked(MouseEvent me) {
        }

            @Override
            public void mousePressed(MouseEvent me) {
                VentanaVisualizar VV = new VentanaVisualizar(img2);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        
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
        panel.add(aumentar);
    }
    
  
    
    
}
