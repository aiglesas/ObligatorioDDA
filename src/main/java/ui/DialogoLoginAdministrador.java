/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Usuario;
import java.awt.Frame;
import ui.controladores.LoginAdministradorControlador;
import ui.controladores.LoginControlador;

/**
 *
 * @author usuario
 */
public class DialogoLoginAdministrador extends DialogoLogin {

    public DialogoLoginAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
    }    

    @Override
    protected LoginControlador crearControlador() {
        return new LoginAdministradorControlador(this);
    }

    @Override
    public void ejecutarCasoDeUsoInicial(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarMensajeDeError(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cerrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

   