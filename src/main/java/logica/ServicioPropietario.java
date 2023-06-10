package logica;

import dominio.Propietario;
import dominio.Usuario;
import dominio.exceptions.ExcepcionPropietario;
import java.util.ArrayList;

public class ServicioPropietario extends ServicioUsuario {

    private static float saldoMinimoDefault;

    public ServicioPropietario() {
        propietarios = new ArrayList();
    }

    private ArrayList<Propietario> propietarios;

    public static float getSaldoMinimoDefault() {
        return saldoMinimoDefault;
    }

    public static void setSaldoMinimoDefault(float saldoMinimoDefault) {
        ServicioPropietario.saldoMinimoDefault = saldoMinimoDefault;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public Propietario buscarPropietario(String cedula){
        Propietario propietario = null;
        for (Propietario p : this.propietarios) {
            if(p.getCi().equals(cedula)){
               propietario  = p;
            }
        }
        if(propietario == null){
        }
        return propietario;
    }
    
        public Usuario login(String cedula, String password) {
        for (Usuario p : propietarios) {
           if(p.getCi().equals(cedula) && p.getContraseña().equals(password)){
               return p;
            }
        }
        return null;
    }
        
        public void agregarPropietario(Propietario propietario){
            
            propietarios.add(propietario);
        }
        

}
