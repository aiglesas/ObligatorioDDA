package logica;

import dominio.Puesto;
import dominio.Transito;
import dominio.Vehiculo;
import dominio.Asignacion;
import dominio.Propietario;
import java.util.ArrayList;

public class ServicioPuesto {

    private ArrayList<Puesto> puestos;

    public ServicioPuesto() {
        this.puestos = new ArrayList<Puesto>();
    }
    
    public ArrayList<Puesto> getPuestos() {
        return this.puestos;
    }

    public void setPuestos(ArrayList<Puesto> puestos) {
        this.puestos = puestos;
    }
    public void agregarPuesto(Puesto puesto){
        this.puestos.add(puesto);
    }

    public Transito emularTransito(Vehiculo vehiculo) {
        return null;
    }

    public Asignacion obtenerAsignacion(Propietario propietario) {
        return null;
    }

}
