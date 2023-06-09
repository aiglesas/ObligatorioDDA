package common;

public interface Observable {

    void agregar(Observador o);

    boolean quitar(Observador o);
}
