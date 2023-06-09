package dominio;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Vehiculo {

	private String matricula;

	private String modelo;

	private String color;
        
        private Propietario propietario ;

	private CategoriaVehiculo categoriaVehiculo;
        
        private ArrayList<Transito> transitos;

	public int getTransitos() {
		return 0;
	}

	public CategoriaVehiculo getCategoria() {
		return null;
	}

	public BigDecimal calcularMontoTotalEnTransitos() {
		return null;
	}

    public Vehiculo(String matricula, String modelo, String color, Propietario propietario, CategoriaVehiculo categoriaVehiculo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.propietario = propietario;
        this.categoriaVehiculo = categoriaVehiculo;
    }
    
        public Vehiculo(String matricula, String modelo, String color, Propietario propietario, CategoriaVehiculo categoriaVehiculo, ArrayList<Transito> transitos) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.propietario = propietario;
        this.categoriaVehiculo = categoriaVehiculo;
        this.transitos = transitos;
    }



}
