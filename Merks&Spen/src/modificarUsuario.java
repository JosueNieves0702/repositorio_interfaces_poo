/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class modificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form modificarUsuario
     */
    public modificarUsuario() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dptoSeleccionado = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        tipoSeleccionado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JLabel();
        btnUser = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JLabel();
        btnIngrseId = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MODIFICAR USUARIO");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("DEPARTAMENTO:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CONTRASEÑA:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("TIPO DE USUARIO:");

        dptoSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        dptoSeleccionado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        dptoSeleccionado.setForeground(new java.awt.Color(153, 153, 153));
        dptoSeleccionado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dptoSeleccionado.setText("DPTO.");
        dptoSeleccionado.setBorder(null);
        dptoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptoSeleccionadoActionPerformed(evt);
            }
        });

        txtContra.setBackground(new java.awt.Color(255, 255, 255));
        txtContra.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtContra.setForeground(new java.awt.Color(153, 153, 153));
        txtContra.setText("jPasswordField1");
        txtContra.setBorder(null);
        txtContra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContraMouseReleased(evt);
            }
        });

        tipoSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        tipoSeleccionado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tipoSeleccionado.setForeground(new java.awt.Color(153, 153, 153));
        tipoSeleccionado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tipoSeleccionado.setText("TIPO");
        tipoSeleccionado.setBorder(null);
        tipoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSeleccionadoActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(153, 153, 153));
        btnAdmin.setText("ADMIN");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
        });

        btnUser.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        btnUser.setForeground(new java.awt.Color(153, 153, 153));
        btnUser.setText("USER");
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserMouseExited(evt);
            }
        });

        btnCrearUsuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(153, 153, 153));
        btnCrearUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrearUsuario.setText("MODIFICAR");
        btnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseExited(evt);
            }
        });

        btnIngrseId.setBackground(new java.awt.Color(255, 255, 255));
        btnIngrseId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnIngrseId.setForeground(new java.awt.Color(153, 153, 153));
        btnIngrseId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        btnIngrseId.setText("INGRESE ID.");
        btnIngrseId.setBorder(null);
        btnIngrseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngrseIdActionPerformed(evt);
            }
        });

        btnBuscarId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarId.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarId.setText("BUSCAR");
        btnBuscarId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarIdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarIdMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dptoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tipoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btnUser))
                    .addComponent(jLabel2)
                    .addComponent(btnCrearUsuario)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIngrseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngrseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dptoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin)
                    .addComponent(btnUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 300, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void dptoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dptoSeleccionadoActionPerformed

    private void txtContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseClicked
        // TODO add your handling code here:
        String contra = new String(txtContra.getPassword());
        if (contra.equals("*******")) {
            txtContra.setText(""); // Limpia solo si está el texto por defecto
        }
        txtContra.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtContraMouseClicked

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        // TODO add your handling code here:
        txtContra.setText("");
        txtContra.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_txtContraMousePressed

    private void txtContraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraMouseReleased

    private void tipoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSeleccionadoActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        buscarDpto BB = new buscarDpto();
        BB.setVisible(true);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscar.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
        tipoSeleccionado.setText("ADMIN");
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        // TODO add your handling code here:
        btnAdmin.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        // TODO add your handling code here:
        btnAdmin.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnAdminMouseExited

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        // TODO add your handling code here:
        tipoSeleccionado.setText("USER");
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        // TODO add your handling code here:
        btnUser.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseExited
        // TODO add your handling code here:
        btnUser.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnUserMouseExited

    private void btnCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseEntered
        // TODO add your handling code here:
        btnCrearUsuario.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnCrearUsuarioMouseEntered

    private void btnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseExited
        // TODO add your handling code here:
        btnCrearUsuario.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnCrearUsuarioMouseExited

    private void btnIngrseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngrseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngrseIdActionPerformed

    private void btnBuscarIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBuscarIdMouseClicked

    private void btnBuscarIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseEntered
        // TODO add your handling code here:
        btnBuscarId.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnBuscarIdMouseEntered

    private void btnBuscarIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseExited
        // TODO add your handling code here:
        btnBuscarId.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarIdMouseExited

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
            java.util.logging.Logger.getLogger(modificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnBuscarId;
    private javax.swing.JLabel btnCrearUsuario;
    private javax.swing.JTextField btnIngrseId;
    private javax.swing.JLabel btnUser;
    private javax.swing.JTextField dptoSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tipoSeleccionado;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables
}
