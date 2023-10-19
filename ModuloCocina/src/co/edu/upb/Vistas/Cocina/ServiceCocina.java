package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Order;
import java.rmi.RemoteException;
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.Naming; 
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceCocina implements ServiceCocinaInterface {
    private ServiceCocinaInterface serviceCocina;
    private ServiceCocinaInterface service;
    private String ip;
    private String port;
    private String serviceName;
    private String url;
    
    //Constructor
    public ServiceCocina(String ip, String port, String serviceName) {
        this.service = null;
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }
    
    //Metodos
    @Override
    public boolean login(String user, String password) throws RemoteException {
        try {
            serviceCocina = (ServiceCocinaInterface) Naming.lookup(this.url);
            return serviceCocina.login(user, password);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceCocina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Order getOrder() throws RemoteException {
        try {
            serviceCocina = (ServiceCocinaInterface) Naming.lookup(this.url);
            return serviceCocina.getOrder();
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceCocina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
