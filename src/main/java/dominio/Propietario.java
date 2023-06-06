package dominio;

import common.Observable;
import dominio.exceptions.ExcepcionPropietario;
import java.math.BigDecimal;
import java.util.Date;

public class Propietario extends Usuario {

	private BigDecimal saldo;

	private BigDecimal saldoMinimo;

	private ExcepcionPropietario excepcionPropietario;

	public int getVehiculos() {
		return 0;
	}

    public Propietario(String ci, String contraseña, String nombreCompleto, BigDecimal saldo, BigDecimal saldoMinimo) {
        super(ci, contraseña, nombreCompleto);
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
    }

	public int getAsignaciones() {
		return 0;
	}

	public int getTransitos() {
		return 0;
	}

	public int getNotificaciones() {
		return 0;
	}

	public int getRecargasSaldo() {
		return 0;
	}

	/**
	 * RecargaSaldo rs = new RecargaSaldo(recarga);
	 * 
	 * if(rs.Validar()){
	 *   recargasSaldo.Add(rs);
	 *   reutrn true;
	 * }else{
	 *   return false;
	 * }
	 */
	public boolean recargarSaldo(BigDecimal recarga) {
		return false;
	}

	public boolean ingresarNotificacion(Date fecha, String mensaje) {
		return false;
	}

	public BigDecimal getSaldo() {
		return null;
	}

	/**
	 * return saldo<saldoMinimo
	 */
	public boolean validarSaldoMinimo() {
		return false;
	}

	/**
	 * if(this.saldo >= montoTotal){
	 * this.cobrarSaldo(montoTotal);
	 * return true
	 * }else{
	 * return false
	 * }
	 */
	public boolean validarSaldo(BigDecimal montoTotal) {
		return false;
	}

	/**
	 * if(this.validarSaldo(montoTotal){
	 * saldo = saldo - montoTotal
	 * if(this.validarSaldoMinimo){
	 * this.ingresarNotificacion(DateTime.Now(), “Tu saldo actual es
	 * de $ “ + this.saldo + “ Te recomendamos hacer una recarga”)
	 * }
	 * return saldo
	 * }
	 * return null
	 */
	public BigDecimal cobrarSaldo(BigDecimal montoTotal) {
		return null;
	}

	public Asignacion asignarBonificacion(Bonificacion bonificacion, Puesto puesto) {
		return null;
	}

	public Asignacion buscarAsignacion(Puesto puesto) {
		return null;
	}

}
