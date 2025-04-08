/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
import javax.swing.JOptionPane;

public class crearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form crearUsuario
     */
    public crearUsuario() {
        initComponents();
        this.setTitle("Agregar Usuario");
        
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
        txtDepartamento = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtTipoSeleccionado = new javax.swing.JTextField();
        btnAdmin = new javax.swing.JLabel();
        btnUser = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 234, 235));
        jPanel1.setForeground(new java.awt.Color(206, 234, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CREAR USUARIO");

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

        txtDepartamento.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtDepartamento.setForeground(new java.awt.Color(153, 153, 153));
        txtDepartamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDepartamento.setText("DPTO.");
        txtDepartamento.setBorder(null);
        txtDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDepartamentoMousePressed(evt);
            }
        });
        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("**********");
        txtContraseña.setBorder(null);
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseReleased(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        txtTipoSeleccionado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtTipoSeleccionado.setForeground(new java.awt.Color(153, 153, 153));
        txtTipoSeleccionado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipoSeleccionado.setText("TIPO");
        txtTipoSeleccionado.setBorder(null);
        txtTipoSeleccionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTipoSeleccionadoMouseClicked(evt);
            }
        });
        txtTipoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoSeleccionadoActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(153, 153, 153));
        btnAdmin.setText("Administrador");
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
        btnUser.setText("Usuario");
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
        btnCrearUsuario.setText("CREAR");
        btnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseExited(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(51, 51, 51));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresar.setText("REGRESAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel4)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTipoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btnUser))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCrearUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin)
                    .addComponent(btnUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 300));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 260, 300));

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

    private void btnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseExited
        // TODO add your handling code here:
        btnCrearUsuario.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnCrearUsuarioMouseExited

    private void btnCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseEntered
        // TODO add your handling code here:
        btnCrearUsuario.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnCrearUsuarioMouseEntered

    private void txtTipoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoSeleccionadoActionPerformed

    private void txtContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaMouseReleased

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        // TODO add your handling code here:
        String contra = new String(txtContraseña.getPassword());
        if (contra.equals("**********")) {
            txtContraseña.setText(""); // Limpia solo si está el texto por defecto
        }
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        MenuAdminUsuarios MAU = new MenuAdminUsuarios();
        MAU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtDepartamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepartamentoMousePressed
        // TODO add your handling code here:
        String departamento = new String(txtDepartamento.getText());
        if(departamento.equals("DPTO.")){
            txtDepartamento.setText(""); // Limpia solo si está el texto por defecto
        }
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0)); // Cambia a negro
    }//GEN-LAST:event_txtDepartamentoMousePressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        btnLimpiar.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        btnLimpiar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseClicked
        String departamento = txtDepartamento.getText();
        String contraseña = new String(txtContraseña.getPassword());
        String tipo_usuario = txtTipoSeleccionado.getText();
        
        if (departamento.isEmpty() || contraseña.isEmpty() || tipo_usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Existe un campo vacío, revise nuevamente!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validar que el tipo de usuario sea válido
        if (!tipo_usuario.equalsIgnoreCase("Administrador") && !tipo_usuario.equalsIgnoreCase("Usuario")) {
            JOptionPane.showMessageDialog(this, "Tipo de usuario inválido. Debe ser 'Administrador' o 'Usuario'.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        UserCRUD crud = new UserCRUD();
        boolean status = crud.insertarUsuario(departamento, contraseña, tipo_usuario);
        
        if (status) {
            JOptionPane.showMessageDialog(this, "Usuario Registrado Exitosamente!", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            txtDepartamento.setText("");
            txtContraseña.setText("");
            txtTipoSeleccionado.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearUsuarioMouseClicked

    private void btnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseExited
        // TODO add your handling code here:
        btnUser.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnUserMouseExited

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        // TODO add your handling code here:
        btnUser.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        // TODO add your handling code here:
        txtTipoSeleccionado.setText("Usuario");
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        // TODO add your handling code here:
        btnAdmin.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnAdminMouseExited

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        // TODO add your handling code here:
        btnAdmin.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
        txtTipoSeleccionado.setText("Administrador");
    }//GEN-LAST:event_btnAdminMouseClicked

    private void txtTipoSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoSeleccionadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoSeleccionadoMouseClicked

    private void LimpiarCampos(){
        txtDepartamento.setText("");
        txtContraseña.setText("");
        JOptionPane.showMessageDialog(this, "Campos Limpios!","Limpieza Exitosa",JOptionPane.INFORMATION_MESSAGE);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnCrearUsuario;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtTipoSeleccionado;
    // End of variables declaration//GEN-END:variables
}
