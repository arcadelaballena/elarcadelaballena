/*
En esta ventana se buscarán juegos y se verán favoritos
 */

package elarcadelaballena;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Pedro
 */
public class VentanaBusqueda extends JFrame implements ActionListener{
        
    Container panel;
    JButton volver, buscar, verFav, cambusuario;
    JButton iniBuscar, vertodos,verjuego; 
    JTextField campBuscar;
    JLabel imagen, ejemplo, buscarpor, erroraño, guion;
    JComboBox parametros, combaño, combaño2;
    ImageIcon img;
    JTable tablaFav, tablaAll;
    DefaultTableModel modelotabla, modelotablaAll;
    JScrollPane scroll, scroll2;
    String ititulo, igenero,  idesarrollador,  idistribuidor,  ifechaSalida,  icomentario,  ienlace,Ltitulo, Limagen1, Limagen2;
    int aux;
    
    ArrayList<Juegos> game;
    Basllena con = new Basllena();
    VentanaJuegos VJ;
    Juegos jue;
    
        Font e = new java.awt.Font("Georgia", Font.BOLD,14);
        Font b = new java.awt.Font("Georgia", Font.PLAIN,14);
    
    public VentanaBusqueda(){
        
        // Llamamos al metodo para lanzar los elementos que conforman la ventana
        iniciarComponentes();
        setTitle("Busqueda - El arca de la ballena");
        setSize(730,440); //Tamaño de la ventana
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public void iniciarComponentes(){
        
        
        panel = getContentPane();
        panel.setLayout(null);
        
        //Imagen de la ballena
        imagen = new JLabel();
        imagen.setBounds(275, 20, 400, 150);
        img = new ImageIcon(getClass().getResource("/imagen.png"));
        imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(175, 150, Image.SCALE_SMOOTH)));
        
        //Boton para acceder a los elementos de busqueda
        buscar = new JButton("Buscar");
        buscar.setFont(e);
        buscar.setBounds(40, 230, 190, 20);
        buscar.addActionListener(this);
        
        //Boton para ver favoritos
        verFav = new JButton("Favoritos");
        verFav.setFont(e);
        verFav.setBounds(40, 280, 190, 20);
        verFav.addActionListener(this);
        
        //Boton para cambiar usuario
        cambusuario = new JButton("Cambiar de usuario");
        cambusuario.setFont(e);
        cambusuario.setBounds(40, 330, 190, 20);
        cambusuario.addActionListener(this);
        
        //Boton para volver a la parte de Buscar, Ver favoritos y cambiar usuario
        volver = new JButton("Volver");
        volver.setFont(e);
        volver.setBounds(40, 350, 100, 20);
        volver.addActionListener(this);
        volver.setVisible(false);
        
        /* ##### ELEMENTOS PARA BUSCAR ##### */
        
        //Boton para iniciar la busqueda segun los parametros seleccionados
        iniBuscar = new JButton("Iniciar Busqueda");
        iniBuscar.setFont(e);
        iniBuscar.setBounds(265,350, 200, 20);
        iniBuscar.addActionListener(this);
        iniBuscar.setVisible(false);
        
        //Boton para ver todos los juegos
        vertodos = new JButton("Ver todos");
        vertodos.setFont(e);
        vertodos.setBounds(550,350, 120, 20);
        vertodos.addActionListener(this);
        vertodos.setVisible(false);
        
        //Caja de texto para buscar 
        campBuscar = new JTextField();
        campBuscar.setFont(e);
        campBuscar.addActionListener(this);
        campBuscar.setBounds(265, 240, 300, 20);
        campBuscar.setVisible(false);
        
        //etiqueta con diferentes ejemplos segun lo que vayamos a buscar.
        ejemplo = new JLabel("Como por ejemplo Portal, Fez, Bioshock...");
        ejemplo.setFont(b);
        ejemplo.setBounds(265,280, 300, 20);
        ejemplo.setVisible(false);
        
        //Etiqueta Buscar por:
        buscarpor = new JLabel("Buscar por ");
        buscarpor.setFont(e);
        buscarpor.setBounds(80,210, 100, 20);        
        buscarpor.setVisible(false);
        
