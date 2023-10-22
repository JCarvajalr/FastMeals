package co.edu.upb.Vistas.Entrega;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceEntregaInterface extends Remote {

    public boolean login(String user, String password) throws RemoteException;

    public LinkedList<Order> getPedidos() throws RemoteException;

}
