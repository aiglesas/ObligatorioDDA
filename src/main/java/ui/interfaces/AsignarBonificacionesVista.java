package ui.interfaces;

import dominio.Asignacion;
import dominio.Bonificacion;
import dominio.Propietario;
import dominio.Puesto;
import java.util.ArrayList;

public interface AsignarBonificacionesVista {

	public abstract void mostrarAsignarBonificacion(ArrayList<Bonificacion> bonificaciones, ArrayList<Puesto> puestos);

	public abstract void mostrarBonificaciones(ArrayList<Bonificacion> bonificaciones);

	public abstract void mostrarPuestos(ArrayList<Puesto> puestos);

	public abstract void buscarCedula(String cedula);
        
        public abstract void mostrarMensajeDeError(String mensaje);
        
        public abstract void mostrarPropietario(Propietario propietario);
        
        public abstract void mostrarNombreCompleto(String nombreCompleto);
        
        public abstract void mostrarAsignaciones(ArrayList<Asignacion> asignaciones);

        public abstract void asignarBonificacion(String nombreBonificacion, String nombrePuesto);
        
        public abstract void cerrar();
}
