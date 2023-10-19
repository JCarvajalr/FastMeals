package co.edu.upb.Vistas.Operador;

import co.edu.upb.Clases.Order;
import co.edu.upb.Clases.Product;
import co.edu.upb.Clases.Client;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Interface.NodeInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class VistaOperador extends javax.swing.JFrame {
    ColaPrioridad<Order> colaDePedidos = new ColaPrioridad<>(2);
    Product[] menu;
    
    Order pedidoActual;
    ElementosVisualesProducto[] gruposSwingMenu = new ElementosVisualesProducto[menu.length];
    
    ServiceOperador service;
    
    public VistaOperador(ServiceOperador service){
        this.service = service;
        pedidoActual = new Order();
        llenarMenu();
        
        //Interfaz grafica
        initComponents();
        //setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        agruparElementos();
        textFielNumListener();
        jScrollPaneMenu.getVerticalScrollBar().setValue(0);
        asignarActionsABotonesAddProducts();
        restoreMenuDefault();
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
        AddProduct = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        TextFieldBuscador = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPaneMenu = new javax.swing.JScrollPane();
        jPanelMenu = new javax.swing.JPanel();
        imagenProducto3 = new javax.swing.JLabel();
        precioProducto1 = new javax.swing.JLabel();
        removeProducto1 = new javax.swing.JButton();
        addProducto1 = new javax.swing.JButton();
        descProducto1 = new javax.swing.JTextArea();
        nombreProducto1 = new javax.swing.JLabel();
        nombreProducto3 = new javax.swing.JLabel();
        removeProducto3 = new javax.swing.JButton();
        addProducto3 = new javax.swing.JButton();
        precioProducto3 = new javax.swing.JLabel();
        descProducto3 = new javax.swing.JTextArea();
        nombreProducto4 = new javax.swing.JLabel();
        precioProducto4 = new javax.swing.JLabel();
        descProducto4 = new javax.swing.JTextArea();
        nombreProducto5 = new javax.swing.JLabel();
        precioProducto5 = new javax.swing.JLabel();
        descProducto5 = new javax.swing.JTextArea();
        nombreProducto2 = new javax.swing.JLabel();
        precioProducto2 = new javax.swing.JLabel();
        descProducto2 = new javax.swing.JTextArea();
        imagenProducto2 = new javax.swing.JLabel();
        addProducto2 = new javax.swing.JButton();
        removeProducto2 = new javax.swing.JButton();
        imagenProducto1 = new javax.swing.JLabel();
        imagenProducto4 = new javax.swing.JLabel();
        addProducto4 = new javax.swing.JButton();
        removeProducto4 = new javax.swing.JButton();
        imagenProducto5 = new javax.swing.JLabel();
        addProducto5 = new javax.swing.JButton();
        removeProducto5 = new javax.swing.JButton();
        imagenProducto6 = new javax.swing.JLabel();
        nombreProducto6 = new javax.swing.JLabel();
        precioProducto6 = new javax.swing.JLabel();
        descProducto6 = new javax.swing.JTextArea();
        addProducto6 = new javax.swing.JButton();
        removeProducto6 = new javax.swing.JButton();
        nombreProducto7 = new javax.swing.JLabel();
        imagenProducto7 = new javax.swing.JLabel();
        addProducto7 = new javax.swing.JButton();
        removeProducto7 = new javax.swing.JButton();
        precioProducto7 = new javax.swing.JLabel();
        descProducto7 = new javax.swing.JTextArea();
        imagenProducto8 = new javax.swing.JLabel();
        addProducto8 = new javax.swing.JButton();
        removeProducto8 = new javax.swing.JButton();
        nombreProducto8 = new javax.swing.JLabel();
        precioProducto8 = new javax.swing.JLabel();
        descProducto8 = new javax.swing.JTextArea();
        nombreProducto9 = new javax.swing.JLabel();
        precioProducto9 = new javax.swing.JLabel();
        descProducto9 = new javax.swing.JTextArea();
        imagenProducto9 = new javax.swing.JLabel();
        addProducto9 = new javax.swing.JButton();
        removeProducto9 = new javax.swing.JButton();
        imagenProducto10 = new javax.swing.JLabel();
        addProducto10 = new javax.swing.JButton();
        removeProducto10 = new javax.swing.JButton();
        nombreProducto10 = new javax.swing.JLabel();
        precioProducto10 = new javax.swing.JLabel();
        descProducto10 = new javax.swing.JTextArea();
        imagenProducto11 = new javax.swing.JLabel();
        addProducto11 = new javax.swing.JButton();
        removeProducto11 = new javax.swing.JButton();
        nombreProducto11 = new javax.swing.JLabel();
        precioProducto11 = new javax.swing.JLabel();
        descProducto11 = new javax.swing.JTextArea();
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
        jLabel17 = new javax.swing.JLabel();
        textFieldDirr1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textFieldDirr3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textFieldDirr2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        textFieldLastName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
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

        jLabel1.setFont(new java.awt.Font("Gobold Bold", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FoodUPB");
        jPanelUpBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear pedido");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanelUpBar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 70));

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
        jPanelUpBar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 70));

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

        TextAreaTotal.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaTotal.setColumns(20);
        TextAreaTotal.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
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

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Menú");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(911, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jLabel21))
        );

        AddProduct.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1180, 85));

        jScrollPaneMenu.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPaneMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPaneMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMenu.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPaneMenu.setPreferredSize(new java.awt.Dimension(1186, 882));

        jPanelMenu.setBackground(new java.awt.Color(245, 245, 245));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1182, 1560));

        imagenProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/TacosDeCarneAsada.png"))); // NOI18N

        precioProducto1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto1.setText("14.000$");
        precioProducto1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        removeProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        addProducto1.setBackground(new java.awt.Color(245, 245, 245));
        addProducto1.setForeground(new java.awt.Color(245, 245, 245));
        addProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        descProducto1.setEditable(false);
        descProducto1.setBackground(new java.awt.Color(245, 245, 245));
        descProducto1.setColumns(20);
        descProducto1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto1.setLineWrap(true);
        descProducto1.setRows(5);
        descProducto1.setText("Carne a la parrilla, lechuga, tomate y salsa en un pan suave. \n(5 minutos)\n");
        descProducto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        nombreProducto1.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto1.setText("Hamburguesa Clásica");
        nombreProducto1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        nombreProducto3.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto3.setText("Tacos de Carne Asada");
        nombreProducto3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        removeProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        addProducto3.setBackground(new java.awt.Color(245, 245, 245));
        addProducto3.setForeground(new java.awt.Color(245, 245, 245));
        addProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        precioProducto3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto3.setText("12.000$");
        precioProducto3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto3.setEditable(false);
        descProducto3.setBackground(new java.awt.Color(245, 245, 245));
        descProducto3.setColumns(20);
        descProducto3.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto3.setLineWrap(true);
        descProducto3.setRows(5);
        descProducto3.setText("2 porciones de tacos rellenos de carne asada, cebolla, cilantro y salsa. \n(5 minutos)\n");
        descProducto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        nombreProducto4.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto4.setText("Hot Dog con Chili");
        nombreProducto4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto4.setText("10.000$");
        precioProducto4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto4.setEditable(false);
        descProducto4.setBackground(new java.awt.Color(245, 245, 245));
        descProducto4.setColumns(20);
        descProducto4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto4.setLineWrap(true);
        descProducto4.setRows(5);
        descProducto4.setText("Hot dog con salchicha, pan suave y chilicon carne, cebolla y queso. (5 minutos)\n");
        descProducto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        nombreProducto5.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto5.setText("Burrito de Pollo");
        nombreProducto5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto5.setText("10.000$");
        precioProducto5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto5.setEditable(false);
        descProducto5.setBackground(new java.awt.Color(245, 245, 245));
        descProducto5.setColumns(20);
        descProducto5.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto5.setLineWrap(true);
        descProducto5.setRows(5);
        descProducto5.setText("Burrito relleno de pollo a la parrilla,    arroz, frijoles y salsa. (5 minutos)\n");
        descProducto5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        nombreProducto2.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto2.setText("Hamburguesa Especial");
        nombreProducto2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto2.setText("18.000$");
        precioProducto2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto2.setEditable(false);
        descProducto2.setBackground(new java.awt.Color(245, 245, 245));
        descProducto2.setColumns(20);
        descProducto2.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto2.setLineWrap(true);
        descProducto2.setRows(5);
        descProducto2.setText("Carne de res premium a la parrilla,    queso cheddar, cebolla caramelizada y lechuga en pan de brioche. \n(5 minutos)\n");
        descProducto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        imagenProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/HamburguesaEspecial.png"))); // NOI18N

        addProducto2.setBackground(new java.awt.Color(245, 245, 245));
        addProducto2.setForeground(new java.awt.Color(245, 245, 245));
        addProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        imagenProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/HamburguesaClasica.png"))); // NOI18N

        imagenProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/HotDog.png"))); // NOI18N

        addProducto4.setBackground(new java.awt.Color(245, 245, 245));
        addProducto4.setForeground(new java.awt.Color(245, 245, 245));
        addProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        imagenProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/Burrito.png"))); // NOI18N

        addProducto5.setBackground(new java.awt.Color(245, 245, 245));
        addProducto5.setForeground(new java.awt.Color(245, 245, 245));
        addProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        imagenProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/SándwichBLT.png"))); // NOI18N

        nombreProducto6.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto6.setText("Sándwich BLT");
        nombreProducto6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto6.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto6.setText("10.000$");
        precioProducto6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto6.setEditable(false);
        descProducto6.setBackground(new java.awt.Color(245, 245, 245));
        descProducto6.setColumns(20);
        descProducto6.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto6.setLineWrap(true);
        descProducto6.setRows(5);
        descProducto6.setText("Sándwich con tocino, lechuga y tomate en pan tostado. (5 minutos)\n");
        descProducto6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        addProducto6.setBackground(new java.awt.Color(245, 245, 245));
        addProducto6.setForeground(new java.awt.Color(245, 245, 245));
        addProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        nombreProducto7.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto7.setText("Pizza de pepperoni");
        nombreProducto7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        imagenProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/PizzaDePepperoni.png"))); // NOI18N

        addProducto7.setBackground(new java.awt.Color(245, 245, 245));
        addProducto7.setForeground(new java.awt.Color(245, 245, 245));
        addProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        precioProducto7.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto7.setText("18.000$");
        precioProducto7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto7.setEditable(false);
        descProducto7.setBackground(new java.awt.Color(245, 245, 245));
        descProducto7.setColumns(20);
        descProducto7.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto7.setLineWrap(true);
        descProducto7.setRows(5);
        descProducto7.setText("Pizza con salsa de tomate, queso y\nrodajas de pepperoni. (10 minutos)\n");
        descProducto7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        imagenProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/Picada.jpg"))); // NOI18N

        addProducto8.setBackground(new java.awt.Color(245, 245, 245));
        addProducto8.setForeground(new java.awt.Color(245, 245, 245));
        addProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        nombreProducto8.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto8.setText("Picada");
        nombreProducto8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto8.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto8.setText("30.000$");
        precioProducto8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto8.setEditable(false);
        descProducto8.setBackground(new java.awt.Color(245, 245, 245));
        descProducto8.setColumns(20);
        descProducto8.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto8.setLineWrap(true);
        descProducto8.setRows(5);
        descProducto8.setText("Variedad de carnes y \nacompañamientos para 2 personas.\n(10 minutos)");
        descProducto8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        nombreProducto9.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto9.setText("Papas fritas");
        nombreProducto9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto9.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto9.setText("6.000$");
        precioProducto9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto9.setEditable(false);
        descProducto9.setBackground(new java.awt.Color(245, 245, 245));
        descProducto9.setColumns(20);
        descProducto9.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto9.setLineWrap(true);
        descProducto9.setRows(5);
        descProducto9.setText("Porción de papas a la francesa. \n(5 minutos)\n");
        descProducto9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        imagenProducto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/PapasFritas.jpg"))); // NOI18N

        addProducto9.setBackground(new java.awt.Color(245, 245, 245));
        addProducto9.setForeground(new java.awt.Color(245, 245, 245));
        addProducto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        imagenProducto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/NuggetsDePollo.jpg"))); // NOI18N

        addProducto10.setBackground(new java.awt.Color(245, 245, 245));
        addProducto10.setForeground(new java.awt.Color(245, 245, 245));
        addProducto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        nombreProducto10.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto10.setText("Nuggets de Pollo");
        nombreProducto10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto10.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto10.setText("7.000$");
        precioProducto10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto10.setEditable(false);
        descProducto10.setBackground(new java.awt.Color(245, 245, 245));
        descProducto10.setColumns(20);
        descProducto10.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto10.setLineWrap(true);
        descProducto10.setRows(5);
        descProducto10.setText("Trozos de pollo empanizado, ideales como aperitivo o complemento. \n(5 minutos)");
        descProducto10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        imagenProducto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Productos/ArosDeCebolla.png"))); // NOI18N

        addProducto11.setBackground(new java.awt.Color(245, 245, 245));
        addProducto11.setForeground(new java.awt.Color(245, 245, 245));
        addProducto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducto11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N

        removeProducto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeProducto11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N

        nombreProducto11.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto11.setText("Aros de Cebolla");
        nombreProducto11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        precioProducto11.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto11.setText("8.000$");
        precioProducto11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        descProducto11.setEditable(false);
        descProducto11.setBackground(new java.awt.Color(245, 245, 245));
        descProducto11.setColumns(20);
        descProducto11.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto11.setLineWrap(true);
        descProducto11.setRows(5);
        descProducto11.setText("Aros de cebolla crujientes, ideales como aperitivo o acompañamiento.\n(5 minutos)");
        descProducto11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(imagenProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(imagenProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(nombreProducto1)
                        .addGap(162, 162, 162)
                        .addComponent(nombreProducto2))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(precioProducto1)
                        .addGap(305, 305, 305)
                        .addComponent(precioProducto2))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(descProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(descProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(imagenProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(imagenProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(imagenProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(nombreProducto3)
                        .addGap(159, 159, 159)
                        .addComponent(nombreProducto4)
                        .addGap(201, 201, 201)
                        .addComponent(nombreProducto5))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(precioProducto3)
                        .addGap(307, 307, 307)
                        .addComponent(precioProducto4)
                        .addGap(296, 296, 296)
                        .addComponent(precioProducto5))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(descProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(descProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(descProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(imagenProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(imagenProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(imagenProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(nombreProducto6)
                        .addGap(242, 242, 242)
                        .addComponent(nombreProducto7)
                        .addGap(180, 180, 180)
                        .addComponent(nombreProducto8))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(precioProducto6)
                        .addGap(306, 306, 306)
                        .addComponent(precioProducto7)
                        .addGap(295, 295, 295)
                        .addComponent(precioProducto8))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(descProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(descProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(descProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(imagenProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(imagenProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(imagenProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(nombreProducto9)
                        .addGap(263, 263, 263)
                        .addComponent(nombreProducto10)
                        .addGap(203, 203, 203)
                        .addComponent(nombreProducto11))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(precioProducto9)
                        .addGap(315, 315, 315)
                        .addComponent(precioProducto10)
                        .addGap(305, 305, 305)
                        .addComponent(precioProducto11))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(descProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(descProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(descProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioProducto1)
                    .addComponent(precioProducto2))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioProducto3)
                    .addComponent(precioProducto4)
                    .addComponent(precioProducto5))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioProducto6)
                    .addComponent(precioProducto7)
                    .addComponent(precioProducto8))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descProducto6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(addProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(removeProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioProducto9)
                    .addComponent(precioProducto10)
                    .addComponent(precioProducto11))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descProducto9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descProducto11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneMenu.setViewportView(jPanelMenu);

        AddProduct.add(jScrollPaneMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 262, 1180, 620));
        jScrollPaneMenu.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPaneMenu.getVerticalScrollBar().setValue(0);

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
        Fillinfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jComboBoxTipoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTipoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Premium", "Premium" }));
        jComboBoxTipoCliente.setToolTipText("");
        jComboBoxTipoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fillinfo.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 230, 40));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(135, 135, 135));
        jLabel16.setText("Datos de envío");
        Fillinfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tipo");
        Fillinfo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, -1, -1));

        textFieldDirr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldDirr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 320, 41));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Información complementaria");
        Fillinfo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        textFieldDirr3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldDirr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 320, 41));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Barrio");
        Fillinfo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        textFieldDirr2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fillinfo.add(textFieldDirr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 320, 41));

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calle", "Avenida", "Carrera" }));
        Fillinfo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, -1, 40));

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

    private void textFielNumListener(){
        textFieldNum.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Evitar la entrada de caracteres no numéricos
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // No es necesario implementar este método
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // No es necesario implementar este método
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
            "\nTotal: " + pedidoActual.getTotalCompra());
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
        
        /*TabbedPaneMenu.setSelectedIndex(0);
        TabbedPaneMenu.setSelectedIndex(1);
        JLabel jLabelResultadoBusqueda = new JLabel("No hay coincidencias.");
        jLabelResultadoBusqueda.setSize(180, 30);
        jLabelResultadoBusqueda.setForeground(Color.BLACK);
        jLabelResultadoBusqueda.setFont(new java.awt.Font("Bahnschrift", 0, 18));
        jLabelResultadoBusqueda.setLocation(30, 70);
        jLabelResultadoBusqueda.setVisible(true);
        jPanelResults.add(jLabelResultadoBusqueda);*/
    }
    
    public ElementosVisualesProducto[] convertirResultados(LinkedList<String> resultados){
        if (resultados.isEmpty()){
            return null;
        }
        Iterator<NodeInterface<String>> iterator = resultados.iterator();
        ElementosVisualesProducto[] newResultados = new ElementosVisualesProducto[resultados.size()];
        int contadorPos = 0;
        while (iterator.hasNext()){
            String temp = iterator.next().getObject();
            for (int i=0; i<gruposSwingMenu.length; i++){
                if (gruposSwingMenu[i].getId().equals(temp)){
                    newResultados[contadorPos] = gruposSwingMenu[i];
                    contadorPos++;
                }
            }
        }
        return newResultados;
    }
    
    public ElementosVisualesProducto[] distanciaHammingMod(String stringBusqueda){
        LinkedList<String> resultadoBusqueda = new LinkedList<>();
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
                /* --- Determinar si la busqueda se parece al producto y agregarlo a los resultados ---
                Similitud = Dividir la cantidad de caracteres en las iguales para tener una proporción
                Sí la similitud es menor o igual a 1.5, si son similares.
                */
                if ((igualdades > 0) && ((double)stringBusqueda.length() / igualdades) <= 1.5){
                    resultadoBusqueda.add(productoActual.getId());
                    //Romper el ciclo en caso de encontrar una similitud con cualquiera de los strings de cada producto
                    break;
                }
            }
        }
        return convertirResultados(resultadoBusqueda);
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

        //Aros de cebolla
    private void TextFieldBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldBuscadorKeyReleased
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
                    
                    Font fontNombre = new java.awt.Font("Bahnschrift", 1, 22);
                    Font fontPrecio = new java.awt.Font("Bahnschrift", 1, 22);
                    Font fontDesc = new java.awt.Font("Bahnschrift", 0, 16);
                    
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
                        /*jPanelResults.add(imagenProducto);
                        jPanelResults.add(nombreProducto);
                        jPanelResults.add(precio);
                        jPanelResults.add(descripcion);
                        jPanelResults.add(addProducto);
                        jPanelResults.add(removeProducto);*/
                        
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
                    //TabbedPaneMenu.setSelectedIndex(1);
                    //jPanelResults.revalidate();
                    //jPanelResults.repaint();
                } else{
                    mostrarBusquedaNulaEnResultados();
                }
            //}else{
            //    mostrarBusquedaNulaEnResultados();
            //}
        }else{
            restoreMenuDefault();
        }
    }//GEN-LAST:event_TextFieldBuscadorKeyReleased

    public void restoreMenuDefault(){
        int posX = 30;
        int posY1 = 10, posY2 = 210, posY3 = 240, posY4 = 270;
        jScrollPaneMenu.getVerticalScrollBar().setValue(0);
        jPanelMenu.removeAll();
        for (int i=0; i<gruposSwingMenu.length; i++){
            JLabel imagenProducto = gruposSwingMenu[i].imagenProducto;
            JLabel nombreProducto = gruposSwingMenu[i].nombreProducto;
            JLabel precio = gruposSwingMenu[i].precioProducto;
            JTextArea descripcion = gruposSwingMenu[i].descProducto;
            JButton addProducto = gruposSwingMenu[i].addProducto;
            JButton removeProducto = gruposSwingMenu[i].removeProducto;

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
        // [1186, 1634]
        //jPanelMenu.setSize(1186, 1634);
        jPanelMenu.revalidate();
        jPanelMenu.repaint();
    }
    
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
            if (textFieldName.getText().isBlank()){
                validate = false;
                camposInvalidos += "Nombre completo.\n";
            }
            if (textFieldLastName.getText().isBlank()){
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
    
    private void confirmarPedido() throws RemoteException{
        if (verificarPedido()){
            imprimirRecibo();
            
            guardarDatosPedido();
            colaDePedidos.add(pedidoActual, pedidoActual.tipoCliente);
            service.addOrder(pedidoActual);
            textPaneListaDePedidos.setText(colaDePedidos.toString());
            reiniciarPedido();
        }
    }
    
    public void imprimirRecibo(){
        Icon icono = new ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoFactura.png"));
        JOptionPane.showMessageDialog(null, "Imprimir recibo", "Recibo", JOptionPane.PLAIN_MESSAGE, icono);
    }
    
    private void reiniciarPedido(){
        pedidoActual = new Order();
        textFieldDirr1.setText("");
        textFieldDirr2.setText("");
        textFieldDirr3.setText("");
        textFieldName.setText("");
        textFieldNum.setText("");
        jComboBoxTipoCliente.setSelectedIndex(0);
        
        TextAreaCarritoCompras.setText("");
        TextAreaTotal.setText("");
    }
    
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
    
    private void asignarActionsABotonesAddProducts(){
        
        for (int i=0; i<gruposSwingMenu.length; i++){
            
            Product temp = gruposSwingMenu[i].producto;
            gruposSwingMenu[i].addProducto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pedidoActual.addProducto(temp);
                    actualizarAreaCarritoDeCompras();
                }
            });
            
            gruposSwingMenu[i].removeProducto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pedidoActual.removeProduct(temp);
                    actualizarAreaCarritoDeCompras();
                }
            });
        }
        
    }
    
    private void guardarDatosPedido(){
        pedidoActual.nombres = textFieldName.getText();
        pedidoActual.direccion = textFieldDirr1.getText();
        pedidoActual.direccion += textFieldDirr2.getText();
        pedidoActual.direccion += textFieldDirr3.getText();
        pedidoActual.tipoCliente = jComboBoxTipoCliente.getSelectedIndex();
    }
    
    private void agruparElementos(){
        gruposSwingMenu[0] = new ElementosVisualesProducto(imagenProducto1, nombreProducto1, precioProducto1, descProducto1, addProducto1, removeProducto1, "001", menu[0]);
        gruposSwingMenu[1] = new ElementosVisualesProducto(imagenProducto2, nombreProducto2, precioProducto2, descProducto2, addProducto2, removeProducto2, "002", menu[1]);
        gruposSwingMenu[2] = new ElementosVisualesProducto(imagenProducto3, nombreProducto3, precioProducto3, descProducto3, addProducto3, removeProducto3, "005", menu[4]);
        gruposSwingMenu[3] = new ElementosVisualesProducto(imagenProducto4, nombreProducto4, precioProducto4, descProducto4, addProducto4, removeProducto4, "006", menu[5]);
        gruposSwingMenu[4] = new ElementosVisualesProducto(imagenProducto5, nombreProducto5, precioProducto5, descProducto5, addProducto5, removeProducto5, "009", menu[8]);
        gruposSwingMenu[5] = new ElementosVisualesProducto(imagenProducto6, nombreProducto6, precioProducto6, descProducto6, addProducto6, removeProducto6, "010", menu[9]);
        gruposSwingMenu[6] = new ElementosVisualesProducto(imagenProducto7, nombreProducto7, precioProducto7, descProducto7, addProducto7, removeProducto7, "008", menu[7]);
        gruposSwingMenu[7] = new ElementosVisualesProducto(imagenProducto8, nombreProducto8, precioProducto8, descProducto8, addProducto8, removeProducto8, "011", menu[10]);
        gruposSwingMenu[8] = new ElementosVisualesProducto(imagenProducto9, nombreProducto9, precioProducto9, descProducto9, addProducto9, removeProducto9, "003", menu[2]);
        gruposSwingMenu[9] = new ElementosVisualesProducto(imagenProducto10, nombreProducto10, precioProducto10, descProducto10, addProducto10, removeProducto10, "004", menu[3]);
        gruposSwingMenu[10] = new ElementosVisualesProducto(imagenProducto11, nombreProducto11, precioProducto11, descProducto11, addProducto11, removeProducto11, "007", menu[6]);    
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
    private javax.swing.JButton addProducto1;
    private javax.swing.JButton addProducto10;
    private javax.swing.JButton addProducto11;
    private javax.swing.JButton addProducto2;
    private javax.swing.JButton addProducto3;
    private javax.swing.JButton addProducto4;
    private javax.swing.JButton addProducto5;
    private javax.swing.JButton addProducto6;
    private javax.swing.JButton addProducto7;
    private javax.swing.JButton addProducto8;
    private javax.swing.JButton addProducto9;
    private javax.swing.JTextArea descProducto1;
    private javax.swing.JTextArea descProducto10;
    private javax.swing.JTextArea descProducto11;
    private javax.swing.JTextArea descProducto2;
    private javax.swing.JTextArea descProducto3;
    private javax.swing.JTextArea descProducto4;
    private javax.swing.JTextArea descProducto5;
    private javax.swing.JTextArea descProducto6;
    private javax.swing.JTextArea descProducto7;
    private javax.swing.JTextArea descProducto8;
    private javax.swing.JTextArea descProducto9;
    private javax.swing.JLabel imagenProducto1;
    private javax.swing.JLabel imagenProducto10;
    private javax.swing.JLabel imagenProducto11;
    private javax.swing.JLabel imagenProducto2;
    private javax.swing.JLabel imagenProducto3;
    private javax.swing.JLabel imagenProducto4;
    private javax.swing.JLabel imagenProducto5;
    private javax.swing.JLabel imagenProducto6;
    private javax.swing.JLabel imagenProducto7;
    private javax.swing.JLabel imagenProducto8;
    private javax.swing.JLabel imagenProducto9;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
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
    private javax.swing.JLabel nombreProducto1;
    private javax.swing.JLabel nombreProducto10;
    private javax.swing.JLabel nombreProducto11;
    private javax.swing.JLabel nombreProducto2;
    private javax.swing.JLabel nombreProducto3;
    private javax.swing.JLabel nombreProducto4;
    private javax.swing.JLabel nombreProducto5;
    private javax.swing.JLabel nombreProducto6;
    private javax.swing.JLabel nombreProducto7;
    private javax.swing.JLabel nombreProducto8;
    private javax.swing.JLabel nombreProducto9;
    private javax.swing.JLabel precioProducto1;
    private javax.swing.JLabel precioProducto10;
    private javax.swing.JLabel precioProducto11;
    private javax.swing.JLabel precioProducto2;
    private javax.swing.JLabel precioProducto3;
    private javax.swing.JLabel precioProducto4;
    private javax.swing.JLabel precioProducto5;
    private javax.swing.JLabel precioProducto6;
    private javax.swing.JLabel precioProducto7;
    private javax.swing.JLabel precioProducto8;
    private javax.swing.JLabel precioProducto9;
    private javax.swing.JButton removeProducto1;
    private javax.swing.JButton removeProducto10;
    private javax.swing.JButton removeProducto11;
    private javax.swing.JButton removeProducto2;
    private javax.swing.JButton removeProducto3;
    private javax.swing.JButton removeProducto4;
    private javax.swing.JButton removeProducto5;
    private javax.swing.JButton removeProducto6;
    private javax.swing.JButton removeProducto7;
    private javax.swing.JButton removeProducto8;
    private javax.swing.JButton removeProducto9;
    private javax.swing.JTextField textFieldDirr1;
    private javax.swing.JTextField textFieldDirr2;
    private javax.swing.JTextField textFieldDirr3;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldNum;
    private javax.swing.JTextPane textPaneListaDePedidos;
    // End of variables declaration//GEN-END:variables
}
