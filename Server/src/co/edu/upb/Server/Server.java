package co.edu.upb.Server;

import co.edu.upb.Interfaces.Operador.VistaOperadorInterface;
import co.edu.upb.Services.ServicioOperador;
import java.io.Serializable;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    public String ip;
    public String port;
    public String serviceName;
    public String url;
    
    public Server(String ip, String port, String serviceName) {
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "//" + ip + ":" + port + "/" + serviceName;
    }
    
    public boolean deployServices() {
        try {
            deployServiceOperador("Operador", "5000", "serviceOperador");
            
            return true;
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, e.getMessage(), e);
            return false;
        }
    }
    
    public boolean deployServiceOperador(String serviceType, String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) 
            return false;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;
            //port
            LocateRegistry.createRegistry(Integer.parseInt(port));
            VistaOperadorInterface service = new ServicioOperador();
            
            Naming.rebind(url, service);
            System.out.println("Service:" +serviceType +": on");
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }
    
    
}
