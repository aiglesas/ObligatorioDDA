/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Propietario;

/**
 *
 * @author usuario
 */
public interface TableroPropietarioVista {

    void mostarVehiculos();

    void mostrarBonificaciones(Propietario propietario);

    void mostrarTransitos(Propietario propietario);

    void mostrarRecargas(Propietario propietario);

    void mostrarNotificacion(Propietario propietario);

    void mostrarNombreCompletoYSaldoActual(Propietario propietario);
    
    void mostrarTablero(Propietario propietario);

}
