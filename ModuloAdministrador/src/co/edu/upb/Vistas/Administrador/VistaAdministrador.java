package co.edu.upb.Vistas.Administrador;

import co.edu.upb.Clases.Client;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaAdministrador extends javax.swing.JFrame {

    ServiceAdministrador service;
    
    public VistaAdministrador(ServiceAdministrador service) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.service = service;
    }
    
    public VistaAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jPanelEliminarCliente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TextAreaInfoCliente = new javax.swing.JTextArea();
        BotonEliminarCliente = new javax.swing.JButton();
        jPanelAdminUsuarios = new javax.swing.JPanel();
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

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Registrar cliente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Eliminar cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel5.setForeground(java.awt.SystemColor.activeCaptionText);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Administrar usuarios");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 580));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanelRegistrarCliente.setBackground(new java.awt.Color(245, 245, 245));
        jPanelRegistrarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRegistrarCliente.add(TextFieldNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, 35));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel8.setText("Número de telefono");
        jPanelRegistrarCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 30));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel9.setText("Dirección");
        jPanelRegistrarCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel10.setText("Nombre");
        jPanelRegistrarCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        TextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRegistrarCliente.add(TextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 35));

        TextFieldNombre1.setBackground(new java.awt.Color(245, 245, 245));
        TextFieldNombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldNombre1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelRegistrarCliente.add(TextFieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 40, 35));

        TextFieldNombre2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelRegistrarCliente.add(TextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 210, 35));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calle", "Avenida", "Carrera" }));
        jPanelRegistrarCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 35));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel11.setText("Apellidos");
        jPanelRegistrarCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 30));

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

        jTabbedPane1.addTab("tab1", jPanelRegistrarCliente);

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

        jTabbedPane1.addTab("tab2", jPanelEliminarCliente);

        javax.swing.GroupLayout jPanelAdminUsuariosLayout = new javax.swing.GroupLayout(jPanelAdminUsuarios);
        jPanelAdminUsuarios.setLayout(jPanelAdminUsuariosLayout);
        jPanelAdminUsuariosLayout.setHorizontalGroup(
            jPanelAdminUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        jPanelAdminUsuariosLayout.setVerticalGroup(
            jPanelAdminUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanelAdminUsuarios);

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

        jTabbedPane1.addTab("tab4", jPanel11);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 930, 460));

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

    private void confirmarRemoveClient(Client cliente){
        TextAreaInfoCliente.setText("Cliente (" + tipoClienteString(cliente.getTipoCliente()) + ")\n" +
                "Nombre: " + cliente.getNombres() + "\nApellidos: " + cliente.getApellidos());
        BotonEliminarCliente.setVisible(true);
        
        
        
    }
    
    public String tipoClienteString(int tipo){
        return (tipo == 0) ? "No premium" : "Premium";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarCliente;
    private javax.swing.JTextArea TextAreaInfoCliente;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldNombre1;
    private javax.swing.JTextField TextFieldNombre2;
    private javax.swing.JTextField TextFieldNombre3;
    private javax.swing.JTextField TextFieldNum;
    private javax.swing.JButton jButtonCrearCliente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAdminUsuarios;
    private javax.swing.JPanel jPanelEliminarCliente;
    private javax.swing.JPanel jPanelRegistrarCliente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
