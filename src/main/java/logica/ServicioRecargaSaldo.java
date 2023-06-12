package logica;

import common.Evento;
import common.ObservableAbstracto;
import dominio.Administrador;
import dominio.Propietario;
import dominio.RecargaSaldo;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionRecargaSaldo;
import java.util.ArrayList;

public class ServicioRecargaSaldo extends ObservableAbstracto {

    private ArrayList<RecargaSaldo> recargasSaldo;

    public ServicioRecargaSaldo() {
        this.recargasSaldo = new ArrayList<RecargaSaldo>();
    }
    
    public ArrayList<RecargaSaldo> getRecargasPendientes() {
        ArrayList<RecargaSaldo> rs = new ArrayList<>();
        for (RecargaSaldo reSal : this.recargasSaldo) {
            if (!reSal.isEstado()) {
                rs.add(reSal);
            }
        }
        return rs;
    }

    public void recargarSaldo(float recarga, Propietario propietario) throws ExcepcionRecargaSaldo {
        RecargaSaldo rs = new RecargaSaldo(recarga, propietario);
        rs.validar();
        propietario.agregarRecarga(rs);
        this.recargasSaldo.add(rs);
        avisar(Evento.RecargaSaldo);
    }
    
    public void emularAprobacionRecarga(Administrador administrador, RecargaSaldo recargaAprobada) {
        recargaAprobada.emularAprobacion(administrador);
        avisar(Evento.AprobarRecargaSaldo);
    }

}
