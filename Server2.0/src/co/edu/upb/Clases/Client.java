package co.edu.upb.Clases;

import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.io.Serializable;
import java.util.Iterator;

/**
 * @author Kz
 */
public class Client implements Serializable {
    String numeroTelefono; //10 Digits
    String nombres;
    String apellidos;
    int tipoCliente;
    /** TipoCliente:
     * 0 -> No premium
     * 1 -> Premium
     */
    String direccion;
    public String[][] productosMasPedidos;
    /** Matriz de (n*2) para guardar los productos mas pedidos.
     * Columna[0] -> Id de producto.
     * Columna[1] -> Cantidad de veces que se ha pedido.
     */

    public Client(String nombres, String apellidos, int tipoCliente, String direccion, String numeroTelefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoCliente = tipoCliente;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
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

    /**
     * Metodo para leer la matriz de productos mas pedidos y convertirla a una lista.
     * Al convertir a una lista tambien ordena los productos de mayor a menor.
     * @return Lista tipo "String[]" o 'null' en caso de no tener pedidos.
     */
    public LinkedList<String[]> leerProductos(){
        if (productosMasPedidos != null){
            LinkedList<String[]> topProductos = new LinkedList<>();
            for (int i=0; i < productosMasPedidos.length; i++){
                String id = productosMasPedidos[i][0];
                if (topProductos.isEmpty()){
                    topProductos.add(productosMasPedidos[i]);
                } else {
                    if (Integer.parseInt(topProductos.get()[1]) <= Integer.parseInt(productosMasPedidos[i][1])){
                        topProductos.addOnHead(productosMasPedidos[i]);
                    } else {
                        topProductos.add(productosMasPedidos[i]);
                    }
                }
            }
            return topProductos;
        }
        return null;
    }

    /**
     * Metodo para añadir el pedido hecho por el cliente a los productos mas pedidos.
     * @param pedido        LinkedList tipo "Product" que corresponde a los productos pedidos.
     * @param topProductos  Matriz de producto mas pedidos convertida en LinkedList con el metodo "leerProductos".
     */
    public void addProductos(LinkedList<Product> pedido, LinkedList<String[]> topProductos){
        Iterator<NodeInterface<Product>> iterator = pedido.iterator();
        while (iterator.hasNext()){
            Product temp = iterator.next().getObject();
            boolean added = false;

            Iterator<NodeInterface<String[]>> subIterator = topProductos.iterator();
            while (subIterator.hasNext()){
                String[] topActual = subIterator.next().getObject();
                // En caso de ya existir el producto, sumar 1 a la cantidad de veces que ha pedido.
                if (topActual[0].equals(temp.getId())){
                    added = true;
                    topActual[1] = String.valueOf(Integer.parseInt(topActual[1]) + 1);
                }
            }
            // En caso de no haber sido agregado, crear una nueva fila de ese producto para la matriz.
            if (!added){
                String[] newTop = {temp.getId(), "1"};
                topProductos.add(newTop);
            }
        }
        convertToArray(topProductos);
    }

    /**
     * Metodo para convertir de vuelta la lista en una matriz para poder ser guardada en el JSon.
     * @param topProductos LinkedList retornada en el metodo "leerProductos".
     */
    private void convertToArray(LinkedList<String[]> topProductos){
        productosMasPedidos = new String[topProductos.size()][2];
        for (int i=0; i<productosMasPedidos.length; i++){
            productosMasPedidos[i] = topProductos.pop();
        }
    }

    @Override
    public String toString(){
        return nombres + " " + apellidos + "  |" + tipoCliente + "|";
    }

}
