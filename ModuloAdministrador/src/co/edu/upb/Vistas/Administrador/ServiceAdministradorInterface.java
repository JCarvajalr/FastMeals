package co.edu.upb.Vistas.Administrador;

import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.User;
import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 * Interfaz para conectar el módulo administrador y servidor
 * @author JuanDavidCarvajal
 */
public interface ServiceAdministradorInterface extends Remote {

    /**
     * Metodo para buscar un cliente en la base de datos.
     * @param number Numero de cliente a buscar.
     * @return       Cliente que coincide con el número de telefono.
     * @throws RemoteException
     */
    public Client searchClient(String number) throws RemoteException;

    /**
     * Metodo para eliminar un cliente en la base de datos.
     * @param number Número de telefono asociado a la información del cliente a eliminar.
     * @return
     * @throws RemoteException
     */
    public boolean removeClient(String number) throws RemoteException;

    /**
     * Metodo para añadir un cliente en la base de datos.
     * @param cliente Cliente a añadir.
     * @return
     * @throws RemoteException
     */
    public boolean addCliente(Client cliente) throws RemoteException;

    /**
     * Metodo para crear un usuario para acceder a los distintos modulos.
     * @param newUser
     * @return
     * @throws RemoteException
     */
    public boolean addUsuario(User newUser) throws RemoteException;

    /**
     * Comunica al servidor para comprobar que el usuario y contraseña ingresados sean válidos y pertenezan
     * al usuario tipo Administrador.
     * @param username      Nombre de usuario ingresado en la ventana.
     * @param password  Contraseña ingresada en la ventana.
     * @return          Retorna falso o verdadero acorde a la verificación.
     * @throws RemoteException
     */
    public boolean login(String username, String password) throws RemoteException;

    /**
     * Metodo para eliminar un usuario de la base de datos.
     * @param username
     * @return
     * @throws RemoteException
     */
    public boolean removeUsuario(String username) throws RemoteException;

    /**
     * Metodo para añadir un producto al menú.
     * @param newProduct
     * @return
     * @throws RemoteException
     */
    public boolean addProduct(Product newProduct) throws RemoteException;

    /**
     * Metodo para eliminar un producto del menú.
     * @param id
     * @return
     * @throws RemoteException
     */
    public boolean removeProduct(String id) throws RemoteException;

    /**
     * Metodo para buscar un producto por su Id.
     * @param id
     * @return
     * @throws RemoteException
     */
    public Product searchProduct(String id) throws RemoteException;
}