package co.edu.upb.Vistas.Operador;

import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.Lista.Doble.LinkedList;
import co.edu.upb.Estructuras.Lista.Interface.NodeInterface;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VistaOperador extends javax.swing.JFrame {
    LinkedList<String> productos = new LinkedList<>();
    LinkedList<Product> menu = new LinkedList<>();
    ColaPrioridad<Order> colaDePedidos = new ColaPrioridad<>(2);
    Order pedidoActual;
    
    public VistaOperador(){
        pedidoActual = new Order();
        llenarMenu();
        
        //Interfaz grafica
        initComponents();
        //setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TabbebPaneMain = new javax.swing.JTabbedPane();
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
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        PanelListaPedidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneListaDePedidos = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 100, 20));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gobold Bold", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FoodUPB");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear pedido");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 70));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Operador");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, 70));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ver lista de pedidos");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoOperador.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 10, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 70));

        TabbebPaneMain.setPreferredSize(new java.awt.Dimension(100, 50));

        PanelNuevoPedido.setBackground(new java.awt.Color(245, 245, 245));
        PanelNuevoPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelVerPedidoActual.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel26.setText(" Pedido Completo:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttom (Custom).png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                .addGroup(PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextAreaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(81, 81, 81))))
                    .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelVerPedidoActualLayout.setVerticalGroup(
            PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(TextAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        PanelNuevoPedido.add(PanelVerPedidoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 240, 630));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nuevo Pedido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, -1, -1));

        PanelNuevoPedido.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 80));

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
        TextFieldBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldBuscadorMouseClicked(evt);
            }
        });
        AddProduct.add(TextFieldBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 110, 341, 41));

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Menú");
        AddProduct.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel22.setText("Hamburguesas");

        jSeparator4.setForeground(new java.awt.Color(187, 187, 187));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel24.setText("14.000$");

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel25.setText("Sencilla");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addComponent(jLabel23)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jButton2))
                .addContainerGap(386, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        AddProduct.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 950, 320));

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
        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });
        Fillinfo.add(textFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 41));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre completo");
        Fillinfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo de cliente");
        Fillinfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jComboBoxTipoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTipoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Premium", "Premium" }));
        jComboBoxTipoCliente.setToolTipText("");
        jComboBoxTipoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fillinfo.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, 40));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(135, 135, 135));
        jLabel16.setText("Datos de envío");
        Fillinfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Calle/Avenida/Carrera");
        Fillinfo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        textFieldDirr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDirr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDirr1ActionPerformed(evt);
            }
        });
        Fillinfo.add(textFieldDirr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 320, 41));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Información complementaria");
        Fillinfo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        textFieldDirr3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDirr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDirr3ActionPerformed(evt);
            }
        });
        Fillinfo.add(textFieldDirr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 320, 41));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Barrio");
        Fillinfo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        textFieldDirr2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDirr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDirr2ActionPerformed(evt);
            }
        });
        Fillinfo.add(textFieldDirr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 320, 41));

        jTabbedPane2.addTab("Llenar informacion", Fillinfo);

        PanelNuevoPedido.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 960, 590));

        TabbebPaneMain.addTab("Crear Pedido", PanelNuevoPedido);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
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
                .addContainerGap(99, Short.MAX_VALUE))
        );

        TabbebPaneMain.addTab("Ver Lista de pedidos", PanelListaPedidos);

        jPanel1.add(TabbebPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1180, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void textFieldNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumActionPerformed

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameActionPerformed

    private void textFieldDirr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDirr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDirr1ActionPerformed

    private void textFieldDirr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDirr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDirr3ActionPerformed

    private void textFieldDirr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDirr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDirr2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        TabbebPaneMain.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        TabbebPaneMain.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Product prodcuto = buscarProducto("001");
        pedidoActual.addProducto(prodcuto);
        
        TextAreaCarritoCompras.setText(pedidoActual.listaProductos.listToString());
        TextAreaTotal.setText("Productos: " + pedidoActual.listaProductos.size() + 
                "\nTotal: " + pedidoActual.getTotalCompra());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextFieldBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldBuscadorMouseClicked
        TextFieldBuscador.setText("");
    }//GEN-LAST:event_TextFieldBuscadorMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        confirmarPedido();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            if (textFieldName.getText().isEmpty()){
                validate = false;
                camposInvalidos += "Nombre completo.\n";
            }
            if (textFieldDirr1.getText().isEmpty()){
                validate = false;
                camposInvalidos += "Calle/Avenida/Carrera.\n";
            }
            if (textFieldDirr3.getText().isEmpty()){
                validate = false;
                camposInvalidos += "Barrio.\n";
            }
        }
        
        if (!validate){
            JOptionPane.showMessageDialog(null, camposInvalidos, "Campos invalidos", JOptionPane.INFORMATION_MESSAGE);
        }
        return validate;
    }
    
    private void confirmarPedido(){
        if (verificarPedido()){
            Icon icono = new ImageIcon(getClass().getResource("/co/edu/upb/Iconos/IconoFactura.png"));
            JOptionPane.showMessageDialog(null, "Imprimir recibo", "Recibo", JOptionPane.PLAIN_MESSAGE, icono);
            guardarDatosPedido();
            colaDePedidos.add(pedidoActual, pedidoActual.tipoCliente);
            
            textPaneListaDePedidos.setText(colaDePedidos.toString());
            System.out.println("Pedido: " + pedidoActual.toString());
            System.out.println(colaDePedidos.toString());
            
            reiniciarPedido();
            
        }
        
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
        Product producto = new Product("Hamburgesa sencilla", "001", 15000, 1, "Descripcion");
        menu.add(producto);
        
        //Leer json y agregar productos en la lista
        
        
    }
    
    private Product buscarProducto(String id){
        Iterator<NodeInterface<Product>> iterator = menu.iterator();
        Product temp;
        while (iterator.hasNext()){
            temp = iterator.next().getObject();
            if (temp.id == id){
                return temp;
            }
        }
        return null;
    }
    
    private void guardarDatosPedido(){
        pedidoActual.nombres = textFieldName.getText();
        pedidoActual.direccion = textFieldDirr1.getText();
        pedidoActual.direccion += textFieldDirr2.getText();
        pedidoActual.direccion += textFieldDirr3.getText();
        pedidoActual.tipoCliente = jComboBoxTipoCliente.getSelectedIndex();
        
    }
    
    public void buscarProductosHamming(){
        
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddProduct;
    private javax.swing.JPanel Fillinfo;
    private javax.swing.JPanel PanelListaPedidos;
    private javax.swing.JPanel PanelNuevoPedido;
    private javax.swing.JPanel PanelVerPedidoActual;
    private javax.swing.JTabbedPane TabbebPaneMain;
    private javax.swing.JTextArea TextAreaCarritoCompras;
    private javax.swing.JTextArea TextAreaTotal;
    private javax.swing.JTextField TextFieldBuscador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField textFieldDirr1;
    private javax.swing.JTextField textFieldDirr2;
    private javax.swing.JTextField textFieldDirr3;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldNum;
    private javax.swing.JTextPane textPaneListaDePedidos;
    // End of variables declaration//GEN-END:variables
}
