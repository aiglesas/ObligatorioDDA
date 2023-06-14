package dominio;

import java.util.Date;

public class Notificacion implements Comparable<Notificacion> {

    private Date fecha;

    private String mensaje;

    public Notificacion(Date fecha, String mensaje) {
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int compareTo(Notificacion n) {
        return this.fecha.compareTo(n.fecha);
    }

}
