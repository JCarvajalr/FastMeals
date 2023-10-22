package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.rmi.RemoteException;
import java.io.IOException;
import java.rmi.Remote;

/**
 * Interfaz que conecta el modulo cocina y servidor
 * @author JuanDavidCarvajal
 */
public interface ServiceCocinaInterface extends Remote{
    
    /**
     * Comunica al servidor para comprobar que el usuario y contraseña ingresados sean válidos y pertenezan
     * al usuario tipo Cocina.
     * @param user      Nombre de usuario ingresado en la ventana.
     * @param password  Contraseña ingresada en la ventana.
     * @return          Retorna falso o verdadero acorde a la verificación.
     * @throws RemoteException
     */
    public boolean login(String user, String password) throws RemoteException;
    
    /**
     * Metodo para buscar en el servidor pedidos confirmados en la cola y hacerle 'pop' para traer un pedido.
     * @return 
     * @throws RemoteException 
     */
    public Order getOrder() throws RemoteException;
    
    /**
     * Metodo para cuando un pedido se cocina completamente y sea enviado al servido como pedido terminado para poderse 
     * enviar al modulo de entrega.
     * @param order
     * @return
     * @throws RemoteException 
     */
    public boolean finishOrder(Order order) throws RemoteException;
    
}
