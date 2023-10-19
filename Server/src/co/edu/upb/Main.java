package co.edu.upb;


import co.edu.upb.Server.Server;

public class Main {
    public static void main(String[] args) {
        //"localhost", "4999", "serviceAdministrador"
        //"localhost","5001","serviceOperador"
        Server serverDeploy = new Server();
        serverDeploy.deployServiceOperador("localhost","5001","serviceOperador");
        serverDeploy.deployServiceAdministrador("localhost", "4999", "serviceAdministrador");

    }
    
}
