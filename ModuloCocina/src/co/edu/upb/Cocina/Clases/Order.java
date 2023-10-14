package co.edu.upb.Cocina.Clases;

import co.edu.upb.Estructuras.Lista.Doble.LinkedList;
import co.edu.upb.Estructuras.Lista.Interface.NodeInterface;
import java.util.Iterator;

public class Order {
    LinkedList<Product> listaProductos = new LinkedList<>();
    String nombres;
    String apellidos;
    int tipoCliente;
    /*  0-> Comun
        1-> Premium
    */
    String direccion;
    int valorTotal;
    
    /*  información de cliente:
	>Nombres
	>Apellidos
	>Tipo de cliente (?)
	>Dirección (Calle/Carrera/Avenida, Número, Casa, Barrio, Municipio)
	>Los 10 pedidos mas frecuentes ordenados por cantidad
    */
    public Order(){
        valorTotal = 0;
    }
    
    public Product getProduct(){        
        Iterator<NodeInterface<Product>> iterator = listaProductos.iterator();
        Product temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.getCook() == 0){
                return temp;
            }
        }
        return null;
    }
    
    public boolean isCooking(){
        Iterator<NodeInterface<Product>> iterator = listaProductos.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getObject().getCook() > 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean isCooked(){
        Iterator<NodeInterface<Product>> iterator = listaProductos.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getObject().getCook() == 2){
                return false;
            }
        }
        return true;
    }
    
    public void addProducto(Product newProduct){
        listaProductos.add(newProduct);
        valorTotal += newProduct.precio;
    }
    
    public void removeProduct(Product producto){
        valorTotal -= producto.precio;
        listaProductos.remove(producto);
    }
    
    public int getTotalCompra(){
        return valorTotal;
    }
    
    public void imprimir(){
        listaProductos.imprimir();
    }
    
    @Override
    public String toString(){
        return "-" + nombres + ",  $" + valorTotal;
    }
   
}
