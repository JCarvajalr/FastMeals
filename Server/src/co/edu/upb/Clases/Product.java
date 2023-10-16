package co.edu.upb.Clases;

import java.io.Serializable;

public class Product implements Serializable{
    private static final long serialVersionUID = 12234523L;
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

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString(){
        return nombre;
    }

    public String getId(){
        return id;
    }

}
