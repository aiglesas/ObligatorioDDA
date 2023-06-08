package logica;

import dominio.Propietario;
import dominio.exceptions.ExcepcionPropietario;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ServicioPropietario extends ServicioUsuario {

    private static BigDecimal saldoMinimoDefault;

    private ArrayList<Propietario> propietarios;

    public static BigDecimal getSaldoMinimoDefault() {
        return saldoMinimoDefault;
    }

    public static void setSaldoMinimoDefault(BigDecimal saldoMinimoDefault) {
        ServicioPropietario.saldoMinimoDefault = saldoMinimoDefault;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public Propietario buscarPropietario(String cedula) throws ExcepcionPropietario{
        Propietario propietario = null;
        for (Propietario p : this.propietarios) {
            if(p.getCi().equals(cedula)){
               propietario  = p;
            }
        }
        if(propietario == null){
            throw new ExcepcionPropietario("No existe el propietario");
        }
        return propietario;
    }

}
