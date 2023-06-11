package dominio;

import java.math.BigDecimal;

public class Tarifa {
        private String nombre;
	private BigDecimal monto;

    public Tarifa(BigDecimal monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getMonto() {
        return monto;
    }
    
    

}
