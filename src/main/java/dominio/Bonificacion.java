package dominio;
import java.util.ArrayList;

public abstract class Bonificacion {

    private String nombre;
    private ArrayList<Asignacion> asignaciones;

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
    
        public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Bonificacion(String nombre, int descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.asignaciones = new ArrayList<Asignacion>();
    }

    public abstract float calcularMonto(Transito transito);

}
