package ui.controladores;

import dominio.Propietario;
import ui.TableroPropietario;
import logica.Fachada;
import common.Observable;
import common.Evento;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import ui.interfaces.TableroPropietarioVista;

public class TableroPropietarioControlador {

    private Propietario propietario;

    private TableroPropietarioVista vista;

    public void borrarNotificacion() {

    }

    public TableroPropietarioControlador(TableroPropietarioVista vista, Usuario usuario) {
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

    /**
     * @see common.Obervador#actualizar(common.Observable, common.Evento)
     */
    public void actualizar(Observable origen, Evento evento) {

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
