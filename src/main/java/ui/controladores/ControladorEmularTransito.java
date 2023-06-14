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
    }

    public void mostrarEmuladorTransito(String matricula) {

    }

    public void mostrarPuestos() {
        puestos = modelo.getPuestos();
        vista.mostrarPuestos(puestos);
    }

    public void mostrarTarifas(String nombrePuesto) {
        for (Puesto p : puestos) {
            if (p.getNombre() == nombrePuesto) {
                vista.mostrarTarifas(p);
                puestoSeleccionado = p;
            }
        }
    }

    public void registrarTransito(String matricula) {
        try {
            Vehiculo vehiculo = modelo.getVehiculo(matricula);
            puestoSeleccionado.crearTransito(vehiculo);
        } catch (ExcepcionVehiculo | ExcepcionPropietario ex) {
            vista.mostrarMensajeDeError(ex.getMessage());    
        }
    }

    public void cerrar() {

    }

}
