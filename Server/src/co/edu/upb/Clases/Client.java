package co.edu.upb.Clases;

import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.io.Serializable;
import java.util.Iterator;

public class Client implements Serializable {
    String numeroTelefono; //10 Digits
    String nombres;
    String apellidos;
    int tipoCliente;
    /* 0 -> No premium
     * 1 -> Premium
     */
    String direccion;
    public String[][] productosMasPedidos;
    // 0 -> Id    1 -> Cnt


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

    public void addProductos(LinkedList<Product> pedido, LinkedList<String[]> topProductos){
        Iterator<NodeInterface<Product>> iterator = pedido.iterator();

        while (iterator.hasNext()){
            Product temp = iterator.next().getObject();
            boolean added = false;

            Iterator<NodeInterface<String[]>> subIterator = topProductos.iterator();
            while (subIterator.hasNext()){
                String[] topActual = subIterator.next().getObject();
                if (topActual[0].equals(temp.getId())){
                    added = true;
                    topActual[1] = String.valueOf(Integer.parseInt(topActual[1]) + 1);
                }
            }
            if (!added){
                String[] newTop = {temp.getId(), "1"};
                topProductos.add(newTop);
            }
        }
        convertToArray(topProductos);
    }

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
