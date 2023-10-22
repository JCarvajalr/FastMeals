package co.edu.upb.Vistas.Entrega;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.rmi.RemoteException;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la interfaz que módulo de entrega y servidor
 * @author JuanDavidCarvajal
 */
public class ServiceEntrega implements ServiceEntregaInterface{
    private ServiceEntregaInterface serviceEntrega;
    private String ip;
    private String port;
    private String serviceName;
    private String url;

    public ServiceEntrega(String ip, String port, String serviceName){
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }

    @Override
    public LinkedList<Order> getPedidos() throws RemoteException {
        try {
            if (serviceEntrega == null){
                serviceEntrega = (ServiceEntregaInterface) Naming.lookup(this.url);
            }
            return serviceEntrega.getPedidos();
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceEntrega.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean login(String user, String password) throws RemoteException {
        try {
            serviceEntrega = (ServiceEntregaInterface) Naming.lookup(this.url);
            return serviceEntrega.login(user, password);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ServiceEntrega.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }




}
