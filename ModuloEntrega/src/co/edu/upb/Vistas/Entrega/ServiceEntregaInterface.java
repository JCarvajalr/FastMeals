package co.edu.upb.Vistas.Entrega;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.rmi.RemoteException;
import java.io.IOException;
import java.rmi.Remote;

public interface ServiceEntregaInterface extends Remote {
    
    public boolean login(String user, String password) throws RemoteException;
    
    public LinkedList<Order> getPedidos() throws RemoteException;
}
