package ui.controladores;

import dominio.Propietario;
import dominio.exceptions.ExcepcionPropietario;
import logica.Fachada;
import ui.RecargaSaldoVista;

public class ControladorRecargaSaldo {

    private Propietario propietario;

    private RecargaSaldoVista vista;
    
    private Fachada fachada;

    public ControladorRecargaSaldo(RecargaSaldoVista vista, Propietario propietario) {
        this.propietario = propietario;
        this.vista = vista;
        this.fachada = Fachada.getInstance();
        inicializar();
    }

    public void inicializar() {
        this.vista.mostrarNombreCompleto(this.propietario.getNombreCompleto());
        Float monto = this.propietario.getSaldo();
        this.vista.mostrarSueldoActual(monto.toString());
    }

    public void recargarSaldo(String saldo) {
        try 
        {
            Float saldoFloat = Float.parseFloat(saldo);
            fachada.recargarSaldo(saldoFloat, this.propietario);
        } catch (ExcepcionPropietario exP) {
            this.vista.mostrarMensajeDeError(exP.getMessage());
        }

    }

}
