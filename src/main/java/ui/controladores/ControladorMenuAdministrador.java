package ui.controladores;

import dominio.Administrador;
import ui.interfaces.MenuAdministradorVista;

public class ControladorMenuAdministrador {

    private Administrador administrador;

    private MenuAdministradorVista vista;

    public ControladorMenuAdministrador(Administrador administrador, MenuAdministradorVista menuAdministrador) {
        this.administrador = administrador;
        this.vista = menuAdministrador;
    }

    public Administrador getAdministrador() {
        return this.administrador;
    }
}
