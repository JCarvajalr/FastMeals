package co.edu.upb.Vistas.Operador;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class elementosVisualesProducto {
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JLabel nombreProducto;
    private javax.swing.JLabel precioProducto;
    private javax.swing.JTextArea descProducto;

    public elementosVisualesProducto(JLabel imagenProducto, JLabel nombreProducto, JLabel precioProducto, JTextArea descProducto) {
        this.imagenProducto = imagenProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.descProducto = descProducto;
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
    
    
    
}
