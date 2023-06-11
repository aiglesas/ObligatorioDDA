package dominio;

public class Frecuentes extends Bonificacion {

    public Frecuentes(String nombre, int descuento) {
        super(nombre, descuento);
    }
    
    @Override
    public Float calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
