package co.edu.upb.Vistas.Operador.Interfaces;

import co.edu.upb.Vistas.Operador.Order;
import co.edu.upb.Vistas.Operador.Product;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VistaOperadorInterface extends Remote {
    
    public boolean login(String user, String password) throws RemoteException;
    
    // Leer json para crear todos los productos del menu
    public boolean addProduct(Product product) throws RemoteException;
    
    public boolean addOrder(Order order) throws RemoteException;
    
    public boolean isOnDatabase(int number) throws RemoteException;
    

    
}
