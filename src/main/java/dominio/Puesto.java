package dominio;

import static common.Evento.CrearTransito;
import common.ObservableAbstracto;
import dominio.exceptions.ExcepcionPropietario;
import java.util.ArrayList;
import java.util.Calendar;

public class Puesto extends ObservableAbstracto {

    private String nombre;

    private String direccion;

    private ArrayList<Tarifa> tarifas;

    private ArrayList<Asignacion> asignaciones;

    private ArrayList<Transito> transitos;

    public Puesto(String nombre, String direccion, ArrayList<Tarifa> tarifas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = tarifas;
        this.asignaciones = new ArrayList<Asignacion>();
    }

    public void agregarAsignacion(Asignacion asignacion) {
        this.asignaciones.add(asignacion);
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
        for (Tarifa t : tarifas) {
            if (t.getCategoriaVehiculo().equals(categoria)) {
                return t;
            }
        }
        return null;
    }

    public Asignacion getAsignacion(Propietario propietario) {
        return null;
    }

    public float calcularMontoBonificacion(Vehiculo vehiculo) {
        return 0;
    }

    public Bonificacion getBonificacion(Propietario p) {
        Bonificacion b = null;
        for (Asignacion a : asignaciones) {
            if (a.getPropietario().equals(p)) {
                b = a.getBonificacion();
            }
        }
        return b;
    }

    public void crearTransito(Vehiculo vehiculo) throws ExcepcionPropietario {
        Propietario p = vehiculo.getPropietario();
        Bonificacion bonificacion = getBonificacion(p);
        
        Tarifa tarifa = this.getTarifa(vehiculo.getCategoriaVehiculo());
        Transito transito = new Transito(Calendar.getInstance().getTime(), vehiculo, this, tarifa, bonificacion);

        p.cobrarTransito(transito.getTotal());

        this.transitos.add(transito);
        avisar(CrearTransito);
    }

}
