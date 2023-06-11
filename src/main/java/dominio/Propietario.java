package dominio;

import common.Observable;
import dominio.exceptions.ExcepcionPropietario;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;

public class Propietario extends Usuario {

    private float saldo;

    private float saldoMinimo;

    private ArrayList<Vehiculo> vehiculos;

    private ArrayList<Asignacion> asignaciones;

    private ArrayList<RecargaSaldo> recargasSaldo;

    private ArrayList<Notificacion> notificaciones;


    public Propietario( String ci, String contrase�a, String nombreCompleto, float saldo, float saldoMinimo) {
        super(ci, contrase�a, nombreCompleto);
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
        this.vehiculos = new ArrayList<Vehiculo>();
        this.asignaciones = new ArrayList<Asignacion>();
        this.recargasSaldo = new ArrayList<RecargaSaldo>();
        this.notificaciones = new ArrayList<Notificacion>();
    }
    
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(float saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public ArrayList<RecargaSaldo> getRecargasSaldo() {
        return this.recargasSaldo;
    }

    public void setRecargasSaldo(ArrayList<RecargaSaldo> recargasSaldo) {
        this.recargasSaldo = recargasSaldo;
    }

    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ArrayList<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public ArrayList<Transito> getTransitos() {
        ArrayList<Transito> transitos = new ArrayList<Transito>();
        for (Vehiculo v : this.vehiculos) {
            transitos.addAll(v.getTransitos());
        }
        return transitos;
    }
    
    public void asignarRecarga(RecargaSaldo recargaSaldo){
        this.recargasSaldo.add(recargaSaldo);
    }

    public void incrementarSaldo(float monto){
        this.saldo += monto;
    }
    
    public void ingresarNotificacion(Date fecha, String mensaje) {
        Notificacion n = new Notificacion(fecha, mensaje);
        notificaciones.add(n);
    }

    /**
     * return saldo<saldoMinimo
     */
    public boolean validarSaldoMinimo() {
        return false;
    }

    /**
     * if(this.saldo >= montoTotal){ this.cobrarSaldo(montoTotal); return true
     * }else{ return false }
     */
    public boolean validarSaldo(BigDecimal montoTotal) {
        return false;
    }

    /**
     * if(this.validarSaldo(montoTotal){ saldo = saldo - montoTotal
     * if(this.validarSaldoMinimo){ this.ingresarNotificacion(DateTime.Now(),
     * â€œTu saldo actual es de $ â€œ + this.saldo + â€œ Te recomendamos hacer una
     * recargaâ€?) } return saldo } return null
     */
    public BigDecimal cobrarSaldo(BigDecimal montoTotal) {
        return null;
    }

    public void asignarBonificacion(Bonificacion bonificacion, Puesto puesto) throws ExcepcionPropietario{
        Asignacion asignacion = new Asignacion(bonificacion, this, puesto);
        if(buscarAsignacionPorPuesto(puesto) == null){
            this.asignaciones.add(asignacion);
        }else{
            throw new ExcepcionPropietario("Ya tiene una bonificaciÃ³n asignada para ese puesto");
        }
    }

    public Asignacion buscarAsignacionPorPuesto(Puesto puesto) {
        Asignacion asignacion = null;
        for (Asignacion a : this.asignaciones) {
            if(a.getPuesto().equals(puesto)){
               asignacion = a;
            }
        }
        return null;
    }

    @Override
    public boolean validarLogin(String ci, String password) {
        return false;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
}
