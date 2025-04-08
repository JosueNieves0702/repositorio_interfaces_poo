/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class cambiarEstatus extends javax.swing.JFrame {

    /**
     * Creates new form cambiarEstatus
     */
    private pedidoCRUD crud = new pedidoCRUD();
    public cambiarEstatus() {
        initComponents();
        rellenarCombos.llenarComboDesdeBD(combDpto, "Departamento", "Nombre_departamento");
        
        rellenarCombos.llenarComboDesdeBD(combStatus, "Status_pedido", "Estatus");
        this.setTitle("Cambiar Estatus");
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
        jLabel4 = new javax.swing.JLabel();
        combDpto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combStatus = new javax.swing.JComboBox<>();
        btnConfirmar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CAMBIAR STATUS");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("INGRESE DEPARTAMENTO");

        combDpto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        combDpto.setForeground(new java.awt.Color(153, 153, 153));
        combDpto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combDptoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("INGRESE ID");

        combId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        combId.setForeground(new java.awt.Color(153, 153, 153));
        combId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combIdActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("CAMBIAR STATUS");

        combStatus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        combStatus.setForeground(new java.awt.Color(153, 153, 153));
        combStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combStatusActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        btnConfirmar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(153, 153, 153));
        btnConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseExited(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(51, 51, 51));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar))
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(combStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combDpto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnRegresar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 300));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "FECHA", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 392, 232));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combDptoActionPerformed
        // TODO add your handling code here:
        String departamentoSeleccionado = combDpto.getSelectedItem().toString();
        DefaultTableModel modelo = crud.obtenerPedidosPorDepartamento(departamentoSeleccionado);
        jTable1.setModel(modelo);
    }//GEN-LAST:event_combDptoActionPerformed

    private void combIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combIdActionPerformed

    private void combStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combStatusActionPerformed
        // TODO add your handling code here:                                        
    
       if (combDpto.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Seleccione un departamento primero");
        return;
    }
    
    String departamentoSeleccionado = combDpto.getSelectedItem().toString();
    
    try {
        // Actualizar el comboBox de IDs
        combId.removeAllItems();
        List<Integer> idsPedidos = crud.obtenerIdsPedidosPorDepartamento(departamentoSeleccionado);
        
        if (idsPedidos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay pedidos para este departamento");
        } else {
            for (Integer id : idsPedidos) {
                combId.addItem(id.toString());
            }
        }
        
        // Actualizar la tabla
        DefaultTableModel modelo = crud.obtenerPedidosPorDepartamento(departamentoSeleccionado);
        jTable1.setModel(modelo);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_combStatusActionPerformed

    private void btnConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseEntered
        // TODO add your handling code here:
         btnConfirmar.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnConfirmarMouseEntered

    private void btnConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseExited
        // TODO add your handling code here:
         btnConfirmar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnConfirmarMouseExited

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        // TODO add your handling code here:
         String departamentoSeleccionado = combDpto.getSelectedItem().toString();
    String idPedidoSeleccionado = combId.getSelectedItem() != null ? combId.getSelectedItem().toString() : null;
    String nuevoStatus = combStatus.getSelectedItem() != null ? combStatus.getSelectedItem().toString() : null;
    
    // Verificar que todos los campos estén seleccionados
    if (departamentoSeleccionado == null || idPedidoSeleccionado == null || nuevoStatus == null) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione todos los campos.");
        return;
    }
    
    // Intentar actualizar el estado del pedido
    try {
        // Llamar a la función del CRUD para actualizar el estado del pedido
        boolean actualizado = crud.modificarEstatusPedido(Integer.parseInt(idPedidoSeleccionado), nuevoStatus);
        
        if (actualizado) {
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "El estado del pedido ha sido actualizado exitosamente.");
            
            // Actualizar la tabla con los datos más recientes
            DefaultTableModel modelo = crud.obtenerPedidosPorDepartamento(departamentoSeleccionado);
            jTable1.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado del pedido.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar el estado: " + e.getMessage());
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        menuAdminPedidos MAP = new menuAdminPedidos();
        MAP.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnRegresarMouseExited

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
            java.util.logging.Logger.getLogger(cambiarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiarEstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConfirmar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JComboBox<String> combDpto;
    private javax.swing.JComboBox<String> combId;
    private javax.swing.JComboBox<String> combStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
