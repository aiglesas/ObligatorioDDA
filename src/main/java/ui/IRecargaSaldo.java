package ui;

import java.math.BigDecimal;

public interface IRecargaSaldo {

	public abstract void mostrarRecargaSaldo();

	public abstract void mostrarNombreCompletoYSueldoActual();

	public abstract void recargarSaldo(BigDecimal saldo);

	public abstract void mostrarMensajeDeError(String mensaje);

}
