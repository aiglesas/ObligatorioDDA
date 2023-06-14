package dominio;

public class CategoriaVehiculo {

    private String nombre;
    
    private Tarifa tarifa;
        
    public CategoriaVehiculo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
    
    

}
