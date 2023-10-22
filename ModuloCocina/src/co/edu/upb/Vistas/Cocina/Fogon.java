package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Product;
import javax.swing.JLabel;

/**
 * Objeto para manejar los fogones, tanto en como se procesan los productos como los 
 * elementos a mostrar en pantalla.
 * @author Kz
 */
public class Fogon {
    public Product currentProduct;
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
        CheckFogon.setVisible(true);
        LabelFg.setText(product.getNombre());
        on = true;
    }
    
    public void endCooking(){
        on = false;
    }
    
    public boolean isOn(){
        return on;
    }
    
}
