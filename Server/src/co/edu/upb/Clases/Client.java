package co.edu.upb.Clases;

import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

public class Client {

    String nombres;
    String apellidos;
    int tipoCliente;
    /* 0 -> No premium
     * 1 -> Premium
     */
    String direccion;
    //LinkedList<Product> productosMasPedidos;
    public int[] productosMasPedidos;


    public Client(String nombres, String apellidos, int tipoCliente, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoCliente = tipoCliente;
        this.direccion = direccion;
        //productosMasPedidos = new LinkedList<>();
        productosMasPedidos = new int[10];
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