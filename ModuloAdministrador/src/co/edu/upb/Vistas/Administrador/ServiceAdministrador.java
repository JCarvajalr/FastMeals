package co.edu.upb.Vistas.Administrador;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.User;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServiceAdministrador implements ServiceAdministradorInterface{
    private ServiceAdministradorInterface serviceAdministrador;
    private String ip;
    private String port;
    private String serviceName;
    private String url;
    
    public ServiceAdministrador(String ip, String port, String serviceName) {
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }
    
    @Override
    public Client searchClient(String number) throws RemoteException {
        try {
            serviceAdministrador = (ServiceAdministradorInterface) Naming.lookup(this.url);
            return serviceAdministrador.searchClient(number);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean removeClient(String number) throws RemoteException {
        try {
            serviceAdministrador = (ServiceAdministradorInterface) Naming.lookup(this.url);
            return serviceAdministrador.removeClient(number);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean addCliente(Client cliente) throws RemoteException {
        try {
            serviceAdministrador = (ServiceAdministradorInterface) Naming.lookup(this.url);
            return serviceAdministrador.addCliente(cliente);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean addUsuario(User newUser) throws RemoteException {
        try {
            serviceAdministrador = (ServiceAdministradorInterface) Naming.lookup(this.url);
            return serviceAdministrador.addUsuario(newUser);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean login(String username, String password) throws RemoteException {
        try {
            serviceAdministrador = (ServiceAdministradorInterface) Naming.lookup(this.url);
            return serviceAdministrador.login(username, password);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    
}
