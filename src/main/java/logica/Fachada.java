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
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionRecargaSaldo;
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

    public Fachada() {
        this.servicioPropietario = new ServicioPropietario();
        this.servicioAdministrador = new ServicioAdministrador();
        this.servicioPuesto = new ServicioPuesto();
        this.servicioVehiculo = new ServicioVehiculo();
        this.servicioRecargaSaldo = new ServicioRecargaSaldo();
        this.servicioRecargaSaldo.agregar(this);
        this.servicioBonificacion = new ServicioBonificacion();
    }

    public synchronized static Fachada getInstance() {
        if (instacia == null) {
            instacia = new Fachada();
        }
        return instacia;
    }

    public Usuario LoginAdministrador(String ci, String password) {
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

    public void agregarVehiculo(Vehiculo vehiculo) {
        servicioVehiculo.agregarVehiculo(vehiculo);
    }

    public void recargarSaldo(float recarga, Propietario propietario) throws ExcepcionRecargaSaldo {
        servicioRecargaSaldo.recargarSaldo(recarga, propietario);
    }

    public void emularAprobacion(Administrador administrador, RecargaSaldo recargaAprobada){
        servicioRecargaSaldo.emularAprobacion(administrador, recargaAprobada);
    }
    
    @Override
    public void actualizar(Observable origen, Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(ObservableAbstracto origen, Evento evento) {
        if (origen instanceof ServicioRecargaSaldo) {
            avisar(evento);
        }
    }
}
