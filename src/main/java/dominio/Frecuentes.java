package dominio;

import java.time.LocalDate; // import the LocalDate class

import java.util.Calendar;
import java.util.Date;

public class Frecuentes extends Bonificacion {

    public Frecuentes(String nombre, int descuento) {
        super(nombre, descuento);
    }
    


    @Override
    public float calcularMonto(Transito transito) {
        float montoBonificacion = 0;
   
        if(transito.getVehiculo().tieneTransitoDelDia(transito.getPuesto())){
            montoBonificacion = transito.getTarifa().getMonto() * (this.getDescuento()/100 );
        }
        return montoBonificacion;
    }
}
