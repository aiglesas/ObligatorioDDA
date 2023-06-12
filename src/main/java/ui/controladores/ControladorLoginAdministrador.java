package ui.controladores;

import dominio.Administrador;
import dominio.Propietario;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionUsuario;
import logica.Fachada;
import ui.interfaces.LoginVista;

public class ControladorLoginAdministrador extends ControladorLogin {

    private Fachada fachada;

    public ControladorLoginAdministrador(LoginVista vista) {
        super(vista);
        this.fachada = Fachada.getInstance();
    }

    @Override
    protected Usuario loginGenerico(String ci, String password) throws ExcepcionUsuario {
        return fachada.LoginAdministrador(ci, password);
    }

}
