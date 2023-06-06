package dominio;

import java.math.BigDecimal;

public abstract class Bonificacion {

	private String nombre;

	private int descuento;

	/**
	 * Cada uno va a implementar lo que necesite
	 */
	public BigDecimal calcularMonto() {
		return null;
	}

}
