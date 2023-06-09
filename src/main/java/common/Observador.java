package common;

public interface Observador {

    public enum Eventos {
        ContactoAgregado, UsuarioDeAgendaAutenticado, LogOutUsuarioDeAgenda, AgendaAsignada
    };

    void actualizar(ObservableAbstracto origen, Eventos evento);

    public void actualizar(Observable origen, Evento evento);

}
