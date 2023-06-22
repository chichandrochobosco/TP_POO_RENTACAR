
package rentacarloboscofuentesfresco;

import java.util.ArrayList;
import java.util.Date;


public class Reserva {
    private ArrayList<Auto> listaAutos = new ArrayList<>();
    private Cliente cliente;
    private Date fechaIni;
    private Date fechaFin;
    private int cantDias;
    private int idReserva;

    public Reserva(Cliente cliente, int cantDias) {
        this.cliente = cliente;
        this.cantDias = cantDias;
    }

    public Reserva(Cliente cliente, Date fechaFin) {
        this.cliente = cliente;
        this.fechaFin = fechaFin;
    }
    
    public void agregarAuto(){
        
    }
    public int calcularDias(){
        return 0;
    }
    public void calcularFechaFin(){
        
    }
    public double calcularTotalRenta(){
        return 0;
    } 
    public void imprimirTicket(){
        
    }
    
}
