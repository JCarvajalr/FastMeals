package co.edu.upb.Vistas.Operador;

import co.edu.upb.Clases.Product;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ElementosVisualesProducto {
    public Product producto;
    public String id;
    public javax.swing.JLabel imagenProducto;
    public javax.swing.JLabel nombreProducto;
    public javax.swing.JLabel precioProducto;
    public javax.swing.JTextArea descProducto;
    public JButton addProducto;
    public JButton removeProducto;

    public ElementosVisualesProducto(JLabel imagenProducto, JLabel nombreProducto, JLabel precioProducto, JTextArea descProducto, JButton addProducto, 
            JButton removeProducto, String id, Product producto) {
        this.imagenProducto = imagenProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.descProducto = descProducto;
        this.addProducto = addProducto;
        this.removeProducto = removeProducto;
        this.id = id;
        this.producto = producto;
    }
    
    public ElementosVisualesProducto(JLabel nombreProducto, JLabel precioProducto, JTextArea descProducto, JButton addProducto, 
            JButton removeProducto, String id, Product producto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.descProducto = descProducto;
        this.addProducto = addProducto;
        this.removeProducto = removeProducto;
        this.id = id;
        this.producto = producto;
    }

    public JLabel getImagenProducto() {
        return imagenProducto;
    }

    public JLabel getNombreProducto() {
        return nombreProducto;
    }

    public JLabel getPrecioProducto() {
        return precioProducto;
    }

    public JTextArea getDescProducto() {
        return descProducto;
    }
    
    public String getId(){
        return id;
    }
    
}
