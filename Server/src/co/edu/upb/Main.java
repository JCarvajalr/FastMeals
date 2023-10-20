package co.edu.upb;


import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Server.Server;
import co.edu.upb.Services.OrderController;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //"localhost", "4999", "serviceAdministrador"
        //"localhost","5001","serviceOperador"
        //"localhost","5020","serviceCocina"
        //String nombres, String apellidos, int tipoCliente, String direccion, int valorTotal
        //String nombre, String id, int precio, int tiempoCoccion, String descripcion

        Server serverDeploy = new Server();
        serverDeploy.deployServiceOperador("localhost","5001","serviceOperador");
        serverDeploy.deployServiceAdministrador("localhost", "4999", "serviceAdministrador");
        serverDeploy.deployServiceCocina("localhost","5020","serviceCocina");



    }
    
}
