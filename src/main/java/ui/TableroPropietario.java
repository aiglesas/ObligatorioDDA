package ui;

import dominio.Propietario;

public interface TableroPropietario {

	public void cerrar();

	public abstract void mostarTablero(Propietario propietario);

	public abstract void mostrarVehiculos(Propietario propietario);

	public abstract void mostrarBonificaciones(Propietario propietario);

	public abstract void mostrarTransitos(Propietario propietario);

	public abstract void mostrarRegargas(Propietario propietario);

	public abstract void mostrarNotificaciones(Propietario propietario);

	public abstract void mostrarNombreCompletoYSaldoActual(Propietario propietario);

}
