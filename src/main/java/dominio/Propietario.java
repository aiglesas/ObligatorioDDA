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
        super();
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


	public boolean recargarSaldo(BigDecimal recarga) {
		return false;
	}

	public boolean ingresarNotificacion(Date fecha, String mensaje) {
		return false;
	}

	public BigDecimal getSaldo() {
		return null;
	}


	public boolean validarSaldoMinimo() {
		return false;
	}


	public boolean validarSaldo(BigDecimal montoTotal) {
		return false;
	}


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
