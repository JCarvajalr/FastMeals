package co.edu.upb.Server;

import co.edu.upb.Services.ServiceAdministrador;
import co.edu.upb.Services.ServiceCocina;
import co.edu.upb.Vistas.Administrador.ServiceAdministradorInterface;
import co.edu.upb.Vistas.Cocina.ServiceCocinaInterface;
import co.edu.upb.Vistas.Operador.ServiceOperadorInterface;
import co.edu.upb.Services.ServicioOperador;

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
    
    public Server() {

    }
    

    
    public boolean deployServiceOperador(String ip, String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceOperadorInterface service = new ServicioOperador();
            
            Naming.rebind(url, service);
            System.out.println("Service: " + serviceName +": on");
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deployServiceAdministrador(String ip, String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceAdministradorInterface service = new ServiceAdministrador();

            Naming.rebind(url, service);
            System.out.println("Service: " + serviceName +": on");
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deployServiceCocina(String ip, String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceCocinaInterface service = new ServiceCocina();

            Naming.rebind(url, service);
            System.out.println("Service: " + serviceName +": on");
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
