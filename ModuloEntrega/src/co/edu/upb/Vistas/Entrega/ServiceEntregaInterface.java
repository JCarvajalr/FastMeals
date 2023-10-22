package co.edu.upb.Vistas.Entrega;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.rmi.RemoteException;
import java.io.IOException;
import java.rmi.Remote;

/**
 * Interfaz para comunicar módulo entrega y servidor
 * @author JuanDavidCarvajal
 */
public interface ServiceEntregaInterface extends Remote {

    /**
     * Comunica al servidor para comprobar que el usuario y contraseña ingresados sean válidos y pertenezan
     * al usuario tipo Entrega.
     * @param user      Nombre de usuario ingresado en la ventana.
     * @param password  Contraseña ingresada en la ventana.
     * @return          Retorna falso o verdadero acorde a la verificación.
     * @throws RemoteException
     */
    public boolean login(String user, String password) throws RemoteException;


    /**
     * @return Retorna lista a partir de pedidos ya hechos, que no acumulen mas de 8 productos
     * @throws RemoteException
     */
    public LinkedList<Order> getPedidos() throws RemoteException;
}
