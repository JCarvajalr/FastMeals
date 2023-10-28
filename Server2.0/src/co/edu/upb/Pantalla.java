package co.edu.upb;

import co.edu.upb.Server.Server;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {
    JLabel[] avisos = new JLabel[4];
    
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

        avisoAdministrador.setFont(fontLabel); avisoAdministrador.setText("Administrador: ");
        avisoOperador.setFont(fontLabel); avisoOperador.setText("Operador: ");
        avisoCocina.setFont(fontLabel); avisoCocina.setText("Cocina: ");
        avisoEntrega.setFont(fontLabel); avisoEntrega.setText("Entrega: ");
        avisoAdministrador.setBounds(10,15,200, 30);
        avisoOperador.setBounds(10, 45, 200, 30);
        avisoCocina.setBounds(10, 75, 200, 30);
        avisoEntrega.setBounds(10,105, 200, 30);
        panel.add(avisoAdministrador);
        panel.add(avisoOperador);
        panel.add(avisoCocina);
        panel.add(avisoEntrega);
        avisos[0] = avisoAdministrador;
        avisos[1] = avisoOperador;
        avisos[2] = avisoCocina;
        avisos[3] = avisoEntrega;
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

        boolean[] info = serverDeploy.deployServices();
        String mostrar;
        if (info != null){
            
            for (int i=0; i<avisos.length; i++){
                if (info[i]){
                    avisos[i].setForeground(Color.GREEN);
                    avisos[i].setText(avisos[i].getText() + "On");
                } else {
                    avisos[i].setForeground(Color.RED);
                    avisos[i].setText(avisos[i].getText() + "Off");
                }               
            }
            
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
