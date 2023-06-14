package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;

public class Transito implements Comparable<Transito> {

    private Date fecha;
    private Vehiculo vehiculo;
    private Puesto puesto;
    private Tarifa tarifa;
    private Bonificacion bonificacion;

    private float total;
    private float montoBonificacion;

    /**
     * return puesto.getTarifa(this.getVehiculo().getCategoria());
     */
    public Transito(Date fecha, Vehiculo vehiculo, Puesto puesto, Tarifa tarifa, Bonificacion bonificacion) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
        this.tarifa = tarifa;
        this.bonificacion = bonificacion;
        this.montoBonificacion = this.calcularMontoBonificacion();
        this.total = calcularMontoTotal();
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public float calcularMontoTotal() {
        return (tarifa.getMonto() - this.montoBonificacion);
    }

    public float calcularMontoBonificacion() {
        float montoBonificacion = 0;
        if (this.bonificacion != null) {
            montoBonificacion = bonificacion.calcularMonto(this);
        }
        return montoBonificacion;
    }

    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public float getMontoBonificacion() {
        return montoBonificacion;
    }

    public void setMontoBonificacion(float montoBonificacion) {
        this.montoBonificacion = montoBonificacion;
    }

    public LocalDate getFechaParseada() {
        return this.fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    @Override
    public int compareTo(Transito t) {
        return this.fecha.compareTo(t.fecha);
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
