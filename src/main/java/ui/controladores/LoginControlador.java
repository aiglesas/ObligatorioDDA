package ui.controladores;

import ui.LoginVista;
import logica.Fachada;
import dominio.Usuario;

public abstract class LoginControlador {

	private LoginVista loginVista;

	private Fachada fachada;

	/**
	 * UsuarioGenerico usuario =loginGenerico(nombreUsuario, password);
	 *         if (usuario == null) {
	 * //ToDo: Try/catch            vista.mostrarMensajeDeError("Nombre/Password erroneo.";} else { vista.ejecutarCasoUsoInicial(usuario);
	 * vista.cerrarVista();
	 *         }
	 */
	public void login(String userName, String password) {

	}

	protected abstract Usuario loginGenerico(String ci, String password);

}
