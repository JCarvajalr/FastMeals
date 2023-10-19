package co.edu.upb.Clases;

import java.io.Serializable;

public class Client implements Serializable {
    String numeroTelefono; //10 Digits
    String nombres;
    String apellidos;
    int tipoCliente;
    /* 0 -> No premium
     * 1 -> Premium
     */
    String direccion;
    public int[] productosMasPedidos;


    public Client(String nombres, String apellidos, int tipoCliente, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoCliente = tipoCliente;
        this.direccion = direccion;
        productosMasPedidos = new int[10];
    }

    public String getNumeroTelfono(){
        return numeroTelefono;
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

    public void addProducto(Product producto){
        int posProducto = Integer.parseInt(producto.id) - 1;
        productosMasPedidos[posProducto]++;

    }

    public void imprimirProductos(){
        for (int cantidadProducto : productosMasPedidos){
            System.out.println(cantidadProducto);
        }
    }

    public int[] getProductosMasPedidos(){
        return productosMasPedidos;
    }

    @Override
    public String toString(){
        return nombres + " " + apellidos + "  |" + tipoCliente + "|";
    }

}
