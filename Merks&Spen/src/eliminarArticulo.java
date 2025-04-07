/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */



import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class eliminarArticulo extends javax.swing.JFrame {

    /**
     * Creates new form eliminarArticulo
     */
   
      private UserCRUD crud;

      
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
        jLabel2.setText("ELIMINAR ARTÍCULO");
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarIdMousePressed(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarArticuloMousePressed(evt);
            }
        });

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
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad"
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
        if (contra.equals("Ingrese el id")) {
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

    private void btnEliminarArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarArticuloMousePressed
        // TODO add your handling code here:
        //1. Se guarda en la variable lo que el usuario a ingresado
        
        String ideliminar=txtIngresarId.getText();
        
        //2. Se valida que no existan vacíos
        
        if(ideliminar.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "El campo es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //3. El usuario ingresa dato para actualizar el campo de correo
        
        UserCRUD crud = new UserCRUD();
     
        //4. Se pregunta al usuario si desea eliminar el registro
        
        
        int respuesta = JOptionPane.showConfirmDialog(
            null, 
            "¿Estás seguro de que quieres eliminar este registro?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (respuesta == JOptionPane.YES_OPTION){
            
        //5. Se muestra el status de la elimiación/DELETE
                
            //Si selecciona la opción "YES/SI" se elimina el registro correspondiente a ese id
            
            boolean status=crud.eliminararticulo(ideliminar);
            
            if(status){
       JOptionPane.showMessageDialog(this,"Registro eliminado", "Éxito",JOptionPane.INFORMATION_MESSAGE);
            
        }
            
        }
            
        else
        {       
            //En caso contrario muestra el siguiente mensaje:
            JOptionPane.showMessageDialog(this,"Registro no eliminado",  "No eliminado",JOptionPane.INFORMATION_MESSAGE);  
        }
     
    }//GEN-LAST:event_btnEliminarArticuloMousePressed
    
    //FIN MÉTODO PARA ELIMINAR UN ARTÍCULO
    
    private void btnBuscarIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMousePressed
        // TODO add your handling code here:
        
        //1. Obtener el valor del text, en donde se coloca el id para realizar consultas
        String idtext=txtIngresarId.getText();
        
        //2. Se valida que no exista vacío
        
        if(idtext.isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo id es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //3. Búsqueda, llenado de la tabla
        try{
            
            int id=Integer.parseInt(idtext);
            ResultSet rs = crud.buscarporid(id);
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);//Limpiar para ingresar otro valor
            
            if(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("id_articulo"), rs.getString("Nombre_articulo"), rs.getString("cantidad_articulo")});
            }
       }
        
        catch(SQLException e){
            
            System.out.println("Error al llenar la tabla"+e.getMessage());
        
        }
        
        
    }//GEN-LAST:event_btnBuscarIdMousePressed

    
    //FIN MÉTODO PARA BUSCAR POR ID
    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIngresarId;
    // End of variables declaration//GEN-END:variables
}
