package ui.controladores;

import logica.Fachada;
import dominio.Usuario;

public abstract class LoginControlador {


	private Fachada fachada;




    protected abstract Usuario loginGenerico(String userName, String password);

}
