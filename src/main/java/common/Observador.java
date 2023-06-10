package common;

public interface Observador {

    public enum Eventos {
        ContactoAgregado, UsuarioDeAgendaAutenticado, LogOutUsuarioDeAgenda, AgendaAsignada
    };

    public void actualizar(Observable origen, Evento evento);
    
    void actualizar(ObservableAbstracto origen, Eventos evento);

}
