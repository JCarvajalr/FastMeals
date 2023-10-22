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

    public static LinkedList<Order> generarDomicilio(){
        if (!ordenesListas.isEmpty()){
            int cantidad = 0;

            LinkedList<Order> domicilio = new LinkedList<>();
            Order temp = ordenesListas.pop();
            cantidad += temp.cantidadProductos;
            domicilio.add(temp);
            boolean stop = false;
            while (!ordenesListas.isEmpty() && !stop){
                if ((cantidad < 8) && (cantidad + ordenesListas.get().cantidadProductos <= 8)){
                    temp = ordenesListas.pop();
                    cantidad += temp.cantidadProductos;
                    domicilio.add(temp);
                } else {
                    stop = true;
                }
            }
            return domicilio;
        }
        return null;
    }

    private static Order dividirOrden(Order order){
        int limite = order.cantidadProductos;
        int i = 0;

        while (i < limite){
            Order order2 = new Order();
            order2.nombres = order.nombres;
            order2.apellidos = order.apellidos;
            order2.id = order.id;
            order2.barrio = order.barrio;
            order2.numeroTelefono = order.numeroTelefono;

        }






        return null;
    }

}
