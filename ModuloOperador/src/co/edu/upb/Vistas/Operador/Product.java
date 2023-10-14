package co.edu.upb.Vistas.Operador;

public class Product {
    int precio;
    String nombre;
    int tiempoCoccion; //0 -> Rapida, 1 -> Lenta
    String id;
    String descripcion;
    
    public Product(String nombre, String id, int precio, int tiempoCoccion, String descripcion){
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.tiempoCoccion = tiempoCoccion;
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public String getId(){
        return id;
    }
    
}
