package dominio;

public abstract class Usuario {

    private String ci;

    private String contraseña;

    private String nombreCompleto;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Usuario(String ci, String contraseña, String nombreCompleto) {
        this.ci = ci;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
    }

    public boolean Validar() {
        return false;
    }

}
