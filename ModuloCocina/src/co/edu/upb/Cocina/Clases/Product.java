package co.edu.upb.Cocina.Clases;


public class Product {
    int precio;
    String nombre;
    int tiempoCoccion; //0 -> Rapida, 1 -> Lenta
    String id;
    String descripcion;
    int cook;
    // 0 - Sin cocinar, 1 - Cocinando, 2 - Cocinado
    
    public Product(String nombre, String id, int precio, int tiempoCoccion, String descripcion){
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.tiempoCoccion = tiempoCoccion;
        this.descripcion = descripcion;
        cook = 0;
    }
    
    public boolean isCooked() {
        return (cook == 2);
    }
    
    public int getCook(){
        return cook;
    }

    public void setCooking(){
        this.cook = 1;
    }
    
    public void setCooked() {
        this.cook = 2;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }
    
    
    
    @Override
    public String toString(){
        return nombre;
    }
    
}