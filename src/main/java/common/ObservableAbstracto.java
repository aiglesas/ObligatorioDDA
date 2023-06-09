/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public abstract class ObservableAbstracto implements Observable {

    private final ArrayList<Observador> observadores = new ArrayList();

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public boolean quitar(Observador o) {
        return observadores.remove(o);
    }

    protected void avisar(Observador.Eventos evento) {
        for (Observador o : observadores) {
            o.actualizar(this, evento);
        }
    }
}