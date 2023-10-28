package co.edu.upb.Services;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Clases.User;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Vistas.Entrega.ServiceEntregaInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

/**
 * Clase que implementa la interfaz que módulo de entrega y servidor
 * @author JuanDavidCarvajal
 */

public class ServiceEntrega extends UnicastRemoteObject implements ServiceEntregaInterface {
    public ServiceEntrega() throws RemoteException {
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
            if (temp.verificateLogin(user, password) && temp.getTipoUsuario().equals(TipoUsuario.ENTREGA)){
                return true;
            }
        }
        return false;
    }

    @Override
    public LinkedList<Order> getPedidos() throws RemoteException {
        return OrderController.generarDomicilio();
    }
}