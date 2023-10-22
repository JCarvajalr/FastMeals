package co.edu.upb.Vistas.Operador;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceOperadorInterface extends Remote {
    
    public boolean login(String user, String password) throws RemoteException;

    public boolean addOrder(Order order) throws RemoteException;

    public byte[] isOnDatabase(String number) throws IOException;

    public boolean addClientOnDataBase(Client client) throws RemoteException;

    public LinkedList<Product> getMenu() throws IOException;

}
