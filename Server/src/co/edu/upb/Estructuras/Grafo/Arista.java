package co.edu.upb.Estructuras.Grafo;

import java.io.Serializable;

public class Arista implements Serializable {
    private NodoGrafo nodo;
    private int peso;

    public Arista(NodoGrafo nodo, int peso) {
        this.nodo = nodo;
        this.peso = peso;
    }

    public int getPeso() {
        return this.peso;
    }

    public NodoGrafo getNodo() {
        return nodo;
    }

    public NodoGrafo getDestino() {
        return nodo;
    }
}