package co.edu.upb.Clases;

import co.edu.upb.Clases.Product;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.io.Serializable;

/**
 * @author JuanDavidCarvajal
 */
public class Order implements Serializable{
    private static final long serialVersionUID = 4964834523L;
    public LinkedList<Product> listaProductos = new LinkedList<>();
    public String id;
    public String nombres;
    public String apellidos;
    public int tipoCliente;
    /** TipoCliente:
     * 0 -> No premium
     * 1 -> Premium
     */
    public String direccion;
    public String barrio;
    public double valorTotal;
    public int cantidadProductos;
    public String numeroTelefono;
    public Order(){
        valorTotal = 0;
    }
    public Order(String nombres, String apellidos, int tipoCliente, String direccion, int valorTotal) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoCliente = tipoCliente;
        this.direccion = direccion;
        this.valorTotal = valorTotal;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void addProducto(Product newProduct){
        listaProductos.add(newProduct);
        valorTotal += newProduct.precio;
    }

    public void removeProduct(Product producto){
        if (listaProductos.remove(producto)){
            valorTotal -= producto.precio;
        }
    }

    public void imprimir(){
        listaProductos.imprimir();
    }

    @Override
    public String toString(){
        return "-" + nombres + ",  $" + valorTotal;
    }

}
