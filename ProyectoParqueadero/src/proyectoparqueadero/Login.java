/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;

/**
 *
 * @author Luiggi
 */
import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    static Empresa  miEmpresa;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
    }

    public void OpenInternet(){
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaUsuarioLog = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cajaCodigoLogin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLoguear = new javax.swing.JButton();
        jlblInternet = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cajaBuscar = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cajaEliminar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jplRegistro = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cajaNumero = new javax.swing.JTextField();
        cajaContrasenia = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Contraseña: ");
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 30));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Usuario: ");
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 110));

        cajaUsuarioLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaUsuarioLog.setForeground(new java.awt.Color(153, 153, 153));
        cajaUsuarioLog.setText("Ingrese Usuario");
        cajaUsuarioLog.setBorder(null);
        jpIngreso.add(cajaUsuarioLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 10));

        cajaCodigoLogin.setForeground(new java.awt.Color(153, 153, 153));
        cajaCodigoLogin.setText("jPasswordField1");
        cajaCodigoLogin.setBorder(null);
        jpIngreso.add(cajaCodigoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 260, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_customer_32px_1.png"))); // NOI18N
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Key_32px.png"))); // NOI18N
        jpIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Menu_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        btnLoguear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_OFF.png"))); // NOI18N
        btnLoguear.setBorder(null);
        btnLoguear.setBorderPainted(false);
        btnLoguear.setContentAreaFilled(false);
        btnLoguear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoguear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnLoguear.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnLoguear.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnLoguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoguearActionPerformed(evt);
            }
        });
        jpIngreso.add(btnLoguear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 100, 40));

        jlblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Globe_32px.png"))); // NOI18N
        jlblInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblInternetMouseClicked(evt);
            }
        });
        jpIngreso.add(jlblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 40, 40));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Handshake_96px.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 140, 140));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Maintenance_96px.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 140, 150));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Clock_96px.png"))); // NOI18N
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 140, 140));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Today_96px.png"))); // NOI18N
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 150, 140));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Idea_96px.png"))); // NOI18N
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 140, 150));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Google_Drive_96px.png"))); // NOI18N
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 140, 150));

        jLabel13.setBackground(new java.awt.Color(255, 99, 71));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 99, 71));
        jLabel13.setText("Socios");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 99, 71));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 99, 71));
        jLabel14.setText("Calendario");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 99, 71));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 99, 71));
        jLabel15.setText("Ajustes");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 99, 71));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 99, 71));
        jLabel16.setText("Horarios");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 99, 71));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 99, 71));
        jLabel17.setText("Novedad");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 99, 71));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 99, 71));
        jLabel18.setText("Drive");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Search_32px_2.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 30, 30));

        cajaBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cajaBuscar.setForeground(new java.awt.Color(204, 204, 204));
        cajaBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaBuscar.setText("Buscar Código");
        cajaBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jPanel3.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 130, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rubbish-bin-delete-button.png"))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        cajaEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cajaEliminar.setForeground(new java.awt.Color(204, 204, 204));
        cajaEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaEliminar.setText("Eliminar");
        cajaEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jPanel3.add(cajaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 110, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 99, 71));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setOpaque(true);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 99, 71));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setOpaque(true);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 30));

        jPanel1.add(jPanel3, "card2");

        jplRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jplRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jplRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 99, 71));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clipboard-with-pencil-.png"))); // NOI18N
        jLabel21.setText("ÁREA DE REGISTRO");
        jplRegistro.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 230, 80));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 99, 71));
        jLabel23.setText("Nombre de Usuario:");
        jplRegistro.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 99, 71));
        jLabel24.setText("Contraseña:");
        jplRegistro.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 30));

        cajaNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        cajaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroActionPerformed(evt);
            }
        });
        jplRegistro.add(cajaNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, 30));

        cajaContrasenia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jplRegistro.add(cajaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 140, 30));

        btnRegistrar.setBackground(new java.awt.Color(255, 99, 71));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Enviar");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setOpaque(true);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jplRegistro.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 140, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 99, 71));
        jLabel22.setText("Número móvil: ");
        jplRegistro.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 110, 30));

        cajaNombre1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        cajaNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombre1ActionPerformed(evt);
            }
        });
        jplRegistro.add(cajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 210, 30));

        jPanel1.add(jplRegistro, "card3");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 30, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //Derecha
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jlblInternet);
        
        //Para la izq
        AnimationClass internett = new AnimationClass();
        internett.jLabelXLeft(10, -40, 10, 5, jlblInternet);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Está seguro de salir?", "Salida", dialogo);
        
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
       jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabel12MouseMoved

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
       jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jlblInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInternetMouseClicked
        OpenInternet();
    }//GEN-LAST:event_jlblInternetMouseClicked

    private void cajaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroActionPerformed

    private void cajaNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombre1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
       if(cajaContrasenia.getText().isEmpty() || cajaNombre1.getText().isEmpty() || cajaNumero.getText().isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "Ingrese Valores","Advertencia", JOptionPane.ERROR_MESSAGE);
       }else{
           String cod = cajaContrasenia.getText();
           String nombre = cajaNombre1.getText();
           float numero = Float.parseFloat(cajaNumero.getText());
       
       if(miEmpresa.Insertar(cod, nombre, numero))
           JOptionPane.showMessageDialog(rootPane, "Registrado con éxito","Área de Registro", JOptionPane.INFORMATION_MESSAGE);
       else
           JOptionPane.showMessageDialog(rootPane, "Tabla Hash Llena","Área de Registro", JOptionPane.INFORMATION_MESSAGE);
       } 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(cajaBuscar.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Ingrese Valores","Advertencia", JOptionPane.ERROR_MESSAGE);
        else{
        String b = cajaBuscar.getText();
        int rpt = miEmpresa.Buscar(b);
        if (rpt == -1) {
            JOptionPane.showMessageDialog(rootPane, "elemento NO encontrado!","Nota.",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
             JOptionPane.showMessageDialog(rootPane, "Se encuentra en la posición ("+(rpt+1)+")","Nota",JOptionPane.INFORMATION_MESSAGE);
         }
        }
        //cajaResultados.setText("");
        //cajaResultados.setText(mostrar());
        //cajaBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(cajaEliminar.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Ingrese Valores","Advertencia", JOptionPane.ERROR_MESSAGE);
        else{
            int sol = miEmpresa.eliminar(cajaEliminar.getText());
            if (sol == 1) {
                JOptionPane.showMessageDialog(rootPane, "Eliminado con éxito","Nota.",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "elemento NO encontrado!","Nota.",JOptionPane.INFORMATION_MESSAGE);}
            //cajaResultados.setText("");
            //cajaResultados.setText(mostrar());
            cajaEliminar.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLoguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoguearActionPerformed
        
        String pas = "";
        char[] p = cajaCodigoLogin.getPassword();
        for (int i = 0; i < p.length; i++) {
            pas +=p[i]; 
        }
        
        if(cajaUsuarioLog.getText().isEmpty()|| pas.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Ingrese Valores","Advertencia", JOptionPane.ERROR_MESSAGE);
        else{
        //String b = cajaCodigoLogin.getText();
        int rpt = miEmpresa.Buscar(pas);
        if (rpt == -1) {
            JOptionPane.showMessageDialog(rootPane, "elemento NO encontrado!","Nota.",JOptionPane.INFORMATION_MESSAGE);
            
//ABRIR REGISTRARSE****************************************************
            jPanel1.removeAll();
            jPanel1.add(jplRegistro);
            jPanel1.repaint();
            jPanel1.revalidate();
        }
        else{
             JOptionPane.showMessageDialog(rootPane, "Se encuentra en la posición ("+(rpt+1)+")","Nota",JOptionPane.INFORMATION_MESSAGE);
             
//ABRIR "PRINCIPAL"****************************************************
            
             Principal abrir = new Principal();
             abrir.setVisible(true);
             this.setVisible(false);
         }
        }
    }//GEN-LAST:event_btnLoguearActionPerformed

    
    public static void llenar(){
        miEmpresa = new Empresa();
        String codigo[] = {"11", "13", "14333", "admin", "16",
        "17", "18", "19", "20", "21"};
        
        String nombre[] = {"Juan Rosales", "Ana Ramirez", "Maria Trinidad",
        "admin", "Raul Gonzales", "Pedro Mamani",
        "Rosario Paredes", "Martha Huaman", "Saul Espino","Karen Mendiola"};
        
        float numero[] = {902415672, 923456180, 909845327, 908642690, 945316278, 962005101, 976543267, 976453260, 987650912, 965432180};
        boolean flag;
        for (int i = 0; i < codigo.length; i++) {
            flag = miEmpresa.Insertar(codigo[i], nombre[i], numero[i]);
            if(flag == false)
                JOptionPane.showMessageDialog(null, "Tabla Lena!","Nota",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLoguear;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JPasswordField cajaCodigoLogin;
    private javax.swing.JTextField cajaContrasenia;
    private javax.swing.JTextField cajaEliminar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNumero;
    private javax.swing.JTextField cajaUsuarioLog;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblInternet;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JPanel jplRegistro;
    // End of variables declaration//GEN-END:variables
}
