package co.edu.upb.Estructuras.Grafo;


import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.Grafo.Arista;

import java.io.Serializable;

public class NodoGrafo implements Serializable {

    private boolean visitado;
    private String nombre;
    private int indice;
    private LinkedList<Arista> conexiones;
    private int distanciaMinima;

    public NodoGrafo(int indice, String nombre) {
        this.indice = indice;
        this.nombre = nombre;
        this.conexiones = new LinkedList<>();
        this.distanciaMinima = Integer.MAX_VALUE;
        this.visitado = false;
    }

    public int getIndice() {
        return indice;
    }

    public LinkedList<Arista> getConexiones() {
        return conexiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void addConexion(NodoGrafo conexion, int peso) {
        conexiones.add(new Arista(conexion, peso));
        // También agrega la conexión en la dirección opuesta
        conexion.conexiones.add(new Arista(this, peso));
    }

    public int getNumeroConexiones() {
        return conexiones.size();
    }

    public boolean removerConexion(Arista arista) {
        return conexiones.remove(arista);
    }

    // Método para marcar el nodo como visitado
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    // Método para verificar si el nodo ha sido visitado
    public boolean esVisitado() {
        return visitado;
    }
}