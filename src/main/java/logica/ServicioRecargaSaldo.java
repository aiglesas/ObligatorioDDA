package logica;

import dominio.RecargaSaldo;
import java.util.ArrayList;

public class ServicioRecargaSaldo {

    private ArrayList<RecargaSaldo> recargasSaldo;

    public ArrayList<RecargaSaldo> getRecargasPendientes() {
        ArrayList<RecargaSaldo> rs = new ArrayList<>();
        for(RecargaSaldo reSal : this.recargasSaldo){
            if(!reSal.isEstado()){
                rs.add(reSal);
            }
        }
        return rs;
    }
}
