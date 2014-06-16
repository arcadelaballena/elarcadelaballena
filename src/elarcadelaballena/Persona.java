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

    private String nombre, alias,email;

    public Persona() {
    }
    public Persona(String nombre,String alias,String email){
    this.nombre=nombre;
    this.alias=alias;
    this.email=email;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }
    
}
