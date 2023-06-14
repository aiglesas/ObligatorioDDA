package logica;

import dominio.Propietario;
import dominio.Usuario;
import dominio.Vehiculo;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionVehiculo;
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

    public Propietario buscarPropietario(String cedula) throws ExcepcionPropietario {
        Propietario propietario = null;
        for (Propietario p : this.propietarios) {
            if (p.getCi().equals(cedula)) {
                propietario = p;
            }
        }
        if (propietario == null) {
            throw new ExcepcionPropietario("No existe el propietario");
        }
        return propietario;
    }

    public Propietario login(String cedula, String password) {
        for (Propietario p : propietarios) {
            if (p.getCi().equals(cedula) && p.getContraseña().equals(password)) {
                return p;
            }
        }
        return null;
    }

    public void agregarPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }

    public Vehiculo getVehiculo(String matricula) throws ExcepcionVehiculo {
        Vehiculo vehiculo = null;
        for (Propietario p : propietarios) {
            vehiculo = p.getVehiculo(matricula);
        }
        if (vehiculo == null) {
            throw new ExcepcionVehiculo("No existe el vehículo");
        }
        return vehiculo;
    }
    

}
