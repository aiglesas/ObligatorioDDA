package dominio;

import common.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Puesto {

    private String nombre;

    private String direccion;

    private ArrayList<Tarifa> tarifas;

    public Puesto(String nombre, String direccion, ArrayList<Tarifa> tarifas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = new ArrayList<Tarifa>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(ArrayList<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

    public Tarifa getTarifa(CategoriaVehiculo categoria) {
        return null;
    }

    public Asignacion getAsignacion(Propietario propietario) {
        return null;
    }

    public BigDecimal calcularMontoBonificacion(Vehiculo vehiculo) {
        return null;
    }

    public BigDecimal calcularMontoTotal(Vehiculo vehiculo) {
        return null;
    }

    public Transito emularTransito(Vehiculo vehiculo) {
        return null;
    }

}
