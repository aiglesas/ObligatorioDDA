package ui.interfaces;

import dominio.RecargaSaldo;
import java.util.ArrayList;

public interface EmularAprobacionRecargaVista {
        
        public abstract void mostrarRecargasPendientes(ArrayList<RecargaSaldo> recargasSaldo);

	public abstract void aprobarRecarga();

        public abstract void mostrarMensajeDeError(String mensaje);
        
	public abstract void cerrar();
}
