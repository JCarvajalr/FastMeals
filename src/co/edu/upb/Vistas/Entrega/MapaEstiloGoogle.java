package co.edu.upb.Vistas.Entrega;

import javax.swing.*;
import java.awt.*;


public class MapaEstiloGoogle extends JPanel {
    private String[] ciudadesNombres;
    private Point[] ciudadesPosiciones;
    private String[] conexionesOrigen;
    private String[] conexionesDestino;
    private int[] conexionesDistancias;
    private int ciudadesCount;
    private int conexionesCount;

    public MapaEstiloGoogle() {
        int maxCiudades = 10; // Define el número máximo de ciudades
        int maxConexiones = 20; // Define el número máximo de conexiones
        ciudadesNombres = new String[maxCiudades];
        ciudadesPosiciones = new Point[maxCiudades];
        conexionesOrigen = new String[maxConexiones];
        conexionesDestino = new String[maxConexiones];
        conexionesDistancias = new int[maxConexiones];
        ciudadesCount = 0;
        conexionesCount = 0;

        // Cargar una imagen de fondo que represente un mapa de estilo Google Maps
        ImageIcon mapaImagen = new ImageIcon("co.edu.upb.Iconos.mapaGoogle.jpg");

       // Agregar las ciudades y sus posiciones en el mapa
        agregarCiudad("Bucaramanga", new Point(100, 100));
        agregarCiudad("Floridablanca", new Point(250, 200));
        agregarCiudad("Piedecuesta", new Point(150, 300));
        agregarCiudad("Girón", new Point(350, 350));
        agregarCiudad("San Gil", new Point(500, 100));
        agregarCiudad("Aratoca", new Point(550, 300));
        agregarCiudad("Curití", new Point(400, 400));
        agregarCiudad("Cucuta", new Point(600, 150));
        agregarCiudad("Los Santos", new Point(700, 300));
        agregarCiudad("Barbosa", new Point(300, 500));

        // Agregar las conexiones y distancias
        conectar("Bucaramanga", "Floridablanca", 30);
        conectar("Floridablanca", "Piedecuesta", 25);
        conectar("Piedecuesta", "Girón", 35);
        conectar("Girón", "Bucaramanga", 40);
        conectar("San Gil", "Aratoca", 60);
        conectar("Aratoca", "Curití", 70);
        conectar("Curití", "San Gil", 55);
        conectar("Cucuta", "Los Santos", 110);
        conectar("Bucaramanga", "Cucuta", 210);
        conectar("San Gil", "Barbosa", 90);
    }

    private void agregarCiudad(String nombre, Point posicion) {
        ciudadesNombres[ciudadesCount] = nombre;
        ciudadesPosiciones[ciudadesCount] = posicion;
        ciudadesCount++;
    }

    private void conectar(String ciudadOrigen, String ciudadDestino, int distancia) {
        conexionesOrigen[conexionesCount] = ciudadOrigen;
        conexionesDestino[conexionesCount] = ciudadDestino;
        conexionesDistancias[conexionesCount] = distancia;
        conexionesCount++;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar el mapa de fondo
        ImageIcon mapaImagen = new ImageIcon("C:\\Users\\Jean\\Desktop\\ESTRUCTURA DE DATOS PROYECTO\\uservalidation\\imagenes\\mapaGoogle.jpg");
        Image mapa = mapaImagen.getImage();
        g.drawImage(mapa, 0, 0, getWidth(), getHeight(), this);

        // Dibujar conexiones entre ciudades
        for (int i = 0; i < conexionesCount; i++) {
            String ciudadOrigen = conexionesOrigen[i];
            String ciudadDestino = conexionesDestino[i];
            int distancia = conexionesDistancias[i];

            int indiceOrigen = encontrarIndiceCiudad(ciudadOrigen);
            int indiceDestino = encontrarIndiceCiudad(ciudadDestino);

            Point puntoOrigen = ciudadesPosiciones[indiceOrigen];
            Point puntoDestino = ciudadesPosiciones[indiceDestino];

            // Dibujar línea entre las ciudades
            g.setColor(Color.BLACK);
            g.drawLine(puntoOrigen.x, puntoOrigen.y, puntoDestino.x, puntoDestino.y);

            // Dibujar etiqueta de distancia
            int etiquetaX = (puntoOrigen.x + puntoDestino.x) / 2;
            int etiquetaY = (puntoOrigen.y + puntoDestino.y) / 2;
            g.drawString(String.valueOf(distancia), etiquetaX, etiquetaY);
        }

        // Dibujar ciudades como círculos
        for (int i = 0; i < ciudadesCount; i++) {
            String ciudad = ciudadesNombres[i];
            Point punto = ciudadesPosiciones[i];
            g.setColor(Color.BLUE);
            g.fillOval(punto.x - 15, punto.y - 15, 30, 30);
            g.setColor(Color.BLACK);
            g.drawString(ciudad, punto.x - 15, punto.y - 20);
        }
    }

    private int encontrarIndiceCiudad(String ciudad) {
        for (int i = 0; i < ciudadesCount; i++) {
            if (ciudadesNombres[i].equals(ciudad)) {
                return i;
            }
        }
        return -1;
    }
}
