package logica;

import dominio.Usuario;

public abstract class ServicioUsuario {

	private Usuario[] usuario;

	private Fachada fachada;

	public boolean validarLogin(String ci, String password) {
		return false;
	}

}
