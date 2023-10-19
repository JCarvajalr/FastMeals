package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Order;

import java.rmi.RemoteException;
import java.io.IOException;
import java.rmi.Remote;

public interface ServiceCocinaInterface extends Remote {

    public boolean login(String user, String password) throws RemoteException;

    public Order getOrder() throws RemoteException;


}
