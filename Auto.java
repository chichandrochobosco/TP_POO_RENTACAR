
package rentacarloboscofuentesfresco;


public class Auto {
    private String matricula;
    private String modelo;
    private String marca;
    private String color;
    private double precio;

    public Auto(String matricula, String modelo, String marca, String color, double precio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    
    public void mostrarAuto() {
        System.out.println("Auto: " + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", precio=" + precio);
    }
    
    
    
           
}
