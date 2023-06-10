package ui.controladores;

import dominio.Propietario;
import ui.TableroPropietario;
import logica.Fachada;
import common.Observable;
import common.Evento;
import dominio.Usuario;
import ui.TableroPropietarioVista;

public class TableroPropietarioControlador {

    private Propietario propietario;

    private TableroPropietarioVista vista;

    public void borrarNotificacion() {

    }

    public void recargaSaldo() {

    }

    public void mostrarTablero(Usuario usuario) {
        vista.mostrarTablero(Fachada.getInstance().buscarPropietario(usuario.getCi()));

    }

    /**
     * @see common.Obervador#actualizar(common.Observable, common.Evento)
     */
    public void actualizar(Observable origen, Evento evento) {

    }

}
