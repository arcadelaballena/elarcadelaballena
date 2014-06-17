/*
    Ventana para control de usuarios (LOGIN)
 */

package elarcadelaballena;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Pedro
 */
public class VentanaLogin extends JFrame implements ActionListener{
    
    Container panel;
    JLabel imagen, usuario, contra, rusuario, rcontra, rcontra2, remail;
    JTextField tusuario, rtusuario, rtemail;
    JPasswordField tcontra, rtcontra, rtcontra2;
    JButton entrar, registrar, raceptar, volver;
    JCheckBox recordaru, recordarc;
    ImageIcon img;
    
    Basllena con = new Basllena();
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
        entrar.addActionListener(this);
        
        //Boton para registrar un usuario nuevo
        registrar = new JButton("Registrarse");
        registrar.setFont(e);
        registrar.setBounds(210, 420, 120, 20);
        registrar.addActionListener(this);
        
        /* ######### PEDIMOS DATOS PARA REGISTRAR A UN USUARIO ############*/
        
        rusuario = new JLabel("Nombre de usuario");
        rusuario.setBounds(50, 250, 200, 20);
        rusuario.setFont(e);
        rusuario.setVisible(false);
        rtusuario = new JTextField();
        rtusuario.setBounds(200, 250, 150, 20);
        rtusuario.setFont(b);
        rtusuario.setVisible(false);
        
        rcontra = new JLabel("Contraseña");
        rcontra.setBounds(75, 300, 200, 20);
        rcontra.setFont(e);
        rcontra.setVisible(false);
        rtcontra = new JPasswordField();
        rtcontra.setBounds(200, 300, 150, 20);
        rtcontra.setFont(b);
        rtcontra.setVisible(false);
        
        rcontra2 = new JLabel("Repite la contraseña");
        rcontra2.setBounds(40, 350, 200, 20);
        rcontra2.setFont(e);
        rcontra2.setVisible(false);
        rtcontra2 = new JPasswordField();
        rtcontra2.setBounds(200, 350, 150, 20);
        rtcontra2.setFont(b);
        rtcontra2.setVisible(false);
        
        remail = new JLabel("E-Mail");
        remail.setBounds(90, 400, 200, 20);
        remail.setFont(e);
        remail.setVisible(false);
        rtemail = new JTextField();
        rtemail.setBounds(200, 400, 150, 20);
        rtemail.setFont(b);
        rtemail.setVisible(false);
        
        
        volver = new JButton("Volver");
        volver.setFont(e);
        volver.setBounds(50, 450, 120, 20);
        volver.addActionListener(this);
        volver.setVisible(false);
        raceptar = new JButton("Aceptar");
        raceptar.setFont(e);
        raceptar.setBounds(210, 450, 120, 20);
        raceptar.addActionListener(this);
        raceptar.setVisible(false);
        
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
        panel.add(rusuario);
        panel.add(rtusuario);
        panel.add(rcontra);
        panel.add(rtcontra);
        panel.add(rcontra2);
        panel.add(rtcontra2);
        panel.add(remail);
        panel.add(rtemail);
        panel.add(volver);
        panel.add(raceptar);
    }

    public void recibidor(){
        
        imagen.setVisible(true);
        usuario.setVisible(true);
        tusuario.setVisible(true);
        recordaru.setVisible(true);
        contra.setVisible(true);
        tcontra.setVisible(true);
        recordarc.setVisible(true);
        entrar.setVisible(true);
        registrar.setVisible(true);
        rusuario.setVisible(false);
        rtusuario.setVisible(false);
        rcontra.setVisible(false);
        rtcontra.setVisible(false);
        rcontra2.setVisible(false);
        rtcontra2.setVisible(false);
        remail.setVisible(false);
        rtemail.setVisible(false);
        volver.setVisible(false);
        raceptar.setVisible(false);
    }
    
    public void verRegistrarse(){
        usuario.setVisible(false);
        tusuario.setVisible(false);
        recordaru.setVisible(false);
        contra.setVisible(false);
        tcontra.setVisible(false);
        recordarc.setVisible(false);
        entrar.setVisible(false);
        registrar.setVisible(false);
        rusuario.setVisible(true);
        rtusuario.setVisible(true);
        rcontra.setVisible(true);
        rtcontra.setVisible(true);
        rcontra2.setVisible(true);
        rtcontra2.setVisible(true);
        remail.setVisible(true);
        rtemail.setVisible(true);
        volver.setVisible(true);
        raceptar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        
         //en opcion recogemos el valor que devuelve el evento en un String para poder comparar en el Switch
        String opcion = String.valueOf(ev.getActionCommand());
        
        switch(opcion){
            case "Entrar" :
                boolean comp;
                
                String contra="";
                char con[]=tcontra.getPassword();
                for(int i=0;i<con.length;i++){
                   contra=contra+con[i];
                    
                }
                System.out.println(contra);
                /*
                comp=con.comprobarUser(tusuario.getText(),contra);
                System.out.println(comp);
                if(comp==true){
                    System.out.println("hola");
                    VentanaBusqueda VB = new VentanaBusqueda();
                    this.setVisible(false);
                }
                */
               
                break;
            case "Registrarse":
                verRegistrarse();
                break;
            case "Volver":
                recibidor();
                break;
        }
    }
    
   
}
