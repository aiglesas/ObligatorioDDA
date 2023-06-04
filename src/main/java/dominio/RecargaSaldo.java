package dominio;

import common.Observable;

public class RecargaSaldo extends Observable implements Observable {

	private DateTime fechaInicio;

	private DateTime fechaFin;

	private BigDecimal monto;

	private boolean estado;

	public Administrador getAdministrador() {
		return null;
	}

	/**
	 * if(this.monto >= 1){
	 *   return true;
	 * }else{
	 *   return false;
	 * }
	 */
	public boolean validar() {
		return false;
	}

	/**
	 * Lanza un ingreso de notificacion al propietario con el mensaje 
	 * [Fecha y hora de la notificación] + “Tu recarga de $ ” + valor de la recarga + “fue aprobada”
	 * Y le asigna el administrador.
	 */
	public void emularAprobacion(Administrador administrador) {

	}

}
