package logica;

import dominio.Administrador;
import dominio.Propietario;
import dominio.Sesion;
import dominio.Usuario;
import java.util.ArrayList;

public class ServicioAdministrador extends ServicioUsuario {

    private ArrayList<Administrador> administradores;

    private ArrayList<Sesion> sesiones;

    public ServicioAdministrador() {
        this.administradores = new ArrayList<Administrador>();
    }

    public void logout(Administrador administrador) {

    }

    public void agregarAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }

    public Administrador buscarAdministrador(String cedula) {
        return null;
    }

    public Usuario login(String cedula, String password) {
        for (Administrador a : administradores) {
            if (a.getCi().equals(cedula) && a.getContraseña().equals(password)) {
                return a;
            }
        }
        return null;
    }

}
