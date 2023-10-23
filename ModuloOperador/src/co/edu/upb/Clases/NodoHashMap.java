package co.edu.upb.Clases;

import co.edu.upb.Clases.Product;
import java.io.Serializable;

/**
 *
 * @author JuanDavidCarvajal
 */
public class NodoHashMap implements Serializable{
    public String producto;
    public double diferencia;
    
    public NodoHashMap(String producto, double diferencia){
        this.producto = producto;
        this.diferencia = diferencia;
    }
}
