package dominio;

import java.math.BigDecimal;

public abstract class Bonificacion {

	private String nombre;

	private int descuento;  

	/**
	 * Cada uno va a implementar lo que necesite
	 */
	public float calcularMonto() {
		return 0;
	}

    public String getNombre() {
        return nombre;
    }

    public int getDescuento() {
        return descuento;
    }
        
        

}
