package co.edu.upb.Vistas.Operador;

import co.edu.upb.Clases.NodoHashMap;
import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.Client;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Interfaz grafica del modulo operador
 * @author JuanDavidCarvajal
 */
public class VistaOperador extends javax.swing.JFrame {
    double valorIVA = 1.19;
    ColaPrioridad<Order> colaDePedidos = new ColaPrioridad<>(2);
    Product[] menu;
    Order pedidoActual;
    ElementosVisualesProducto[] gruposSwingMenu;
    ServiceOperador service;
    LinkedList<String[]> topProductos;
    Boolean volver = false;
    
    public VistaOperador(ServiceOperador service){
        this.service = service;
        pedidoActual = new Order();
        llenarMenu();
        
        //Interfaz grafica
        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
        setResizable(false);
        textFielNumListener();
        agruparElementos();
        asignarActionsABotonesAddProducts();
        topProductos = new LinkedList<>();
        jIconoProductosMasPedidos.setVisible(false);
        jLabelProductosMasPedidos.setVisible(false);
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
        jPanel7 = new javax.swing.JPanel();
        jPanelUpBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TabbedPaneMain = new javax.swing.JTabbedPane();
        PanelNuevoPedido = new javax.swing.JPanel();
        PanelVerPedidoActual = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TextAreaTotal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaCarritoCompras = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        AddProduct = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        TextFieldBuscador = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jScrollPaneMenu = new javax.swing.JScrollPane();
        jPanelMenu = new javax.swing.JPanel();
        jIconoProductosMasPedidos = new javax.swing.JLabel();
        jLabelProductosMasPedidos = new javax.swing.JLabel();
        Fillinfo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textFieldNum = new javax.swing.JTextField();
        textFieldName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        textFieldDirr1 = new javax.swing.JTextField();
        textFieldDirr3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        textFieldLastName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        PanelListaPedidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneListaDePedidos = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 800));

        jPanelUpBar.setBackground(new java.awt.Color(227, 100, 20));
        jPanelUpBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoLogo.png"))); // NOI18N
        jPanelUpBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear pedido");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanelUpBar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 70));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Operador");
        jPanelUpBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, 70));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ver lista de pedidos");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanelUpBar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoOperador.png"))); // NOI18N
        jPanelUpBar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelUpBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 10, 40));

        jPanel1.add(jPanelUpBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 70));

        TabbedPaneMain.setPreferredSize(new java.awt.Dimension(100, 50));

        PanelNuevoPedido.setBackground(new java.awt.Color(245, 245, 245));
        PanelNuevoPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelVerPedidoActual.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel26.setText(" Pedido Completo:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/Button.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/ButtonSelected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextAreaTotal.setEditable(false);
        TextAreaTotal.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaTotal.setColumns(20);
        TextAreaTotal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        TextAreaTotal.setForeground(new java.awt.Color(0, 0, 0));
        TextAreaTotal.setRows(5);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TextAreaCarritoCompras.setEditable(false);
        TextAreaCarritoCompras.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaCarritoCompras.setColumns(20);
        TextAreaCarritoCompras.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        TextAreaCarritoCompras.setForeground(new java.awt.Color(0, 0, 0));
        TextAreaCarritoCompras.setRows(5);
        jScrollPane3.setViewportView(TextAreaCarritoCompras);

        javax.swing.GroupLayout PanelVerPedidoActualLayout = new javax.swing.GroupLayout(PanelVerPedidoActual);
        PanelVerPedidoActual.setLayout(PanelVerPedidoActualLayout);
        PanelVerPedidoActualLayout.setHorizontalGroup(
            PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TextAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelVerPedidoActualLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PanelVerPedidoActualLayout.setVerticalGroup(
            PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(TextAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        PanelNuevoPedido.add(PanelVerPedidoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 230, 800));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nuevo Pedido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, -1, -1));

        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        PanelNuevoPedido.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 90));

        jTabbedPane2.setBackground(new java.awt.Color(245, 245, 245));

        AddProduct.setBackground(new java.awt.Color(245, 245, 245));
        AddProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Agregar productos");
        AddProduct.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(135, 135, 135));
        jLabel10.setText("Llenar información");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        AddProduct.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        AddProduct.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 900, 10));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Buscar producto");
        AddProduct.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 79, -1, -1));

        TextFieldBuscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldBuscador.setText(" Buscar...");
        TextFieldBuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldBuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldBuscadorFocusLost(evt);
            }
        });
        TextFieldBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldBuscadorKeyReleased(evt);
            }
        });
        AddProduct.add(TextFieldBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 110, 341, 41));

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));

        jLabelMenu.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu.setText("Menú");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(749, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jLabelMenu))
        );

        AddProduct.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, 1180, 70));

        jScrollPaneMenu.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPaneMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPaneMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMenu.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneMenu.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanelMenu.setBackground(new java.awt.Color(245, 245, 245));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1185, 1560));

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1185, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1560, Short.MAX_VALUE)
        );

        jScrollPaneMenu.setViewportView(jPanelMenu);

        AddProduct.add(jScrollPaneMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 254, 1180, 470));
        jScrollPaneMenu.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPaneMenu.getVerticalScrollBar().setValue(0);

        jIconoProductosMasPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoMasPedidos.png"))); // NOI18N
        jIconoProductosMasPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIconoProductosMasPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconoProductosMasPedidosMouseClicked(evt);
            }
        });
        AddProduct.add(jIconoProductosMasPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, -1, -1));

        jLabelProductosMasPedidos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabelProductosMasPedidos.setText("Ver Productos más pedidos");
        jLabelProductosMasPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelProductosMasPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProductosMasPedidosMouseClicked(evt);
            }
        });
        AddProduct.add(jLabelProductosMasPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        jTabbedPane2.addTab("Agregar productos", AddProduct);

        Fillinfo.setBackground(new java.awt.Color(245, 245, 245));
        Fillinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(135, 135, 135));
        jLabel13.setText("Agregar productos");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        Fillinfo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Llenar información");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fillinfo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Fillinfo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 900, 10));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(135, 135, 135));
        jLabel7.setText("Datos Cliente");
        Fillinfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Número de telefono");
        Fillinfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(135, 135, 135));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Fillinfo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 10, 380));

        textFieldNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumActionPerformed(evt);
            }
        });
        Fillinfo.add(textFieldNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 41));

        textFieldName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 41));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre");
        Fillinfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo de cliente");
        Fillinfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jComboBoxTipoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTipoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Premium", "Premium" }));
        jComboBoxTipoCliente.setToolTipText("");
        jComboBoxTipoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fillinfo.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 230, 40));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(135, 135, 135));
        jLabel16.setText("Datos de envío");
        Fillinfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        textFieldDirr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldDirr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 320, 41));

        textFieldDirr3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldDirr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 320, 41));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Barrio");
        Fillinfo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Apellidos");
        Fillinfo.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        textFieldLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 320, 41));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Calle/Avenida/Carrera");
        Fillinfo.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jTabbedPane2.addTab("Llenar informacion", Fillinfo);

        PanelNuevoPedido.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 790));

        TabbedPaneMain.addTab("Crear Pedido", PanelNuevoPedido);

        PanelListaPedidos.setBackground(new java.awt.Color(245, 245, 245));

        textPaneListaDePedidos.setEditable(false);
        textPaneListaDePedidos.setBackground(new java.awt.Color(245, 245, 245));
        textPaneListaDePedidos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(textPaneListaDePedidos);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoPedidos.png"))); // NOI18N

        jLabel27.setBackground(new java.awt.Color(51, 51, 51));
        jLabel27.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Lista de pedidos:");

        javax.swing.GroupLayout PanelListaPedidosLayout = new javax.swing.GroupLayout(PanelListaPedidos);
        PanelListaPedidos.setLayout(PanelListaPedidosLayout);
        PanelListaPedidosLayout.setHorizontalGroup(
            PanelListaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaPedidosLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(PanelListaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        PanelListaPedidosLayout.setVerticalGroup(
            PanelListaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaPedidosLayout.createSequentialGroup()
                .addGroup(PanelListaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListaPedidosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelListaPedidosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        TabbedPaneMain.addTab("Ver Lista de pedidos", PanelListaPedidos);

        jPanel1.add(TabbedPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1410, 830));

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    /**
     * Metodo que apartir del String dado en el buscador, genera un nuevo menu con los productos con nombres similares
     * y los muestra en pantalla.
     */
    public void generarResultadosBusqueda(){
        //jScrollPaneResults.getVerticalScrollBar().setValue(0);
        //jPanelResults.removeAll();
        jScrollPaneMenu.getVerticalScrollBar().setValue(0);
        jPanelMenu.removeAll();
        if (!TextFieldBuscador.getText().isBlank()){
            //Busqueda invalida
            //if (TextFieldBuscador.getText().length() > 3){
                ElementosVisualesProducto[] resultados = distanciaHammingMod(TextFieldBuscador.getText());
                if (resultados != null){
                    int posX = 30;
                    int posY1 = 10, posY2 = 210, posY3 = 240, posY4 = 270;
                    for (int i=0; i<resultados.length; i++){
                        JLabel imagenProducto = resultados[i].imagenProducto;
                        JLabel nombreProducto = resultados[i].nombreProducto;
                        JLabel precio = resultados[i].precioProducto;
                        JTextArea descripcion = resultados[i].descProducto;
                        JButton addProducto = resultados[i].addProducto;
                        JButton removeProducto = resultados[i].removeProducto;
                        
                        jPanelMenu.add(imagenProducto);
                        jPanelMenu.add(nombreProducto);
                        jPanelMenu.add(precio);
                        jPanelMenu.add(descripcion);
                        jPanelMenu.add(addProducto);
                        jPanelMenu.add(removeProducto);
                        
                        imagenProducto.setLocation(posX, posY1);
                        nombreProducto.setLocation(posX, posY2);
                        precio.setLocation(posX, posY3);
                        descripcion.setLocation(posX, posY4);
                        addProducto.setLocation(posX + 305, posY1);
                        removeProducto.setLocation(posX + 305, posY1 + 30);
                        
                        posX += 380;
                        if (posX > 790){
                            posY1 += 390;
                            posY2 += 390;
                            posY3 += 390;
                            posY4 += 390;
                            posX = 30;
                        }
                    }
                    jPanelMenu.revalidate();
                    jPanelMenu.repaint();
                } else{
                    mostrarBusquedaNulaEnResultados();
                }
            //}else{
            //    mostrarBusquedaNulaEnResultados();
            //}
        }else{
            mostrarProductoEnMenu(gruposSwingMenu);
        }
    }
    
    private void agruparElementos(){
        Font fontNombre = new java.awt.Font("Bahnschrift", 1, 22);
        Font fontPrecio = new java.awt.Font("Bahnschrift", 1, 24);
        Font fontDescripcion = new java.awt.Font("Bahnschrift", 0, 16);
        Color backGround = new java.awt.Color(245, 245, 245);
        gruposSwingMenu = new ElementosVisualesProducto[menu.length];

        for (int i = 0; i < menu.length; i++){
            JLabel nombre = new JLabel(menu[i].getNombre()); nombre.setVisible(true);
            nombre.setFont(fontNombre);
            nombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
            nombre.setSize(300, 30);
            
            JLabel precio = new JLabel(convertPrecio(menu[i].getPrecio())); precio.setVisible(true);
            precio.setFont(fontPrecio);
            precio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
            precio.setSize(300, 30);
            
            JTextArea descripcion = new JTextArea(menu[i].getDescripcion()); descripcion.setVisible(true);
            descripcion.setEditable(false);
            descripcion.setBackground(backGround);
            descripcion.setColumns(20);
            descripcion.setFont(fontDescripcion);
            descripcion.setLineWrap(true);
            descripcion.setWrapStyleWord(true);
            descripcion.setRows(5);
            descripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            descripcion.setSize(280, 70);
            
            JButton addButton = new JButton(); addButton.setVisible(true);
            addButton.setBorderPainted(false);
            addButton.setContentAreaFilled(false);
            addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png")));
            addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            addButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png")));
            addButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png")));
            addButton.setSize(25, 25);
            
            JButton removeButton = new JButton(); removeButton.setVisible(true);
            removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
            removeButton.setBorderPainted(false);
            removeButton.setContentAreaFilled(false);
            removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            removeButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
            removeButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
            removeButton.setSize(25, 25);
            
            JLabel imagen = new JLabel(); imagen.setVisible(true);
            imagen.setSize(300, 200);
            String ruta = "/co/edu/upb/Iconos/Productos/" + menu[i].getNombre() + ".png";
            
            java.net.URL imgURL = VistaOperador.class.getResource(ruta);
            if (imgURL != null) {
                imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
            } else {
                ruta = "/co/edu/upb/Iconos/Productos/" + menu[i].getNombre() + ".jpg";
                if (imgURL != null) {
                imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
                } else {
                    imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/ImageToError.png")));
                }
            }
            gruposSwingMenu[i] = new ElementosVisualesProducto(imagen, nombre, precio, descripcion, 
                    addButton, removeButton, menu[i].getId(), menu[i]);
            
        }
        mostrarProductoEnMenu(gruposSwingMenu);
    }
    
    /**
     * Metodo para recrear el panel de menu y mostrar los productos que se necesiten.
     * @param elementos Array de elementos graficos que se desean mostrar.
     */
    public void mostrarProductoEnMenu(ElementosVisualesProducto[] elementos){
        jPanelMenu.removeAll();
        int posX = 30;
        int posY1 = 10, posY2 = 210, posY3 = 240, posY4 = 270;
        for (int i=0; i < elementos.length; i++){
            
            JLabel imagenProducto = elementos[i].imagenProducto;
            JLabel nombreProducto = elementos[i].nombreProducto;
            JLabel precio = elementos[i].precioProducto;
            JTextArea descripcion = elementos[i].descProducto;
            JButton addProducto = elementos[i].addProducto;
            JButton removeProducto = elementos[i].removeProducto;

            jPanelMenu.add(imagenProducto);
            jPanelMenu.add(nombreProducto);
            jPanelMenu.add(precio);
            jPanelMenu.add(descripcion);
            jPanelMenu.add(addProducto);
            jPanelMenu.add(removeProducto);

            imagenProducto.setLocation(posX, posY1);
            nombreProducto.setLocation(posX, posY2);
            precio.setLocation(posX, posY3);
            descripcion.setLocation(posX, posY4);
            addProducto.setLocation(posX + 305, posY1);
            removeProducto.setLocation(posX + 305, posY1 + 30);
            
            posX += 380;
            if (posX > 790){
                posY1 += 390;
                posY2 += 390;
                posY3 += 390;
                posY4 += 390;
                posX = 30;
            }
        }
        jPanelMenu.revalidate();
        jPanelMenu.repaint();
        jScrollPaneMenu.getVerticalScrollBar().setValue(0);
    }
    
    private void textFielNumListener(){
        textFieldNum.addKeyListener(new KeyListener() {
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
    
    private void textFieldNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumActionPerformed
        try {
            byte[] result = service.isOnDatabase(textFieldNum.getText());
            if (result != null){
                ByteArrayInputStream bs = new ByteArrayInputStream(result);
                ObjectInputStream is = new ObjectInputStream(bs);
                Client cliente = (Client) is.readObject();
                
                //Llenar informacion en la interfaz
                textFieldName.setText(cliente.getNombres());
                textFieldLastName.setText(cliente.getApellidos());
                jComboBoxTipoCliente.setSelectedIndex(cliente.getTipoCliente());
                topProductos = cliente.leerProductos();
                String direccion[] = cliente.getDireccion().split(", ");
                textFieldDirr1.setText(direccion[0]);
                textFieldDirr3.setText(direccion[1]);
                jIconoProductosMasPedidos.setVisible(true);
                jLabelProductosMasPedidos.setVisible(true);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_textFieldNumActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        TabbedPaneMain.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        TabbedPaneMain.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            confirmarPedido();
        } catch (RemoteException ex) {
            Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizarAreaCarritoDeCompras(){
        TextAreaCarritoCompras.setText(pedidoActual.listaProductos.listToString());
        TextAreaTotal.setText("Productos: " + pedidoActual.listaProductos.size() +
            "\nTotal: " + convertPrecio(pedidoActual.getValorTotal()));
    }
        
    public void mostrarBusquedaNulaEnResultados(){
        jPanelMenu.removeAll();
        JLabel jLabelResultadoBusqueda = new JLabel("No hay coincidencias.");
        jLabelResultadoBusqueda.setSize(180, 30);
        jLabelResultadoBusqueda.setForeground(Color.BLACK);
        jLabelResultadoBusqueda.setFont(new java.awt.Font("Bahnschrift", 0, 18));
        jLabelResultadoBusqueda.setLocation(30, 70);
        jLabelResultadoBusqueda.setVisible(true);
        jPanelMenu.add(jLabelResultadoBusqueda);
        jPanelMenu.revalidate();
        jPanelMenu.repaint();
    }
    
    public ElementosVisualesProducto[] convertirResultados(LinkedList<NodoHashMap> resultados){
        if (resultados.isEmpty()){
            return null;
        }
        Iterator<NodeInterface<NodoHashMap>> iterator = resultados.iterator();
        ElementosVisualesProducto[] newResultados = new ElementosVisualesProducto[resultados.size()];
        int contadorPos = 0;
        while (iterator.hasNext()){
            String temp = iterator.next().getObject().producto;
            for (int i=0; i<gruposSwingMenu.length; i++){
                if (gruposSwingMenu[i].getId().equals(temp)){
                    newResultados[contadorPos] = gruposSwingMenu[i];
                    contadorPos++;
                }
            }
        }
        return newResultados;
    }
    
    /**
     * Metodo que usa el algoritmo de "Distancia de Hamming" modificado para dar resultados a la busqueda.
     * @param stringBusqueda Texto ingresado en el buscador.
     * @return Array de elementos graficos asociados a cada producto.
     */
    public ElementosVisualesProducto[] distanciaHammingMod(String stringBusqueda){
        LinkedList<NodoHashMap> productosSimilares = new LinkedList<>();
        //Iterar todos los productos del menu
        for (int j = 0; j < menu.length; j++){
            /*Dividir las palabras del nombre de cada producto en una array con 
              el nombre completo tambien comparar cada posicion con la busqueda. */
            Product productoActual = menu[j];
            String[] palabras = productoActual.getNombre().split(" ");
            String[] stringProductoActual;
            if (palabras.length > 1){
                stringProductoActual = new String[palabras.length + 1];
                System.arraycopy(palabras, 0, stringProductoActual, 0, palabras.length);
                stringProductoActual[palabras.length] = productoActual.getNombre();
            } else {
                stringProductoActual = palabras;
            }
            //Pasar busqueda a minusculas y quitar espacios
            stringBusqueda = stringBusqueda.toLowerCase().replace(" ", "");
            for (int i = 0; i < stringProductoActual.length; i++){
                int igualdades = 0;
                int pos1 = 0;
                int pos2 = 0;
                //Pasar cada string del producto a minusculas para ser comparado
                stringProductoActual[i] = stringProductoActual[i].toLowerCase();
                //Definir limite de la iteracion a partir del string mas pequeño
                int limite = (stringBusqueda.length() > stringProductoActual[i].length()) ? stringProductoActual[i].length() : stringBusqueda.length();
                int iterador = 0;
                while (iterador < limite){
                    //Comparar posicion con posicion (2-2)
                    if (stringBusqueda.charAt(pos1) == stringProductoActual[i].charAt(pos2)){
                        igualdades++;
                        pos1++;
                        pos2++;
                    } else {
                        //Comprobar que existe una posicion siguiente
                        if ((pos2 + 1) < stringProductoActual[i].length()){
                            //Comparar posicion con una adelante (2-3)
                            if (stringBusqueda.charAt(pos1) == stringProductoActual[i].charAt(pos2 + 1)) {
                                igualdades++;
                                pos1++;
                                pos2 += 2;
                                //Disminuir una iteracion si el stringBusqueda no es menor al string del producto
                                if (stringBusqueda.length() >= stringProductoActual[i].length()){
                                    iterador++;
                                }
                            } else{
                                pos1++;
                                pos2++;
                            }
                        }
                    }
                    iterador++;
                }
                /**
                 * Determinar si la busqueda tiene similitud con el producto actual y ser agregado a la lista de resultados.
                 * Calcular similitud:
                 * Se calcula la diferencia dividiendo la cantidad de caracteres en las iguales para tener una proporción si
                 * la diferencia es menor a 1.5, si son similares. 
                 */

                double diferencia = (double)stringBusqueda.length() / igualdades;
                if ((igualdades > 0) && (diferencia < 1.5)){
                    if (!productosSimilares.isEmpty()){
                        if (productosSimilares.get().diferencia >= diferencia){
                            productosSimilares.addOnHead(new NodoHashMap(productoActual.getId(), diferencia));
                        } else {
                            productosSimilares.add(new NodoHashMap(productoActual.getId(), diferencia));
                        }
                    } else {
                        productosSimilares.add(new NodoHashMap(productoActual.getId(), diferencia));
                    }
                    //Romper el ciclo en caso de encontrar una similitud con cualquiera de los strings de cada producto
                    break;
                }
            }
        }
        return convertirResultados(productosSimilares);
    }
    
    private void TextFieldBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldBuscadorFocusGained
        if (TextFieldBuscador.getText().equals(" Buscar...")){
            TextFieldBuscador.setText("");
        }
    }//GEN-LAST:event_TextFieldBuscadorFocusGained

    private void TextFieldBuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldBuscadorFocusLost
        if (TextFieldBuscador.getText().isBlank()){
            TextFieldBuscador.setText(" Buscar...");
        }
    }//GEN-LAST:event_TextFieldBuscadorFocusLost

    private void TextFieldBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldBuscadorKeyReleased
        generarResultadosBusqueda();
    }//GEN-LAST:event_TextFieldBuscadorKeyReleased

    private void jIconoProductosMasPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconoProductosMasPedidosMouseClicked
        mostrarProductosMasPedidos();
    }//GEN-LAST:event_jIconoProductosMasPedidosMouseClicked

    private void jLabelProductosMasPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProductosMasPedidosMouseClicked
        mostrarProductosMasPedidos();
    }//GEN-LAST:event_jLabelProductosMasPedidosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reiniciarPedido();
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean verificarPedido(){
        String camposInvalidos = "";
        boolean validate = true;
        
        if (pedidoActual.listaProductos.size() == 0){
            validate = false;
            camposInvalidos = "Primero debe agregar productos al pedido.";
        } else {
            String temp = textFieldNum.getText();    
            for (int i=0; i<temp.length(); i++){
                if (!(temp.charAt(i) >= 0 && temp.charAt(i) >= 9)){
                    validate = false;
                    camposInvalidos += "Numero de telefono.\n";
                    break;
                }
            }
            
            if (textFieldNum.getText().length() < 10){
            //Confirmar que los caracteres ingresados sean numeros
            
            validate = false;
            camposInvalidos += "Numero de telefono.\n";
            }
            if (textFieldName.getText().length() < 2){
                validate = false;
                camposInvalidos += "Nombre completo.\n";
            }
            if (textFieldLastName.getText().length() < 2){
                validate = false;
                camposInvalidos += "Apellidos incompletos.\n";
            }
            if (textFieldDirr1.getText().isBlank()){
                validate = false;
                camposInvalidos += "Calle/Avenida/Carrera.\n";
            }
            if (textFieldDirr3.getText().isBlank()){
                validate = false;
                camposInvalidos += "Barrio.\n";
            }
        }
        
        if (!validate){
            JOptionPane.showMessageDialog(null, camposInvalidos, "Campos invalidos", JOptionPane.INFORMATION_MESSAGE);
        }
        return validate;
    }
    
    /**
     * Metodo para confirmar el pedido en proceso y enviarlo al servidor a traves de la clase servicio.
     * @throws RemoteException 
     */
    private void confirmarPedido() throws RemoteException{
        if (verificarPedido()){
            guardarDatosPedido();
            generarId();
            imprimirRecibo();
            Client newClient = crearCliente();
            colaDePedidos.add(pedidoActual, pedidoActual.tipoCliente);
            try {
                service.addOrder(pedidoActual);
                service.addClientOnDataBase(newClient);
            } catch (RemoteException ex) {
                Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
            }
            textPaneListaDePedidos.setText(colaDePedidos.toString());
            reiniciarPedido();
        }
    }
    
    /**
     * Generación de Id para cada pedido a partir de:
     * Hora en segundos, Horas, Minutos y Letras del nombre del Cliente.
     */
    public void generarId(){
        LocalDateTime localDateTime = LocalDateTime.now();
        String id = localDateTime.getHour() + "-" + pedidoActual.nombres.charAt(0);
        id += (localDateTime.getHour() + localDateTime.getSecond() + localDateTime.getMinute());
        id += "" + pedidoActual.apellidos.charAt(0) + String.valueOf(pedidoActual.apellidos.charAt(pedidoActual.apellidos.length()-1));
        id += localDateTime.getMinute() + "" + localDateTime.getSecond();
        pedidoActual.id = id;
    }
    
    /**
     * Metodo para mostrar el recibo del pedido en pantalla al finalizar el pedido.
     */
    public void imprimirRecibo(){
        Icon icono = new ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoFactura.png"));
        String recibo = "--------------------------------------" +
                "\nPedido: " + pedidoActual.id +
                "\nTitular: " + pedidoActual.nombres + " " + pedidoActual.apellidos +
                "\n--------------------------------------" +
                "\nProductos:\n" + pedidoActual.listaProductos.listToString() +
                "\nValor productos: $" + pedidoActual.valorTotal;
        pedidoActual.valorTotal = pedidoActual.valorTotal * valorIVA;
        recibo += "\nValor Total con IVA: \n$" + pedidoActual.valorTotal;
        
        JOptionPane.showMessageDialog(null, recibo, "Recibo", JOptionPane.PLAIN_MESSAGE, icono);
    }
    
    private void reiniciarPedido(){
        pedidoActual = new Order();
        textFieldDirr1.setText("");
        textFieldDirr3.setText("");
        textFieldName.setText("");
        textFieldLastName.setText("");
        textFieldNum.setText("");
        jComboBoxTipoCliente.setSelectedIndex(0);
        TextAreaCarritoCompras.setText("");
        TextAreaTotal.setText("");
        jIconoProductosMasPedidos.setVisible(false);
        jLabelProductosMasPedidos.setVisible(false);
        jLabelMenu.setText("Menu");
    }
    
    private void guardarDatosPedido(){
        pedidoActual.nombres = textFieldName.getText();
        pedidoActual.apellidos = textFieldLastName.getText();
        pedidoActual.direccion = textFieldDirr1.getText();
        pedidoActual.direccion += ",  (" + textFieldDirr3.getText() + ")";
        pedidoActual.tipoCliente = jComboBoxTipoCliente.getSelectedIndex();
        pedidoActual.numeroTelefono = textFieldNum.getText();
        pedidoActual.barrio = textFieldDirr3.getText();
        pedidoActual.cantidadProductos = pedidoActual.listaProductos.size();
    }
    
    public Client crearCliente(){
        Client newClient = new Client(textFieldName.getText(), textFieldLastName.getText(), jComboBoxTipoCliente.getSelectedIndex(), 
                textFieldDirr1.getText() + ", " + textFieldDirr3.getText(), textFieldNum.getText());
        newClient.addProductos(pedidoActual.listaProductos, topProductos);
        return newClient;
    }
    
    /**
     * Metodo para comunicarse al servidor a traves de la clase Service y obtener el menu en la base de datos.
     */
    private void llenarMenu(){
        LinkedList<Product> listaMenu = null;
        try {
            listaMenu = service.getMenu();
        } catch (RemoteException ex) {
            Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VistaOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iterator<NodeInterface<Product>> iterator = listaMenu.iterator();
        menu = new Product[listaMenu.size()];
        for (int i=0; i<menu.length; i++) {
            menu[i] = iterator.next().getObject();
        }
    }
    
    public String convertPrecio(double precio){
        DecimalFormat formato = new DecimalFormat("###,###");
        String string = formato.format(precio);
        return "$" + string;
    }
    
    private void asignarActionsABotonesAddProducts(){
        for (int i=0; i<gruposSwingMenu.length; i++){
            Product temp = gruposSwingMenu[i].producto;
            //Actioc Boton add
            gruposSwingMenu[i].addProducto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pedidoActual.addProducto(temp);
                    actualizarAreaCarritoDeCompras();
                }
            });
            //Action Boton remove
            gruposSwingMenu[i].removeProducto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pedidoActual.removeProduct(temp);
                    actualizarAreaCarritoDeCompras();
                }
            });
        }
    }
    
    public void mostrarProductosMasPedidos(){
        if (!volver){
            Iterator<NodeInterface<String[]>> iterator = topProductos.iterator();
            ElementosVisualesProducto[] newResultados = new ElementosVisualesProducto[topProductos.size()];
            int contadorPos = 0;
            while (iterator.hasNext()){
                String idTemp = iterator.next().getObject()[0];
                for (int i=0; i<gruposSwingMenu.length; i++){
                    if (gruposSwingMenu[i].getId().equals(idTemp)){
                        newResultados[contadorPos] = gruposSwingMenu[i];
                        contadorPos++;
                    }
                }
            }
            jLabelMenu.setText("Menu  (Productos más pedidos)");
            volver = true;
            mostrarProductoEnMenu(newResultados);
        } else {
            volver = false;
            mostrarProductoEnMenu(gruposSwingMenu);
            jLabelMenu.setText("Menu");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddProduct;
    private javax.swing.JPanel Fillinfo;
    private javax.swing.JPanel PanelListaPedidos;
    private javax.swing.JPanel PanelNuevoPedido;
    private javax.swing.JPanel PanelVerPedidoActual;
    private javax.swing.JTabbedPane TabbedPaneMain;
    private javax.swing.JTextArea TextAreaCarritoCompras;
    private javax.swing.JTextArea TextAreaTotal;
    private javax.swing.JTextField TextFieldBuscador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JLabel jIconoProductosMasPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelProductosMasPedidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelUpBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField textFieldDirr1;
    private javax.swing.JTextField textFieldDirr3;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldNum;
    private javax.swing.JTextPane textPaneListaDePedidos;
    // End of variables declaration//GEN-END:variables
}