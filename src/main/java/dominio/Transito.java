package dominio;

import java.math.BigDecimal;
import java.util.Date;

public class Transito implements Comparable<Transito>{

	private float total;
	private Date fecha;
        private Vehiculo vehiculo;
        private Puesto puesto;
	/**
	 * return puesto.getTarifa(this.getVehiculo().getCategoria());
	 */
	public Tarifa getTarifa() {
		return null;
	}

	/**
	 * Puesto.getAsignacion(this.getVehiculo().getPropietario())
	 */
	public Asignacion getAsignacionPropietario() {
		return null;
	}

	/**
	 * return this.puesto.calcularMontoTotal(this.vehiculo);
	 */
	public long calcularMontoTotal() {
		return 0;
	}

    public Transito(float total, Date fecha, Vehiculo vehiculo, Puesto puesto) {
        this.total = total;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }

    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
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
}
