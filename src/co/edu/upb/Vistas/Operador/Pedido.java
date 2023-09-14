package co.edu.upb.Vistas.Operador;

import co.edu.upb.Estructuras.Lista.Doble.LinkedList;

public class Pedido {
    LinkedList<Producto> listaProductos = new LinkedList<>();
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
    public Pedido(){
        valorTotal = 0;
    }
    
    public void addProducto(Producto newProduct){
        listaProductos.add(newProduct);
        valorTotal += newProduct.getPrecio();
    }
    
    public void removeProduct(Producto producto){
        valorTotal -= producto.getPrecio();
        listaProductos.remove(producto);
    }
    
    public int getTotalCompra(){
        return valorTotal;
    }
    
    public boolean confirmarPedido(){
        if (nombres == null){
            
        }
        
        
        return false;
    }
    
    public void imprimir(){
        listaProductos.imprimir();
    }
    
    
}
