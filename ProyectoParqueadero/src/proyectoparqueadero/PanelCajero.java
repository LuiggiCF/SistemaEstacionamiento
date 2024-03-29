
package proyectoparqueadero;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiggi
 */
public class PanelCajero extends javax.swing.JPanel {
    //int monedaValor[], monedaCantidad[];
    /**
     * Creates new form PanelCajero
     */
    public PanelCajero() {
        initComponents();
       //int monedaValor[], monedaCantidad[];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaPagar = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaResultados = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaMoneda1 = new javax.swing.JTextField();
        cajaMoneda2 = new javax.swing.JTextField();
        cajaMoneda3 = new javax.swing.JTextField();
        cajaMoneda4 = new javax.swing.JTextField();
        cajaMoneda5 = new javax.swing.JTextField();
        cajaMoneda6 = new javax.swing.JTextField();
        cajaCant1 = new javax.swing.JTextField();
        cajaCant2 = new javax.swing.JTextField();
        cajaCant3 = new javax.swing.JTextField();
        CajaCant4 = new javax.swing.JTextField();
        cajaCant5 = new javax.swing.JTextField();
        cajaCant6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaEntrante = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 99, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atm.png"))); // NOI18N
        jLabel1.setText("Cajero");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 99, 71));
        jLabel2.setText("Monto a pagar:");

        cajaPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        btnEnviar.setBackground(new java.awt.Color(255, 99, 71));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setOpaque(true);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        cajaResultados.setEditable(false);
        cajaResultados.setColumns(20);
        cajaResultados.setRows(5);
        jScrollPane1.setViewportView(cajaResultados);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 99, 71));
        jLabel4.setText("Valor(S/)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 99, 71));
        jLabel5.setText("Cantidad");

        cajaMoneda1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMoneda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        cajaMoneda2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMoneda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        cajaMoneda3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMoneda3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        cajaMoneda4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMoneda4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        cajaMoneda5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMoneda5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        cajaMoneda6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMoneda6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        cajaCant1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCant1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cajaCant2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCant2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cajaCant3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCant3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CajaCant4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaCant4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cajaCant5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCant5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cajaCant6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCant6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 99, 71));
        jLabel6.setText("Monto Entrante:");

        cajaEntrante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        cajaEntrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEntranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(cajaEntrante, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cajaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addComponent(btnEnviar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cajaMoneda5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cajaMoneda4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cajaMoneda3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cajaMoneda2)
                                .addComponent(cajaMoneda6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajaMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaCant1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCant2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCant3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaCant4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCant5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCant6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(cajaCant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaCant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaCant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CajaCant4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaCant5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaCant6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cajaMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaMoneda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaMoneda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaMoneda5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaMoneda6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnEnviar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cajaEntrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(cajaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        int monedaValor[] = {0,0,0,0,0,0}, monedaCantidad[] = {0,0,0,0,0,0};         
        int vuelto = Integer.parseInt(cajaEntrante.getText()) - Integer.parseInt(cajaPagar.getText());
        
        if (cajaPagar.getText().isEmpty() || cajaEntrante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Ingrese valor","NOTA",JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
            try {
                vuelto = Integer.parseInt(cajaEntrante.getText()) - Integer.parseInt(cajaPagar.getText());
              
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"Solo números","ERROR",JOptionPane.ERROR_MESSAGE );
            }
            try {
                monedaValor[0] = Integer.parseInt(cajaMoneda1.getText());
                monedaValor[1] = Integer.parseInt(cajaMoneda2.getText());
                monedaValor[2] = Integer.parseInt(cajaMoneda3.getText());
                monedaValor[3] = Integer.parseInt(cajaMoneda4.getText());
                monedaValor[4] = Integer.parseInt(cajaMoneda5.getText());
                monedaValor[5] = Integer.parseInt(cajaMoneda6.getText());
                
                monedaCantidad[0] = Integer.parseInt(cajaCant1.getText());
                monedaCantidad[1] = Integer.parseInt(cajaCant2.getText());
                monedaCantidad[2] = Integer.parseInt(cajaCant3.getText());
                monedaCantidad[3] = Integer.parseInt(CajaCant4.getText());
                monedaCantidad[4] = Integer.parseInt(cajaCant5.getText());
                monedaCantidad[5] = Integer.parseInt(cajaCant6.getText());
                
                Solucion sol = new Solucion();
                cajaResultados.setText(sol.Solucion(vuelto,monedaValor, monedaCantidad));
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"Valores inválidos","Error",JOptionPane.ERROR);
            }
 
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void cajaEntranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEntranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEntranteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaCant4;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextField cajaCant1;
    private javax.swing.JTextField cajaCant2;
    private javax.swing.JTextField cajaCant3;
    private javax.swing.JTextField cajaCant5;
    private javax.swing.JTextField cajaCant6;
    private javax.swing.JTextField cajaEntrante;
    private javax.swing.JTextField cajaMoneda1;
    private javax.swing.JTextField cajaMoneda2;
    private javax.swing.JTextField cajaMoneda3;
    private javax.swing.JTextField cajaMoneda4;
    private javax.swing.JTextField cajaMoneda5;
    private javax.swing.JTextField cajaMoneda6;
    private javax.swing.JTextField cajaPagar;
    private javax.swing.JTextArea cajaResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
