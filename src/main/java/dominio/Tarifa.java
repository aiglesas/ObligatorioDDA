package dominio;

public class Tarifa {
        private String nombre;
	private float monto;
        private CategoriaVehiculo categoria;

    public Tarifa(String nombre, float monto, CategoriaVehiculo categoria) {
        this.nombre = nombre;
        this.monto = monto;
        this.categoria = categoria;
    }
    
    public Tarifa (){
    }
    public String getNombre() {
        return nombre;
    }

    public float getMonto() {
        return monto;
    }

    public CategoriaVehiculo getCategoriaVehiculo() {
        return categoria;
    }
}
