package ui.controladores;

import dominio.Usuario;
import dominio.exceptions.ExcepcionUsuario;
import logica.Fachada;
import ui.interfaces.LoginVista;

public class ControladorLoginPropietario extends ControladorLogin {

    public ControladorLoginPropietario(LoginVista vista) {
        super(vista);
    }

    @Override
    protected Usuario loginGenerico(String userName, String password) throws ExcepcionUsuario{
        return Fachada.getInstance().loginPropietario(userName, password);
    }

}
