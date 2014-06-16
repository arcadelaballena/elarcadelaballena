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
public class Usuario extends Persona {

    private int codigo, admin;
    private String contrasinal;

    public Usuario() {
    }

    public Usuario(int codigo, int admin, String contrasinal, String nombre, String alias, String ultFechaLogin) {
        super(nombre, alias, ultFechaLogin);
        this.codigo = codigo;
        this.admin = admin;
        this.contrasinal = contrasinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public String getContrasinal() {
        return contrasinal;
    }

    public void setContrasinal(String contrasinal) {
        this.contrasinal = contrasinal;
    }
}
