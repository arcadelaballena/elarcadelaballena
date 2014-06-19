/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elarcadelaballena;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Naruba
 */
public class Fichlleno {

    Persona recibe = null;

    public void crearFavoritos(String recibe, String juego, String comentario) {
        if (!recibe.equals(null)) {
            PrintWriter escribir = null;
            FileWriter nuevo = null;
            try {
                nuevo = new FileWriter(recibe + ".txt", true);
                escribir = new PrintWriter(nuevo);
                escribir.println(juego + ", " + comentario);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problema con el fichero.");
            } finally {
                try {
                    nuevo.close();
                } catch (IOException ex) {
                    Logger.getLogger(Fichlleno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

    public ArrayList<String> listarFavoritos(String nombre) {

        File recoje = null;
        Scanner rec = null;
        ArrayList<String>meter = new ArrayList<String>();
        try {
            recoje = new File(nombre + ".txt");
            rec = new Scanner(recoje).useDelimiter(", ");
            while (rec.hasNextLine()) {
                meter.add(rec.next());
            }
          

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Fallo en la lectura del fichero");

        } finally {
            try {
                rec.close();
            } catch (Exception ex) {
                Logger.getLogger(Fichlleno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return meter;
    }

}
