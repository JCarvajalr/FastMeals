package co.edu.upb.Vistas.Entrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Point;

import java.util.Random;

public class VistaEntrega extends JFrame {
    private String[] ciudadesNombres;
    private Point[] ciudadesPosiciones;
    private String[] conexionesOrigen;
    private String[] conexionesDestino;
    private int[] conexionesDistancias;
    private int ciudadesCount;
    private int conexionesCount;
    private JPanel mapaPanel;
    private DefaultListModel<String> pedidosListModel;

    public VistaEntrega(String usuario) {
        // Configurar la ventana principal
        setTitle("Módulo de Entrega");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar el mapa estilo Google Maps
        int maxCiudades = 10; // Define el número máximo de ciudades
        int maxConexiones = 20; // Define el número máximo de conexiones
        ciudadesNombres = new String[maxCiudades];
        ciudadesPosiciones = new Point[maxCiudades];
        conexionesOrigen = new String[maxConexiones];
        conexionesDestino = new String[maxConexiones];
        conexionesDistancias = new int[maxConexiones];
        ciudadesCount = 0;
        conexionesCount = 0;

        cargarMapa();
        mapaPanel = new MapaEstiloGoogle();
        add(mapaPanel, BorderLayout.CENTER);

        // Inicializar la lista de pedidos
        pedidosListModel = new DefaultListModel<>();
        JList<String> pedidosList = new JList<>(pedidosListModel);
        JScrollPane scrollPane = new JScrollPane(pedidosList);
        add(scrollPane, BorderLayout.EAST);

        // Agregar un botón para simular la llegada de pedidos
        JButton btnNuevoPedido = new JButton("Nuevo Pedido");
        btnNuevoPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarNuevoPedido();
            }
        });
        add(btnNuevoPedido, BorderLayout.SOUTH);
    }

    private void cargarMapa() {
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

        // Otras conexiones según tus necesidades
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

    private void generarNuevoPedido() {
        // Simular la llegada de un nuevo pedido
        Random rand = new Random();
        String ciudadAleatoria = ciudadesNombres[rand.nextInt(ciudadesCount)];
        String pedido = "Pedido a " + ciudadAleatoria;
        pedidosListModel.addElement(pedido);
    }
}
