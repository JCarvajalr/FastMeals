package co.edu.upb.Vistas.Cocina;

import co.edu.upb.Clases.Order;
import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Clases.Product;
import java.awt.Color;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaCocina extends javax.swing.JFrame {
    ServiceCocina service;
    Fogon[] fogones = new Fogon[16];
    ColaPrioridad<Product> colaProductosRapidos = new ColaPrioridad<>(2);
    ColaPrioridad<Product> colaProductosLentos = new ColaPrioridad<>(2);
    
    public VistaCocina(ServiceCocina service) {
        this.service = service;
        initComponents();
        iniciarFogones();
        setTitle("Modulo - Cocina");
        setLocationRelativeTo(null);
    }
    
    public VistaCocina() {
        initComponents();
        iniciarFogones();
        setTitle("Modulo - Cocina");
        setLocationRelativeTo(null);
    }
    
    Font fontOn = new java.awt.Font("Segoe UI", 1, 16);
    Font fontOff = new java.awt.Font("Segoe UI", 2, 16);
    
    //Procesos
    public void tomarPedido(){
        Product temp;
        //Fogones lentos
        if (fogonesLentosDisp() && colaProductosLentos.isEmpty()){
            temp = colaProductosLentos.extraer();
            for (int i=0; i<fogones.length; i++){
                if ((fogones[i].getTipoCoccion() == 1) && (!fogones[i].isOn())){
                    //fogones[i].turnOn(temp);
                    
                    ImagenFogon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // 

                    fogones[i].CheckFogon.setVisible(true);
                    fogones[i].ImagenFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoEncendido.png")));
                    fogones[i].LabelFg.setText("Prueba Hamburguesa");
                    //fogones[i].LabelFg.setText(temp.getNombre());
                    fogones[i].LabelFg.setForeground(java.awt.SystemColor.infoText);
                    fogones[i].LabelFg.setFont(fontOn);
                    break;
                }
            }
        //Fogones rapidos
        } else if (fogonesRapidosDisp() && !colaProductosRapidos.isEmpty()){  
            temp = colaProductosRapidos.extraer();
            for (int i=0; i<fogones.length; i++){
                if ((fogones[i].getTipoCoccion() == 0) && (!fogones[i].isOn())){
                    fogones[i].turnOn(temp);
                    fogones[i].CheckFogon.setVisible(true);
                    fogones[i].ImagenFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoEncendido.png")));
                    fogones[i].LabelFg.setText(temp.getNombre());
                    fogones[i].LabelFg.setForeground(java.awt.SystemColor.infoText);
                    fogones[i].LabelFg.setFont(fontOn);
                }
            }
        }    
    }
    
    public void verPedidos(){
        try {
            Order newOrder = service.getOrder();
            
            if (newOrder != null){                
                
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(VistaCocina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean fogonesLentosDisp(){
        if (!fogones[3].isOn() || !fogones[7].isOn() || !fogones[11].isOn() || !fogones[15].isOn()){
            return true;
        }
        return false;
    }
    
    public boolean fogonesRapidosDisp(){
        if (!fogones[0].isOn() || !fogones[1].isOn() || !fogones[2].isOn() || !fogones[4].isOn() || !fogones[5].isOn() || !fogones[6].isOn() || !fogones[8].isOn() ||
                !fogones[9].isOn() || !fogones[10].isOn() || !fogones[12].isOn() || !fogones[13].isOn() || !fogones[14].isOn()){
            return true;
        }
        return false;
    }
    
    private void iniciarFogones(){
        fogones[0] = new Fogon(0);
        fogones[0].CheckFogon = CheckFogon1;
        fogones[0].ImagenFogon = ImagenFogon1;
        fogones[0].LabelFg = LabelFg1;
        
        fogones[1] = new Fogon(0);
        fogones[1].CheckFogon = CheckFogon2;
        fogones[1].ImagenFogon = ImagenFogon2;
        fogones[1].LabelFg = LabelFg2;
        
        fogones[2] = new Fogon(0);
        fogones[2].CheckFogon = CheckFogon3;
        fogones[2].ImagenFogon = ImagenFogon3;
        fogones[2].LabelFg = LabelFg3;
        
        fogones[3] = new Fogon(1);
        fogones[3].CheckFogon = CheckFogon4;
        fogones[3].ImagenFogon = ImagenFogon4;
        fogones[3].LabelFg = LabelFg4;
        
        fogones[4] = new Fogon(0);
        fogones[4].CheckFogon = CheckFogon5;
        fogones[4].ImagenFogon = ImagenFogon5;
        fogones[4].LabelFg = LabelFg5;
        
        fogones[5] = new Fogon(0);
        fogones[5].CheckFogon = CheckFogon6;
        fogones[5].ImagenFogon = ImagenFogon6;
        fogones[5].LabelFg = LabelFg6;
        
        fogones[6] = new Fogon(0);
        fogones[6].CheckFogon = CheckFogon7;
        fogones[6].ImagenFogon = ImagenFogon7;
        fogones[6].LabelFg = LabelFg7;
                
        fogones[7] = new Fogon(1);
        fogones[7].CheckFogon = CheckFogon8;
        fogones[7].ImagenFogon = ImagenFogon8;
        fogones[7].LabelFg = LabelFg8;
        
        fogones[8] = new Fogon(0);
        fogones[8].CheckFogon = CheckFogon9;
        fogones[8].ImagenFogon = ImagenFogon9;
        fogones[8].LabelFg = LabelFg9;
        
        fogones[9] = new Fogon(0);
        fogones[9].CheckFogon = CheckFogon10;
        fogones[9].ImagenFogon = ImagenFogon10;
        fogones[9].LabelFg = LabelFg10;
        
        fogones[10] = new Fogon(0);
        fogones[10].CheckFogon = CheckFogon11;
        fogones[10].ImagenFogon = ImagenFogon11;
        fogones[10].LabelFg = LabelFg11;
        
        fogones[11] = new Fogon(1);
        fogones[11].CheckFogon = CheckFogon12;
        fogones[11].ImagenFogon = ImagenFogon12;
        fogones[11].LabelFg = LabelFg12;
        
        fogones[12] = new Fogon(0);
        fogones[12].CheckFogon = CheckFogon13;
        fogones[12].ImagenFogon = ImagenFogon13;
        fogones[12].LabelFg = LabelFg13;
        
        fogones[13] = new Fogon(0);
        fogones[13].CheckFogon = CheckFogon14;
        fogones[13].ImagenFogon = ImagenFogon14;
        fogones[13].LabelFg = LabelFg14;
        
        fogones[14] = new Fogon(0);
        fogones[14].CheckFogon = CheckFogon15;
        fogones[14].ImagenFogon = ImagenFogon15;
        fogones[14].LabelFg = LabelFg15;
        
        fogones[15] = new Fogon(1);
        fogones[15].CheckFogon = CheckFogon16;
        fogones[15].ImagenFogon = ImagenFogon16;
        fogones[15].LabelFg = LabelFg16;
        for (int i=0; i<fogones.length; i++){
            fogones[i].CheckFogon.setVisible(false);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    //
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        ImagenFogon9 = new javax.swing.JLabel();
        CheckFogon9 = new javax.swing.JLabel();
        LabelFg9 = new javax.swing.JLabel();
        ImagenFogon10 = new javax.swing.JLabel();
        LabelFg10 = new javax.swing.JLabel();
        CheckFogon10 = new javax.swing.JLabel();
        ImagenFogon12 = new javax.swing.JLabel();
        CheckFogon12 = new javax.swing.JLabel();
        LabelFg12 = new javax.swing.JLabel();
        ImagenFogon11 = new javax.swing.JLabel();
        LabelFg11 = new javax.swing.JLabel();
        CheckFogon11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ImagenFogon1 = new javax.swing.JLabel();
        CheckFogon1 = new javax.swing.JLabel();
        LabelFg1 = new javax.swing.JLabel();
        ImagenFogon2 = new javax.swing.JLabel();
        LabelFg2 = new javax.swing.JLabel();
        CheckFogon2 = new javax.swing.JLabel();
        ImagenFogon4 = new javax.swing.JLabel();
        CheckFogon4 = new javax.swing.JLabel();
        LabelFg4 = new javax.swing.JLabel();
        ImagenFogon3 = new javax.swing.JLabel();
        LabelFg3 = new javax.swing.JLabel();
        CheckFogon3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        ImagenFogon5 = new javax.swing.JLabel();
        CheckFogon5 = new javax.swing.JLabel();
        LabelFg5 = new javax.swing.JLabel();
        ImagenFogon6 = new javax.swing.JLabel();
        LabelFg6 = new javax.swing.JLabel();
        CheckFogon6 = new javax.swing.JLabel();
        ImagenFogon8 = new javax.swing.JLabel();
        CheckFogon8 = new javax.swing.JLabel();
        LabelFg8 = new javax.swing.JLabel();
        ImagenFogon7 = new javax.swing.JLabel();
        LabelFg7 = new javax.swing.JLabel();
        CheckFogon7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        ImagenFogon13 = new javax.swing.JLabel();
        CheckFogon13 = new javax.swing.JLabel();
        LabelFg13 = new javax.swing.JLabel();
        ImagenFogon14 = new javax.swing.JLabel();
        LabelFg14 = new javax.swing.JLabel();
        CheckFogon14 = new javax.swing.JLabel();
        ImagenFogon16 = new javax.swing.JLabel();
        CheckFogon16 = new javax.swing.JLabel();
        LabelFg16 = new javax.swing.JLabel();
        ImagenFogon15 = new javax.swing.JLabel();
        LabelFg15 = new javax.swing.JLabel();
        CheckFogon15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setForeground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 100, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(1475, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/Button.png"))); // NOI18N
        jButton1.setText("Tomar producto");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttoms/ButtonSelected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Productos en proceso:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 310, 790));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenFogon9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(ImagenFogon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 150, -1));

        CheckFogon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon9MouseClicked(evt);
            }
        });
        jPanel10.add(CheckFogon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 25, -1, -1));

        LabelFg9.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg9.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg9.setText("Apagado");
        LabelFg9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(LabelFg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 143, 170, -1));

        ImagenFogon10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(ImagenFogon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 17, 150, -1));

        LabelFg10.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg10.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg10.setText("Apagado");
        LabelFg10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(LabelFg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 143, 170, -1));

        CheckFogon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon10MouseClicked(evt);
            }
        });
        jPanel10.add(CheckFogon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 25, -1, -1));

        ImagenFogon12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(ImagenFogon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 183, 150, -1));

        CheckFogon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon12MouseClicked(evt);
            }
        });
        jPanel10.add(CheckFogon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 191, -1, -1));

        LabelFg12.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg12.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg12.setText("Apagado");
        LabelFg12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(LabelFg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 309, 170, -1));

        ImagenFogon11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(ImagenFogon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 183, 150, -1));

        LabelFg11.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg11.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg11.setText("Apagado");
        LabelFg11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(LabelFg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 309, 170, -1));

        CheckFogon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon11MouseClicked(evt);
            }
        });
        jPanel10.add(CheckFogon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 191, -1, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 590, 340));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenFogon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(ImagenFogon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 150, -1));

        CheckFogon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon1MouseClicked(evt);
            }
        });
        jPanel12.add(CheckFogon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 25, -1, -1));

        LabelFg1.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg1.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg1.setText("Apagado");
        LabelFg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(LabelFg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 143, 170, -1));

        ImagenFogon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(ImagenFogon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 17, 150, -1));

        LabelFg2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg2.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg2.setText("Apagado");
        LabelFg2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(LabelFg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 143, 170, -1));

        CheckFogon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon2MouseClicked(evt);
            }
        });
        jPanel12.add(CheckFogon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 25, -1, -1));

        ImagenFogon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(ImagenFogon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 183, 150, -1));

        CheckFogon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon4MouseClicked(evt);
            }
        });
        jPanel12.add(CheckFogon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 191, -1, -1));

        LabelFg4.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg4.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg4.setText("Apagado");
        LabelFg4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(LabelFg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 309, 170, -1));

        ImagenFogon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(ImagenFogon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 183, 150, -1));

        LabelFg3.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg3.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg3.setText("Apagado");
        LabelFg3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(LabelFg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 309, 170, -1));

        CheckFogon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon3MouseClicked(evt);
            }
        });
        jPanel12.add(CheckFogon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 191, -1, -1));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 590, 340));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenFogon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel13.add(ImagenFogon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 150, -1));

        CheckFogon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon5MouseClicked(evt);
            }
        });
        jPanel13.add(CheckFogon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 25, -1, -1));

        LabelFg5.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg5.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg5.setText("Apagado");
        LabelFg5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel13.add(LabelFg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 143, 170, -1));

        ImagenFogon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel13.add(ImagenFogon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 17, 150, -1));

        LabelFg6.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg6.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg6.setText("Apagado");
        LabelFg6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel13.add(LabelFg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 143, 170, -1));

        CheckFogon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon6MouseClicked(evt);
            }
        });
        jPanel13.add(CheckFogon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 25, -1, -1));

        ImagenFogon8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel13.add(ImagenFogon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 183, 150, -1));

        CheckFogon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon8MouseClicked(evt);
            }
        });
        jPanel13.add(CheckFogon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 191, -1, -1));

        LabelFg8.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg8.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg8.setText("Apagado");
        LabelFg8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel13.add(LabelFg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 309, 170, -1));

        ImagenFogon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel13.add(ImagenFogon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 183, 150, -1));

        LabelFg7.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg7.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg7.setText("Apagado");
        LabelFg7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel13.add(LabelFg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 309, 170, -1));

        CheckFogon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon7MouseClicked(evt);
            }
        });
        jPanel13.add(CheckFogon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 191, -1, -1));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 590, 340));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenFogon13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(ImagenFogon13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 150, -1));

        CheckFogon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon13MouseClicked(evt);
            }
        });
        jPanel14.add(CheckFogon13, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 25, -1, -1));

        LabelFg13.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg13.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg13.setText("Apagado");
        LabelFg13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel14.add(LabelFg13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 143, 170, -1));

        ImagenFogon14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(ImagenFogon14, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 17, 150, -1));

        LabelFg14.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg14.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg14.setText("Apagado");
        LabelFg14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel14.add(LabelFg14, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 143, 170, -1));

        CheckFogon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon14MouseClicked(evt);
            }
        });
        jPanel14.add(CheckFogon14, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 25, -1, -1));

        ImagenFogon16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(ImagenFogon16, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 183, 150, -1));

        CheckFogon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon16MouseClicked(evt);
            }
        });
        jPanel14.add(CheckFogon16, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 191, -1, -1));

        LabelFg16.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg16.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg16.setText("Apagado");
        LabelFg16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel14.add(LabelFg16, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 309, 170, -1));

        ImagenFogon15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(ImagenFogon15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 183, 150, -1));

        LabelFg15.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        LabelFg15.setForeground(java.awt.SystemColor.textInactiveText);
        LabelFg15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg15.setText("Apagado");
        LabelFg15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel14.add(LabelFg15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 309, 170, -1));

        CheckFogon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N
        CheckFogon15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckFogon15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckFogon15MouseClicked(evt);
            }
        });
        jPanel14.add(CheckFogon15, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 191, -1, -1));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 590, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tomarPedido();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void CheckFogon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon1MouseClicked
        turnOff(0);
    }//GEN-LAST:event_CheckFogon1MouseClicked
    private void CheckFogon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon2MouseClicked
        turnOff(1);
    }//GEN-LAST:event_CheckFogon2MouseClicked
    private void CheckFogon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon3MouseClicked
        turnOff(2);
    }//GEN-LAST:event_CheckFogon3MouseClicked
    private void CheckFogon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon4MouseClicked
        turnOff(3);
    }//GEN-LAST:event_CheckFogon4MouseClicked
    private void CheckFogon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon5MouseClicked
        turnOff(4);
    }//GEN-LAST:event_CheckFogon5MouseClicked
    private void CheckFogon6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon6MouseClicked
        turnOff(5);
    }//GEN-LAST:event_CheckFogon6MouseClicked
    private void CheckFogon8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon8MouseClicked
        turnOff(7);
    }//GEN-LAST:event_CheckFogon8MouseClicked
    private void CheckFogon9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon9MouseClicked
        turnOff(8);
    }//GEN-LAST:event_CheckFogon9MouseClicked
    private void CheckFogon10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon10MouseClicked
        turnOff(9);
    }//GEN-LAST:event_CheckFogon10MouseClicked
    private void CheckFogon11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon11MouseClicked
        turnOff(10);
    }//GEN-LAST:event_CheckFogon11MouseClicked
    private void CheckFogon12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon12MouseClicked
        turnOff(11);
    }//GEN-LAST:event_CheckFogon12MouseClicked
    private void CheckFogon13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon13MouseClicked
        turnOff(12);
    }//GEN-LAST:event_CheckFogon13MouseClicked
    private void CheckFogon14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon14MouseClicked
        turnOff(13);
    }//GEN-LAST:event_CheckFogon14MouseClicked
    private void CheckFogon15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon15MouseClicked
        turnOff(14);
    }//GEN-LAST:event_CheckFogon15MouseClicked
    private void CheckFogon16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon16MouseClicked
        turnOff(15);
    }//GEN-LAST:event_CheckFogon16MouseClicked
    private void CheckFogon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckFogon7MouseClicked
        turnOff(6);
    }//GEN-LAST:event_CheckFogon7MouseClicked

    private void turnOff(int i){
        fogones[i].endCooking();
        fogones[i].CheckFogon.setVisible(false);
        if (fogones[i].getTipoCoccion() == 0){
            fogones[i].ImagenFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png")));
        }else{
            fogones[i].ImagenFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png")));
        }
        fogones[i].LabelFg.setText("Apagado");
        fogones[i].LabelFg.setForeground(java.awt.SystemColor.textInactiveText);
        fogones[i].LabelFg.setFont(fontOff);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckFogon1;
    private javax.swing.JLabel CheckFogon10;
    private javax.swing.JLabel CheckFogon11;
    private javax.swing.JLabel CheckFogon12;
    private javax.swing.JLabel CheckFogon13;
    private javax.swing.JLabel CheckFogon14;
    private javax.swing.JLabel CheckFogon15;
    private javax.swing.JLabel CheckFogon16;
    private javax.swing.JLabel CheckFogon2;
    private javax.swing.JLabel CheckFogon3;
    private javax.swing.JLabel CheckFogon4;
    private javax.swing.JLabel CheckFogon5;
    private javax.swing.JLabel CheckFogon6;
    private javax.swing.JLabel CheckFogon7;
    private javax.swing.JLabel CheckFogon8;
    private javax.swing.JLabel CheckFogon9;
    private javax.swing.JLabel ImagenFogon1;
    private javax.swing.JLabel ImagenFogon10;
    private javax.swing.JLabel ImagenFogon11;
    private javax.swing.JLabel ImagenFogon12;
    private javax.swing.JLabel ImagenFogon13;
    private javax.swing.JLabel ImagenFogon14;
    private javax.swing.JLabel ImagenFogon15;
    private javax.swing.JLabel ImagenFogon16;
    private javax.swing.JLabel ImagenFogon2;
    private javax.swing.JLabel ImagenFogon3;
    private javax.swing.JLabel ImagenFogon4;
    private javax.swing.JLabel ImagenFogon5;
    private javax.swing.JLabel ImagenFogon6;
    private javax.swing.JLabel ImagenFogon7;
    private javax.swing.JLabel ImagenFogon8;
    private javax.swing.JLabel ImagenFogon9;
    private javax.swing.JLabel LabelFg1;
    private javax.swing.JLabel LabelFg10;
    private javax.swing.JLabel LabelFg11;
    private javax.swing.JLabel LabelFg12;
    private javax.swing.JLabel LabelFg13;
    private javax.swing.JLabel LabelFg14;
    private javax.swing.JLabel LabelFg15;
    private javax.swing.JLabel LabelFg16;
    private javax.swing.JLabel LabelFg2;
    private javax.swing.JLabel LabelFg3;
    private javax.swing.JLabel LabelFg4;
    private javax.swing.JLabel LabelFg5;
    private javax.swing.JLabel LabelFg6;
    private javax.swing.JLabel LabelFg7;
    private javax.swing.JLabel LabelFg8;
    private javax.swing.JLabel LabelFg9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
}
