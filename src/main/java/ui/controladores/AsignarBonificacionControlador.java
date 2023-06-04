package ui.controladores;

import ui.AsignarBonificaciones;
import common.Obervador;
import logica.Fachada;
import common.Observable;
import common.Evento;

public class AsignarBonificacionControlador implements AsignarBonificaciones, Obervador {

	private AsignarBonificacionControlador asignarBonificacionControlador;

	private AsignarBonificaciones asignarBonificaciones;

	private Fachada fachada;

	public void mostrarAsignarBonificacion() {

	}

	public void asignarBonificacion() {

	}

	public void buscarCedula(String cedula) {

	}

	public void cerrar() {

	}


	/**
	 * @see ui.AsignarBonificaciones#mostrarBonificaciones()
	 */
	public void mostrarBonificaciones() {

	}


	/**
	 * @see ui.AsignarBonificaciones#mostrarPuestos()
	 */
	public void mostrarPuestos() {

	}


	/**
	 * @see common.Obervador#actualizar(common.Observable, common.Evento)
	 */
	public void actualizar(Observable origen, Evento evento) {

	}

}
