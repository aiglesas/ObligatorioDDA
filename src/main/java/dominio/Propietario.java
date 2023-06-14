package dominio;

import common.Evento;
import common.Observable;
import common.ObservableConcreto;
import common.Observador;
import dominio.exceptions.ExcepcionAsignacion;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionRecargaSaldo;
import dominio.exceptions.ExcepcionVehiculo;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Propietario extends Usuario implements Observable {

    private float saldo;

    private float saldoMinimo;

    private ArrayList<Vehiculo> vehiculos;

    private ArrayList<Asignacion> asignaciones;

    private ArrayList<RecargaSaldo> recargasSaldo;

    private ArrayList<Notificacion> notificaciones;

    private final ObservableConcreto observableWrapped = new ObservableConcreto();

    public Propietario(String ci, String contrasenia, String nombreCompleto, float saldo, float saldoMinimo) {
        super(ci, contrasenia, nombreCompleto);
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

    public ArrayList<RecargaSaldo> getRecargasPendientes() {
        ArrayList<RecargaSaldo> rs = new ArrayList<>();
        for (RecargaSaldo reSal : this.recargasSaldo) {
            if (!reSal.isEstado()) {
                rs.add(reSal);
            }
        }
        return rs;
    }

    public void recargarSaldo(float recarga) throws ExcepcionRecargaSaldo {
        RecargaSaldo rs = new RecargaSaldo(recarga, this);
        agregarRecarga(rs);
        observableWrapped.avisar(Evento.RecargaSaldo);
    }

    public void agregarRecarga(RecargaSaldo recargaSaldo) {
        this.recargasSaldo.add(recargaSaldo);
    }

    public void agregarAsignacion(Asignacion asignacion) {
        this.asignaciones.add(asignacion);
    }

    public void incrementarSaldo(float monto) {
        this.saldo += monto;
        observableWrapped.avisar(Evento.AprobarRecargaSaldo);
    }

    public void ingresarNotificacion(Date fecha, String mensaje) {
        Notificacion n = new Notificacion(fecha, mensaje);
        notificaciones.add(n);
        observableWrapped.avisar(Evento.IngresoNotifiacion);
    }

    public void eliminarNotificaciones() {
        this.notificaciones.clear();
        observableWrapped.avisar(Evento.EliminarNotificaciones);
    }

    public void validarSaldo(Float montoTransito) throws ExcepcionPropietario {
        if (this.saldo < montoTransito) {
            throw new ExcepcionPropietario("Saldo insuficiente:  " + this.getSaldo());
        }
    }

    public void validarSaldoMinimo() {
        if (this.saldo < this.saldoMinimo) {
            this.ingresarNotificacion(Calendar.getInstance().getTime(), "Tu saldo actual es de $" + this.getSaldo() + ". Te recomendamos hacer una recarga");
        }
    }

    public void cobrarTransito(float montoTransito) throws ExcepcionPropietario {
        this.validarSaldo(montoTransito);
        this.setSaldo(this.saldo - montoTransito);
        this.validarSaldoMinimo();
    }

    public void asignarBonificacion(Puesto puesto, Bonificacion bonificacion) throws ExcepcionAsignacion {
        if (buscarAsignacion(puesto) == null) {
            Asignacion asignacion = new Asignacion(bonificacion, this, puesto);
            this.agregarAsignacion(asignacion);
            observableWrapped.avisar(Evento.AsignarBonificacion);
        } else {
            throw new ExcepcionAsignacion("Ya tiene una bonificacionn asignada para ese puesto");
        }
    }

    public Asignacion buscarAsignacion(Puesto puesto) {
        Asignacion asignacion = null;
        for (Asignacion a : this.asignaciones) {
            if (a.getPuesto().equals(puesto)) {
                asignacion = a;
            }
        }
        return asignacion;
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

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public void agregar(Observador o) {
        this.observableWrapped.agregar(o);
    }

    @Override
    public boolean quitar(Observador o) {
        return this.observableWrapped.quitar(o);
    }

}
