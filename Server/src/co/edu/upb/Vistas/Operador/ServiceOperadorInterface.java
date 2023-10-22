package co.edu.upb.Vistas.Operador;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.Client;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interfaz para comunicar módulo operador y servidor
 * @author JuanDavidCarvajal
 */
public interface ServiceOperadorInterface extends Remote {

    /**
     * Comunica al servidor para comprobar que el usuario y contraseña ingresados sean válidos y
     * pertenezcan al usuario tipo Operador.
     * @param user      Nombre de usuario ingresado en la ventana.
     * @param password  Contraseña ingresada en la ventana.
     * @return          Retorna falso o verdadero acorde a la verificación.
     * @throws RemoteException
     */
    public boolean login(String user, String password) throws RemoteException;

    /**
     * Comunica al servidor y envia un pedido confirmado para ser añadido a la cola.
     * @param order Orden confirmada en "VistaOperador".
     * @return
     * @throws RemoteException
     */
    public boolean addOrder(Order order) throws RemoteException;

    /**
     * Comunica al servidor y envia número de telefono de cliente para buscar en la base de datos.
     * @param number Número ingresado a la hora de llenar los datos del cliente.
     * @return       Cliente en caso de existir.
     * @throws RemoteException
     */
    public byte[] isOnDatabase(String number) throws IOException;

    /**
     * Lee el archivo "MenuFastMeals.json" y retorna los productos.
     * @return Lista de objetos tipo "Product".
     * @throws RemoteException
     */
    public LinkedList<Product> getMenu() throws RemoteException;

    /**
     * Registra un cliente en la base de datos.
     * @param client Cliente a registrar
     * @return
     * @throws RemoteException
     */
    public boolean addClientOnDataBase(Client client) throws RemoteException;
}
