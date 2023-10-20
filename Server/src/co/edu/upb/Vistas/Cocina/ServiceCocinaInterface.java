package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.rmi.RemoteException;
import java.io.IOException;
import java.rmi.Remote;

public interface ServiceCocinaInterface extends Remote {

    public boolean login(String user, String password) throws RemoteException;

    public Order getOrder() throws RemoteException;

    public boolean finishOrder(Order order) throws RemoteException;
}
