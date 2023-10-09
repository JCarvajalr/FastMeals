package co.edu.upb.Interfaces.Operador;

import co.edu.upb.Interfaces.Operador.ProductInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;


public interface VistaOperadorInterface extends Remote {
    
    public boolean login(String user, String password) throws RemoteException;
    
    // Verificar que todos los campos necesarios esten sean validos
    public boolean verificarPedido() throws RemoteException;
    
    // Verificar pedido, guardarlo en la cola y reiniciar la orden
    public void confirmarPedido() throws RemoteException;
    
    // Leer json para crear todos los productos del menu
    public void llenarMenu() throws RemoteException;
    
    // Buscar un producto en base a su id
    public ProductInterface buscarProducto(String id) throws RemoteException;
    
    
}
