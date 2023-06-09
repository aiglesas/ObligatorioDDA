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

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public CategoriaVehiculo getCategoriaVehiculo() {
        return categoriaVehiculo;
    }
    public void setCategoriaVehiculo(CategoriaVehiculo categoriaVehiculo) {
        this.categoriaVehiculo = categoriaVehiculo;
    }
    public ArrayList<Transito> getTransitos() {
        return transitos;
    }
    public void setTransitos(ArrayList<Transito> transitos) {
        this.transitos = transitos;
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
