package ui.controladores;

import dominio.Propietario;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import logica.Fachada;
import ui.LoginVista;

public class LoginPropietarioControlador extends LoginControlador {

    public LoginPropietarioControlador(LoginVista vista) {
        super(vista);
    }

    @Override
    protected Usuario loginGenerico(String userName, String password) {
        Usuario usuario = Fachada.getInstance().loginPropietario(userName, password);
        if (usuario != null) {
            //return Fachada.getInstance().buscarPropietario(usuario.getCi());
        } else {
        }
            return null;
    }


}


