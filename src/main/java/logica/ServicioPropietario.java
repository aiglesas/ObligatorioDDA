package logica;

import dominio.Propietario;
import dominio.Usuario;
import dominio.Vehiculo;
import dominio.exceptions.ExcepcionPropietario;
import dominio.exceptions.ExcepcionUsuario;
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

    public Propietario login(String cedula, String password) throws ExcepcionUsuario {
        for (Propietario p : propietarios) {
            if (p.validarLogin(cedula, password)) {
                return p;
            }
        }
        throw new ExcepcionUsuario("Acceso denegado");
    }

    public void agregarPropietario(Propietario propietario) {
        if (propietario.getSaldoMinimo() == 0) {
            propietario.setSaldoMinimo(saldoMinimoDefault);
        }
        propietarios.add(propietario);
    }

    public Vehiculo getVehiculo(String matricula) throws ExcepcionVehiculo {
        Vehiculo vehiculo = null;
        for (Propietario p : propietarios) {
            Vehiculo v = p.getVehiculo(matricula);
            if (v != null) {
                vehiculo = v;
            }

        }
        if (vehiculo == null) {
            throw new ExcepcionVehiculo("No existe el vehículo");
        }
        return vehiculo;
    }

}
