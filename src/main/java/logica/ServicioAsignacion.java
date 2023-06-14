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
}
