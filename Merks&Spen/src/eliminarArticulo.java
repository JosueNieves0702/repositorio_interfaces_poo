/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class eliminarArticulo extends javax.swing.JFrame {

    /**
     * Creates new form eliminarArticulo
     */
    public eliminarArticulo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresarId = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JLabel();
        btnEliminarArticulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ELIIMINAR ARTÍCULO");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtIngresarId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtIngresarId.setForeground(new java.awt.Color(153, 153, 153));
        txtIngresarId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIngresarId.setText("INGRESE ID");
        txtIngresarId.setBorder(null);
        txtIngresarId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIngresarId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIngresarIdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIngresarIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIngresarIdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIngresarIdMousePressed(evt);
            }
        });
        txtIngresarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarIdActionPerformed(evt);
            }
        });

        btnBuscarId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarId.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarId.setText("BUSCAR");
        btnBuscarId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarIdMouseExited(evt);
            }
        });

        btnEliminarArticulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminarArticulo.setForeground(new java.awt.Color(153, 153, 153));
        btnEliminarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarArticulo.setText("ELIMINAR");
        btnEliminarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarArticuloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarArticuloMouseExited(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarArticulo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIngresarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarId))
                    .addComponent(jLabel2))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId))
                .addGap(18, 18, 18)
                .addComponent(btnEliminarArticulo)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 220, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarIdMouseClicked

    private void txtIngresarIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarIdMouseEntered

    private void txtIngresarIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarIdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarIdMouseExited

    private void txtIngresarIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarIdMousePressed
        // TODO add your handling code here:
        String contra = new String(txtIngresarId.getText());
        if (contra.equals("INGRESE ID")) {
            txtIngresarId.setText(""); // Limpia solo si está el texto por defecto
        }
        txtIngresarId.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtIngresarIdMousePressed

    private void txtIngresarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarIdActionPerformed

    private void btnBuscarIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseEntered
        // TODO add your handling code here:
        btnBuscarId.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnBuscarIdMouseEntered

    private void btnBuscarIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseExited
        // TODO add your handling code here:
        btnBuscarId.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarIdMouseExited

    private void btnEliminarArticuloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarArticuloMouseEntered
        // TODO add your handling code here:
        btnEliminarArticulo.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnEliminarArticuloMouseEntered

    private void btnEliminarArticuloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarArticuloMouseExited
        // TODO add your handling code here:
        btnEliminarArticulo.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnEliminarArticuloMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(eliminarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarId;
    private javax.swing.JLabel btnEliminarArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIngresarId;
    // End of variables declaration//GEN-END:variables
}
