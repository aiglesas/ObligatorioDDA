package ui.controladores;

import dominio.Administrador;
import dominio.Propietario;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import logica.Fachada;
import ui.LoginVista;

public class LoginAdministradorControlador extends LoginControlador {

    public LoginAdministradorControlador(LoginVista vista)  {
        super(vista);
    }


    @Override
    protected Usuario loginGenerico(String ci, String password) {
    return Fachada.getInstance().LoginAdministrador(ci, password);    
    }



}
