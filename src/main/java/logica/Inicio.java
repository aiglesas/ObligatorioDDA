/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica;

import dominio.Administrador;
import dominio.CategoriaVehiculo;
import dominio.Exonerados;
import dominio.Propietario;
import dominio.Puesto;
import dominio.Tarifa;
import dominio.Transito;
import dominio.Vehiculo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import ui.VentanaInicio;

/**
 *
 * @author aigle
 */
public class Inicio {

    public static void main(String[] args) {
     crearDatosDePrueba();
     new VentanaInicio().setVisible(true);
    }
    
    public static void crearDatosDePrueba(){
    //propietarios 
        Propietario propietario1 = new Propietario("51980285", "1234", "Andres Iglesias", 1000, 500);
        Propietario propietario2 = new Propietario("987654321", "1234", "Lucas Gonzales", 500, 200);
        Fachada.getInstance().agregarPropietario(propietario1);  
        Fachada.getInstance().agregarPropietario(propietario2);

    
//administradores

        Administrador administrador1 = new Administrador("57554654", "contraseña2", "Luis Suarez");
        Administrador administrador2 = new Administrador("54654654", "contraseña2", "Gonzalo Bergesio");
    //categoria vehiculo
        CategoriaVehiculo categoria1 = new CategoriaVehiculo("Sedán");
        CategoriaVehiculo categoria2 = new CategoriaVehiculo("SUV");
    //vehiculos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", "Rojo", propietario1, categoria1);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Honda CR-V", "Azul", propietario2, categoria2);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Ford Mustang", "Negro", propietario1, categoria1);
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
        Puesto puesto1 = new Puesto("peaje pando", "pando",tarifas);    
        Puesto puesto2 = new Puesto("peaje solis", "solis",tarifas);   
        Puesto puesto3 = new Puesto("peaje rocha", "rocha",tarifas);
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
        

    }
}

