package logica;

import common.Evento;
import common.Observable;
import common.ObservableAbstracto;
import common.Observador;
import dominio.Administrador;
import dominio.Asignacion;
import dominio.Bonificacion;
import dominio.Propietario;
import dominio.Puesto;
import dominio.RecargaSaldo;
import dominio.Transito;
import dominio.Usuario;
import dominio.Vehiculo;
import dominio.exceptions.ExcepcionAsignacion;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionRecargaSaldo;
import dominio.exceptions.ExcepcionUsuario;
import java.util.ArrayList;

public class Fachada {

    private static Fachada instacia;

    private ServicioPropietario servicioPropietario;

    private ServicioAdministrador servicioAdministrador;

    private ServicioPuesto servicioPuesto;

    private ServicioVehiculo servicioVehiculo;

    private ServicioBonificacion servicioBonificacion;

    private ServicioUsuario servicioUsuario;

    public Fachada() {
        this.servicioPropietario = new ServicioPropietario();
        this.servicioAdministrador = new ServicioAdministrador();
        this.servicioPuesto = new ServicioPuesto();
        this.servicioVehiculo = new ServicioVehiculo();
        this.servicioBonificacion = new ServicioBonificacion();
    }

    public synchronized static Fachada getInstance() {
        if (instacia == null) {
            instacia = new Fachada();
        }
        return instacia;
    }

    public ArrayList<Propietario> getPropietarios() {
        return servicioPropietario.getPropietarios();
    }

    public void cerrarSesion(Administrador administrador) {
        servicioAdministrador.cerrarSesion(administrador);
    }

    public Administrador LoginAdministrador(String ci, String password) throws ExcepcionUsuario {
        return servicioAdministrador.login(ci, password);
    }

    public Usuario loginPropietario(String ci, String password) {
        return servicioPropietario.login(ci, password);
    }

    public Asignacion obtenerAsignacion(Propietario propietario) {
        return null;
    }

    public Transito emularTransito(Vehiculo vehiculo) {
        return null;
    }

    public ArrayList<Puesto> getPuestos() {
        return servicioPuesto.getPuestos();
    }

    public ArrayList<Bonificacion> getBonificaciones() {
        return servicioBonificacion.getBonificaciones();
    }

    public Vehiculo obtenerVehiculo(String matricula) {
        return null;
    }

    public Propietario buscarPropietario(String cedula) throws ExcepcionPropietario {
        return servicioPropietario.buscarPropietario(cedula);
    }

    public void agregarPropietario(Propietario propietario) {
        servicioPropietario.agregarPropietario(propietario);
    }

    public void agregarAdministrador(Administrador administrador) {
        servicioAdministrador.agregarAdministrador(administrador);
    }

    public void setBonificaciones(ArrayList<Bonificacion> bonificaciones) {
        servicioBonificacion.setBonificaciones(bonificaciones);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        servicioVehiculo.agregarVehiculo(vehiculo);
    }

    public void agregarPuesto(Puesto puesto) {
        servicioPuesto.agregarPuesto(puesto);
    }
}
