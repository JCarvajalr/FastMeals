package co.edu.upb.Cocina;

import co.edu.upb.Cocina.Clases.Product;
import co.edu.upb.Cocina.Clases.Order;
import co.edu.upb.Cocina.Clases.Fogon;
import co.edu.upb.Estructuras.Cola.Cola;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.Lista.Doble.LinkedList;

public class Controlador {
    ColaPrioridad<Order> colaPedidos = new ColaPrioridad(2);
    LinkedList<Order> pedidosEnProceso = new LinkedList<>();
    
    int[] fogonesasd = new int[16];
    
    Fogon[] fogones = new Fogon[16];
    
    public Controlador(){
        fogones[0] = new Fogon(0);
        fogones[1] = new Fogon(0);
        fogones[2] = new Fogon(0);
        fogones[3] = new Fogon(1);
        fogones[4] = new Fogon(0);
        fogones[5] = new Fogon(0);
        fogones[6] = new Fogon(0);
        fogones[7] = new Fogon(1);
        fogones[8] = new Fogon(0);
        fogones[9] = new Fogon(0);
        fogones[10] = new Fogon(0);
        fogones[11] = new Fogon(1);
        fogones[12] = new Fogon(0);
        fogones[13] = new Fogon(0);
        fogones[14] = new Fogon(0);
        fogones[15] = new Fogon(1);
    }
    
    public Product tomarProducto(){
        
        if (pedidosEnProceso.isEmpty()){
            if (!colaPedidos.isEmpty()){
                pedidosEnProceso.add(colaPedidos.extraer());
                
                //Tomar producto del pedido
                Product product = pedidosEnProceso.get().getProduct();
                
                if (product.getTiempoCoccion() == 0){
                    ingresarEnFogonRapido(product);
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
    
    public boolean ingresarEnFogonRapido(Product producto){
        for (int i=0; i<fogones.length; i++){
            if ((fogones[i].getTipoCoccion() == 0) && (!fogones[i].isOn())){
                fogones[i].turnOn(producto);
                return true;
            }
        }
        return false;
    }
    
    public boolean ingresarEnfogonLento(Product producto){
        for (int i=0; i<fogones.length; i++){
            if ((fogones[i].getTipoCoccion() == 1) && (!fogones[i].isOn())){
                fogones[i].turnOn(producto);
                return true;
            }
        }
        return false;
    }
    
    
}
