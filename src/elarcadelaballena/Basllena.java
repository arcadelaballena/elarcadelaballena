/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elarcadelaballena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iago
 */
public class Basllena {

    private Juegos leyenda;
    private Connection conexion;
    private Statement consulta;
    private ResultSet resultado;

    public Basllena() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/basllena", "root", "root");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, " Error en el Driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion");
        }
    }

    public ArrayList<Juegos> devolverTodo() {
        ArrayList<Juegos> ley = new ArrayList();
        try {

            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from juegos;");
            while (resultado.next()) {

                ley.add(new Juegos(resultado.getString("nombre"),
                        resultado.getString("genero"),
                        resultado.getString("desarrollador"),
                        resultado.getString("distribuidor"),
                        resultado.getString("fechaSalida"),
                        resultado.getString("comentario"),
                        resultado.getString("enlace")));//Almacena mos los datos en el arrayList.

            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de consulta");
        }

        return ley;//devuelve el ArrayList declarado arriba de tipo Juegos. 
    }

    public ArrayList<Juegos> devolverBusqueda(String campo, String busca) {//Variables para encontrar el juego exacto
        ArrayList<Juegos> ley = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from juegos where " + campo + " like '%" + busca + "%';");//SENSIBLE A MAYUSCULAS
            while (resultado.next()) {
                ley.add(new Juegos(resultado.getString("nombre"),
                        resultado.getString("genero"),
                        resultado.getString("desarrollador"),
                        resultado.getString("distribuidor"),
                        resultado.getString("fechaSalida"),
                        resultado.getString("comentario"),
                        resultado.getString("enlace")));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de consulta");
        }
        return ley;
    }

    public ArrayList<Juegos> devolverFecha(String fecha1, String fecha2) {//Variables para encontrar el juego exacto
        ArrayList<Juegos> ley = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from juegos where fechaSalida>='" + fecha1 + "' AND fechaSalida<='" + fecha2 + "';");
            while (resultado.next()) {
                ley.add(new Juegos(resultado.getString("nombre"),
                        resultado.getString("genero"),
                        resultado.getString("desarrollador"),
                        resultado.getString("distribuidor"),
                        resultado.getString("fechaSalida"),
                        resultado.getString("comentario"),
                        resultado.getString("enlace")));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de consulta");
        }
        return ley;
    }

    public Juegos devolverUno(String exacto) {

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from juegos where nombre='" + exacto + "';");//SENSIBLE A MAYUSCULAS
            while (resultado.next()) {
                leyenda = new Juegos(resultado.getString("nombre"),
                        resultado.getString("genero"),
                        resultado.getString("desarrollador"),
                        resultado.getString("distribuidor"),
                        resultado.getString("fechaSalida"),
                        resultado.getString("comentario"),
                        resultado.getString("enlace"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de consulta");
        }
        return leyenda;
    }

    public Juegos devolverImagen(String nombre) {

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from imagenesjuegos where ID in (select ID from juegos where nombre='" + nombre + "');");//SENSIBLE A MAYUSCULAS
            //Devuelve la portada imagen 1 y 2 del juego seleccionado.
            while (resultado.next()) {
                leyenda = new Juegos(resultado.getString("portada"),
                        resultado.getString("imagen1"),
                        resultado.getString("imagen2"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de consulta");
        }
        return leyenda;
    }

    public boolean comprobarUser(String nombre, String contra) {
        boolean comprobante = false;
        String[] nombres = null;
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select nombre from usuarios;");
            while (resultado.next()) {
                nombres = new String[]{resultado.getString("nombre")};
            }
            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i].equalsIgnoreCase(nombre)) {

                    if (comprobarContra(nombre, contra)) {
                        comprobante = true;
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El nombre no concuerda con ninguno existente.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de la consulta");
        }
        return comprobante;
    }

    public boolean comprobarContra(String nombre, String contra) {
        String comprueba = null;
        boolean comprobante = false;
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select contraseña from usuarios where nombre='admin';");
            while (resultado.next()) {
                comprueba = resultado.getString("contraseña");
                if (comprueba.equals(contra)) {
                    System.out.println(comprueba);
                    comprobante = true;

                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no concuerda");
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la obtencion de la consulta");
        }
        return comprobante;
    }
}
