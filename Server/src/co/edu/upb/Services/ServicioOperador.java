package co.edu.upb.Services;

import co.edu.upb.Interfaces.Operador.ProductInterface;
import co.edu.upb.Interfaces.Operador.VistaOperadorInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

public class ServicioOperador extends UnicastRemoteObject implements VistaOperadorInterface {

    public ServicioOperador() throws RemoteException {
    }
    
    @Override
    public boolean login(String user, String password) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean verificarPedido() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void confirmarPedido() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void llenarMenu() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ProductInterface buscarProducto(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
