/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elarcadelaballena;

import basesdedatos.Basesdedatos;

/**
 *
 * @author Pedro
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Basesdedatos datos = new Basesdedatos(null,"basllena", "root", "root");
        datos.conectar();
        String[] prueba = datos.seleccion("*", "juegos", null);
        for (int i=0;i<prueba.length;i++){
            System.out.println(prueba[i]);
        }
        //VentanaJuegos obx = new VentanaJuegos();
        //VentanaLogin log = new VentanaLogin();
        //VentanaBusqueda busq = new VentanaBusqueda();
    }
}
