package co.edu.upb.Cocina;

import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Cocina.Clases.Product;

public class VistaCocina extends javax.swing.JFrame {

    javax.swing.JLabel[] botonesListo = new javax.swing.JLabel[16];
    Fogon[] fogones = new Fogon[16];
    ColaPrioridad<Product> colaProductosRapidos = new ColaPrioridad<>(2);
    ColaPrioridad<Product> colaProductosLentos = new ColaPrioridad<>(2);
    
    public VistaCocina() {
        initComponents();
        iniciarFogones();
        setTitle("Modulo - Cocina");
        setLocationRelativeTo(null);
        
    }
    
    //Procesos
    public void tomarPedido(){
        Product temp;
        
        //Fogones lentos
        if (fogonesLentosDisp() && !colaProductosLentos.isEmpty()){
            temp = colaProductosLentos.extraer();
            
            for (int i=0; i<fogones.length; i++){
                if ((fogones[i].getTipoCoccion() == 1) && (!fogones[i].isOn())){
                    fogones[i].turnOn(temp);
                    fogones[i].CheckFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png")));
                    fogones[i].ImagenFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoEcendido.png")));
                    fogones[i].LabelFg.setText(temp.getNombre());
                    
                    botonesListo[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png")));
                }
            }
        //Fogones rapidos
        } else if (fogonesRapidosDisp() && !colaProductosRapidos.isEmpty()){  
            temp = colaProductosRapidos.extraer();
            
            for (int i=0; i<fogones.length; i++){
                if ((fogones[i].getTipoCoccion() == 0) && (!fogones[i].isOn())){
                    fogones[i].turnOn(temp);
                    fogones[i].CheckFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png")));
                    fogones[i].ImagenFogon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoEcendido.png")));
                    fogones[i].LabelFg.setText(temp.getNombre());
                    
                    botonesListo[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png")));
                }
            }
            
            
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
    }
    
    private void inciarBotonesListo(){
        
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
        jTextArea1.setText("//Lista de productos\nHamburguesa sencilla (F.1)\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/Buttom.png"))); // NOI18N
        jButton1.setText("Tomar producto");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        ImagenFogon9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg9.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg9.setText("Hamburguesa sencilla");
        LabelFg9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg10.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg10.setText("Hamburguesa sencilla");
        LabelFg10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        ImagenFogon12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg12.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg12.setText("Hamburguesa sencilla");
        LabelFg12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg11.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg11.setText("Hamburguesa sencilla");
        LabelFg11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ImagenFogon9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckFogon9))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ImagenFogon11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckFogon11))
                            .addComponent(LabelFg11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFg9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                            .addComponent(ImagenFogon12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                            .addComponent(LabelFg12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                            .addComponent(ImagenFogon10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                            .addComponent(LabelFg10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
                .addGap(31, 31, 31))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon9)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg9))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon10)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon12)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg12))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon11)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg11)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 590, 340));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        ImagenFogon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg1.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg1.setText("Hamburguesa sencilla");
        LabelFg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg2.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg2.setText("Hamburguesa sencilla");
        LabelFg2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        ImagenFogon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg4.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg4.setText("Hamburguesa sencilla");
        LabelFg4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg3.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg3.setText("Hamburguesa sencilla");
        LabelFg3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ImagenFogon1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckFogon1))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ImagenFogon3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckFogon3))
                            .addComponent(LabelFg3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFg1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(ImagenFogon4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(LabelFg4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(ImagenFogon2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(LabelFg2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
                .addGap(31, 31, 31))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon1)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg1))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon2)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon4)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg4))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon3)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg3)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        ImagenFogon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg5.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg5.setText("Hamburguesa sencilla");
        LabelFg5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg6.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg6.setText("Hamburguesa sencilla");
        LabelFg6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        ImagenFogon8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg8.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg8.setText("Hamburguesa sencilla");
        LabelFg8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg7.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg7.setText("Hamburguesa sencilla");
        LabelFg7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ImagenFogon5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckFogon5))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ImagenFogon7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckFogon7))
                            .addComponent(LabelFg7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFg5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(ImagenFogon8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(LabelFg8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(ImagenFogon6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(LabelFg6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
                .addGap(31, 31, 31))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon5)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg5))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon6)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon8)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg8))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon7)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg7)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, -1, -1));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        ImagenFogon13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg13.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg13.setText("Hamburguesa sencilla");
        LabelFg13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg14.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg14.setText("Hamburguesa sencilla");
        LabelFg14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        ImagenFogon16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonLentoApagado.png"))); // NOI18N
        ImagenFogon16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CheckFogon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        LabelFg16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg16.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg16.setText("Hamburguesa sencilla");
        LabelFg16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenFogon15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFogon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/FogonRapidoApagado.png"))); // NOI18N
        ImagenFogon15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabelFg15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelFg15.setForeground(new java.awt.Color(51, 51, 51));
        LabelFg15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFg15.setText("Hamburguesa sencilla");
        LabelFg15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CheckFogon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/upb/Iconos/DoneIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ImagenFogon13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckFogon13))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ImagenFogon15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckFogon15))
                            .addComponent(LabelFg15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFg13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addComponent(ImagenFogon16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addComponent(LabelFg16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addComponent(ImagenFogon14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CheckFogon14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addComponent(LabelFg14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
                .addGap(31, 31, 31))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon13)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg13))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon14)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg14)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon16)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg16))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenFogon15)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CheckFogon15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFg15)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, -1, -1));

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
