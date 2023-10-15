package co.edu.upb.Vistas.Operador;

import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Vistas.Operador.Interfaces.VistaOperadorInterface;
import java.rmi.RemoteException;
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.Naming; import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceOperador implements VistaOperadorInterface{
    
    private VistaOperadorInterface serviceOperador;
    private VistaOperadorInterface service;
    private String ip;
    private String port;
    private String serviceName;
    private String url;

    public ServiceOperador(String ip, String port, String serviceName) {
        this.service = null;
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }
    
    
    public ColaPrioridad<Order> colaDePedidos = new ColaPrioridad<>(2);
    
    @Override
    public boolean login(String user, String password) throws RemoteException {
        try {
            serviceOperador = (VistaOperadorInterface) Naming.lookup(url);
            return serviceOperador.login(user, password);
        } catch (NotBoundException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServiceOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean addProduct(Product product) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addOrder(Order order) throws RemoteException {
        return colaDePedidos.add(order, order.tipoCliente);
    }

    @Override
    public boolean isOnDatabase(int number) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
