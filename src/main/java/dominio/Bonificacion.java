package dominio;

import java.math.BigDecimal;

public abstract class Bonificacion {

    private String nombre;


    private int descuento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Bonificacion(String nombre, int descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public abstract Float calcularMonto();

    public String getNombre() {
        return nombre;
    }

    public int getDescuento() {
        return descuento;
    }
        
        

}
