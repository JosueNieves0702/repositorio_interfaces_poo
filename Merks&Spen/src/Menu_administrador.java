/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class Menu_administrador extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    public Menu_administrador() {
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
        btnMenuUsuarios = new javax.swing.JLabel();
        btnControlDeArticulos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("BIENVENIDO");

        btnMenuUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuUsuarios.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnMenuUsuarios.setForeground(new java.awt.Color(153, 153, 153));
        btnMenuUsuarios.setText("MENU USUARIOS");
        btnMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuUsuariosMouseExited(evt);
            }
        });

        btnControlDeArticulos.setBackground(new java.awt.Color(255, 255, 255));
        btnControlDeArticulos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnControlDeArticulos.setForeground(new java.awt.Color(153, 153, 153));
        btnControlDeArticulos.setText("CONTROL DE ARTICULOS");
        btnControlDeArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControlDeArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnControlDeArticulosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnControlDeArticulosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnControlDeArticulosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnControlDeArticulos)
                    .addComponent(btnMenuUsuarios))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnMenuUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnControlDeArticulos)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 300));

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

    private void btnControlDeArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlDeArticulosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnControlDeArticulosMouseClicked

    private void btnMenuUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuUsuariosMouseExited
        // TODO add your handling code here:
        btnMenuUsuarios.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnMenuUsuariosMouseExited

    private void btnMenuUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuUsuariosMouseEntered
        // TODO add your handling code here:
        btnMenuUsuarios.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnMenuUsuariosMouseEntered

    private void btnControlDeArticulosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlDeArticulosMouseEntered
        // TODO add your handling code here:
        btnControlDeArticulos.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnControlDeArticulosMouseEntered

    private void btnControlDeArticulosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlDeArticulosMouseExited
        // TODO add your handling code here:
        btnControlDeArticulos.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnControlDeArticulosMouseExited

    private void btnMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuUsuariosMouseClicked
        // TODO add your handling code here:
        MenuAdminUsuarios MU = new MenuAdminUsuarios();
        MU.setVisible(true);
    }//GEN-LAST:event_btnMenuUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnControlDeArticulos;
    private javax.swing.JLabel btnMenuUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
