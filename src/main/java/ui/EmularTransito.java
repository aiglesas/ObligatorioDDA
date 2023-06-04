package ui;

import dominio.Puesto;

public interface EmularTransito {

	public abstract void mostrarEmuladorTransito();

	public abstract void mostrarPuestos();

	public abstract void mostrarTarifas(Puesto puesto);

	public abstract void registrarTransito();

	public abstract void cerrar();

	public abstract void mostrarMensajeDeError(String mensaje);

}
