package dominio;

public class Administrador extends Usuario {

    public Administrador(String ci, String contrasenia, String nombreCompleto) {
        super(ci, contrasenia, nombreCompleto);
    }

    public String getNombre() {
        return super.getNombreCompleto();
    }

}
