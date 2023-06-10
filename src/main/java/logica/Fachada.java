package logica;

import dominio.Asignacion;
import dominio.Propietario;
import dominio.RecargaSaldo;
import dominio.Transito;
import dominio.Vehiculo;
import java.util.ArrayList;

public class Fachada {

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
        this.servicioBonificacion = new ServicioBonificacion();
        this.servicioUsuario = new ServicioPropietario();
    }

    public synchronized static Fachada getInstance() {
        if (instacia == null) {
            instacia = new Fachada();
        }
        return instacia;
    }

    public boolean validarLoginAdministrador(String ci, String password) {
        return false;
    }

    public boolean validarLoginPropietario(String ci, String password) {
        return false;
    }

    public Asignacion obtenerAsignacion(Propietario propietario) {
        return null;
    }

    public Transito emularTransito(Vehiculo vehiculo) {
        return null;
    }

    public int getPuestos() {
        return 0;
    }

    public Vehiculo obtenerVehiculo(String matricula) {
        return null;
    }

    public ArrayList<RecargaSaldo> getRecargasPendientes() {
        return servicioRecargaSaldo.getRecargasPendientes();
    }

}
