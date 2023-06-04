package logica;

import dominio.Asignacion;
import dominio.Propietario;
import dominio.Transito;
import dominio.Vehiculo;

public class Fachada {

	private Fachada instacia;

	private ServicioPropietario servicioPropietario;

	private ServicioAdministrador servicioAdministrador;

	private ServicioPuesto servicioPuesto;

	private ServicioVehiculo servicioVehiculo;

	private ServicioRecargaSaldo servicioRecargaSaldo;

	private ServicioBonificacion servicioBonificacion;

	private ServicioUsuario servicioUsuario;

	public boolean validarLoginAdministrador(String ci, String password) {
		return false;
	}

	public boolean validarLoginPropietario(String ci, String password) {
		return false;
	}

	public Asignacion obtenerAsignacion(Propietario propietario) {
		return null;
	}

	public Transito emularTransito(Vehiculo vehiculo) {
		return null;
	}

	public int getPuestos() {
		return 0;
	}

	public Vehiculo obtenerVehiculo(String matricula) {
		return null;
	}

}
