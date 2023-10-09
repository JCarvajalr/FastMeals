package co.edu.upb.Clases;

public class User {

    private String username;
    private String password;
    private final String tipoUsuario;

    public User(String username, String password, String tipoUsuario) {
        this.username = username;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    public boolean verificateLogin(String user, String pass){
        return username.equals(user) && password.equals(pass);
    }

    public String getUsername() {
        return username;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
