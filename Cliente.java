package rentacarloboscofuentesfresco;

import javax.swing.JOptionPane;


public class Cliente {
    private String nombre;
    private int dni;
    private String direccion;
    private int telefono;
    private static int numCli;
    private int id;

    public Cliente(String nombre, int dni, String direccion, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numCli ++;
        this.id = numCli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumCli() {
        return numCli;
    }

    public static void setNumCli(int numCli) {
        Cliente.numCli = numCli;
    }

    public void mostrarCliente() {
        JOptionPane.showMessageDialog(null, "Cliente:\nnombre:" + this.nombre + ", dni: " + this.dni + ", direccion: " + this.direccion + ", telefono: " + this.telefono + ", id: " + this.id);
    }
 
}
