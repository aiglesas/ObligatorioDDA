package dominio;

import java.util.Calendar;
import java.util.Date;


public class Trabajadores extends Bonificacion {
    
    public Trabajadores(String nombre, int descuento) {
        super(nombre, descuento);
        
    }
    


    @Override
    public float calcularMonto(Transito transito) {
        float montoBonificacion = 0;
        Calendar calendar = Calendar.getInstance();
        if(calendar.get(Calendar.DAY_OF_WEEK)>1 && calendar.get(Calendar.DAY_OF_WEEK) < 7){
           montoBonificacion = transito.getTarifa().getMonto() * (this.getDescuento()/100 );
        }
        
        return montoBonificacion;
    }
}
