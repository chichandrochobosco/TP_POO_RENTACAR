package rentacarloboscofuentesfresco;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro", 1234567, "Galvan 2099", 12345678);
        Auto a1 = new Auto("ABC123", "Fiat 1", "Fiat", "Amarillo", 999999);
        Auto a2 = new Auto("WYZ789", "Ford Ka", "Ford", "Violeta", 777777);
        
        Cliente c2 = new Cliente("Chicha", 9876543, "Larralde 1916", 76833320);
        Auto a3 = new Auto("DEF456", "Camaro", "Chevrolet", "Negro", 456123);
        Auto a4 = new Auto("GHI437", "Roadster", "Tesla", "Amarillo", 4444444);
        
        Reserva r1 = new Reserva(c1, 23);
        r1.agregarAuto(a1);
        r1.agregarAuto(a2);
        
        r1.calcularFechaFin();
        r1.imprimirTicket();
        
        Reserva r2 = new Reserva(c2, "2023-07-01");
        r2.agregarAuto(a3);
        r2.agregarAuto(a4);
        
        r2.calcularDias();
        r2.imprimirTicket();
    }
    
}
