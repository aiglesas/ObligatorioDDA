package ui;

import ui.controladores.LoginControlador;
import dominio.Usuario;

public abstract class DialogoLogin implements LoginVista {

	private LoginControlador loginControlador;


	/**
	 * @see ui.LoginVista#mostrarMensajeDeError(java.lang.String)
	 */
	public void mostrarMensajeDeError(String mensaje) {

	}


	/**
	 * @see ui.LoginVista#cerrarVista()
	 */
	public void cerrarVista() {

	}


	/**
	 * @see ui.LoginVista#ejecutarCasoDeUsoInicial(dominio.Usuario)
	 *  
	 */
	public void ejecutarCasoDeUsoInicial(Usuario usuario) {

	}

}
