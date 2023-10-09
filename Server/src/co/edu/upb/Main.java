package co.edu.upb;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.User;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.NodeInterface;
import com.sun.jdi.IntegerValue;

import java.util.Iterator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Product: String nombre, String id, int precio, int tiempoCoccion, String descripcion
        // Cliente: String nombres, String apellidos, int tipoCliente, String direccion


        JSon<Product> menuJSon = new JSon<>("MenuFastMeals.json", Product.class);
        menuJSon.cargarJSon();

        LinkedList<Product> menu = new LinkedList<>();
        menu = menuJSon.getList();


        LinkedList<Product> resultadoBusqueda = new LinkedList();
        Iterator<NodeInterface<Product>> iterator = resultadoBusqueda.iterator();


        while (iterator.hasNext()){
            Product productoActual = iterator.next().getObject();

            String stringActual = "Pizza pepperoni";;
            String stringBusqueda = "pyza pepe";
            int igualdades = 0;
            int pos1 = 0;
            int pos2 = 0;
            stringActual = stringActual.toLowerCase().replace(" ", "");
            stringBusqueda = stringBusqueda.toLowerCase().replace(" ", "");

            while (pos1 < stringBusqueda.length()){

                if (stringBusqueda.charAt(pos1) == stringActual.charAt(pos2)){
                    igualdades++;
                    pos1++;
                    pos2++;
                } else {
                    if ((pos2 + 1) < stringActual.length()){
                        if (stringBusqueda.charAt(pos1) == stringActual.charAt(pos2 + 1)) {
                            igualdades++;
                            pos1++;
                            pos2 += 2;
                        } else{
                            pos1++;
                            pos2++;
                        }
                    } else{
                        pos1+= 9999999;
                    }
                }
            }

            //Determinar si la busqueda se parece al producto y agregarlo a los resultados
            /*
                Similitud = Dividir la cantidad de caracteres en las iguales para tener una proporción
                Sí la similitud es menor o igual a 2, si son similares.
             */

            System.out.println(stringBusqueda + "  :  " + productoActual.nombre);
            System.out.println("\t" + igualdades);

        }











    }
    
}
