package ui.controladores;

import common.Evento;
import common.Observable;
import common.ObservableAbstracto;
import logica.Fachada;
import common.Observador;
import dominio.Bonificacion;
import dominio.Propietario;
import dominio.Puesto;
import dominio.exceptions.ExcepcionAsignacion;
import dominio.exceptions.ExcepcionPropietario;
import java.util.ArrayList;
import ui.interfaces.AsignarBonificacionesVista;

public class ControladorAsignarBonificacion implements Observador{

    private AsignarBonificacionesVista vista;

    private Fachada fachada;

    private ArrayList<Bonificacion> bonificaciones;

    private ArrayList<Puesto> puestos;

    private Propietario propietario;

    public ControladorAsignarBonificacion(AsignarBonificacionesVista vista) {
        this.vista = vista;
        this.fachada = Fachada.getInstance();
        this.fachada.agregar(this);
        inicializar();
    }

    private void inicializar() {
        this.bonificaciones = fachada.getBonificaciones();
        this.puestos = fachada.getPuestos();
        this.vista.mostrarAsignarBonificacion(this.bonificaciones, this.puestos);
    }

    public void asignarBonificacion(String nombreBonificacion, String nombrePuesto) {

        if (!nombreBonificacion.equals("")) {
            if (!nombrePuesto.equals("")) {
                if (propietario != null) {
                    Bonificacion bonificacion = null;
                    Puesto puesto = null;
                    for (Bonificacion b : this.bonificaciones) {
                        if (b.getNombre().equals(nombreBonificacion)) {
                            bonificacion = b;
                        }
                    }
                    for (Puesto p : this.puestos) {
                        if (p.getNombre().equals(nombrePuesto)) {
                            puesto = p;
                        }
                    }
                    try {
                        fachada.asignarBonificacion(puesto, bonificacion, propietario);
                    } catch (ExcepcionAsignacion exP) {
                        vista.mostrarMensajeDeError(exP.getMessage());
                    }
                } else {
                    vista.mostrarMensajeDeError("Debe especificar un propietario");
                }
            } else {
                vista.mostrarMensajeDeError("Debe especificar un puesto");
            }
        } else {
            vista.mostrarMensajeDeError("Debe especificar una bonificación");
        }
    }

    public void buscarCedula(String cedula) {
        try {
            propietario = fachada.buscarPropietario(cedula);
            vista.mostrarPropietario(propietario);
        } catch (ExcepcionPropietario exP) {
            vista.mostrarMensajeDeError(exP.getMessage());
        }

    }

    @Override
    public void actualizar(Observable origen, Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if(evento.equals(Evento.AsignarBonificacion)){
            vista.mostrarPropietario(propietario);
        }
    }
}
