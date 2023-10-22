package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para manejar las colas de prioridades de cocina.
 * @author Kz
 */
public class Controlador {
    LinkedList<Order> pedidosActuales = new LinkedList<>();
    ColaPrioridad<Product>[] colaProductos = new ColaPrioridad[2];
    ServiceCocina service;
    
    public Controlador(ServiceCocina service){
        this.service = service;
        colaProductos[0] = new ColaPrioridad<>(2); //Rapido
        colaProductos[1] = new ColaPrioridad<>(2); //Lento
    }
    
    public boolean finishOrder(Order order){
        pedidosActuales.remove(order);
        try {
            return service.finishOrder(order);
        } catch (RemoteException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean insertarProducto(Product product, int prioridad){
        return colaProductos[product.getTiempoCoccion()].add(product, prioridad);
    }
    
    public boolean colaRapidaIsEmpty(){
        return colaProductos[0].isEmpty();
    }
    public boolean colaLentaIsEmpty(){
        return colaProductos[1].isEmpty();
    }
    
    public Product popColaRapida(){
        return colaProductos[0].extraer();
    }
    public Product popColaLenta(){
        return colaProductos[1].extraer();
    }
    
    public boolean colaLentaIsProductPremium(){
        return !colaProductos[1].isEmptyLastPriority();
    }
    
    public boolean colaRapidaIsProductPremium(){
        return colaProductos[0].isEmptyLastPriority();
    }
    
}
