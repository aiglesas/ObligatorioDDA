package common;

public interface Obervador {

	private Evento eventos;

	public void actualizar(Observable origen, Evento evento);

}
