package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.rmi.RemoteException;
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.Naming; 
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa interfaz para conectar el módulo cocina y el servidor.
 * @author JuanDavidCarvajal
 */
public class ServiceCocina implements ServiceCocinaInterface {
    private ServiceCocinaInterface serviceCocina;
    private String ip;
    private String port;
    private String serviceName;
    private String url;
    
    //Constructor
    public ServiceCocina(String ip, String port, String serviceName) {
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
            if (serviceCocina == null){
                serviceCocina = (ServiceCocinaInterface) Naming.lookup(this.url);
            }
            return serviceCocina.getOrder();
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceCocina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }   

    @Override
    public boolean finishOrder(Order order) throws RemoteException {
        try {
            if (serviceCocina == null){
                serviceCocina = (ServiceCocinaInterface) Naming.lookup(this.url);
            }
            return serviceCocina.finishOrder(order);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceCocina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
