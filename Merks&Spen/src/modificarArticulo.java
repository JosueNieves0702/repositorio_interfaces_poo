/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class modificarArticulo extends javax.swing.JFrame {

    /**
     * Creates new form modificarArticulo
     */
    public modificarArticulo() {
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
        jLabel3 = new javax.swing.JLabel();
        txtNombreArticulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadArticulo = new javax.swing.JTextField();
        txtIngresarId = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JLabel();
        btnModificarArticulo = new javax.swing.JLabel();
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
        jLabel2.setText("MODIFICAR ARTÍCULO");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NOMBRE:");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNombreArticulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtNombreArticulo.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreArticulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreArticulo.setText("INGRESE NOMBRE");
        txtNombreArticulo.setBorder(null);
        txtNombreArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreArticuloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreArticuloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNombreArticuloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreArticuloMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("STOCK:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtCantidadArticulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtCantidadArticulo.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidadArticulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCantidadArticulo.setText("INGRESE CANTIDAD");
        txtCantidadArticulo.setBorder(null);
        txtCantidadArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidadArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadArticuloMousePressed(evt);
            }
        });
        txtCantidadArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadArticuloActionPerformed(evt);
            }
        });

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

        btnModificarArticulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnModificarArticulo.setForeground(new java.awt.Color(153, 153, 153));
        btnModificarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarArticulo.setText("MODIFICAR");
        btnModificarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarArticuloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarArticuloMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarArticulo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIngresarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarId))
                    .addComponent(txtCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarArticulo)
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void txtNombreArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreArticuloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArticuloMouseClicked

    private void txtNombreArticuloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreArticuloMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArticuloMouseEntered

    private void txtNombreArticuloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreArticuloMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArticuloMouseExited

    private void txtNombreArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreArticuloMousePressed
        // TODO add your handling code here:
        String contra = new String(txtNombreArticulo.getText());
        if (contra.equals("INGRESE NOMBRE")) {
            txtNombreArticulo.setText(""); // Limpia solo si está el texto por defecto
        }
        txtNombreArticulo.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtNombreArticuloMousePressed

    private void txtCantidadArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadArticuloMousePressed
        // TODO add your handling code here:
        String contra = new String(txtCantidadArticulo.getText());
        if (contra.equals("INGRESE CANTIDAD")) {
            txtCantidadArticulo.setText(""); // Limpia solo si está el texto por defecto
        }
        txtCantidadArticulo.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtCantidadArticuloMousePressed

    private void txtCantidadArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadArticuloActionPerformed

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

    private void btnModificarArticuloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarArticuloMouseEntered
        // TODO add your handling code here:
                btnModificarArticulo.setForeground(new java.awt.Color(0,102,102));

    }//GEN-LAST:event_btnModificarArticuloMouseEntered

    private void btnModificarArticuloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarArticuloMouseExited
        // TODO add your handling code here:
        btnModificarArticulo.setForeground(new java.awt.Color(153,153,153));

    }//GEN-LAST:event_btnModificarArticuloMouseExited

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
            java.util.logging.Logger.getLogger(modificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarId;
    private javax.swing.JLabel btnModificarArticulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidadArticulo;
    private javax.swing.JTextField txtIngresarId;
    private javax.swing.JTextField txtNombreArticulo;
    // End of variables declaration//GEN-END:variables
}
