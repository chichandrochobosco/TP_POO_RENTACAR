package rentacarloboscofuentesfresco;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Reserva {
    private ArrayList<Auto> lista;
    private Cliente cli;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private int cantDias;
    private static int cantRes;
    private int idRes;
    
    public RENTA(Cliente c, int dias){
        this.cli = c;
        this.cantDias = dias;
        this.cantRes ++;
        this.idRes = cantRes;
        this.lista = new ArrayList();
    }
    
    public RENTA(CLIENTE c, LocalDate fechaFin){
        this.cli = c;
        this.fechaFin = fechaFin;
        this.cantRes ++;
        this.idRes = cantRes;
    }
    
    public ArrayList<Auto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Auto> lista) {
        this.lista = lista;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int canntDias) {
        this.cantDias = canntDias;
    }

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public static int getCantRes() {
        return cantRes;
    }

    public static void setCantRes(int cantRes) {
        Reserva.cantRes = cantRes;
    }
    
    public void agregarAuto(Auto a){
        lista.add(a);
    }
    
    public int calcularDias(){
        Period periodoDias = fechaIni.until(fechaFin);
        int dias = periodoDias.getDays();
        return dias;
    }
    
    public void calcularFechaFin(){
        
    }
    
    public double calcularTotalRenta(){
        
    }
    
    public void imprimirTicket(){
        
    }

}
