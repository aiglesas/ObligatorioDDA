/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Propietario;
import dominio.Usuario;
import java.awt.Frame;
import ui.controladores.LoginControlador;
import ui.controladores.LoginPropietarioControlador;

public class DialogoLoginPropietario extends DialogoLogin {

    public DialogoLoginPropietario(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    protected LoginControlador crearControlador() {
        return new LoginPropietarioControlador(this);
    }

    public void ejecutarCasoDeUsoInicial(Propietario propietario) {
        new DialogoTableroPropietario(propietario).setVisible(true);
    }

    @Override
    public void mostrarMensajeDeError(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cerrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ejecutarCasoDeUsoInicial(Usuario usuario) {
        new DialogoTableroPropietario((Usuario) usuario).setVisible(true);
    }

}
