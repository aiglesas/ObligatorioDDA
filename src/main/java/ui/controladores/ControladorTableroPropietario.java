package ui.controladores;

import dominio.Propietario;
import logica.Fachada;
import common.Observable;
import common.Evento;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import ui.interfaces.TableroPropietarioVista;

public class ControladorTableroPropietario {

    private Propietario propietario;

    private TableroPropietarioVista vista;

    public void borrarNotificacion() {

    }

    public ControladorTableroPropietario(TableroPropietarioVista vista, Usuario usuario) {
        try {
            this.propietario = Fachada.getInstance().buscarPropietario(usuario.getCi());
        } catch (ExcepcionPropietario exP) {
        }
        this.vista = vista;
        this.inicializador();
    }

    public void inicializador() {
        this.vista.mostrarTablero(propietario);
    }

    public void mostrarVehiculos() {
        vista.mostarVehiculos(propietario.getVehiculos());
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void recargaSaldo() {
        vista.recargaSaldo(propietario);
    }

    public void borrarNotificaiones() {
        vista.borrarNotificaciones(propietario);
    }

}
