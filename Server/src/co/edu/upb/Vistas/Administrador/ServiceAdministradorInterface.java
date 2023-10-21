package co.edu.upb.Vistas.Administrador;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.User;
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface ServiceAdministradorInterface extends Remote {

    public Client searchClient(String number) throws RemoteException;

    public boolean removeClient(String number) throws RemoteException;

    public boolean addCliente(Client cliente) throws RemoteException;

    public boolean addUsuario(User newUser) throws RemoteException;

    public boolean removeUsuario(String username) throws RemoteException;

    public boolean addProduct(Product newProduct) throws RemoteException;

    public boolean removeProduct(String id) throws RemoteException;

    public Product searchProduct(String id) throws RemoteException;

    public boolean login(String username, String password) throws RemoteException;
}
