package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Product;
import javax.swing.JLabel;

public class Fogon {
    Product currentProduct;
    boolean on;
    int tipoCoccion;
    // 0 - Rapida, 1 - lenta
    
    //Elementos Swing
    public JLabel ImagenFogon; //Imagen
    public JLabel CheckFogon;  //Boton
    public JLabel LabelFg;     //Producto
    
    public Fogon(int tipoCoccion){
        this.tipoCoccion = tipoCoccion;
    }
    
    public int getTipoCoccion(){
        return tipoCoccion;
    }
    
    public void turnOn(Product product){
        currentProduct = product;
        on = true;
    }
    
    public void endCooking(){
        if (on){
            currentProduct.setCooked();
            on = false;
        }
    }
    
    public boolean isOn(){
        return on;
    }
    
}
