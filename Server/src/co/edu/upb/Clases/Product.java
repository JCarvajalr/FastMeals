package co.edu.upb.Clases;

import java.io.Serializable;

/**
 * @author JuanDavidCarvajal
 */
public class Product implements Serializable{
    private static final long serialVersionUID = 12234523L;
    int precio;
    String nombre;
    int tiempoCoccion;
    /** TiempoCoccion:
     * 0 -> Rapido
     * 1 -> Lento
     */
    String id;
    String descripcion;
    String pedidoId;

    public Product(String nombre, String id, int precio, int tiempoCoccion, String descripcion){
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.tiempoCoccion = tiempoCoccion;
        this.descripcion = descripcion;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
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
