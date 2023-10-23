package co.edu.upb.Server;

import co.edu.upb.Services.ServiceAdministrador;
import co.edu.upb.Services.ServiceCocina;

import co.edu.upb.Services.ServiceEntrega;
import co.edu.upb.Vistas.Administrador.ServiceAdministradorInterface;
import co.edu.upb.Vistas.Cocina.ServiceCocinaInterface;
import co.edu.upb.Vistas.Entrega.ServiceEntregaInterface;
import co.edu.upb.Vistas.Operador.ServiceOperadorInterface;
import co.edu.upb.Services.ServicioOperador;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Properties;

/**
 * @author JuanDavidCarvajal
 */
public class Server {

    String ip;

    public Server(String ip){
        this.ip = ip;
    }

    public String[] deployServices(){
        Properties properties = new Properties();
        try{
            String[] result = new String[4];
            properties.load(new FileInputStream(new File("config.properties")));

            result[0] = deployServiceAdministrador((String) properties.get("PORT1"), (String) properties.get("SERVICENAME1")) ? "Service: Administrador: On" : "Service: Administrador: Off";

            result[1] = deployServiceOperador((String) properties.get("PORT2"), (String) properties.get("SERVICENAME2")) ? "Service: Operador: On" : "Service: Operador: Off";

            result[2] = deployServiceCocina((String) properties.get("PORT3"), (String) properties.get("SERVICENAME3")) ? "Service: Cocina: On" : "Service: Cocina: Off";

            result[3] = deployServiceEntrega((String) properties.get("PORT4"), (String) properties.get("SERVICENAME4")) ? "Service: Entrega: On" : "Service: Entrega: Off";

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deployServiceOperador(String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", this.ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceOperadorInterface service = new ServicioOperador();
            
            Naming.rebind(url, service);
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deployServiceAdministrador(String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", this.ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceAdministradorInterface service = new ServiceAdministrador();

            Naming.rebind(url, service);
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deployServiceCocina(String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", this.ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceCocinaInterface service = new ServiceCocina();

            Naming.rebind(url, service);
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deployServiceEntrega(String port, String serviceName) {
        boolean result = false;
        if (ip == null | port == null | serviceName == null) return false;
        try {
            System.setProperty( "java.rmi.server.hostname", this.ip);
            String url = "//" + ip + ":" + port + "/" + serviceName;

            LocateRegistry.createRegistry(Integer.parseInt(port));
            ServiceEntregaInterface service = new ServiceEntrega();

            Naming.rebind(url, service);
            result = true;
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
