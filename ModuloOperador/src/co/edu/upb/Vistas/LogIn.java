package co.edu.upb.Vistas;

import co.edu.upb.Vistas.Operador.ServiceOperador;
import co.edu.upb.Vistas.Operador.VistaOperador;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 * Login inicial para acceder al módulo operador
 * @author JuanDavidCarvajal
 */
public class LogIn extends javax.swing.JFrame {
    
    ServiceOperador service = new ServiceOperador("localhost","5001","serviceOperador");
    
    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("FastMeals - Login");
        setIconImage(getIconImage());

        jButton1.requestFocusInWindow();
        
    }

    @Override
    public Image getIconImage(){
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("co/edu/upb/Iconos/Icono.png"));
        return retvalue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparatorUser = new javax.swing.JSeparator();
        jSeparatorPassword = new javax.swing.JSeparator();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelError = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparatorUser.setBackground(new java.awt.Color(147, 147, 147));
        jSeparatorUser.setForeground(new java.awt.Color(147, 147, 147));
        jSeparatorUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jSeparatorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 190, 20));

        jSeparatorPassword.setBackground(new java.awt.Color(147, 147, 147));
        jSeparatorPassword.setForeground(new java.awt.Color(147, 147, 147));
        jPanel1.add(jSeparatorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 190, 10));

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(147, 147, 147));
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUsuario.setText("Ingresar usuario..");
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 190, 30));

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(147, 147, 147));
        jPasswordField.setText("contraseña");
        jPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 190, 30));

        jLabelError.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(165, 18, 18));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 450, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/Button.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/ButtonSelected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 170, 50));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modulo Operador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 450, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Fondo.png"))); // NOI18N
        Fondo.setText("jLabel3");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1140, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost
        if (jTextFieldUsuario.getText().isBlank()){
            Color colorOut = new java.awt.Color(147, 147, 147);
            jTextFieldUsuario.setText("Ingresar usuario..");
            jTextFieldUsuario.setForeground(colorOut);
            jSeparatorUser.setForeground(colorOut);
            jSeparatorUser.setBackground(colorOut);
        }
    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
       if (jPasswordField.getText().isBlank()){
            Color colorOut = new java.awt.Color(147, 147, 147);
            jPasswordField.setText("contraseña");
            jPasswordField.setForeground(colorOut);
            jSeparatorPassword.setForeground(colorOut);
            jSeparatorPassword.setBackground(colorOut);
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    //Boton " iniciar "
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jTextFieldUsuario.getText();
        String password = jPasswordField.getText();

        try {
            boolean login = service.login(username, password);
            if (login){
                dispose();
                VistaOperador vistaOperador = new VistaOperador(service);
                vistaOperador.setVisible(true);
            }else{
                jLabelError.setText("Usuario inccorrecto");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        if (jPasswordField.getText().equals("contraseña")){
            Color colorIn = new java.awt.Color(97, 97, 97);
            jPasswordField.setText("");
            jSeparatorPassword.setForeground(colorIn);
            jSeparatorPassword.setBackground(colorIn);
            jPasswordField.setForeground(colorIn);
        }
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        if (jTextFieldUsuario.getText().equals("Ingresar usuario..")){
            Color colorIn = new java.awt.Color(97, 97, 97);
            jTextFieldUsuario.setText("");
            jSeparatorUser.setForeground(colorIn);
            jSeparatorUser.setBackground(colorIn);
            jTextFieldUsuario.setForeground(colorIn);
        }
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparatorPassword;
    private javax.swing.JSeparator jSeparatorUser;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
