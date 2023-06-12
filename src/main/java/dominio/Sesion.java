package dominio;

public class Sesion {
    
    private Administrador administrador;

    public Sesion(Administrador administrador) {
        this.administrador = administrador;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

}
