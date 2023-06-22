
package rentacarloboscofuentesfresco;


public class Cliente {
    private String nombre;
    private int dni;
    private String direccion;
    private int telefono;
    private int id;

    public Cliente(String nombre, int dni, String direccion, int telefono, int id) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
    }

    
    public void mostrarCliente() {
        System.out.println("Cliente: " + "nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", id=" + id);
    }
   
    
    
}
