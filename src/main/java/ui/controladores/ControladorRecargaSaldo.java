package ui.controladores;

import common.Evento;
import common.Observable;
import common.ObservableAbstracto;
import common.Observador;
import dominio.Propietario;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionRecargaSaldo;
import logica.Fachada;
import ui.interfaces.RecargaSaldoVista;

public class ControladorRecargaSaldo implements Observador {

    private Propietario propietario;

    private RecargaSaldoVista vista;

    private Fachada fachada;

    public ControladorRecargaSaldo(RecargaSaldoVista vista, Propietario propietario) {
        this.propietario = propietario;
        this.vista = vista;
        this.fachada = Fachada.getInstance();
        this.fachada.agregar(this);
        inicializar();
    }

    public void inicializar() {
        this.vista.mostrarNombreCompleto(this.propietario.getNombreCompleto());
        Float monto = this.propietario.getSaldo();
        this.vista.mostrarSueldoActual(monto.toString());
    }

    public void recargarSaldo(String saldo) {
        try {
            Float saldoFloat = Float.parseFloat(saldo);
            fachada.recargarSaldo(saldoFloat, this.propietario);
        } catch (ExcepcionRecargaSaldo exRS) {
            this.vista.mostrarMensajeDeError(exRS.getMessage());
        }

    }

    @Override
    public void actualizar(Observable origen, Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (evento.equals(Evento.AprobarRecargaSaldo)) {
            Float monto = this.propietario.getSaldo();
            this.vista.mostrarSueldoActual(monto.toString());
        }
    }

}
