package dominio;

public class Exonerados extends Bonificacion {

    public Exonerados(String nombre, float descuento) {
        super(nombre, descuento);
    }

    @Override
    public float calcularMonto(Transito transito) {
        return transito.getTarifa().getMonto() * (this.getDescuento() /100);
    }
    
}
