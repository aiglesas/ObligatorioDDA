/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Propietario;
import dominio.Usuario;
import java.awt.Frame;
import javax.swing.JOptionPane;
import ui.controladores.ControladorLogin;
import ui.controladores.ControladorLoginPropietario;

public class DialogoLoginPropietario extends DialogoLogin {

    public DialogoLoginPropietario(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    protected ControladorLogin crearControlador() {

    return new ControladorLoginPropietario(this);

    }

    public void ejecutarCasoDeUsoInicial(Propietario propietario) {
        new DialogoTableroPropietario(propietario).setVisible(true);
    }

    @Override
    public void cerrarVista() {
     }

    @Override
    public void ejecutarCasoDeUsoInicial(Usuario usuario) {
        Propietario p = (Propietario) usuario;
        new DialogoTableroPropietario( p).setVisible(true);
    }

}
