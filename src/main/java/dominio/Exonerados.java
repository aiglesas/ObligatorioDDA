package dominio;

public class Exonerados extends Bonificacion {

    public Exonerados(String nombre, int descuento) {
        super(nombre, descuento);

    @Override
    public Float calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
