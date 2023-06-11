package logica;

import dominio.Vehiculo;
import java.util.ArrayList;

public class ServicioVehiculo {

	private ArrayList<Vehiculo> vehiculos;

    public ServicioVehiculo() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }

	public Vehiculo obtenerVehiculo(String matricula) {
		return null;
	}
        
        public void agregarVehiculo(Vehiculo vehiculo){
            vehiculos.add(vehiculo);
        }

}
