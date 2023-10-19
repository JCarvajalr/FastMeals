package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

public class Controlador {
    ColaPrioridad<Order> colaPedidos = new ColaPrioridad(2);
    LinkedList<Order> pedidosEnProceso = new LinkedList<>();
    
    
    public Controlador(){
        
    }
    
    public Product tomarProducto(){
        
        if (pedidosEnProceso.isEmpty()){
            if (!colaPedidos.isEmpty()){
                pedidosEnProceso.add(colaPedidos.extraer());
                
                //Tomar producto del pedido
                Product product = pedidosEnProceso.get().getProduct();
                
                if (product.getTiempoCoccion() == 0){
                    //ingresarEnFogonRapido(product);
                }
                
            } else {
                return null;
            }
        } else{
            
            
            
            
        }
        
        return null;
    }
    
    public boolean verificarFogonesRapidos(){
        /*if (fogones[3] == 0 || fogones[7] == 0 || fogones[11] == 0 || fogones[15] == 0){
            return true;
        }*/
        
        
        
        
        return false;
    }
    
    
}
