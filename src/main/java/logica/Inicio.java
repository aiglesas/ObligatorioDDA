/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package logica;

import dominio.Administrador;
import dominio.Bonificacion;
import dominio.CategoriaVehiculo;
import dominio.Exonerados;
import dominio.Frecuentes;
import dominio.Propietario;
import dominio.Puesto;
import dominio.RecargaSaldo;
import dominio.Tarifa;
import dominio.Trabajadores;
import dominio.Transito;
import dominio.Vehiculo;
import dominio.exceptions.ExcepcionRecargaSaldo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ui.DialogoVentanaInicio;

/**
 *
 * @author aigle
 */
public class Inicio {

    private Fachada fachada;

    public static void main(String[] args) {
        crearDatosDePrueba();
        new DialogoVentanaInicio().setVisible(true);
    }

    public static void crearDatosDePrueba() {

        Fachada fachada = Fachada.getInstance();
        //propietarios 
        Propietario propietario1 = new Propietario("51980285", "1234", "Andres Iglesias", 1000, 500);
        Propietario propietario2 = new Propietario("52401979", "1234", "Lucas Gonzalez", 500, 200);
        fachada.agregarPropietario(propietario1);
        fachada.agregarPropietario(propietario2);

        //administradores
        Administrador administrador1 = new Administrador("52401979", "1234", "Luis Suarez");
        Administrador administrador2 = new Administrador("54654654", "contraseña2", "Gonzalo Bergesio");       
        Administrador administrador3 = new Administrador("51980285", "1234", "Andres Iglesias");


        fachada.agregarAdministrador(administrador1);    
        fachada.agregarAdministrador(administrador3);


        //categoria vehiculo
        CategoriaVehiculo categoria1 = new CategoriaVehiculo("Sedán");
        CategoriaVehiculo categoria2 = new CategoriaVehiculo("SUV");

        //vehiculos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", "Rojo", propietario1, categoria1);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Honda CR-V", "Azul", propietario2, categoria2);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Ford Mustang", "Negro", propietario1, categoria1);

        propietario1.agregarVehiculo(vehiculo1);
        propietario1.agregarVehiculo(vehiculo2);



        //tarifas
        Tarifa tarifa1 = new Tarifa("Tarifa auto",500, categoria2);
        Tarifa tarifa2 = new Tarifa("Tarifa camioneta",750, categoria2);
        Tarifa tarifa3 = new Tarifa("Tarifa omnibus",1000, categoria2);
        Tarifa tarifa4 = new Tarifa("Tarifa moto",100, categoria2);
        ArrayList<Tarifa> tarifas = new ArrayList<Tarifa>();
        tarifas.add(tarifa1);
        tarifas.add(tarifa2);
        tarifas.add(tarifa3);
        tarifas.add(tarifa4);

        
        //puestos
        Puesto puesto1 = new Puesto("peaje pando", "pando", tarifas);
        Puesto puesto2 = new Puesto("peaje solis", "solis", tarifas);
        Puesto puesto3 = new Puesto("peaje rocha", "rocha", tarifas);
        fachada.agregarPuesto(puesto1);
        fachada.agregarPuesto(puesto2);
        fachada.agregarPuesto(puesto3);

        //bonificaciones    
        ArrayList<Bonificacion> bonificaciones = new ArrayList<Bonificacion>();
        Frecuentes bonificacionFrecuente = new Frecuentes("Frecuente", 20);
        Exonerados bonificacionExonerado = new Exonerados("Exonerado", 20);
        Trabajadores bonificacionTrabajador = new Trabajadores("Trabajador", 20);

        bonificaciones.add(bonificacionFrecuente);
        bonificaciones.add(bonificacionExonerado);
        bonificaciones.add(bonificacionTrabajador);
        Fachada.getInstance().setBonificaciones(bonificaciones);

        //RecargasSaldo
        try {
            Fachada.getInstance().recargarSaldo(200, propietario1);
            Fachada.getInstance().recargarSaldo(350, propietario2);
        } catch (ExcepcionRecargaSaldo exRS) {

        }

    }
}
