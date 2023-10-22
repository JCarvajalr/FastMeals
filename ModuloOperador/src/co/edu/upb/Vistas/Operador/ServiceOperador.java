package co.edu.upb.Vistas.Operador;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.io.ByteArrayInputStream;

import java.rmi.RemoteException;
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.Naming; 
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceOperador implements ServiceOperadorInterface{
    private ServiceOperadorInterface serviceOperador;
    private String ip;
    private String port;
    private String serviceName;
    private String url;

    //Constructor
    public ServiceOperador(String ip, String port, String serviceName) {
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }
    
    //Metodos
    @Override
    public boolean login(String user, String password) throws RemoteException {
        try {
            serviceOperador = (ServiceOperadorInterface) Naming.lookup(this.url);
            return serviceOperador.login(user, password);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean addOrder(Order order) throws RemoteException {
        try {
            serviceOperador = (ServiceOperadorInterface) Naming.lookup(this.url);
            return serviceOperador.addOrder(order);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public byte[] isOnDatabase(String number) throws RemoteException {
        try {
            serviceOperador = (ServiceOperadorInterface) Naming.lookup(this.url);
            return serviceOperador.isOnDatabase(number);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public LinkedList<Product> getMenu() throws RemoteException {
        try {
            serviceOperador = (ServiceOperadorInterface) Naming.lookup(this.url);
            return serviceOperador.getMenu();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean addClientOnDataBase(Client client) throws RemoteException {
        try {
            serviceOperador = (ServiceOperadorInterface) Naming.lookup(this.url);
            return serviceOperador.addClientOnDataBase(client);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    
    
}
