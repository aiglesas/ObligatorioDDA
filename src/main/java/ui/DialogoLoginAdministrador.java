/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Administrador;
import dominio.Usuario;
import java.awt.Frame;
import ui.controladores.ControladorLoginAdministrador;
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
        return new ControladorLoginAdministrador(this);
    }

    @Override
    public void ejecutarCasoDeUsoInicial(Usuario usuario) {
        new DialogoMenuAdministrador((Administrador)usuario).setVisible(true);
    }
}

   