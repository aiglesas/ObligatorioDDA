package logica;

import dominio.Administrador;
import dominio.Propietario;
import dominio.Sesion;
import dominio.Usuario;
import dominio.exceptions.ExcepcionUsuario;
import java.util.ArrayList;

public class ServicioAdministrador extends ServicioUsuario {

    private ArrayList<Administrador> administradores;

    private ArrayList<Sesion> sesiones;

    public ServicioAdministrador() {
        this.administradores = new ArrayList<Administrador>();
        this.sesiones = new ArrayList<Sesion>();
    }

    public void cerrarSesion(Administrador administrador) {
        Sesion s = buscarSesion(administrador);
        this.sesiones.remove(s);
    }

    public void agregarAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }

    public Administrador buscarAdministrador(String cedula) {
        for (Administrador a : administradores) {
            if (a.getCi().equals(cedula)) {
                return a;
            }
        }
        return null;
    }

    public Sesion buscarSesion(Administrador administrador) {
        for (Sesion s : this.sesiones) {
            if (s.getAdministrador().equals(administrador)) {
                return s;
            }
        }
        return null;
    }

    public Administrador login(String cedula, String password) throws ExcepcionUsuario {
        for (Administrador a : administradores) {
            if (a.validarLogin(cedula, password)) {
                if (buscarSesion(a) != null) {
                    throw new ExcepcionUsuario("Ud. Ya está logueado");
                }
                crearSesion(a);
                return a;
            }
        }
        throw new ExcepcionUsuario("Acceso denegado");
    }
    
    public void crearSesion(Administrador administrador){
        sesiones.add(new Sesion(administrador));
    }

}
