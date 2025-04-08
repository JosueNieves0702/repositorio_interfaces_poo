/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dalea
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form BuscarUsuario
     */
    public BuscarUsuario() {
        initComponents();
        this.setTitle("Consultar Usuario");
    }
    private void cargarTabla(ResultSet rs) {
    try {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Departamento");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Tipo de Usuario");

        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_usuario"),
                rs.getString("Nombre"),
                rs.getString("Contraseña"),
                rs.getString("Tipo")
            };
            modelo.addRow(fila);
        }

        jTable1.setModel(modelo);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresarNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscarPorId = new javax.swing.JLabel();
        btnTodos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("BUSCAR POR NOMBRE");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtIngresarNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtIngresarNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtIngresarNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIngresarNombre.setText("INGRESE NOMBBRE");
        txtIngresarNombre.setBorder(null);
        txtIngresarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIngresarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIngresarNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIngresarNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIngresarNombreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIngresarNombreMousePressed(evt);
            }
        });
        txtIngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarNombreActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(txtIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CONSULTAR USUARIO");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtId.setText("INGRESE ID.");
        txtId.setBorder(null);
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnBuscarPorId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarPorId.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarPorId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarPorId.setText("BUSCAR");
        btnBuscarPorId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPorId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPorIdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarPorIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarPorIdMouseExited(evt);
            }
        });

        btnTodos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(153, 153, 153));
        btnTodos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTodos.setText("BUSCAR A TODOS");
        btnTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTodosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTodosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTodosMouseExited(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarPorId))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorId))
                .addGap(18, 18, 18)
                .addComponent(btnTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Usuario", "Departamento", "Contraseña", "Tipo de usuario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 210, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarNombreMouseClicked

    private void txtIngresarNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarNombreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarNombreMouseEntered

    private void txtIngresarNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarNombreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarNombreMouseExited

    private void txtIngresarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarNombreMousePressed
        // TODO add your handling code here:
        String contra = new String(txtIngresarNombre.getText());
        if (contra.equals("INGRESE NOMBRE")) {
            txtIngresarNombre.setText(""); // Limpia solo si está el texto por defecto
        }
        txtIngresarNombre.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtIngresarNombreMousePressed

    private void txtIngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarNombreActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscar.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMouseClicked

    private void txtIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMouseEntered

    private void txtIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMouseExited

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        // TODO add your handling code here:
        String id = new String(txtId.getText());
        if (id.equals("INGRESE ID.")) {
            txtId.setText(""); // Limpia solo si está el texto por defecto
        }
        txtId.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtIdMousePressed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBuscarPorIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPorIdMouseClicked
        // TODO add your handling code here:
         String idTexto = txtId.getText().trim();

    if (idTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int id = Integer.parseInt(idTexto);
        UserCRUD crud = new UserCRUD();
        ResultSet rs = crud.buscarPorID(id);
        cargarTabla(rs);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido, debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error en la consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarPorIdMouseClicked

    private void btnBuscarPorIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPorIdMouseEntered
        // TODO add your handling code here:
        btnBuscarPorId.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnBuscarPorIdMouseEntered

    private void btnBuscarPorIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPorIdMouseExited
        // TODO add your handling code here:
        btnBuscarPorId.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarPorIdMouseExited

    private void btnTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseClicked
        // TODO add your handling code here:
        try {
        UserCRUD crud = new UserCRUD();
        ResultSet rs = crud.obtenerTodos();
        cargarTabla(rs);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener usuarios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTodosMouseClicked

    private void btnTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseEntered
        // TODO add your handling code here:
        btnBuscar.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnTodosMouseEntered

    private void btnTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseExited
        // TODO add your handling code here:
        btnBuscar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnTodosMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        MenuAdminUsuarios MAU = new MenuAdminUsuarios();
        MAU.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnBuscarPorId;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnTodos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIngresarNombre;
    // End of variables declaration//GEN-END:variables
}
