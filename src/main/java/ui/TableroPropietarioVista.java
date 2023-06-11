/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Bonificacion;
import dominio.Notificacion;
import dominio.Propietario;
import dominio.RecargaSaldo;
import dominio.Transito;
import dominio.Usuario;
import dominio.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface TableroPropietarioVista {

    void mostarVehiculos(ArrayList<Vehiculo> vehiculos);

    void mostrarBonificaciones(ArrayList<Bonificacion> vehiculos);

    void mostrarTransitos(ArrayList<Transito> vehiculos);

    void mostrarRecargas(ArrayList<RecargaSaldo> vehiculos);

    void mostrarNotificacion(ArrayList<Notificacion> vehiculos);
    
    void mostrarTablero(Propietario propietario);

}
