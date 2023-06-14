package ui.controladores;

import dominio.Administrador;
import logica.Fachada;
import ui.interfaces.MenuAdministradorVista;

public class ControladorMenuAdministrador {

    private Administrador administrador;

    private MenuAdministradorVista vista;

    public ControladorMenuAdministrador(Administrador administrador, MenuAdministradorVista menuAdministrador) {
        this.administrador = administrador;
        this.vista = menuAdministrador;
    }

    public void navegar(String opcion) {
        switch (opcion) {
            case "emularTransito":
                vista.mostrarDialogoEmularTransito();
                break;
            case "emularAprobacionRecarga":
                vista.mostrarDialogoEmularAprobacionRecarga(administrador);
                break;
            case "asignarBonificacion":
                vista.mostrarDialogoAsignarBonificaciones();
                break;
            case "salir":
                cerrarSesion();
                vista.salir();
                break;
        }
    }
    public void cerrarSesion(){
        Fachada.getInstance().cerrarSesion(administrador);
    }
}
