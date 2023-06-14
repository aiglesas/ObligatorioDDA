package dominio;

import java.util.Date;
import dominio.exceptions.ExcepcionRecargaSaldo;
import java.util.Calendar;

public class RecargaSaldo implements Comparable<RecargaSaldo>{

    private Administrador administrador;

    private Propietario propietario;

    private Date fechaInicio;

    private Date fechaFin;

    private float monto;

    private boolean estado;

    public RecargaSaldo(float monto, Propietario propietario) throws ExcepcionRecargaSaldo{
        this.propietario = propietario;
        this.fechaInicio = Calendar.getInstance().getTime();
        this.monto = monto;
        this.estado = false;
        this.validar();
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Administrador getAdministrador() {
        return this.administrador;
    }

    public void setAdministrador(Administrador a) {
        this.administrador = a;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void validar() throws ExcepcionRecargaSaldo {
        if (!(getMonto() >= 1)) {
            throw new ExcepcionRecargaSaldo("Monto invalido");
        }
    }

    public void aprobacionRecarga(Administrador administrador) {
        setEstado(true);
        getPropietario().incrementarSaldo(getMonto());
        setAdministrador(administrador);
        Date fechaActual = Calendar.getInstance().getTime();
        setFechaFin(fechaActual);
        getPropietario().ingresarNotificacion(fechaActual, "Tu recarga de $" + getMonto() + " fue aprobada");
    }

    @Override
    public int compareTo(RecargaSaldo rs) {
        return this.fechaInicio.compareTo(rs.fechaInicio);
    }
}
