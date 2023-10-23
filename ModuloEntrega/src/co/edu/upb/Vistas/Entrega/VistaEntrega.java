
package co.edu.upb.Vistas.Entrega;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Interfaz grafica de modulo entrega
 * @author JuanDavidCarvajal
 */
public class VistaEntrega extends javax.swing.JFrame {
    ServiceEntrega service;
    Order[] domicilioActual;
    
    public VistaEntrega(ServiceEntrega service) {
        initComponents();
        initComponents2();
        this.service = service;
        setLocationRelativeTo(null);
        setIconImage(getIconImage());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPaneTable = new javax.swing.JScrollPane();
        jPanelTable = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 100, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoLogo.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoEntrega.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel9.setForeground(java.awt.SystemColor.controlHighlight);
        jLabel9.setText("Entrega");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 681, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(1050, 140));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setText("Ruta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(987, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 1050, 140));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/Button.png"))); // NOI18N
        jButton2.setText("Tomar pedidos");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/ButtonSelected.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 50));

        jScrollPaneTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPaneTable.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelTable.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTable.setPreferredSize(new java.awt.Dimension(1050, 298));

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jScrollPaneTable.setViewportView(jPanelTable);

        jPanel1.add(jScrollPaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1050, 300));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setText("Nombre Titular");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel3.setText("Valor total");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel8.setText("Teléfono");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(131, 131, 131)
                .addComponent(jLabel3)
                .addGap(79, 79, 79)
                .addComponent(jLabel8)
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 1050, 70));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel4.setText("Nuevo Domicilio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tomarPedido();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void tomarPedido(){
        try {
            LinkedList<Order> domicilio = service.getPedidos();
            if (domicilio != null){
                domicilioActual = new Order[domicilio.size()];
                for (int i = 0; i < domicilioActual.length; i++){
                    domicilioActual[i] = domicilio.pop();
                }
                initTable(domicilioActual);
            }

        } catch (RemoteException ex) {
            Logger.getLogger(VistaEntrega.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JScrollPane jScrollPaneTable;
    // End of variables declaration//GEN-END:variables
    private Color hover;
    private Font fontTable;
    private Cursor cursorClickeable;
    
    public void initComponents2(){
        hover = new java.awt.Color(233,231,227);
        fontTable = new java.awt.Font("Bahnschrift", 0, 18);
        cursorClickeable = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
    }
    
    /**
     * Generación de tabla para observar la información de los pedidos para el domicilio actual
     * @param pedidos -> Pedidos recibidos a partir de la busqueda en el servidor con la clase "ServiceEntrega"
     */
    public void initTable(Order[] pedidos){
        int y = 10;
        
        for (int i=0; i < pedidos.length; i++){
            
            JPanel panelRow = new JPanel(); panelRow.setVisible(true);
            panelRow.setSize(1050, 60);
            panelRow.setBackground(Color.WHITE);
            jPanelTable.add(panelRow);
            int a = i;
            panelRow.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    //Mostrar lista de productos
                    String productos = pedidos[a].listaProductos.listToString();
                    JOptionPane.showMessageDialog(null, productos, "Pedido para " + pedidos[a].nombres + " " + pedidos[a].apellidos, JOptionPane.PLAIN_MESSAGE);
                }
                // Hover
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    panelRow.setBackground(hover);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    panelRow.setBackground(Color.WHITE);
                }
            });
            panelRow.setCursor(cursorClickeable);
            panelRow.setLocation(0, y);
            JLabel titular = new JLabel(pedidos[i].getNombres() + " " + pedidos[i].getApellidos()); titular.setVisible(true);
            titular.setSize(250, 25);
            titular.setFont(fontTable);
            
            panelRow.add(titular);
            titular.setLocation(20, 5);
            
            JLabel precio = new JLabel(convertPrecio(pedidos[i].valorTotal)); precio.setVisible(true);
            precio.setSize(140, 30);
            precio.setFont(fontTable);
            
            panelRow.add(precio);
            precio.setLocation(330, 5);
            
            JLabel numero = new JLabel(pedidos[i].numeroTelefono); numero.setVisible(true);
            numero.setSize(140, 30);
            numero.setFont(fontTable);
            
            panelRow.add(numero);
            numero.setLocation(530, 5);
            
            JLabel direccion = new JLabel(pedidos[i].getDireccion()); direccion.setVisible(true);
            direccion.setSize(320, 30);
            direccion.setFont(fontTable);
            
            panelRow.add(direccion);
            direccion.setLocation(720, 5);
            
            JLabel aux = new JLabel("(Click para ver lista de productos)"); aux.setVisible(true);
            aux.setSize(200, 20);
            aux.setForeground(java.awt.SystemColor.textInactiveText);
            
            panelRow.add(aux);
            aux.setLocation(20, 28);
            
            y += 70;
        }
    }

    public String convertPrecio(double precio){
        DecimalFormat formato = new DecimalFormat("###,###");
        String string = formato.format(precio);
        return "$" + string;
    }
}
