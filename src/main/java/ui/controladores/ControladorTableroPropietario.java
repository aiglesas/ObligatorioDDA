package ui.controladores;

import common.Evento;
import common.ObservableAbstracto;
import dominio.Propietario;
import common.Observador;
import dominio.Notificacion;
import dominio.RecargaSaldo;
import dominio.Transito;
import java.util.ArrayList;
import java.util.Collections;
import ui.interfaces.TableroPropietarioVista;

public class ControladorTableroPropietario implements Observador {

    private Propietario propietario;

    private TableroPropietarioVista vista;

    public ControladorTableroPropietario(TableroPropietarioVista vista, Propietario propietario) {
        this.propietario = propietario;
        this.vista = vista;
        this.inicializador();
        this.propietario.agregar(this);
    }

    public void inicializador() {
        this.vista.mostrarTablero(propietario);
        this.mostrarTransitos();
        this.mostrarRecargas();
        this.mostrarNotificaciones();
    }

    public void mostrarTransitos() {
        ArrayList<Transito> transitos = propietario.getTransitos();
        Collections.sort(transitos);
        vista.mostrarTransitos(transitos);
    }

    public void mostrarRecargas() {
        ArrayList<RecargaSaldo> rss = propietario.getRecargasSaldo();
        Collections.sort(rss);
        vista.mostrarRecargas(rss);
    }

    public void mostrarNotificaciones() { 
        ArrayList<Notificacion> notificaciones = propietario.getNotificaciones();
        Collections.sort(notificaciones);
        vista.mostrarNotificacion(notificaciones);
    }
    
    public void mostrarBonificaciones(){
        vista.mostrarBonificaciones(propietario.getAsignaciones());
    }
    
    public void mostrarSaldo(){
        vista.mostrarSaldo(Float.toString(propietario.getSaldo()));
    }

    public void borrarNotificacion() {
        propietario.eliminarNotificaciones();
    }

    public void recargaSaldo() {
        vista.recargaSaldo(propietario);
    }

    public void borrarNotificaiones() {
        vista.borrarNotificaciones(propietario);
    }
    
    public void cerrar(){
        propietario.quitar(this);
        vista.cerrar();
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        switch (evento) {
            case RecargaSaldo:
                mostrarRecargas();
                break;
            case AprobarRecargaSaldo:
                mostrarSaldo();
                mostrarRecargas();
                break;
            case AsignarBonificacion:
                mostrarBonificaciones();
                break;
            case ingresoNotifiacion:
                mostrarNotificaciones();
                break;
            case eliminarNotificaciones:
                mostrarNotificaciones();
                break;
        }
    }
}
