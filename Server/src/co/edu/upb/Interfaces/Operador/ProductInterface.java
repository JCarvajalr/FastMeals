package co.edu.upb.Interfaces.Operador;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProductInterface extends Remote {
    
    public int getPrecio() throws RemoteException;
    
    public String getNombre() throws RemoteException;
    
    public String getId() throws RemoteException;
    
    public int getTiempoCoccion() throws RemoteException;
}
