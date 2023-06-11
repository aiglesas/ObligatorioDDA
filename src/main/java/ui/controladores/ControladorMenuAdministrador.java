package ui.controladores;

import dominio.Administrador;
import ui.MenuAdministradorVista;

public class ControladorMenuAdministrador {

    private Administrador administrador;

    private MenuAdministradorVista menuAdministrador;

    public ControladorMenuAdministrador(Administrador administrador, MenuAdministradorVista menuAdministrador) {
        this.administrador = administrador;
        this.menuAdministrador = menuAdministrador;
    }
    
    public Administrador getAdministrador(){
        return this.administrador;
    }
}
