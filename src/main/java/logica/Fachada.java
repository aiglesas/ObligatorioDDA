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
import dominio.Tarifa;
import dominio.Transito;
import dominio.Usuario;
import dominio.Vehiculo;
import dominio.exceptions.ExcepcionAsignacion;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionRecargaSaldo;
import dominio.exceptions.ExcepcionUsuario;
import dominio.exceptions.ExcepcionVehiculo;
import java.util.ArrayList;

public class Fachada extends ObservableAbstracto implements Observador {

    private static Fachada instacia;

    private ServicioPropietario servicioPropietario;

    private ServicioAdministrador servicioAdministrador;

    private ServicioPuesto servicioPuesto;

    private ServicioVehiculo servicioVehiculo;

    private ServicioRecargaSaldo servicioRecargaSaldo;

    private ServicioBonificacion servicioBonificacion;

    private ServicioUsuario servicioUsuario;

    private ServicioAsignacion servicioAsignacion;

    public Fachada() {
        this.servicioPropietario = new ServicioPropietario();
        this.servicioAdministrador = new ServicioAdministrador();
        this.servicioPuesto = new ServicioPuesto();
        this.servicioVehiculo = new ServicioVehiculo();
        this.servicioRecargaSaldo = new ServicioRecargaSaldo();
        this.servicioRecargaSaldo.agregar(this);
        this.servicioBonificacion = new ServicioBonificacion();
        this.servicioAsignacion = new ServicioAsignacion();
        this.servicioAsignacion.agregar(this);
    }

    public synchronized static Fachada getInstance() {
        if (instacia == null) {
            instacia = new Fachada();
        }
        return instacia;
    }

    public void cerrarSesion(Administrador administrador) {
        servicioAdministrador.cerrarSesion(administrador);
    }

    public Administrador LoginAdministrador(String ci, String password) throws ExcepcionUsuario {
        return servicioAdministrador.login(ci, password);
    }

    public Propietario loginPropietario(String ci, String password) {
        return servicioPropietario.login(ci, password);
    }

    public void asignarBonificacion(Puesto puesto, Bonificacion bonificacion, Propietario propietario) throws ExcepcionAsignacion {
        servicioAsignacion.asignarBonificacion(puesto, bonificacion, propietario);
    }

    public Asignacion obtenerAsignacion(Propietario propietario) {
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

    public ArrayList<RecargaSaldo> getRecargasPendientes() {
        return servicioRecargaSaldo.getRecargasPendientes();
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

    
    public Vehiculo getVehiculo(String matricula) throws ExcepcionVehiculo{
       return servicioPropietario.getVehiculo(matricula);
    }


    public void recargarSaldo(float recarga, Propietario propietario) throws ExcepcionRecargaSaldo {
        servicioRecargaSaldo.recargarSaldo(recarga, propietario);
    }

    public void emularAprobacionRecarga(Administrador administrador, RecargaSaldo recargaAprobada) {
        servicioRecargaSaldo.emularAprobacionRecarga(administrador, recargaAprobada);
    }

    public void agregarPuesto(Puesto puesto) {
        servicioPuesto.agregarPuesto(puesto);
    }

    @Override
    public void actualizar(Observable origen, Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (origen instanceof ServicioRecargaSaldo || origen instanceof ServicioAsignacion) {
            avisar(evento);
        }
    }
}
