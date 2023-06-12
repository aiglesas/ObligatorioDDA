/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import common.Evento;
import common.ObservableAbstracto;
import dominio.Asignacion;
import dominio.Bonificacion;
import dominio.Propietario;
import dominio.Puesto;
import dominio.exceptions.ExcepcionAsignacion;
import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServicioAsignacion extends ObservableAbstracto{

    private ArrayList<Asignacion> asignaciones;

    public ServicioAsignacion() {
        this.asignaciones = new ArrayList<Asignacion>();
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public void asignarBonificacion(Puesto puesto, Bonificacion bonificacion, Propietario propietario) throws ExcepcionAsignacion {
        Asignacion asignacion = new Asignacion(bonificacion, propietario, puesto);
        if (buscarAsignacion(puesto, propietario) == null) {
            this.asignaciones.add(asignacion);
            puesto.agregarAsignacion(asignacion);
            propietario.agregarAsignacion(asignacion);
            avisar(Evento.AsignarBonificacion);
        } else {
            throw new ExcepcionAsignacion("Ya tiene una bonificacionn asignada para ese puesto");
        }
    }

    public Asignacion buscarAsignacion(Puesto puesto, Propietario propietario) {
        for (Asignacion a : this.asignaciones) {
            if (a.getPuesto().equals(puesto) && a.getPropietario().equals(propietario)) {
                return a;
            }
        }
        return null;
    }
}
