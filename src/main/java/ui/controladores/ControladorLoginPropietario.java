package ui.controladores;

import dominio.Propietario;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import logica.Fachada;
import ui.interfaces.LoginVista;

public class ControladorLoginPropietario extends ControladorLogin {

    public ControladorLoginPropietario(LoginVista vista) {
        super(vista);
    }

    @Override
    protected Usuario loginGenerico(String userName, String password) {
        return Fachada.getInstance().loginPropietario(userName, password);
    }

}
