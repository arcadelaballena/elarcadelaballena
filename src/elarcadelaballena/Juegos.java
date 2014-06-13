/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elarcadelaballena;

/**
 *
 * @author Naruba
 */
public class Juegos {

    private String nombre, genero, desarrollador, distribuidor, fechaSalida, comentario, enlace;

    public Juegos() {
    }

    public Juegos(String nombre, String genero, String desarrollador, String distribuidor, String fechaSalida, String comentario, String enlace) {
        this.nombre = nombre;
        this.genero = genero;
        this.desarrollador = desarrollador;
        this.distribuidor = distribuidor;
        this.fechaSalida = fechaSalida;
        this.comentario = comentario;
        this.enlace = enlace;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

}
