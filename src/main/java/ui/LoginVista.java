package ui;

import dominio.Usuario;

public interface LoginVista {

	public abstract void mostrarMensajeDeError(String mensaje);

	public abstract void cerrarVista();

	public abstract void ejecutarCasoDeUsoInicial(Usuario usuario);

}
