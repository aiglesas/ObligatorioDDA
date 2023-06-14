package dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vehiculo {

    private String matricula;

    private String modelo;

    private String color;

    private Propietario propietario;

    private CategoriaVehiculo categoriaVehiculo;

    private ArrayList<Transito> transitos;

    public Vehiculo(String matricula, String modelo, String color, Propietario propietario, CategoriaVehiculo categoriaVehiculo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.propietario = propietario;
        this.categoriaVehiculo = categoriaVehiculo;
        this.transitos = new ArrayList<Transito>();
    }
    
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
    
    public void agregarTransito(Transito transito){
        this.transitos.add(transito);
    }

    public float getMontoTotal() {
        long montoTotal = 0;
        for (Transito t : transitos) {
            montoTotal += t.getTotal();
        }
        return montoTotal;
    }

    public boolean tieneTransitoDelDia(Puesto puesto) {
        boolean tieneTransitoDelDia = false;
        for (Transito t : this.transitos) {
            if (t.getFechaParseada().compareTo(LocalDate.now()) == 0 && t.getPuesto().equals(puesto)) {
                tieneTransitoDelDia = true;
            }
        }
        return tieneTransitoDelDia;
    }

}
