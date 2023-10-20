package co.edu.upb.Clases;

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private String password;
    //private final String tipoUsuario;
    private TipoUsuario tipoUsuario;

    public User(String username, String password, TipoUsuario tipoUsuario) {
        this.username = username;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }
    
    public User(String username, String password, int tipoUsuario) {
        this.username = username;
        this.password = password;
        switch (tipoUsuario) {
            case 1 -> this.tipoUsuario = TipoUsuario.OPERADOR;
            case 2 -> this.tipoUsuario = TipoUsuario.COCINA;
            case 3 -> this.tipoUsuario = TipoUsuario.ENTREGA;
        }
    }
    
    public boolean verificateLogin(String user, String pass){
        return username.equals(user) && password.equals(pass);
    }

    public String getUsername() {
        return username;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    @Override
    public String toString(){
        return username + ", " + password + "  (" + tipoUsuario + ")";
    }

}
