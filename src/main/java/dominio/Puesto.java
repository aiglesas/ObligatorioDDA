package dominio;

import common.Obervador;
import common.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Puesto extends Observable {

	private String nombre;

	private String direccion;

	private ArrayList<Tarifa> tarifa;

	public int getTarifas() {
		return 0;
	}

    public Puesto(String nombre, String direccion, ArrayList<Tarifa> tarifa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifa = tarifa;
    }

	/**
	 * for(Tarifa t : this.tarifas){
	 *    if(t.getCategoriaVehiculo.Equals(categoria)){
	 *        return t;
	 *    }
	 * }
	 * return null;
	 */
	public Tarifa getTarifa(CategoriaVehiculo categoria) {
		return null;
	}

	/**
	 * for(Asignacion a : this.asignaciones){
	 *    if(a.getPropietario.Equals(Propietario)){
	 *        return a;
	 *    }
	 * }
	 * return null;
	 */
	public Asignacion getAsignacion(Propietario propietario) {
		return null;
	}

	/**
	 * Asignacion asi = this.getAsignacion((vehiculo.getPropietario());
	 * 
	 * int porcDescuento = asi.getDescuentoBonificacion();
	 * 
	 * BigDecimal montoTarifa = this.getTarifa(vehiculo.getCategoriaVehiculo()).getMonto();
	 * 
	 * return montoTarifa * (porcDescuento / 100);
	 */
	public BigDecimal calcularMontoBonificacion(Vehiculo vehiculo) {
		return null;
	}

	/**
	 * return this.getTarifa(vehiculo.getCategoriaVehiculo()).GetMonto() - this.calcularMontoBonificacion(vehiculo.getPropietaro());
	 */
	public BigDecimal calcularMontoTotal(Vehiculo vehiculo) {
		return null;
	}

	/**
	 * Crea un objeto transito con el total(monto tarifa - bonificacion) y el vehiculo
	 * 
	 * Toma el propietario del vehiculo y llama a ingresarNotificacion y le manda la hora actual y el mensaje con formato:
	 * 
	 * [Fecha y hora de la notificación] + “Pasaste por el puesto “ + número de puesto + “con
	 * el vehículo” + número de matrícula
	 * 
	 * En caso que el saldo sea menor al del total del transito, se ingresa otra notificacion:
	 * 
	 * [Fecha y hora de la notificación] + “Tu saldo actual es de $ “ + saldo actual + “ Te recomendamos hacer una recarga”
	 */
	public Transito emularTransito(Vehiculo vehiculo) {
		return null;
	}

    @Override
    public void agregar(Obervador o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean quitar(Obervador o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
