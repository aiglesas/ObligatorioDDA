package logica;

import dominio.Administrador;
import dominio.Propietario;
import dominio.Sesion;
import dominio.Usuario;

public class ServicioAdministrador extends ServicioUsuario {

	private Administrador[] administrador;

	private Sesion[] sesion;

	public void logout(Administrador administrador) {

	}

	public Administrador buscarAdministrador(String cedula) {
		return null;
	}
        
        public Usuario login(String cedula, String password) {
        for (Administrador a : administrador) {
           if(a.getCi().equals(cedula) && a.getContraseña().equals(password)){
               return a;
            }
        }
        return null;
    }
        

}
