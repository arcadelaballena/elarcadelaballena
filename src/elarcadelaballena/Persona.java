/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elarcadelaballena;

/**
 *
 * @author Iago
 */
public class Persona {

    private static String nombre,email;

    public Persona() {
    }
    public Persona(String nom_bre,String e_mail){
    nombre=nom_bre;  
    email=e_mail;
    
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nom_bre) {
        nombre = nom_bre;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String e_mail) {
        email=e_mail;
    }
    
}
