package ui.controladores;

import dominio.Propietario;
import dominio.exceptions.ExcepcionPropietario;
import ui.RecargaSaldoVista;

public class ControladorRecargaSaldo {

    private Propietario propietario;

    private RecargaSaldoVista vista;

    public ControladorRecargaSaldo(RecargaSaldoVista vista, Propietario propietario) {
        this.propietario = propietario;
        this.vista = vista;

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
            propietario.recargarSaldo(saldoFloat);
        } catch (ExcepcionPropietario exP) {
            this.vista.mostrarMensajeDeError(exP.getMessage());
        }

    }

}
