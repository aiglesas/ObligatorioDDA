package dominio;

import java.math.BigDecimal;

public class Trabajadores extends Bonificacion {
    
    public Trabajadores(String nombre, int descuento) {
        super(nombre, descuento);
    }
    
    @Override
    public Float calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
