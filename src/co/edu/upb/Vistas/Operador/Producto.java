package co.edu.upb.Vistas.Operador;

public class Producto {
    int precio;
    String nombre;
    int tiempoCoccion;
    
    public Producto(String nombre, int precio, int tiempoCoccion){
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString(){
        return nombre + "_  " + precio;
    }
    
}
