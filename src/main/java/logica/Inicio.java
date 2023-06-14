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
        Propietario propietario3 = new Propietario("123456789", "1234", "Pepito Lays", 500, 200);
        fachada.agregarPropietario(propietario1);
        fachada.agregarPropietario(propietario2);
        fachada.agregarPropietario(propietario3);
        
        //RecargaSaldo
        try{
            propietario1.recargarSaldo(200);
            propietario1.recargarSaldo(250);
            propietario1.recargarSaldo(432);
            propietario1.recargarSaldo(678);
            propietario1.recargarSaldo(222.43f);
            propietario2.recargarSaldo(350);
            propietario2.recargarSaldo(457);
            propietario2.recargarSaldo(876);
            propietario2.recargarSaldo(987);
            propietario2.recargarSaldo(123);
            propietario2.recargarSaldo(245.45f);
            propietario3.recargarSaldo(123);
            propietario3.recargarSaldo(456);
            propietario3.recargarSaldo(800);
            propietario3.recargarSaldo(190.23f);
            propietario3.recargarSaldo(123.13f);
        }catch(ExcepcionRecargaSaldo exrs){
            
        }
        //administradores
        Administrador administrador1 = new Administrador("52401979", "1234", "Luis Suarez");
        Administrador administrador2 = new Administrador("52401979", "1234", "Gonzalo Bergesio");
        Administrador administrador3 = new Administrador("12345678", "1234", "Gonzalo Farolini");

        Fachada.getInstance().agregarAdministrador(administrador1);
        Fachada.getInstance().agregarAdministrador(administrador2);
        Fachada.getInstance().agregarAdministrador(administrador3);

        //categoria vehiculo
        CategoriaVehiculo categoria1 = new CategoriaVehiculo("Sedán");
        CategoriaVehiculo categoria2 = new CategoriaVehiculo("SUV");

        //vehiculos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", "Rojo", propietario1, categoria1);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Honda CR-V", "Azul", propietario2, categoria2);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Ford Mustang", "Negro", propietario1, categoria1);

        fachada.agregarVehiculo(vehiculo1);
        fachada.agregarVehiculo(vehiculo2);

        propietario1.agregarVehiculo(vehiculo1);
        propietario1.agregarVehiculo(vehiculo2);

        //tarifas
        Tarifa tarifa1 = new Tarifa(new BigDecimal("500.00"));
        Tarifa tarifa2 = new Tarifa(new BigDecimal("250.00"));
        Tarifa tarifa3 = new Tarifa(new BigDecimal("100.00"));
        Tarifa tarifa4 = new Tarifa(new BigDecimal("50.00"));
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

        //transitos    
        Transito transito1 = new Transito(50, new Date(), vehiculo1, puesto1);
        Transito transito2 = new Transito(30, new Date(), vehiculo2, puesto2);
        Transito transito3 = new Transito(30, new Date(), vehiculo2, puesto2);
        Transito transito4 = new Transito(30, new Date(), vehiculo2, puesto3);
        ArrayList<Transito> transitosVehiculo2 = new ArrayList<Transito>();
        transitosVehiculo2.add(transito2);
        transitosVehiculo2.add(transito3);
        transitosVehiculo2.add(transito4);

        //bonificaciones    
        ArrayList<Bonificacion> bonificaciones = new ArrayList<Bonificacion>();
        Frecuentes bonificacionFrecuente = new Frecuentes("Frecuente", 50);
        Exonerados bonificacionExonerado = new Exonerados("Exonerado", 100);
        Trabajadores bonificacionTrabajador = new Trabajadores("Trabajador", 80);

        bonificaciones.add(bonificacionFrecuente);
        bonificaciones.add(bonificacionExonerado);
        bonificaciones.add(bonificacionTrabajador);
        Fachada.getInstance().setBonificaciones(bonificaciones);




    }
}
