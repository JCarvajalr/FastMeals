package co.edu.upb.Services;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Clases.User;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Vistas.Cocina.ServiceCocinaInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

/**
 * Clase que implementa interfaz para conectar el módulo cocina y el servidor.
 * @author JuanDavidCarvajal
 */
public class ServiceCocina extends UnicastRemoteObject implements ServiceCocinaInterface {


    public ServiceCocina() throws RemoteException {
    }

    @Override
    public boolean login(String user, String password) throws RemoteException {
        JSon<User> usuariosData = new JSon<>("Usuarios.json", User.class);
        usuariosData.cargarJSon();
        LinkedList<User> usuarios = usuariosData.getList();
        Iterator<NodeInterface<User>> iterator = usuarios.iterator();
        User temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.verificateLogin(user, password) && temp.getTipoUsuario().equals(TipoUsuario.COCINA)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Order getOrder() throws RemoteException {
        return OrderController.popOrder();
    }

    @Override
    public boolean finishOrder(Order order) throws RemoteException {
        return OrderController.addDoneOrder(order);
    }
}
