package ui.controladores;

import dominio.Puesto;
import dominio.Vehiculo;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionVehiculo;
import java.util.ArrayList;
import logica.Fachada;
import ui.interfaces.EmularTransitoVista;

public class ControladorEmularTransito {

    private EmularTransitoVista vista;

    private Fachada modelo;

    private ArrayList<Puesto> puestos;

    private Puesto puestoSeleccionado;

    public ControladorEmularTransito(EmularTransitoVista vista) {
        this.vista = vista;
        this.modelo = Fachada.getInstance();
        inicializar();
    }

    public void inicializar() {
        mostrarPuestos();
    }

    public void mostrarPuestos() {
        puestos = modelo.getPuestos();
        vista.mostrarPuestos(puestos);
    }

    public void mostrarTarifas(String nombrePuesto) {
        for (Puesto p : puestos) {
            if (p.getNombre().equals(nombrePuesto)) {
                vista.mostrarTarifas(p);
                puestoSeleccionado = p;
            }
        }
    }

    public void registrarTransito(String matricula) {
        try {
            Vehiculo vehiculo = modelo.getVehiculo(matricula);
            if (puestoSeleccionado != null) {
                puestoSeleccionado.crearTransito(vehiculo);
                vista.mostrarMensajeDeExito("Transito creado correctamente");
            }else{
                vista.mostrarMensajeDeError("Debe seleccionar un puesto");
            }

        } catch (ExcepcionVehiculo | ExcepcionPropietario ex) {
            vista.mostrarMensajeDeError(ex.getMessage());
        }
    }
}
