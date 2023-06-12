package ui.controladores;

import logica.Fachada;
import common.Observable;
import common.Evento;
import common.ObservableAbstracto;
import common.Observador;
import dominio.Administrador;
import dominio.RecargaSaldo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ui.interfaces.EmularAprobacionRecargaVista;

public class ControladorEmularAprobacionRecarga implements Observador {

    private final EmularAprobacionRecargaVista vista;

    private Fachada modelo;

    private final Administrador administrador;

    private ArrayList<RecargaSaldo> recargasSaldo;

    public ControladorEmularAprobacionRecarga(EmularAprobacionRecargaVista vista, Administrador administrador /*,Propietario propietario*/) {
        this.vista = vista;
        this.modelo = Fachada.getInstance();
        this.administrador = administrador;
        this.modelo.agregar(this);
        inicializar();
    }

    private void inicializar() {
        recargasSaldo = this.modelo.getRecargasPendientes();
        this.vista.mostrarRecargasPendientes(recargasSaldo);
    }

    public void aprobarRecarga(int seleccionado) {
        RecargaSaldo recarga = this.recargasSaldo.get(seleccionado);
        this.modelo.emularAprobacionRecarga(administrador, recarga);
        recargasSaldo = this.modelo.getRecargasPendientes();
        Date fecha = Calendar.getInstance().getTime();
        recarga.getPropietario().ingresarNotificacion(fecha, "Tu recarga de $" + recarga.getMonto() + " de la recarga fue aprobada");
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (evento.equals(Evento.RecargaSaldo) || evento.equals(Evento.AprobarRecargaSaldo)) {
            recargasSaldo = this.modelo.getRecargasPendientes();
            this.vista.mostrarRecargasPendientes(recargasSaldo);
        }

    }

    @Override
    public void actualizar(Observable origen, Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
