package dominio;

public abstract class Usuario {

	private String ci;

	private String contraseña;

	private String nombreCompleto;
        
            public Usuario(String ci, String contraseña, String nombreCompleto) {
        this.ci = ci;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
    }

	public boolean Validar() {
		return false;
	}

}
