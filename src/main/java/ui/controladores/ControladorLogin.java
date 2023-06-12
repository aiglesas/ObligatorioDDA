package ui.controladores;

import logica.Fachada;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionUsuario;
import ui.interfaces.LoginVista;

public abstract class ControladorLogin {

    protected LoginVista vista;

    public ControladorLogin(LoginVista vista) {
        this.vista = vista;
    }

    public void login(String userName, String password) {
        try {
            Usuario usuario = loginGenerico(userName, password);
            vista.ejecutarCasoDeUsoInicial(usuario);
        } catch (ExcepcionUsuario exU) {
            vista.mostrarMensajeDeError(exU.getMessage());
        }
    }

    protected abstract Usuario loginGenerico(String userName, String password) throws ExcepcionUsuario;

}
