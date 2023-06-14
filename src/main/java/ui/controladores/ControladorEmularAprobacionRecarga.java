package ui.controladores;

import logica.Fachada;
import common.Observable;
import common.Evento;
import common.ObservableAbstracto;
import common.Observador;
import dominio.Administrador;
import dominio.Propietario;
import dominio.RecargaSaldo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ui.interfaces.EmularAprobacionRecargaVista;

public class ControladorEmularAprobacionRecarga implements Observador {

    private final EmularAprobacionRecargaVista vista;

    private Fachada fachada;

    private final Administrador administrador;

    private ArrayList<RecargaSaldo> recargasSaldo;

    private ArrayList<Propietario> propietarios;

    public ControladorEmularAprobacionRecarga(EmularAprobacionRecargaVista vista, Administrador administrador /*,Propietario propietario*/) {
        this.vista = vista;
        this.fachada = Fachada.getInstance();
        this.administrador = administrador;
        propietarios = fachada.getPropietarios();
        recargasSaldo = new ArrayList<RecargaSaldo>();
        inicializar();
    }

    private void inicializar() {
        subscribirAPropietarios();
        actualizarRecargasPendientes();
    }

    public void mostrarRecargasPendientes() {
        this.vista.mostrarRecargasPendientes(recargasSaldo);
    }

    public void aprobarRecarga(int seleccionado) {
        if (seleccionado != -1) {
            RecargaSaldo recarga = this.recargasSaldo.get(seleccionado);
            recarga.aprobacionRecarga(administrador);
        } else {
            vista.mostrarMensajeDeError("Debe seleccionar una recarga");
        }
    }

    public void salirYDesubscribir() {
        desSubscribirAPropietarios();
        this.vista.cerrar();
    }

    public void actualizarRecargasPendientes() {
        recargasSaldo.clear();
        for (Propietario p : propietarios) {
            recargasSaldo.addAll(p.getRecargasPendientes());
        }
        mostrarRecargasPendientes();
    }

    public void subscribirAPropietarios() {
        for (Propietario p : propietarios) {
            p.agregar(this);
        }
    }

    public void desSubscribirAPropietarios() {
        for (Propietario p : propietarios) {
            p.quitar(this);
        }
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (evento.equals(Evento.RecargaSaldo) || evento.equals(Evento.AprobarRecargaSaldo)) {
            actualizarRecargasPendientes();
        }
    }
}
