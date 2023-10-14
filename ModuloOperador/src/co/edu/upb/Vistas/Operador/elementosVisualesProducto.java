package co.edu.upb.Vistas.Operador;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ElementosVisualesProducto {
    private String id;
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JLabel nombreProducto;
    private javax.swing.JLabel precioProducto;
    private javax.swing.JTextArea descProducto;

    public ElementosVisualesProducto(JLabel imagenProducto, JLabel nombreProducto, JLabel precioProducto, JTextArea descProducto, String id) {
        this.imagenProducto = imagenProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.descProducto = descProducto;
        this.id = id;
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
