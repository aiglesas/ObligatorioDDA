package dominio;

public abstract class Usuario {

    private String ci;

    private String contrasenia;

    private String nombreCompleto;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Usuario(String ci, String contrasenia, String nombreCompleto) {
        this.ci = ci;
        this.contrasenia = contrasenia;
        this.nombreCompleto = nombreCompleto;
    }

    public boolean validarLogin(String ci, String password){
        return this.ci.equals(ci) && this.contrasenia.equals(password);
    }
}
