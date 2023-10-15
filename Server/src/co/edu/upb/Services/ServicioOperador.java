package co.edu.upb.Services;

import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Server.UserValidation;
import co.edu.upb.Vistas.Operador.Interfaces.VistaOperadorInterface;
import co.edu.upb.Vistas.Operador.Order;
import co.edu.upb.Vistas.Operador.Product;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicioOperador extends UnicastRemoteObject implements VistaOperadorInterface {

    public ServicioOperador() throws RemoteException {
    }
    
    @Override
    public boolean login(String user, String password) throws RemoteException {
        return UserValidation.verificatelogIn(user, password).equals(TipoUsuario.OPERADOR);
    }

    @Override
    public boolean addProduct(Product product) throws RemoteException {
        return false;
    }

    @Override
    public boolean addOrder(Order order) throws RemoteException {
        return false;
    }

    @Override
    public boolean isOnDatabase(int number) throws RemoteException {
        return false;
    }
}
