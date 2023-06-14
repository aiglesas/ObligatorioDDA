package dominio;

import common.Observable;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionVehiculo;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Propietario extends Usuario {

    private float saldo;

    private float saldoMinimo;

    private ArrayList<Vehiculo> vehiculos;

    private ArrayList<Asignacion> asignaciones;

    private ArrayList<RecargaSaldo> recargasSaldo;

    private ArrayList<Notificacion> notificaciones;

    public Propietario(String ci, String contraseña, String nombreCompleto, float saldo, float saldoMinimo) {
        super(ci, contraseña, nombreCompleto);
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

    public void agregarRecarga(RecargaSaldo recargaSaldo) {
        this.recargasSaldo.add(recargaSaldo);
    }

    public void agregarAsignacion(Asignacion asignacion) {
        this.asignaciones.add(asignacion);
    }

    public void incrementarSaldo(float monto) {
        this.saldo += monto;
    }

    public void ingresarNotificacion(Date fecha, String mensaje) {
        Notificacion n = new Notificacion(fecha, mensaje);
        notificaciones.add(n);
    }

    public void validarSaldo(Float montoTransito) throws ExcepcionPropietario {
        if (this.saldo > montoTransito) {
        } else {
            throw new ExcepcionPropietario("Saldo insuficiente:  " + this.getSaldo());
        }
    }

    public void validarSaldoMinimo() {
        if (this.saldo < this.saldoMinimo) {
            this.ingresarNotificacion(Calendar.getInstance().getTime(), "Tu saldo actual es de $" + this.getSaldo() + ". Te recomendamos hacer una recarga");

            //TODO OBSERVER, SE TIENE QUE ACTUALIZAR LA NOTIFICAION EN EL TABLERO
        }
    }

    public void cobrarTransito(float montoTransito) throws ExcepcionPropietario {
        this.validarSaldo(montoTransito);
        this.setSaldo(this.saldo - montoTransito);
        this.validarSaldoMinimo();

    }

    public Asignacion buscarAsignacionPorPuesto(Puesto puesto) {
        Asignacion asignacion = null;
        for (Asignacion a : this.asignaciones) {
            if (a.getPuesto().equals(puesto)) {
                asignacion = a;
            }
        }
        return null;
    }

    @Override
    public boolean validarLogin(String ci, String password) {
        return false;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo getVehiculo(String matricula) {
        Vehiculo vehiculo = null;

        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                vehiculo = v;
            }
        }

        return vehiculo;
    }



}
