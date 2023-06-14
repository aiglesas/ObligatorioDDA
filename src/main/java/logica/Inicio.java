/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package logica;

import dominio.Administrador;
import dominio.Asignacion;
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
import dominio.exceptions.ExcepcionPropietario;
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

    public static void main(String[] args) throws ExcepcionPropietario, ExcepcionRecargaSaldo {
        crearDatosDePrueba();
        new DialogoVentanaInicio().setVisible(true);
    }

    public static void crearDatosDePrueba() throws ExcepcionPropietario, ExcepcionRecargaSaldo {

        Fachada fachada = Fachada.getInstance();
        //En lo posible el saldo minimo siempre sea mayor al total de las tarifas
        ServicioPropietario.setSaldoMinimoDefault(800);
        //propietarios 
        Propietario Andres = new Propietario("51980285", "1234", "Andres Iglesias", 1200, 500);
        Propietario Lucas = new Propietario("52401979", "1234", "Lucas Gonzalez", 1200, 700);
        Propietario propietario3 = new Propietario("12345678", "1234", "Pepito Lays", 2000, 0);
        Propietario propietario4 = new Propietario("87654321", "1234", "Hellow Word", 2000, 0);
        fachada.agregarPropietario(Andres);
        fachada.agregarPropietario(Lucas);
        fachada.agregarPropietario(propietario3);
        fachada.agregarPropietario(propietario4);

        //RecargaSaldo
        Andres.recargarSaldo(200);
        Andres.recargarSaldo(250);
        Andres.recargarSaldo(432);
        Andres.recargarSaldo(678);
        Andres.recargarSaldo(222.43f);
        Lucas.recargarSaldo(350);
        Lucas.recargarSaldo(457);
        Lucas.recargarSaldo(876);
        Lucas.recargarSaldo(987);
        Lucas.recargarSaldo(123);
        Lucas.recargarSaldo(245.45f);
        propietario3.recargarSaldo(123);
        propietario3.recargarSaldo(456);
        propietario3.recargarSaldo(800);
        propietario3.recargarSaldo(190.23f);
        propietario3.recargarSaldo(123.13f);
        propietario4.recargarSaldo(300);
        propietario4.recargarSaldo(400);
        propietario4.recargarSaldo(150);
        propietario4.recargarSaldo(640);
        propietario4.recargarSaldo(986);
        propietario4.recargarSaldo(750.43f);

        //administradores
        Administrador administrador1 = new Administrador("52401979", "1234", "Luis Suarez");
        Administrador administrador2 = new Administrador("51980285", "1234", "Andres Iglesias");
        Administrador administrador3 = new Administrador("12345678", "1234", "Gonzalo Farolini");

        Fachada.getInstance().agregarAdministrador(administrador1);
        Fachada.getInstance().agregarAdministrador(administrador2);
        Fachada.getInstance().agregarAdministrador(administrador3);

        //categoria vehiculo
        CategoriaVehiculo sedan = new CategoriaVehiculo("Sedan");
        CategoriaVehiculo SUV = new CategoriaVehiculo("SUV");
        CategoriaVehiculo camion = new CategoriaVehiculo("Camion");
        CategoriaVehiculo omnibus = new CategoriaVehiculo("Omnibus");

        //tarifas
        Tarifa tarifa1Sedan = new Tarifa("Tarifa para auto", 120, sedan);
        Tarifa tarifa2SUV = new Tarifa("Tarifa para camioneta", 150, SUV);
        Tarifa tarifa3Omnibus = new Tarifa("Tarifa para omnibus", 500, omnibus);
        Tarifa tarifa4Camion = new Tarifa("Tarifa para camion", 300, camion);
        ArrayList<Tarifa> tarifas1 = new ArrayList<Tarifa>();
        tarifas1.add(tarifa1Sedan);
        tarifas1.add(tarifa2SUV);
        tarifas1.add(tarifa3Omnibus);
        tarifas1.add(tarifa4Camion);

        Tarifa tarifa5Sedan = new Tarifa("Tarifa para auto", 100, sedan);
        Tarifa tarifa6SUV = new Tarifa("Tarifa para camioneta", 130, SUV);
        Tarifa tarifa7Omnibus = new Tarifa("Tarifa para omnibus", 400, omnibus);
        Tarifa tarifa8Camion = new Tarifa("Tarifa para camion", 280, camion);
        ArrayList<Tarifa> tarifas2 = new ArrayList<Tarifa>();
        tarifas2.add(tarifa5Sedan);
        tarifas2.add(tarifa6SUV);
        tarifas2.add(tarifa7Omnibus);
        tarifas2.add(tarifa8Camion);
        
        Tarifa tarifa9Sedan = new Tarifa("Tarifa para auto", 80, sedan);
        Tarifa tarifa10SUV = new Tarifa("Tarifa para camioneta", 115, SUV);
        Tarifa tarifa11Omnibus = new Tarifa("Tarifa para omnibus", 200, omnibus);
        Tarifa tarifa12Camion = new Tarifa("Tarifa para camion", 500, camion);
        ArrayList<Tarifa> tarifas3 = new ArrayList<Tarifa>();
        tarifas3.add(tarifa9Sedan);
        tarifas3.add(tarifa10SUV);
        tarifas3.add(tarifa11Omnibus);
        tarifas3.add(tarifa12Camion);

        //puestos
        Puesto puesto1 = new Puesto("Peaje Pando", "pando1234", tarifas1);
        Puesto puesto2 = new Puesto("Peaje Solis", "solis2345", tarifas2);
        Puesto puesto3 = new Puesto("Peaje Rocha", "rocha5678", tarifas3);
        fachada.agregarPuesto(puesto1);
        fachada.agregarPuesto(puesto2);
        fachada.agregarPuesto(puesto3);

        //bonificaciones    
        ArrayList<Bonificacion> bonificaciones = new ArrayList<Bonificacion>();
        Exonerados bonificacionExonerado = new Exonerados("Exonerado", 100);
        Frecuentes bonificacionFrecuente = new Frecuentes("Frecuente", 50);
        Trabajadores bonificacionTrabajador = new Trabajadores("Trabajador", 80);

        bonificaciones.add(bonificacionFrecuente);
        bonificaciones.add(bonificacionExonerado);
        bonificaciones.add(bonificacionTrabajador);
        Fachada.getInstance().setBonificaciones(bonificaciones);

        //Asignaciones
        Asignacion asignacion1 = new Asignacion(bonificacionFrecuente, Andres, puesto1);
        Asignacion asignacion2 = new Asignacion(bonificacionTrabajador, Lucas, puesto2);
        Asignacion asignacion3 = new Asignacion(bonificacionTrabajador, propietario3, puesto3);
        Asignacion asignacion4 = new Asignacion(bonificacionExonerado, propietario4, puesto2);

        Andres.agregarAsignacion(asignacion1);
        Lucas.agregarAsignacion(asignacion2);
        propietario3.agregarAsignacion(asignacion3);
        propietario4.agregarAsignacion(asignacion4);

        //vehiculos
        Vehiculo vehiculo1sedan = new Vehiculo("ABC123", "Toyota Corolla", "Rojo", Andres, sedan);
        Vehiculo vehiculo2suv = new Vehiculo("DEF456", "Honda CR-V", "Azul", Andres, SUV);
        Vehiculo vehiculo3sedan = new Vehiculo("GHI789", "Ford Mustang", "Negro", Andres, sedan);

        Vehiculo vehiculo4sedan = new Vehiculo("JKL123", "Toyota Corolla", "Rojo", Lucas, sedan);
        Vehiculo vehiculo5camion = new Vehiculo("MNO456", "MAC", "Purpura", Lucas, camion);
        Vehiculo vehiculo6omnibus = new Vehiculo("PQR789", "Omnibus grande", "Negro", Lucas, omnibus);

        Vehiculo vehiculo7sedan = new Vehiculo("STU123", "Renault Kwid", "Rojo", propietario3, sedan);
        Vehiculo vehiculo8suv = new Vehiculo("YRT456", "Honda CR-V", "Azul", propietario3, SUV);
        Vehiculo vehiculo9sedan = new Vehiculo("POL789", "Hyundai HB20", "Azul", propietario3, sedan);

        Vehiculo vehiculo10sedan = new Vehiculo("LAY123", "Chevrolet camaro", "Rojo", propietario4, sedan);
        Vehiculo vehiculo11SUV = new Vehiculo("RES456", "Volkswagen Amarok", "Azul", propietario4, SUV);
        Vehiculo vehiculo12camion = new Vehiculo("TOK799", "Camion chico", "Negro", propietario4, camion);

        Andres.agregarVehiculo(vehiculo1sedan);
        Andres.agregarVehiculo(vehiculo2suv);
        Andres.agregarVehiculo(vehiculo3sedan);

        Lucas.agregarVehiculo(vehiculo4sedan);
        Lucas.agregarVehiculo(vehiculo5camion);
        Lucas.agregarVehiculo(vehiculo6omnibus);

        propietario3.agregarVehiculo(vehiculo7sedan);
        propietario3.agregarVehiculo(vehiculo8suv);
        propietario3.agregarVehiculo(vehiculo9sedan);

        propietario4.agregarVehiculo(vehiculo10sedan);
        propietario4.agregarVehiculo(vehiculo11SUV);
        propietario4.agregarVehiculo(vehiculo12camion);

        puesto1.crearTransito(vehiculo1sedan);
        puesto1.crearTransito(vehiculo3sedan);
        puesto1.crearTransito(vehiculo4sedan);
        puesto1.crearTransito(vehiculo9sedan);
        puesto1.crearTransito(vehiculo11SUV);
        puesto1.crearTransito(vehiculo1sedan);

        puesto2.crearTransito(vehiculo2suv);
        puesto2.crearTransito(vehiculo5camion);
        puesto2.crearTransito(vehiculo6omnibus);
        puesto2.crearTransito(vehiculo7sedan);
        puesto2.crearTransito(vehiculo12camion);

        puesto3.crearTransito(vehiculo8suv);
        puesto3.crearTransito(vehiculo10sedan);

    }
}
