package co.edu.upb.Cocina.Clases;

public class Fogon {
    Product currentProduct;
    boolean on;
    int tipoCoccion;
    // 0 - Rapida, 1 - lenta
    
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
