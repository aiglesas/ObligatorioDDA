package ui.controladores;

import logica.Fachada;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import ui.interfaces.LoginVista;

public abstract class LoginControlador {

    protected LoginVista vista;

    public LoginControlador(LoginVista vista) {
        this.vista = vista;
    }

    public void login(String userName, String password) {
        Usuario usuario = loginGenerico(userName, password);
        if (usuario == null) {
            vista.mostrarMensajeDeError("Nombre/Password erroneo.");
        } else {
            vista.ejecutarCasoDeUsoInicial(usuario);
            //vista.cerrarVista();
        }
    }

    protected abstract Usuario loginGenerico(String userName, String password);

}
