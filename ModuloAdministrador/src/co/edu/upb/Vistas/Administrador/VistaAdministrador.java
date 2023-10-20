package co.edu.upb.Vistas.Administrador;

import co.edu.upb.Clases.Client;
import co.edu.upb.Clases.TipoUsuario;
import co.edu.upb.Clases.User;
import java.awt.Color;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class VistaAdministrador extends javax.swing.JFrame {

    ServiceAdministrador service;
    private java.awt.Color Hover;
    
    public VistaAdministrador(ServiceAdministrador service) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.service = service;
        Hover = new java.awt.Color(204,204,204);
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
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        jTextField1 = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        panelEliminarUsuario = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldEliminarUsuario = new javax.swing.JTextField();
        BotonEliminarUsuario = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();

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

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel6.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Eliminar cliente");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAdministrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 920, 40));

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

        jTextField1.setBackground(new java.awt.Color(245, 245, 245));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(java.awt.SystemColor.controlDkShadow);
        jTextField1.setText("Ingresar número..");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanelEliminarCliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 322, 40));

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
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanelAdminUsuarios.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 30));

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

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel16.setText("Nombre de usuario");
        panelCrearUsuario.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 30));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel17.setText("Tipo");
        panelCrearUsuario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 30));

        textFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelCrearUsuario.add(textFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 35));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel18.setText("Confirma contraseña");
        panelCrearUsuario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        textFieldPassword2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelCrearUsuario.add(textFieldPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 200, 35));

        jTipoUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Operador", "Cocina", "Entrega" }));
        panelCrearUsuario.add(jTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 35));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
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

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton1.setText("Crear usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, 60));

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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

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

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    //Buscar cliente en la base de datos
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if (!jTextField1.getText().isBlank()){
            try {
            Client cliente = service.searchClient(jTextField1.getText());
            if (cliente != null){
                confirmarRemoveClient(cliente);
            }
            } catch (RemoteException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (jTextField1.getText().isBlank()){
            TextAreaInfoCliente.setText("");
            BotonEliminarCliente.setVisible(false);            
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void BotonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarClienteActionPerformed
        String textConfirm = JOptionPane.showInputDialog("Escriba 'Eliminar' para confirmar.");
        if ((textConfirm != null) && (textConfirm.equals("Eliminar"))){
            try {
                service.removeClient(jTextField1.getText().replace(" ", ""));
            } catch (RemoteException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BotonEliminarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
    }//GEN-LAST:event_jLabelAdministrarUsuariosMouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarCliente;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JTextArea TextAreaInfoCliente;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldNombre1;
    private javax.swing.JTextField TextFieldNombre2;
    private javax.swing.JTextField TextFieldNombre3;
    private javax.swing.JTextField TextFieldNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonCrearCliente;
    private javax.swing.JButton jButtonRemoveUser;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAdministrarUsuarios;
    private javax.swing.JLabel jLabelEliminarCliente;
    private javax.swing.JLabel jLabelRegistrarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAdminUsuarios;
    private javax.swing.JPanel jPanelEliminarCliente;
    private javax.swing.JPanel jPanelRegistrarCliente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPaneGlobal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldEliminarUsuario;
    private javax.swing.JComboBox<String> jTipoUsuario;
    private javax.swing.JLabel labelTipoUsuario;
    private javax.swing.JPanel panelAdministrarUsuarios;
    private javax.swing.JPanel panelCrearUsuario;
    private javax.swing.JPanel panelEliminarCliente;
    private javax.swing.JPanel panelEliminarUsuario;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JPanel panelRegistrarCliente;
    private javax.swing.JPanel panelSeleccionarAccion;
    private javax.swing.JTabbedPane tabbedPaneAdministrarUsuarios;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldPassword2;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