        //elementos del Combo Box llamado parametros
        String[] paramet = { "Nombre", "Genero", "Desarrollador", "Distribuidor", "Fecha de salida","Intervalo de fechas" };
        parametros = new JComboBox(paramet);
        parametros.setFont(b);
        parametros.setBounds(60, 240, 150, 20);
        parametros.setVisible(false);
        parametros.addActionListener(this);
        
        
        /*######### BUSCAR POR AÑO ########*/
        
        //Le damos al String fechas los valores de los años desde 1997 hasta 2020
        String fechas []=  new String[23];
        int i= 1997;
        for(int x=0;x<23;x++){
                fechas[x]=String.valueOf(i);
                i++;
            }
        
        //Combo Box con las fechas del año unico / primer año
        combaño = new JComboBox(fechas);
        combaño.setFont(b);
        combaño.setBounds(300, 240, 100, 20);
        combaño.setVisible(false);
        combaño.addActionListener(this);   
        
        //Combo Box para el segundo año
        combaño2 = new JComboBox(fechas);
        combaño2.setFont(b);
        combaño2.setBounds(460, 240, 100, 20);
        combaño2.setVisible(false);
        combaño2.addActionListener(this); 
        
        //Etiqueta de mensaje de error si no se encuentra ningun juego en el año seleccionado
        erroraño = new JLabel("<html>No hay ningún resultado para ese año por favor introduzca un año diferente.</html>");
        erroraño.setFont(b);
        erroraño.setVisible(false);
        erroraño.setBounds(230, 280, 250, 60);
            
        //Etiqueta estetica para el guion entre años
        guion = new JLabel(" --- ");
        guion.setFont(e);
        guion.setVisible(false);
        guion.setBounds(420, 240, 100, 20);
        
        
        
        /* ###### TABLA FAVORITOS####### */
        
        //Boton para ver un juego seleccionado en una tabla
        verjuego = new JButton("Ver juego");
        verjuego.setFont(e);
        verjuego.setBounds(260, 350, 200, 20);
        verjuego.addActionListener(this);
        verjuego.setVisible(false);    
        
        //Tablas vacias para que no de error el boton volver a la hora de volver si n haber cargado alguna tabla
        scroll = new JScrollPane();
        scroll2 = new JScrollPane();
        
