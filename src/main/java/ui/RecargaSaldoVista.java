package ui;

public interface RecargaSaldoVista {

    public abstract void mostrarNombreCompleto(String nombreCompleto);
    
    public abstract void mostrarSueldoActual(String monto);

    public abstract void recargarSaldo(String saldo);

    public abstract void mostrarMensajeDeError(String mensaje);
}
