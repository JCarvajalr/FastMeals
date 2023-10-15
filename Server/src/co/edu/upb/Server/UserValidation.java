package co.edu.upb.Server;

import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.DataBase.JSon;
import co.edu.upb.Clases.User;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.NodeInterface;

import java.util.Iterator;

public class UserValidation {



    public static TipoUsuario verificatelogIn(String username, String password){
        JSon<User> usuariosData = new JSon<>("Usuarios.json", User.class);
        usuariosData.cargarJSon();

        LinkedList<User> usuarios = usuariosData.getList();
        Iterator<NodeInterface<User>> iterator = usuarios.iterator();
        User temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.verificateLogin(username, password)){
                return temp.getTipoUsuario();
            }

        }
        return null;
    }


}
