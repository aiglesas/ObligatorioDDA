package common;

public interface Observador {

    public enum Eventos {
    };

    public void actualizar(Observable origen, Evento evento);
    
    void actualizar(ObservableAbstracto origen, Evento evento);

}
