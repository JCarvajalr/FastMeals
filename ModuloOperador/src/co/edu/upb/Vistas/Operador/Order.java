package co.edu.upb.Vistas.Operador;

import co.edu.upb.Estructuras.Lista.Doble.LinkedList;

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