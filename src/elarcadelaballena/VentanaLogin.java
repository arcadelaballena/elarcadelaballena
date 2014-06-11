/*
    Ventana para control de usuarios (LOGIN)
 */

package elarcadelaballena;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Pedro
 */
public class VentanaLogin extends JFrame{
    
    Container panel;
    JLabel imagen, usuario, contra;
    JTextField tusuario;
    JPasswordField tcontra;
    JButton entrar, registrar;
    JCheckBox recordaru, recordarc;
    ImageIcon img;
    
    
    /* Formamos la ventana que contendrá todos los elementos */ 
    public VentanaLogin(){
        
        // Llamamos al metodo para lanzar los elementos que conforman la ventana 
        iniciarComponentes();
        setTitle("Login - El arca de la ballena");
        setSize(400,520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);  //No se puede cambiar el tamaño
        setVisible(true);
        
    }
    
    public void iniciarComponentes(){
        
        //Aqui declaramos dos fuentes diferentes, una en negrita (e) y otra normal(b)
        Font e = new java.awt.Font("Georgia", Font.BOLD,14);
        Font b = new java.awt.Font("Georgia", Font.PLAIN,14);
        
        panel = getContentPane();
        panel.setLayout(null);
        
        //En cada bloque de codigo le damos valores y posición a los diferentes elementos
        //Imagen de la ballena
        imagen = new JLabel();
        imagen.setBounds(75, 10, 400, 200);
        img = new ImageIcon(getClass().getResource("/imagen.png"));
        imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(225, 200, Image.SCALE_SMOOTH)));
        
        //Etiqueta usuario
        usuario = new JLabel("Usuario");
        usuario.setBounds(160, 250, 200, 20);
        usuario.setFont(e);
        //Caja de texto para introducir usuario
        tusuario = new JTextField();
        tusuario.setBounds(115, 280, 150, 20);
        tusuario.setFont(b);
        //Check box para recordar usuario
        recordaru = new JCheckBox("Recordar");
        recordaru.setBounds(280, 280, 100, 20);
        recordaru.setFont(b);
        
        //Etiqueta contraseña
        contra = new JLabel("Contraseña");
        contra.setBounds(150, 330, 200, 20);
        contra.setFont(e);
        //Caja de texto para introducir contraseña sin ver las letras
        tcontra = new JPasswordField();
        tcontra.setBounds(115, 360, 150, 20);
        tcontra.setFont(b);
        //CheckBox para recordar contraseña
        recordarc = new JCheckBox("Recordar");
        recordarc.setBounds(280, 360, 100, 20);
        recordarc.setFont(b);
        
        //Boton para entrar con usuario
        entrar = new JButton("Entrar");
        entrar.setFont(e);
        entrar.setBounds(50, 420, 120, 20);
        
        //Boton para registrar un usuario nuevo
        registrar = new JButton("Registrarse");
        registrar.setFont(e);
        registrar.setBounds(210, 420, 120, 20);
        
        //Por ultimo añadimos todos los elementos el panel
        panel.add(imagen);
        panel.add(usuario);
        panel.add(tusuario);
        panel.add(recordaru);
        panel.add(contra);
        panel.add(tcontra);
        panel.add(recordarc);
        panel.add(entrar);
        panel.add(registrar);
    }
    
   
}
