/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dominio.Administrador;
import dominio.Propietario;
import dominio.Usuario;

/**
 *
 * @author usuario
 */
public interface LoginVista {

    void mostrarMensajeDeError(String mensaje);

    void cerrarVista();

    void ejecutarCasoDeUsoInicial(Usuario usuario);    
    

}