package ui.controladores;

import common.Evento;
import common.ObservableAbstracto;
import common.Observador;
import dominio.Propietario;
import dominio.Puesto;
import dominio.RecargaSaldo;
import dominio.exceptions.ExcepcionRecargaSaldo;
import logica.Fachada;
import ui.interfaces.RecargaSaldoVista;

public class ControladorRecargaSaldo implements Observador {

    private Propietario propietario;

    private RecargaSaldoVista vista;

    public ControladorRecargaSaldo(RecargaSaldoVista vista, Propietario propietario) {
        this.propietario = propietario;
        this.vista = vista;
        this.propietario.agregar(this);
        subscribir();
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
            this.propietario.recargarSaldo(saldoFloat);
            desuscribirYSalir();
        } catch (ExcepcionRecargaSaldo exRS) {
            this.vista.mostrarMensajeDeError(exRS.getMessage());
        }
    }
        public void subscribir() {
        for (Puesto p : Fachada.getInstance().getPuestos()) {
            p.agregar(this);
        }
    }

    public void desSubscribir() {
        for (Puesto p : Fachada.getInstance().getPuestos()) {
            p.quitar(this);
        }
    }
    public void desuscribirYSalir(){
        desSubscribir();
        this.propietario.quitar(this);
        this.vista.cerrarVista();
    }    

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (evento.equals(Evento.AprobarRecargaSaldo) || evento.equals(Evento.CrearTransito)) {
            Float monto = this.propietario.getSaldo();
            this.vista.mostrarSueldoActual(monto.toString());
        }
    }

}
