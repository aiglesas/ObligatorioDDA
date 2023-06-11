package ui.controladores;

import logica.Fachada;
import common.Observable;
import common.Evento;
import common.ObservableAbstracto;
import common.Observador;
import dominio.Administrador;
import dominio.RecargaSaldo;
import java.util.ArrayList;
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
        // Se suscribe para saber cuando se asignó una nueva agenda. Ejemplo de ObservableConcreto wrapped by Usuario.
        //Hay que ver como suscribirse, a quien ???
        //this.propietario.agregar(this);
        inicializar();
    }

    private void inicializar() {
        recargasSaldo = this.modelo.getRecargasPendientes();
        this.vista.mostrarRecargasPendientes(recargasSaldo);
    }

    public void aprobarRecarga(int seleccionado) {
        RecargaSaldo recarga = this.recargasSaldo.get(seleccionado);
        this.modelo.emularAprobacion(administrador, recarga);
        recargasSaldo = this.modelo.getRecargasPendientes();
        this.vista.mostrarRecargasPendientes(recargasSaldo);
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (evento.equals(Evento.RecargaSaldo)) {
            recargasSaldo = this.modelo.getRecargasPendientes();
            this.vista.mostrarRecargasPendientes(recargasSaldo);
        }

    }

    @Override
    public void actualizar(Observable origen, Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
