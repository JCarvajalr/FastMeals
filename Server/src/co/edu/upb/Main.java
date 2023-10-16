package co.edu.upb;

import co.edu.upb.Clases.Product;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import co.edu.upb.Server.Server;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Product: String nombre, String id, int precio, int tiempoCoccion, String descripcion
        // Cliente: String nombres, String apellidos, int tipoCliente, String direccion


        Server serverDeploy = new Server("localhost","5001","serviceOperador");
        serverDeploy.deployServiceOperador();


    }
    
}
