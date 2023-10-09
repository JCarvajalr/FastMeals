package co.edu.upb.Interfaces.Operador;

import co.edu.upb.Interfaces.Operador.ProductInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OrderInterface extends Remote {
    
    /* Add a product to the linkedList and 
     * add to the total value
     */
    public void addProducto(ProductInterface newProduct) throws RemoteException;
    
    /* Remove the product from the list and
     * subtract the value from the total
     */
    public void removeProduct(ProductInterface producto) throws RemoteException;
    
    /* Returns the total value of the order
     */
    public int getTotalCompra() throws RemoteException;
    
}
