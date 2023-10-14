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
        jPanelUpBar = new javax.swing.JPanel();
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
        jPanel5 = new javax.swing.JPanel();
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
        jLabel34 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
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
        jLabel40 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
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
        PanelListaPedidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneListaDePedidos = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanelUpBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, 70));

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
        jPanelUpBar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelUpBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 10, 40));

        jPanel1.add(jPanelUpBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 70));

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
                .addGroup(PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                    .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerPedidoActualLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        PanelVerPedidoActualLayout.setVerticalGroup(
            PanelVerPedidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerPedidoActualLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        PanelNuevoPedido.add(PanelVerPedidoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 210, 800));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nuevo Pedido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, -1, -1));

        PanelNuevoPedido.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 80));

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
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 190));

        precioProducto1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto1.setText("14.000$");
        precioProducto1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 30));

        removeProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 25, 25));

        addProducto1.setBackground(new java.awt.Color(245, 245, 245));
        addProducto1.setForeground(new java.awt.Color(245, 245, 245));
        addProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 25, 25));

        descProducto1.setEditable(false);
        descProducto1.setBackground(new java.awt.Color(245, 245, 245));
        descProducto1.setColumns(20);
        descProducto1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto1.setLineWrap(true);
        descProducto1.setRows(5);
        descProducto1.setText("Carne a la parrilla, lechuga, tomate y salsa en un pan suave. \n(5 minutos)\n");
        descProducto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 70));

        nombreProducto1.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto1.setText("Hamburguesa Clásica");
        nombreProducto1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 30));

        nombreProducto3.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto3.setText("Tacos de Carne Asada");
        nombreProducto3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, -1, 30));

        removeProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 25, 25));

        addProducto3.setBackground(new java.awt.Color(245, 245, 245));
        addProducto3.setForeground(new java.awt.Color(245, 245, 245));
        addProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 25, 25));

        precioProducto3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto3.setText("12.000$");
        precioProducto3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, 30));

        descProducto3.setEditable(false);
        descProducto3.setBackground(new java.awt.Color(245, 245, 245));
        descProducto3.setColumns(20);
        descProducto3.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto3.setLineWrap(true);
        descProducto3.setRows(5);
        descProducto3.setText("2 porciones de tacos rellenos de carne asada, cebolla, cilantro y salsa. \n(5 minutos)\n");
        descProducto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 290, 70));

        nombreProducto4.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto4.setText("Hot Dog con Chili");
        nombreProducto4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, -1, 30));

        precioProducto4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto4.setText("10.000$");
        precioProducto4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 680, -1, 30));

        descProducto4.setEditable(false);
        descProducto4.setBackground(new java.awt.Color(245, 245, 245));
        descProducto4.setColumns(20);
        descProducto4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto4.setLineWrap(true);
        descProducto4.setRows(5);
        descProducto4.setText("Hot dog con salchicha, pan suave y chilicon carne, cebolla y queso. (5 minutos)\n");
        descProducto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 290, 60));

        nombreProducto5.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto5.setText("Burrito de Pollo");
        nombreProducto5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 650, -1, 30));

        precioProducto5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto5.setText("10.000$");
        precioProducto5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 680, -1, 30));

        descProducto5.setEditable(false);
        descProducto5.setBackground(new java.awt.Color(245, 245, 245));
        descProducto5.setColumns(20);
        descProducto5.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto5.setLineWrap(true);
        descProducto5.setRows(5);
        descProducto5.setText("Burrito relleno de pollo a la parrilla,    arroz, frijoles y salsa. (5 minutos)\n");
        descProducto5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 710, 290, 70));

        nombreProducto2.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto2.setText("Hamburguesa Especial");
        nombreProducto2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, 30));

        precioProducto2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto2.setText("18.000$");
        precioProducto2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, 30));

        descProducto2.setEditable(false);
        descProducto2.setBackground(new java.awt.Color(245, 245, 245));
        descProducto2.setColumns(20);
        descProducto2.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto2.setLineWrap(true);
        descProducto2.setRows(5);
        descProducto2.setText("Carne de res premium a la parrilla,    queso cheddar, cebolla caramelizada y lechuga en pan de brioche. \n(5 minutos)\n");
        descProducto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, 86));

        imagenProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 290, 190));

        addProducto2.setBackground(new java.awt.Color(245, 245, 245));
        addProducto2.setForeground(new java.awt.Color(245, 245, 245));
        addProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 25, 25));

        removeProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 25, 25));

        imagenProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 190));

        imagenProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 290, 190));

        addProducto4.setBackground(new java.awt.Color(245, 245, 245));
        addProducto4.setForeground(new java.awt.Color(245, 245, 245));
        addProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 25, 25));

        removeProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 25, 25));

        imagenProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 290, 190));

        addProducto5.setBackground(new java.awt.Color(245, 245, 245));
        addProducto5.setForeground(new java.awt.Color(245, 245, 245));
        addProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 450, 25, 25));

        removeProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 480, 25, 25));

        imagenProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 290, 190));

        nombreProducto6.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto6.setText("Sándwich BLT");
        nombreProducto6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1060, -1, 30));

        precioProducto6.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto6.setText("10.000$");
        precioProducto6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1090, -1, 30));

        descProducto6.setEditable(false);
        descProducto6.setBackground(new java.awt.Color(245, 245, 245));
        descProducto6.setColumns(20);
        descProducto6.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto6.setLineWrap(true);
        descProducto6.setRows(5);
        descProducto6.setText("Sándwich con tocino, lechuga y tomate en pan tostado. (5 minutos)\n");
        descProducto6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1120, 290, 70));

        addProducto6.setBackground(new java.awt.Color(245, 245, 245));
        addProducto6.setForeground(new java.awt.Color(245, 245, 245));
        addProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 860, 25, 25));

        removeProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 890, 25, 25));

        jLabel34.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel34.setText("Comida mexicana");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(187, 187, 187));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 740, 10));

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel22.setText("Hamburguesas");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(187, 187, 187));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 753, 10));

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
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        jLabel37.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel37.setText("Otros");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(187, 187, 187));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 840, 10));

        nombreProducto7.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto7.setText("Pizza de pepperoni");
        nombreProducto7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1060, -1, 30));

        imagenProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 860, 290, 190));

        addProducto7.setBackground(new java.awt.Color(245, 245, 245));
        addProducto7.setForeground(new java.awt.Color(245, 245, 245));
        addProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 860, 25, 25));

        removeProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 890, 25, 25));

        precioProducto7.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto7.setText("18.000$");
        precioProducto7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1090, -1, 30));

        descProducto7.setEditable(false);
        descProducto7.setBackground(new java.awt.Color(245, 245, 245));
        descProducto7.setColumns(20);
        descProducto7.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto7.setLineWrap(true);
        descProducto7.setRows(5);
        descProducto7.setText("Pizza con salsa de tomate, queso y\nrodajas de pepperoni. (10 minutos)\n");
        descProducto7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1120, 290, 70));

        imagenProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 860, 290, 190));

        addProducto8.setBackground(new java.awt.Color(245, 245, 245));
        addProducto8.setForeground(new java.awt.Color(245, 245, 245));
        addProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 860, 25, 25));

        removeProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 890, 25, 25));

        nombreProducto8.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto8.setText("Picada");
        nombreProducto8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1060, -1, 30));

        precioProducto8.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto8.setText("30.000$");
        precioProducto8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1090, -1, 30));

        descProducto8.setEditable(false);
        descProducto8.setBackground(new java.awt.Color(245, 245, 245));
        descProducto8.setColumns(20);
        descProducto8.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto8.setLineWrap(true);
        descProducto8.setRows(5);
        descProducto8.setText("Variedad de carnes y \nacompañamientos para 2 personas.\n(10 minutos)");
        descProducto8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1120, 290, 70));

        nombreProducto9.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto9.setText("Papas fritas");
        nombreProducto9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1450, -1, 30));

        precioProducto9.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto9.setText("6.000$");
        precioProducto9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1480, -1, 30));

        descProducto9.setEditable(false);
        descProducto9.setBackground(new java.awt.Color(245, 245, 245));
        descProducto9.setColumns(20);
        descProducto9.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto9.setLineWrap(true);
        descProducto9.setRows(5);
        descProducto9.setText("Porción de papas a la francesa. \n(5 minutos)\n");
        descProducto9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1510, 290, 70));

        imagenProducto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1250, 290, 190));

        addProducto9.setBackground(new java.awt.Color(245, 245, 245));
        addProducto9.setForeground(new java.awt.Color(245, 245, 245));
        addProducto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1250, 25, 25));

        removeProducto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1280, 25, 25));

        jLabel40.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel40.setText("Adicionales o entradas");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1210, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(187, 187, 187));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1220, 700, 10));

        imagenProducto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1250, 290, 190));

        addProducto10.setBackground(new java.awt.Color(245, 245, 245));
        addProducto10.setForeground(new java.awt.Color(245, 245, 245));
        addProducto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1250, 25, 25));

        removeProducto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1280, 25, 25));

        nombreProducto10.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto10.setText("Nuggets de Pollo");
        nombreProducto10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1450, -1, 30));

        precioProducto10.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto10.setText("7.000$");
        precioProducto10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1480, -1, 30));

        descProducto10.setEditable(false);
        descProducto10.setBackground(new java.awt.Color(245, 245, 245));
        descProducto10.setColumns(20);
        descProducto10.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto10.setLineWrap(true);
        descProducto10.setRows(5);
        descProducto10.setText("Trozos de pollo empanizado, ideales como aperitivo o complemento. \n(5 minutos)");
        descProducto10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1510, 290, 70));

        imagenProducto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Hamburguesa.png"))); // NOI18N
        jPanel5.add(imagenProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1250, 290, 190));

        addProducto11.setBackground(new java.awt.Color(245, 245, 245));
        addProducto11.setForeground(new java.awt.Color(245, 245, 245));
        addProducto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadir (Custom).png"))); // NOI18N
        addProducto11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProducto11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirPressed (Custom).png"))); // NOI18N
        addProducto11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonAñadirHover (Custom).png"))); // NOI18N
        jPanel5.add(addProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 1250, 25, 25));

        removeProducto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminar (Custom).png"))); // NOI18N
        removeProducto11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeProducto11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarPressed (Custom).png"))); // NOI18N
        removeProducto11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/BotonEliminarHover (Custom).png"))); // NOI18N
        jPanel5.add(removeProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 1280, 25, 25));

        nombreProducto11.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        nombreProducto11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreProducto11.setText("Aros de Cebolla");
        nombreProducto11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nombreProducto11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(nombreProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1450, -1, 30));

        precioProducto11.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        precioProducto11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioProducto11.setText("8.000$");
        precioProducto11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precioProducto11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(precioProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1480, -1, 30));

        descProducto11.setEditable(false);
        descProducto11.setBackground(new java.awt.Color(245, 245, 245));
        descProducto11.setColumns(20);
        descProducto11.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        descProducto11.setLineWrap(true);
        descProducto11.setRows(5);
        descProducto11.setText("Aros de cebolla crujientes, ideales como aperitivo o acompañamiento.\n(5 minutos)");
        descProducto11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(descProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1510, 290, 70));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1659, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel4);

        AddProduct.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1180, 540));

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

        PanelNuevoPedido.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 1190, 760));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
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

        TabbebPaneMain.addTab("Ver Lista de pedidos", PanelListaPedidos);

        jPanel1.add(TabbebPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1390, 830));

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
    
    private void agruparElementos(){
        
        
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelUpBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
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
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldNum;
    private javax.swing.JTextPane textPaneListaDePedidos;
    // End of variables declaration//GEN-END:variables
}
