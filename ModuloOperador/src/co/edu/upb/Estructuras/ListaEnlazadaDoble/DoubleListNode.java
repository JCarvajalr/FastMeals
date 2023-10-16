package co.edu.upb.Estructuras.ListaEnlazadaDoble;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoubleListNode<T extends Serializable> extends Node<T> implements Serializable{

    private DoubleListNode<T> next;
    private DoubleListNode<T> prev;

    //Constructores
    public DoubleListNode(T object){
        super(object);
    }
    public DoubleListNode(){
        super();
    }

    //Metodos
    public DoubleListNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleListNode<T> next) {
        try {
            this.next = next;
        }
        catch (Exception e){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, e.getMessage(),e);
        }
    }

    public DoubleListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleListNode<T> prev) {
        try {
            this.prev = prev;
        }
        catch (Exception e){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, e.getMessage(),e);
        }
    }
}
