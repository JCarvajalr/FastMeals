package co.edu.upb.Services;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Clases.User;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Vistas.Administrador.ServiceAdministradorInterface;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

public class ServiceAdministrador extends UnicastRemoteObject implements ServiceAdministradorInterface {

    public ServiceAdministrador() throws RemoteException {
    }

    @Override
    public Client searchClient(String number) throws RemoteException {
        JSon<Client> clientesData = new JSon<>("ClientesDataBase.json", Client.class);
        clientesData.cargarJSon();
        LinkedList<Client> clientes = clientesData.getList();
        Iterator<NodeInterface<Client>> iterator = clientes.iterator();
        while (iterator.hasNext()){
            Client temp = iterator.next().getObject();
            if (temp.getNumeroTelfono().equals(number)){
                return temp;
            }
        }
        return null;
    }

    @Override
    public boolean removeClient(String number) throws RemoteException {
        JSon<Client> clientesData = new JSon<>("ClientesDataBase.json", Client.class);
        clientesData.cargarJSon();
        LinkedList<Client> clientes = clientesData.getList();
        Iterator<NodeInterface<Client>> iterator = clientes.iterator();
        while (iterator.hasNext()){
            Client temp = iterator.next().getObject();
            if (temp.getNumeroTelfono().equals(number)){
                clientesData.removeObject(temp);
                clientesData.guardarDatosEnJSon();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addCliente(Client cliente) throws RemoteException {
        JSon<Client> clientesData = new JSon<>("ClientesDataBase.json", Client.class);
        clientesData.cargarJSon();
        clientesData.addObject(cliente);
        return clientesData.guardarDatosEnJSon();
    }

    @Override
    public boolean addUsuario(User newUser) throws RemoteException {
        JSon<User> usuariosData = new JSon<>("Usuarios.json", User.class);
        usuariosData.cargarJSon();
        boolean result = usuariosData.addObject(newUser);
        usuariosData.guardarDatosEnJSon();
        return result;
    }

    @Override
    public boolean login(String username, String password) throws RemoteException {
        JSon<User> usuariosData = new JSon<>("Usuarios.json", User.class);
        usuariosData.cargarJSon();
        LinkedList<User> usuarios = usuariosData.getList();
        Iterator<NodeInterface<User>> iterator = usuarios.iterator();
        User temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.verificateLogin(username, password) && temp.getTipoUsuario().equals(TipoUsuario.ADMINISTRADOR)){
                return true;
            }
        }
        return false;
    }

}
