package co.edu.upb.Services;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Clases.User;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Vistas.Administrador.ServiceAdministradorInterface;

import javax.swing.plaf.LabelUI;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

public class ServiceAdministrador extends UnicastRemoteObject implements ServiceAdministradorInterface {
    public OrderController orderController;

    public ServiceAdministrador() throws RemoteException {
    }

    @Override
    public Client searchClient(String number) throws RemoteException {
        JSon<Client> clientesData = new JSon<>("ClientesDataBase.json", Client.class);
        clientesData.cargarJSon();
        LinkedList<Client> clientes = clientesData.getList();
        Iterator<NodeInterface<Client>> iterator = clientes.iterator();
        number = number.replace(" ", "");
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
        number = number.replace(" ", "");
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
    public boolean removeUsuario(String username) throws RemoteException {
        JSon<User> usuariosData = new JSon<>("Usuarios.json", User.class);
        usuariosData.cargarJSon();
        LinkedList<User> usuarios = usuariosData.getList();
        Iterator<NodeInterface<User>> iterator = usuarios.iterator();
        User temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.getUsername().equals(username)){
                usuarios.remove(temp);
                usuariosData.guardarDatosEnJSon();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addProduct(Product newProduct) throws RemoteException {
        JSon<Product> productosJSon = new JSon<>("MenuFastMeals.json", Product.class);
        productosJSon.cargarJSon();
        boolean result = productosJSon.addObject(newProduct);
        productosJSon.guardarDatosEnJSon();
        return result;
    }

    @Override
    public boolean removeProduct(String id) throws RemoteException {
        JSon<Product> productosJSon = new JSon<>("MenuFastMeals.json", Product.class);
        productosJSon.cargarJSon();
        LinkedList<Product> list = productosJSon.getList();
        Iterator<NodeInterface<Product>> iterator = list.iterator();
        id = id.replace(" ", "");
        id = id.toLowerCase();
        while (iterator.hasNext()){
            Product temp = iterator.next().getObject();
            if (temp.getId().equals(id) || temp.getNombre().replace(" ", "").toLowerCase().equals(id)){
                productosJSon.removeObject(temp);
                return productosJSon.guardarDatosEnJSon();
            }
        }
        return false;
    }

    @Override
    public Product searchProduct(String id) throws RemoteException {
        JSon<Product> productosJSon = new JSon<>("MenuFastMeals.json", Product.class);
        productosJSon.cargarJSon();
        LinkedList<Product> list = productosJSon.getList();
        Iterator<NodeInterface<Product>> iterator = list.iterator();
        id = id.replace(" ", "");
        while (iterator.hasNext()){
            Product temp = iterator.next().getObject();
            if (temp.getId().equals(id) || temp.getNombre().equals(id)){
                return temp;
            }
        }
        return null;
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
