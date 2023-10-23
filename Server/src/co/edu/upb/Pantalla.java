package co.edu.upb;

import co.edu.upb.Server.Server;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {

    public Pantalla(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Servidor");
        setSize(500, 200);
        initComponents();
    }

    public void initComponents(){
        setLocation(120, 400);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        getContentPane().add(panel);

        fontLabel = new Font("calibri", Font.PLAIN, 18);

        avisoAdministrador = new JLabel();
        avisoOperador = new JLabel();
        avisoCocina = new JLabel();
        avisoEntrega = new JLabel();

        avisoAdministrador.setFont(fontLabel);
        avisoOperador.setFont(fontLabel);
        avisoCocina.setFont(fontLabel);
        avisoEntrega.setFont(fontLabel);
        avisoAdministrador.setBounds(10,15,200, 30);
        avisoOperador.setBounds(10, 45, 200, 30);
        avisoCocina.setBounds(10, 75, 200, 30);
        avisoEntrega.setBounds(10,105, 200, 30);
        panel.add(avisoAdministrador);
        panel.add(avisoOperador);
        panel.add(avisoCocina);
        panel.add(avisoEntrega);
        try {
            initServer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void initServer() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("config.properties")));
        Server serverDeploy = new Server((String) properties.get("IP"));

        String[] info = serverDeploy.deployServices();
        if (info != null){
            avisoAdministrador.setText(info[0]);
            avisoOperador.setText(info[1]);
            avisoCocina.setText(info[2]);
            avisoEntrega.setText(info[3]);

            avisoAdministrador.setForeground(Color.GREEN);
            avisoOperador.setForeground(Color.GREEN);
            avisoCocina.setForeground(Color.GREEN);
            avisoEntrega.setForeground(Color.GREEN);
        } else {
            avisoAdministrador.setText("ERROR");
            avisoAdministrador.setForeground(Color.RED);
        }

    }

    Font fontLabel;
    JPanel panel;
    JLabel avisoAdministrador;
    JLabel avisoOperador;
    JLabel avisoCocina;
    JLabel avisoEntrega;

}
