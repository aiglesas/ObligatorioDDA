package logica;

import dominio.Propietario;
import dominio.RecargaSaldo;
import dominio.exceptions.ExcepcionPropietario;
import java.util.ArrayList;

public class ServicioRecargaSaldo {

    private ArrayList<RecargaSaldo> recargasSaldo;

    public ServicioRecargaSaldo() {
        this.recargasSaldo = new ArrayList<RecargaSaldo>();
    }

    public void agregarRecarga(RecargaSaldo rs){
        recargasSaldo.add(rs);
        rs.getPropietario().asignarRecarga(rs);
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

    public void recargarSaldo(float recarga, Propietario propietario) throws ExcepcionPropietario {
        RecargaSaldo rs = new RecargaSaldo(recarga, propietario);
        rs.validar();
        propietario.asignarRecarga(rs);
        this.recargasSaldo.add(rs);
        //Avisar(Evento.RecargaSaldo);
    }
}
