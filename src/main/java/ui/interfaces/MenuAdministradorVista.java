package ui.interfaces;

import dominio.Administrador;

public interface MenuAdministradorVista {

	public abstract void mostrarDialogoEmularTransito();
	public abstract void mostrarDialogoEmularAprobacionRecarga(Administrador administrador);
	public abstract void mostrarDialogoAsignarBonificaciones();
	public abstract void salir();
}
