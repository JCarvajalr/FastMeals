package co.edu.upb.Services;

import co.edu.upb.Clases.*;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Vistas.Operador.Interfaces.VistaOperadorInterface;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

public class ServicioOperador extends UnicastRemoteObject implements VistaOperadorInterface {
    ColaPrioridad<Order> colaPedidos = new ColaPrioridad<>(2);

    public ServicioOperador() throws RemoteException {
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
            if (temp.verificateLogin(user, password) && temp.getTipoUsuario().equals(TipoUsuario.OPERADOR)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addOrder(Order order) throws RemoteException {
        return colaPedidos.add(order, order.getTipoCliente());
    }

    @Override
    public byte[] isOnDatabase(String number) throws IOException {
        JSon<Client> clientesData = new JSon<>("ClientesDataBase.json", Client.class);
        clientesData.cargarJSon();
        LinkedList<Client> clientes = clientesData.getList();
        Iterator<NodeInterface<Client>> iterator = clientes.iterator();
        Client temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.getNumeroTelfono().equals(number)){
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                ObjectOutputStream os = new ObjectOutputStream(bs);
                os.writeObject(temp);
                os.close();
                bs.close();
                return bs.toByteArray();
            }
        }
        return null;
    }

    @Override
    public LinkedList<Product> getMenu() throws RemoteException {
        JSon<Product> menuData = new JSon<>("MenuFastMeals.json", Product.class);
        menuData.cargarJSon();
        return menuData.getList();
    }
}
