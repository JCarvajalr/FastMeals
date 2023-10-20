package co.edu.upb.Services;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.io.Serializable;

public class OrderController implements Serializable {
    public static ColaPrioridad<Order> colaDePedidos = new ColaPrioridad<>(2);
    public static ColaPrioridad<Order> colaDeCocina = new ColaPrioridad<>(2);
    public static LinkedList<Order> ordenesListas = new LinkedList<>();

    public static boolean add(Order order){
        return colaDePedidos.add(order, order.getTipoCliente()) && colaDeCocina.add(order, order.getTipoCliente());
    }

    public static Order popOrder(){
        return colaDeCocina.extraer();
    }

    public static boolean addDoneOrder(Order order){
        return ordenesListas.add(order);
    }

}
