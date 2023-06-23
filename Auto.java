package rentacarloboscofuentesfresco;

import javax.swing.JOptionPane;


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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarAuto(){
        JOptionPane.showMessageDialog(null, "Auto:\nmatricula: " + this.matricula + ", modelo: " + this.modelo + ", marca: " + this.marca + ", color: " + this.color + ", precio: " + this.precio);
    }
        
}
