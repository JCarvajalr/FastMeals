package co.edu.upb.Clases;

public class Product {
    public int precio;
    public String nombre;
    int tiempoCoccion; //0 -> Rapida, 1 -> Lenta
    public String id;
    public String descripcion;

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

}
