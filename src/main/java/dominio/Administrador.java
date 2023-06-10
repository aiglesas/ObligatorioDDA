package dominio;

public class Administrador extends Usuario {

    private Sesion sesion;

    public Administrador(String ci, String contraseña, String nombreCompleto) {
        super(ci, contraseña, nombreCompleto);
    }

    @Override
    public boolean validarLogin(String ci, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}