package ui.interfaces;

import dominio.Puesto;
import java.util.ArrayList;

public interface EmularTransitoVista {

	public abstract void mostrarPuestos(ArrayList<Puesto> puestos);

	public abstract void mostrarTarifas(Puesto puesto);

	public abstract void registrarTransito();

	public abstract void cerrar();

	public abstract void mostrarMensajeDeError(String mensaje);
        
        public void mostrarMensajeDeExito(String mensaje);
}
