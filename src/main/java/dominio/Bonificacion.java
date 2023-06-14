package dominio;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Bonificacion {

    private String nombre;
    private ArrayList<Asignacion> asignaciones;

    private float descuento;

    public Bonificacion(String nombre, float descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.asignaciones = new ArrayList<Asignacion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDescuento() {
        return descuento;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public abstract float calcularMonto(Transito transito);

}