        //Añadimos todos los elementos anteriores al panel
        panel.add(imagen);
        panel.add(buscar);
        panel.add(verFav);
        panel.add(cambusuario);
        panel.add(volver);
        panel.add(iniBuscar);
        panel.add(vertodos);
        panel.add(campBuscar);
        panel.add(ejemplo);
        panel.add(buscarpor);
        panel.add(parametros);
        panel.add(combaño);
        panel.add(erroraño);
        panel.add(guion);
        panel.add(combaño2);
        panel.add(verjuego);
        panel.add(scroll);
        panel.add(scroll2);
    }
    
    /*
    Este metodo esconde todo menos los tres botones para Buscar, Ver favoritos y Cambiar usuario
    Se le llamará desde el Botón VOLVER
    */
    public void recibidor(){
        buscar.setVisible(true);
        verFav.setVisible(true);
        cambusuario.setVisible(true);
        volver.setVisible(false);
        guion.setVisible(false);
        erroraño.setVisible(false);
        combaño2.setVisible(false);
        combaño.setVisible(false);
        parametros.setVisible(false);
        buscarpor.setVisible(false);
        ejemplo.setVisible(false);
        campBuscar.setVisible(false);
        vertodos.setVisible(false);
        iniBuscar.setVisible(false);
        scroll.setVisible(false);
        scroll2.setVisible(false);
        verjuego.setVisible(false);
    }
    
    /*
    Este metodo muestra los elementos para buscar desde una caja de texto 
    Se le llamará desde el botón Buscar.
    */
    public void elementosBuscar(){
        buscar.setVisible(false);
        verFav.setVisible(false);
        cambusuario.setVisible(false);
        volver.setVisible(true);
        iniBuscar.setVisible(true);
        vertodos.setVisible(true);
        campBuscar.setVisible(true);
        ejemplo.setVisible(true);
        buscarpor.setVisible(true);
        parametros.setVisible(true);
                
                
    }
    
    //Metodo que muestra elementos para buscar un juego por año exacto
    public void buscarFecha(){
        campBuscar.setVisible(false);
        ejemplo.setVisible(false);
        combaño.setVisible(true);
        combaño2.setVisible(false);
        guion.setVisible(false);
    }
    
    //Metodo que muestra elementos para buscar un juego entre un intervalo de fechas
    public void buscarInterFecha(){
        campBuscar.setVisible(false);
        ejemplo.setVisible(false);
        combaño.setVisible(true);
        guion.setVisible(true);
        combaño2.setVisible(true);
    }
 
    //Metodo que muestra los elementos favoritos, Se muestra al pulsar el boton Ver favoritos
    public void cargaTablaFavoritos() {
        //En este metodo creamos una tabla
        buscar.setVisible(false);
        verFav.setVisible(false);
        cambusuario.setVisible(false);
        volver.setVisible(true);
        verjuego.setVisible(true);
            
            modelotabla = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            //Añadimos 2 columnas, Juego y Comentario
            modelotabla.addColumn("Juego");
            modelotabla.addColumn("Comentario");
            //Añadimos diferentes filas dependiendo de los resultados
            modelotabla.addRow(new String [] {"Portal ","Este es un juego macanudo"});
            JTable tabla = new JTable(modelotabla); 
            tabla = new JTable(modelotabla);
            //Recogemos una columna y le damos un valor máximo y mínimo a su ancho para que no se pueda cambiar su tamaño
            TableColumn columna = tabla.getColumn("Juego"); 
            columna.setMaxWidth(200);
            columna.setMinWidth(200);
            tabla.getTableHeader().setReorderingAllowed(false);
            scroll = new JScrollPane(tabla);
            scroll.setBounds(20, 200, 690, 125);
            
            //Se añade la tabla al panel
            panel.add(scroll);
            volver.setVisible(true);
        }
    
    //Metodo para mostrar todos los juegos, se le llama desde el boton Ver Todos 
    public void cargaTablaAll(int contador) {
        
        switch(contador){
            case 1:
                game = con.devolverTodo();
                break;
            case 2:  
                game = con.devolverBusqueda((String)parametros.getSelectedItem(), campBuscar.getText());
                break;
            case 3:
                game = con.devolverFecha((String)combaño.getSelectedItem(), (String)combaño.getSelectedItem());
        }
        
        
        //En este metodo creamos una tabla con todos los datos de los juegos
        volver.setVisible(false);
        guion.setVisible(false);
        erroraño.setVisible(false);
        combaño2.setVisible(false);
        combaño.setVisible(false);
        parametros.setVisible(false);
        buscarpor.setVisible(false);
        ejemplo.setVisible(false);
        campBuscar.setVisible(false);
        vertodos.setVisible(false);
        iniBuscar.setVisible(false);
        scroll.setVisible(false);
        verjuego.setVisible(false);
        volver.setVisible(true);
        verjuego.setVisible(true);
        
            modelotablaAll = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            //Añadimos las diferentes columnas
            modelotablaAll.addColumn("Nombre");
            modelotablaAll.addColumn("Genero");
            modelotablaAll.addColumn("Desarrollador");
            modelotablaAll.addColumn("Distribuidor");
            modelotablaAll.addColumn("Fecha de salida");
            //Añadimos una fila por cada juego
               // ArrayList<Juegos> game = con.devolverTodo();
            for(int i=0; i<game.size();i++){
                
                System.out.println(game.get(i));
                Juegos aux = game.get(i);
                String []juego = {aux.getNombre(),aux.getGenero(), aux.getDesarrollador(), aux.getDistribuidor(),
                                  aux.getFechaSalida(), aux.getEnlace()};
                modelotablaAll.addRow(juego);
            
            }
            
            
            
            
            
            //Creamos la tabla y le damos valores maximos y minimos al ancho de cada columna para evitar que el usuario pueda cambiarlas
            tablaAll = new JTable(modelotablaAll);
            
            tablaAll = new JTable(modelotablaAll);
            TableColumn columna = tablaAll.getColumn("Nombre");
            columna.setMaxWidth(150);
            columna.setMinWidth(150);
            TableColumn columna2 = tablaAll.getColumn("Desarrollador");
            columna2.setMaxWidth(150);
            columna2.setMinWidth(150);  
            TableColumn columna3 = tablaAll.getColumn("Genero");
            columna3.setMaxWidth(150);
            columna3.setMinWidth(150);
            TableColumn columna4 = tablaAll.getColumn("Distribuidor");
            columna4.setMaxWidth(130);
            columna4.setMinWidth(130);
            
            tablaAll.getTableHeader().setReorderingAllowed(false);
            scroll2 = new JScrollPane(tablaAll);
            scroll2.setBounds(20, 200, 690, 125);
            
            //Añadimos la tabla al panel
            panel.add(scroll2);

        }
    
    
    /*
    A continuación trataremos los eventos de esta clase, al pulsar los diferentes botones llamamos
    a los metodos correspondientes.
    */
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        
        //en opcion recogemos el valor que devuelve el evento en un String para poder comparar en el Switch
        String opcion = String.valueOf(ev.getActionCommand());
        int contador=0;
        
        switch(opcion){
            
            //Acceder a los elementos de busqueda
            case "Buscar" : 
                    elementosBuscar();
                    break;
            //Ver la tabla de juegos favoritos
            case "Favoritos":
                    cargaTablaFavoritos();
                    break;
            //Ir a la ventana de cambiar usuario
            case "Cambiar de usuario"  :
                    VentanaLogin VL = new VentanaLogin();
                    this.setVisible(false);
                    break;
            //Volver a los botones Buscar, Ver favoritos y Cambiar usuario
            case "Volver":
                    recibidor();
                    break;
            //Eventos cuando un combobox cambie de valor
            case "comboBoxChanged" :
                
                String param = (String)parametros.getSelectedItem();
                    
                switch(param){
                    //Mostrar el elemento para buscar por un año de salida
                    case "Fecha de salida":
                        buscarFecha();
                        break;
                    //Mostrar elementos para buscar por un intervalo de años
                    case "Intervalo de fechas":
                        buscarInterFecha();
                        break;
                    //Mostrar elementos para buscar por Nombre
                    case "Nombre": 
                        elementosBuscar();
                        ejemplo.setText("Como por ejemplo Portal, Fez, Bioshock...");
                        break;
                    //Mostrar elementos para buscar por Nombre
                    case"Genero" : 
                        elementosBuscar();
                        ejemplo.setText("Como por ejemplo FPS, RPG, Puzzle...");
                        break;
                    //Mostrar elementos para buscar por Genera
                    case"Desarrollador" :
                        elementosBuscar();
                        ejemplo.setText("Como por ejemplo Rockstar, Valve, Bethesda...");
                        break;
                    //Mostrar elementos para buscar por Desarrolladora
                    case"Distribuidor":
                        elementosBuscar();
                        ejemplo.setText("Como por ejemplo Sega, Valve, Gearbox...");
                        break;
                        
                }
                 break;
                
            //Mostrar la tabla con todos los juegos
            case "Ver todos":
                contador=1;
                cargaTablaAll(contador);
                break;
                
            case "Ver juego":
                verJuego();
                break;
                
            case "Iniciar Busqueda":
                
                contador = 2;
                if((combaño.isVisible()==true)&&(combaño2.isVisible()==false)){
                 contador=3;   
                }else if((combaño.isVisible()==true)&&(combaño2.isVisible()==true)){
                 contador=4;
                }
                System.out.println(contador);
                cargaTablaAll(contador);
                break;
        } 
}
    
    
    public void verJuego(){
        
        String auxtit;
            int i = tablaAll.getSelectedRow();
            auxtit = (String)tablaAll.getValueAt(i, 0);
            
            Juegos game;
            Juegos igame;
            game = con.devolverUno(auxtit);
            igame = con.devolverImagen(auxtit);
            System.out.println(igame.getPortada());
            
        VJ = new VentanaJuegos(game.getNombre(), game.getGenero(),  game.getDesarrollador(),  game.getDistribuidor(),
                game.getFechaSalida(),  game.getComentario(),  game.getEnlace(), igame.getPortada(), igame.getImagen1(), igame.getImagen2());
        
    }
            
            
}
