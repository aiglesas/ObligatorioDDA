package dominio;

public abstract class Usuario {

    private String ci;

    private String contrase�a;

    private String nombreCompleto;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Usuario(String ci, String contrase�a, String nombreCompleto) {
        this.ci = ci;
        this.contrase�a = contrase�a;
        this.nombreCompleto = nombreCompleto;
    }

    public boolean Validar() {
        return false;
    }

}
