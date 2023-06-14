package dominio;

import java.util.Calendar;
import java.util.Date;

public class Asignacion {

    private Date fecha;

    private Bonificacion bonificacion;

    private Propietario propietario;

    private Puesto puesto;

    public Asignacion(Bonificacion bonificacion, Propietario propietario, Puesto puesto) {
        this.bonificacion = bonificacion;
        this.propietario = propietario;
        this.puesto = puesto;
        this.fecha = Calendar.getInstance().getTime();
        this.puesto.agregarAsignacion(this);
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
}
