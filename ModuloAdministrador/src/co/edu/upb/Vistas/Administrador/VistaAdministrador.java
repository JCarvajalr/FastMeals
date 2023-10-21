package co.edu.upb.Vistas.Administrador;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Clases.User;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VistaAdministrador extends javax.swing.JFrame {

    private ServiceAdministrador service;
    private java.awt.Color Hover;
    private Font fontLabels;
    
    public VistaAdministrador(ServiceAdministrador service) {
        initComponents();
        initComponents2();
        setLocationRelativeTo(null);
        setResizable(false);
        this.service = service;
    }
    
    public VistaAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        Hover = new java.awt.Color(219,220,221);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRegistrarCliente = new javax.swing.JPanel();
        jLabelRegistrarCliente = new javax.swing.JLabel();
        panelEliminarCliente = new javax.swing.JPanel();
        jLabelEliminarCliente = new javax.swing.JLabel();
        panelAdministrarUsuarios = new javax.swing.JPanel();
        jLabelAdministrarUsuarios = new javax.swing.JLabel();
        jPanelAdministrarMenu = new javax.swing.JPanel();
        jLabelAdministrarMenu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPaneGlobal = new javax.swing.JTabbedPane();
        panelInicial = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelRegistrarCliente = new javax.swing.JPanel();
        TextFieldNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldNombre1 = new javax.swing.JTextField();
        TextFieldNombre2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonCrearCliente = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        TextFieldNombre3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanelEliminarCliente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TextAreaInfoCliente = new javax.swing.JTextArea();
        BotonEliminarCliente = new javax.swing.JButton();
        jPanelAdminUsuarios = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        tabbedPaneAdministrarUsuarios = new javax.swing.JTabbedPane();
        panelSeleccionarAccion = new javax.swing.JPanel();
        jButtonAddUser = new javax.swing.JButton();
        jButtonRemoveUser = new javax.swing.JButton();
        labelTipoUsuario = new javax.swing.JLabel();
        panelCrearUsuario = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textFieldPassword2 = new javax.swing.JTextField();
        jTipoUsuario = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButtonCrearUsuario = new javax.swing.JButton();
        panelEliminarUsuario = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldEliminarUsuario = new javax.swing.JTextField();
        BotonEliminarUsuario = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPaneAdministrarMenu = new javax.swing.JTabbedPane();
        panelMenuPrincipal = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanelAddProduct = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        textFieldNombreProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textFieldProductoId = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textAreaDescripcionProducto = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxTipoCoccion = new javax.swing.JComboBox<>();
        jButtonCrearProducto = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        textFieldPrecioProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanelRemoveProduct = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldEliminarProducto = new javax.swing.JTextField();
        botonEliminarProducto = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoLogo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.control);
        jLabel2.setText("Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 747, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        panelRegistrarCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabelRegistrarCliente.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabelRegistrarCliente.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabelRegistrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRegistrarCliente.setText("Registrar cliente");
        jLabelRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRegistrarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegistrarClienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarClienteLayout = new javax.swing.GroupLayout(panelRegistrarCliente);
        panelRegistrarCliente.setLayout(panelRegistrarClienteLayout);
        panelRegistrarClienteLayout.setHorizontalGroup(
            panelRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegistrarClienteLayout.setVerticalGroup(
            panelRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelEliminarCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEliminarCliente.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabelEliminarCliente.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabelEliminarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEliminarCliente.setText("Eliminar cliente");
        jLabelEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEliminarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEliminarClienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarClienteLayout = new javax.swing.GroupLayout(panelEliminarCliente);
        panelEliminarCliente.setLayout(panelEliminarClienteLayout);
        panelEliminarClienteLayout.setHorizontalGroup(
            panelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEliminarClienteLayout.setVerticalGroup(
            panelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelAdministrarUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAdministrarUsuarios.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabelAdministrarUsuarios.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabelAdministrarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAdministrarUsuarios.setText("Administrar usuarios");
        jLabelAdministrarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdministrarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdministrarUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAdministrarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAdministrarUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAdministrarUsuariosLayout = new javax.swing.GroupLayout(panelAdministrarUsuarios);
        panelAdministrarUsuarios.setLayout(panelAdministrarUsuariosLayout);
        panelAdministrarUsuariosLayout.setHorizontalGroup(
            panelAdministrarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministrarUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAdministrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAdministrarUsuariosLayout.setVerticalGroup(
            panelAdministrarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAdministrarUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelAdministrarMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAdministrarMenu.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabelAdministrarMenu.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabelAdministrarMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAdministrarMenu.setText("Administrar Menu");
        jLabelAdministrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdministrarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdministrarMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAdministrarMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAdministrarMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdministrarMenuLayout = new javax.swing.GroupLayout(jPanelAdministrarMenu);
        jPanelAdministrarMenu.setLayout(jPanelAdministrarMenuLayout);
        jPanelAdministrarMenuLayout.setHorizontalGroup(
            jPanelAdministrarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdministrarMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAdministrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAdministrarMenuLayout.setVerticalGroup(
            jPanelAdministrarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAdministrarMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAdministrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAdministrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(panelRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanelAdministrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 580));

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 920, 60));

        jTabbedPaneGlobal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        panelInicial.setBackground(new java.awt.Color(245, 245, 245));
        panelInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido administrador");
        panelInicial.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 916, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setText("Seleccione una opción para empezar");
        panelInicial.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jTabbedPaneGlobal.addTab("tab5", panelInicial);

        jPanelRegistrarCliente.setBackground(new java.awt.Color(245, 245, 245));
        jPanelRegistrarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRegistrarCliente.add(TextFieldNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, 35));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel8.setText("Número de telefono");
        jPanelRegistrarCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel9.setText("Dirección");
        jPanelRegistrarCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel10.setText("Nombre");
        jPanelRegistrarCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 30));

        TextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRegistrarCliente.add(TextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, 35));

        TextFieldNombre1.setBackground(new java.awt.Color(245, 245, 245));
        TextFieldNombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldNombre1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelRegistrarCliente.add(TextFieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 40, 35));

        TextFieldNombre2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRegistrarCliente.add(TextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 210, 35));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calle", "Avenida", "Carrera" }));
        jPanelRegistrarCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 35));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel11.setText("Apellidos");
        jPanelRegistrarCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, 30));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel12.setText("Tipo");
        jPanelRegistrarCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 50, 30));

        jButtonCrearCliente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCrearCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrearCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/Button.png"))); // NOI18N
        jButtonCrearCliente.setText("Crear");
        jButtonCrearCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonCrearCliente.setBorderPainted(false);
        jButtonCrearCliente.setContentAreaFilled(false);
        jButtonCrearCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCrearCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCrearCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/ButtonSelected.png"))); // NOI18N
        jPanelRegistrarCliente.add(jButtonCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 170, 50));
        BotonEliminarCliente.setVisible(false);

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No premium", "Premium" }));
        jPanelRegistrarCliente.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 150, 35));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-");
        jPanelRegistrarCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 20, 35));
        jPanelRegistrarCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 40, 10));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("#");
        jPanelRegistrarCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 20, 35));

        TextFieldNombre3.setBackground(new java.awt.Color(245, 245, 245));
        TextFieldNombre3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldNombre3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelRegistrarCliente.add(TextFieldNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 40, 35));
        jPanelRegistrarCliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 170, 10));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setText("Crear cliente");
        jPanelRegistrarCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        jTabbedPaneGlobal.addTab("tab1", jPanelRegistrarCliente);

        jPanelEliminarCliente.setBackground(new java.awt.Color(245, 245, 245));
        jPanelEliminarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel7.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel7.setText("Ingrese el numero del cliente que desea eliminar");
        jPanelEliminarCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jTextFieldNumeroCliente.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldNumeroCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNumeroCliente.setForeground(java.awt.SystemColor.controlDkShadow);
        jTextFieldNumeroCliente.setText("Ingresar número..");
        jTextFieldNumeroCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldNumeroCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNumeroClienteFocusGained(evt);
            }
        });
        jTextFieldNumeroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroClienteActionPerformed(evt);
            }
        });
        jTextFieldNumeroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroClienteKeyReleased(evt);
            }
        });
        jPanelEliminarCliente.add(jTextFieldNumeroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 322, 40));

        jSeparator1.setBackground(java.awt.SystemColor.controlDkShadow);
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelEliminarCliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 240, 10));

        TextAreaInfoCliente.setEditable(false);
        TextAreaInfoCliente.setColumns(20);
        TextAreaInfoCliente.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        TextAreaInfoCliente.setRows(5);
        TextAreaInfoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelEliminarCliente.add(TextAreaInfoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        BotonEliminarCliente.setBackground(new java.awt.Color(255, 255, 255));
        BotonEliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar.png"))); // NOI18N
        BotonEliminarCliente.setText("Confirmar");
        BotonEliminarCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotonEliminarCliente.setBorderPainted(false);
        BotonEliminarCliente.setContentAreaFilled(false);
        BotonEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed.png"))); // NOI18N
        BotonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarClienteActionPerformed(evt);
            }
        });
        jPanelEliminarCliente.add(BotonEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, -1));
        BotonEliminarCliente.setVisible(false);

        jTabbedPaneGlobal.addTab("tab2", jPanelEliminarCliente);

        jPanelAdminUsuarios.setBackground(new java.awt.Color(245, 245, 245));
        jPanelAdminUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelAdminUsuarios.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 930, 50));

        jPanel12.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelAdminUsuarios.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 50));

        panelSeleccionarAccion.setBackground(new java.awt.Color(245, 245, 245));

        jButtonAddUser.setText("Crear");
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jButtonRemoveUser.setText("Eliminar");
        jButtonRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveUserActionPerformed(evt);
            }
        });

        labelTipoUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        labelTipoUsuario.setText("Adminstrar usuarios");

        javax.swing.GroupLayout panelSeleccionarAccionLayout = new javax.swing.GroupLayout(panelSeleccionarAccion);
        panelSeleccionarAccion.setLayout(panelSeleccionarAccionLayout);
        panelSeleccionarAccionLayout.setHorizontalGroup(
            panelSeleccionarAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarAccionLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(panelSeleccionarAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoUsuario)
                    .addGroup(panelSeleccionarAccionLayout.createSequentialGroup()
                        .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jButtonRemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        panelSeleccionarAccionLayout.setVerticalGroup(
            panelSeleccionarAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarAccionLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelTipoUsuario)
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionarAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        tabbedPaneAdministrarUsuarios.addTab("tab2", panelSeleccionarAccion);

        panelCrearUsuario.setBackground(new java.awt.Color(245, 245, 245));
        panelCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setText("Crear usuario");
        panelCrearUsuario.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        textFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelCrearUsuario.add(textFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 200, 35));

        jLabel16.setFont(fontLabels);
        jLabel16.setText("Nombre de usuario");
        panelCrearUsuario.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 30));

        jLabel17.setFont(fontLabels);
        jLabel17.setText("Tipo");
        panelCrearUsuario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 30));

        textFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelCrearUsuario.add(textFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 35));

        jLabel18.setFont(fontLabels);
        jLabel18.setText("Confirma contraseña");
        panelCrearUsuario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        textFieldPassword2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelCrearUsuario.add(textFieldPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 200, 35));

        jTipoUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Operador", "Cocina", "Entrega" }));
        panelCrearUsuario.add(jTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 35));

        jLabel19.setFont(fontLabels);
        jLabel19.setText("Contraseña");
        panelCrearUsuario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        jButton9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton9.setText("Atras");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 85, 35));

        jButtonCrearUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonCrearUsuario.setText("Crear usuario");
        jButtonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearUsuarioActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(jButtonCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, 60));

        tabbedPaneAdministrarUsuarios.addTab("tab1", panelCrearUsuario);

        panelEliminarUsuario.setBackground(new java.awt.Color(245, 245, 245));
        panelEliminarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton8.setText("Atras");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelEliminarUsuario.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 85, 35));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel20.setText("Nombre de usuario a eliminar");
        panelEliminarUsuario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTextFieldEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelEliminarUsuario.add(jTextFieldEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 40));

        BotonEliminarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BotonEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar.png"))); // NOI18N
        BotonEliminarUsuario.setText("Confirmar");
        BotonEliminarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotonEliminarUsuario.setBorderPainted(false);
        BotonEliminarUsuario.setContentAreaFilled(false);
        BotonEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed.png"))); // NOI18N
        BotonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarUsuarioActionPerformed(evt);
            }
        });
        panelEliminarUsuario.add(BotonEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, -1));
        BotonEliminarCliente.setVisible(false);

        tabbedPaneAdministrarUsuarios.addTab("tab3", panelEliminarUsuario);

        jPanelAdminUsuarios.add(tabbedPaneAdministrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 930, 380));

        jTabbedPaneGlobal.addTab("tab3", jPanelAdminUsuarios);

        jPanel11.setBackground(new java.awt.Color(245, 245, 245));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 928, 60));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 50));

        panelMenuPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        jButton2.setText("Añadir producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar producto");

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPaneAdministrarMenu.addTab("tab1", panelMenuPrincipal);

        jPanelAddProduct.setBackground(new java.awt.Color(245, 245, 245));
        jPanelAddProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton5.setText("Atras");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelAddProduct.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 85, 35));

        textFieldNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelAddProduct.add(textFieldNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 250, 35));

        jLabel6.setFont(fontLabels);
        jLabel6.setText("Asignar imagen (Opcional)");
        jPanelAddProduct.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 170, 30));

        jLabel21.setFont(fontLabels);
        jLabel21.setText("Id de producto");
        jPanelAddProduct.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 140, 30));

        textFieldProductoId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelAddProduct.add(textFieldProductoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 200, 35));

        jLabel22.setFont(fontLabels);
        jLabel22.setText("Nombre de producto");
        jPanelAddProduct.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 30));

        textAreaDescripcionProducto.setColumns(20);
        textAreaDescripcionProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textAreaDescripcionProducto.setRows(5);
        textAreaDescripcionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelAddProduct.add(textAreaDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 250, 130));
        textAreaDescripcionProducto.setLineWrap(true);
        textAreaDescripcionProducto.setWrapStyleWord(true);

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel23.setText("Crear producto");
        jPanelAddProduct.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel24.setFont(fontLabels);
        jLabel24.setText("Descripción");
        jPanelAddProduct.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 140, 30));

        jComboBoxTipoCoccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rapida", "Lenta", " " }));
        jPanelAddProduct.add(jComboBoxTipoCoccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 200, 35));

        jButtonCrearProducto.setText("Crear producto");
        jButtonCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearProductoActionPerformed(evt);
            }
        });
        jPanelAddProduct.add(jButtonCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 150, 50));

        jLabel25.setFont(fontLabels);
        jLabel25.setText("Precio de producto");
        jPanelAddProduct.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 140, 30));

        textFieldPrecioProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelAddProduct.add(textFieldPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 200, 35));

        jButton1.setText("Cargar imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelAddProduct.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 140, 40));

        jLabel26.setFont(fontLabels);
        jLabel26.setText("Tipo de cocción");
        jPanelAddProduct.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 140, 30));

        jTabbedPaneAdministrarMenu.addTab("tab2", jPanelAddProduct);

        jPanelRemoveProduct.setBackground(new java.awt.Color(245, 245, 245));
        jPanelRemoveProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Atras");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelRemoveProduct.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 85, 35));

        jLabel27.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel27.setText("Eliminar producto");
        jPanelRemoveProduct.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel28.setFont(fontLabels);
        jLabel28.setText("Ingrese el ID o Nombre de producto");
        jPanelRemoveProduct.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 220, 30));

        jTextFieldEliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRemoveProduct.add(jTextFieldEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 250, 35));

        botonEliminarProducto.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar.png"))); // NOI18N
        botonEliminarProducto.setText("Eliminar");
        botonEliminarProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonEliminarProducto.setBorderPainted(false);
        botonEliminarProducto.setContentAreaFilled(false);
        botonEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed.png"))); // NOI18N
        botonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProductoActionPerformed(evt);
            }
        });
        jPanelRemoveProduct.add(botonEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, -1));
        BotonEliminarCliente.setVisible(false);

        jTabbedPaneAdministrarMenu.addTab("tab3", jPanelRemoveProduct);

        jPanel14.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPaneAdministrarMenu.addTab("tab4", jPanel14);

        jPanel11.add(jTabbedPaneAdministrarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 930, 360));

        jTabbedPaneGlobal.addTab("tab4", jPanel11);

        jPanel1.add(jTabbedPaneGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 930, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNumeroClienteFocusGained
        jTextFieldNumeroCliente.setText("");
    }//GEN-LAST:event_jTextFieldNumeroClienteFocusGained

    //Buscar cliente en la base de datos
    private void jTextFieldNumeroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroClienteActionPerformed
        if (!jTextFieldNumeroCliente.getText().isBlank()){
            try {
            Client cliente = service.searchClient(jTextFieldNumeroCliente.getText());
            if (cliente != null){
                confirmarRemoveClient(cliente);
            }
            } catch (RemoteException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldNumeroClienteActionPerformed

    private void jTextFieldNumeroClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroClienteKeyReleased
        if (jTextFieldNumeroCliente.getText().isBlank()){
            TextAreaInfoCliente.setText("");
            BotonEliminarCliente.setVisible(false);            
        }
    }//GEN-LAST:event_jTextFieldNumeroClienteKeyReleased

    private void BotonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarClienteActionPerformed
        String textConfirm = JOptionPane.showInputDialog("Escriba 'Eliminar' para confirmar.");
        if ((textConfirm != null) && (textConfirm.equals("Eliminar"))){
            try {
                service.removeClient(jTextFieldNumeroCliente.getText().replace(" ", ""));
            } catch (RemoteException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BotonEliminarClienteActionPerformed

    private void jButtonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearUsuarioActionPerformed
        if (!textFieldUsername.getText().isBlank() || !textFieldPassword.getText().isBlank() || !textFieldPassword2.getText().isBlank()
                || jTipoUsuario.getSelectedIndex() == 0){
            String username = textFieldUsername.getText();
            String password = textFieldPassword.getText();
            if (textFieldPassword2.getText().equals(password)){
                int tipoUsuario = jTipoUsuario.getSelectedIndex();
                    User newUser = new User(username, password, tipoUsuario);
                    String key = showPasswordInputDialog();
                try {
                    if (service.login(service.user, key)){
                        service.addUsuario(newUser);
                        limpiarTextFieldsCrearUsuario();
                    }
                } catch (RemoteException ex) {
                    Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonCrearUsuarioActionPerformed

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
        tabbedPaneAdministrarUsuarios.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        tabbedPaneAdministrarUsuarios.setSelectedIndex(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void BotonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarUsuarioActionPerformed
        try {
            if (jTextFieldEliminarUsuario.getText().isBlank() && service.login(service.user, showPasswordInputDialog())){
                service.removeUsuario(jTextFieldEliminarUsuario.getText());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonEliminarUsuarioActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tabbedPaneAdministrarUsuarios.setSelectedIndex(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveUserActionPerformed
        tabbedPaneAdministrarUsuarios.setSelectedIndex(2);
    }//GEN-LAST:event_jButtonRemoveUserActionPerformed

    private void jLabelRegistrarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarClienteMouseEntered
        panelRegistrarCliente.setBackground(Hover);
    }//GEN-LAST:event_jLabelRegistrarClienteMouseEntered

    private void jLabelRegistrarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarClienteMouseExited
        panelRegistrarCliente.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabelRegistrarClienteMouseExited

    private void jLabelEliminarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarClienteMouseEntered
        panelEliminarCliente.setBackground(Hover);
    }//GEN-LAST:event_jLabelEliminarClienteMouseEntered

    private void jLabelEliminarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarClienteMouseExited
        panelEliminarCliente.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabelEliminarClienteMouseExited

    private void jLabelAdministrarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministrarUsuariosMouseEntered
        panelAdministrarUsuarios.setBackground(Hover);
    }//GEN-LAST:event_jLabelAdministrarUsuariosMouseEntered

    private void jLabelAdministrarUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministrarUsuariosMouseExited
        panelAdministrarUsuarios.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabelAdministrarUsuariosMouseExited

    private void jLabelRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarClienteMouseClicked
        jTabbedPaneGlobal.setSelectedIndex(1);
    }//GEN-LAST:event_jLabelRegistrarClienteMouseClicked

    private void jLabelEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarClienteMouseClicked
        jTabbedPaneGlobal.setSelectedIndex(2);
    }//GEN-LAST:event_jLabelEliminarClienteMouseClicked

    private void jLabelAdministrarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministrarUsuariosMouseClicked
        jTabbedPaneGlobal.setSelectedIndex(3);
        tabbedPaneAdministrarUsuarios.setSelectedIndex(0);
        
    }//GEN-LAST:event_jLabelAdministrarUsuariosMouseClicked

    private void jLabelAdministrarMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministrarMenuMouseEntered
        jPanelAdministrarMenu.setBackground(Hover);
    }//GEN-LAST:event_jLabelAdministrarMenuMouseEntered

    private void jLabelAdministrarMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministrarMenuMouseExited
        jPanelAdministrarMenu.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabelAdministrarMenuMouseExited

    private void jLabelAdministrarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdministrarMenuMouseClicked
        jTabbedPaneGlobal.setSelectedIndex(4);
        jTabbedPaneAdministrarMenu.setSelectedIndex(0);
        limpiarCreacionProducto();
    }//GEN-LAST:event_jLabelAdministrarMenuMouseClicked

    private void jButtonCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearProductoActionPerformed
        if (!textFieldNombreProducto.getText().isBlank() || !textFieldProductoId.getText().isBlank() || !textAreaDescripcionProducto.getText().isBlank()){
            String nombre = textFieldNombreProducto.getText();
            String id = textFieldProductoId.getText();
            String descripcion = textAreaDescripcionProducto.getText();
            int tipoCoccion = jComboBoxTipoCoccion.getSelectedIndex();
            int precio = Integer.parseInt(textFieldPrecioProducto.getText());
            try {
                if (service.login(service.user, showPasswordInputDialog())){
                    Product newProduct = new Product(nombre, id, precio, tipoCoccion, descripcion);
                    service.addProduct(newProduct);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonCrearProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("jpg && png", "jpg", "png");
        jFileChooser.setFileFilter(filtrado);
        int respuesta = jFileChooser.showOpenDialog(this);
        /*String ruta = "";
        if (respuesta == JFileChooser.APPROVE_OPTION){
            File selectedFile = jFileChooser.getSelectedFile();
            String destinationDirectory = "src/co/edu/upb/Iconos/";
            try {
                File destination = new File(destinationDirectory + selectedFile.getName());
                Files.copy(selectedFile.toPath(), destination.toPath());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        System.out.println(ruta);
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProductoActionPerformed
        if (!jTextFieldEliminarProducto.getText().isBlank()){
            try {
                if (service.login(service.user, showPasswordInputDialog())){
                    service.removeProduct(jTextFieldEliminarProducto.getText());
                    limpiarEliminarProducto();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonEliminarProductoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPaneAdministrarMenu.setSelectedIndex(0);
        limpiarEliminarProducto();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPaneAdministrarMenu.setSelectedIndex(0);
        limpiarCreacionProducto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPaneAdministrarMenu.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPaneAdministrarMenu.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void confirmarRemoveClient(Client cliente){
        TextAreaInfoCliente.setText("Cliente (" + tipoClienteString(cliente.getTipoCliente()) + ")\n" +
                "Nombre: " + cliente.getNombres() + "\nApellidos: " + cliente.getApellidos());
        BotonEliminarCliente.setVisible(true);
    }
    
    public void limpiarTextFieldsCrearUsuario(){
        textFieldUsername.setText("");
        textFieldPassword.setText("");
        textFieldPassword2.setText("");
        jTipoUsuario.setSelectedIndex(0);
    }
    
    public String tipoClienteString(int tipo){
        return (tipo == 0) ? "No premium" : "Premium";
    }
    
    public String showPasswordInputDialog() {
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(null, passwordField, "Ingrese la contraseña", JOptionPane.OK_CANCEL_OPTION);
        
        if (option == JOptionPane.OK_OPTION) {
            // Obtener la contraseña ingresada
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);
            return password;
        } else {
            return null;
        }
    }

    public void initComponents2(){
        Hover = new java.awt.Color(233,231,227);
        textFieldPrecioProductoListener();
        textFieldNumListener();
        jTextFieldNumeroClienteListener();
        fontLabels = new java.awt.Font("Bahnschrift", 0, 18);
    }
    
    private void textFieldPrecioProductoListener(){
        textFieldPrecioProducto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char x = e.getKeyChar();
                if (!Character.isDigit(x)) {
                    e.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    private void textFieldNumListener(){
        TextFieldNum.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char x = e.getKeyChar();
                if (!Character.isDigit(x)) {
                    e.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    private void jTextFieldNumeroClienteListener(){
        jTextFieldNumeroCliente.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char x = e.getKeyChar();
                if (!Character.isDigit(x)) {
                    e.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    public void limpiarCreacionProducto(){
        textFieldNombreProducto.setText("");
        textFieldProductoId.setText("");
        textAreaDescripcionProducto.setText("");
        jComboBoxTipoCoccion.setSelectedIndex(0);
        textFieldPrecioProducto.setText("");
    }
    
    public void limpiarEliminarProducto(){
        jTextFieldEliminarUsuario.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarCliente;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JTextArea TextAreaInfoCliente;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldNombre1;
    private javax.swing.JTextField TextFieldNombre2;
    private javax.swing.JTextField TextFieldNombre3;
    private javax.swing.JTextField TextFieldNum;
    private javax.swing.JButton botonEliminarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonCrearCliente;
    private javax.swing.JButton jButtonCrearProducto;
    private javax.swing.JButton jButtonCrearUsuario;
    private javax.swing.JButton jButtonRemoveUser;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxTipoCoccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAdministrarMenu;
    private javax.swing.JLabel jLabelAdministrarUsuarios;
    private javax.swing.JLabel jLabelEliminarCliente;
    private javax.swing.JLabel jLabelRegistrarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelAddProduct;
    private javax.swing.JPanel jPanelAdminUsuarios;
    private javax.swing.JPanel jPanelAdministrarMenu;
    private javax.swing.JPanel jPanelEliminarCliente;
    private javax.swing.JPanel jPanelRegistrarCliente;
    private javax.swing.JPanel jPanelRemoveProduct;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPaneAdministrarMenu;
    private javax.swing.JTabbedPane jTabbedPaneGlobal;
    private javax.swing.JTextField jTextFieldEliminarProducto;
    private javax.swing.JTextField jTextFieldEliminarUsuario;
    private javax.swing.JTextField jTextFieldNumeroCliente;
    private javax.swing.JComboBox<String> jTipoUsuario;
    private javax.swing.JLabel labelTipoUsuario;
    private javax.swing.JPanel panelAdministrarUsuarios;
    private javax.swing.JPanel panelCrearUsuario;
    private javax.swing.JPanel panelEliminarCliente;
    private javax.swing.JPanel panelEliminarUsuario;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelRegistrarCliente;
    private javax.swing.JPanel panelSeleccionarAccion;
    private javax.swing.JTabbedPane tabbedPaneAdministrarUsuarios;
    private javax.swing.JTextArea textAreaDescripcionProducto;
    private javax.swing.JTextField textFieldNombreProducto;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldPassword2;
    private javax.swing.JTextField textFieldPrecioProducto;
    private javax.swing.JTextField textFieldProductoId;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
