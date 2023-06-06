package common;

public abstract class Observable {

	private Obervador[] obervador;

	public abstract void agregar(Obervador o);

	public abstract boolean quitar(Obervador o);

	protected void avisar(Evento evento) {

	}

}
