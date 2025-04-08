/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class modificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form modificarUsuario
     */
    
    private UserCRUD crud;
    
    public modificarUsuario() {
        initComponents();
        this.setTitle("Modificar Usuario");
        crud = new UserCRUD();
        configurarTabla();
        limpiarCampos();
    }
    
    private void configurarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setColumnIdentifiers(new Object[]{"ID", "Departamento", "Contraseña", "Tipo Usuario"});
        modelo.setRowCount(0);
    }
    
    private void limpiarCampos() {
        txtId.setText("INGRESE ID.");
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtDepartamento.setText("DPTO.");
        txtDepartamento.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("*******");
        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtTipoSeleccionado.setText("TIPO");
        txtTipoSeleccionado.setForeground(new java.awt.Color(153, 153, 153));
    }

    private void cargarDatosUsuario(int idUsuario) {
    try {
        ResultSet rs = crud.buscarPorID(idUsuario);  // Corregí "buscarForID" a "buscarPorID"
        if (rs.next()) {
            // Mostrar datos en los campos
            txtDepartamento.setText(rs.getString("Nombre"));  // Cambiado de "Nombre_departamento" a "Nombre"
            txtDepartamento.setForeground(new java.awt.Color(0, 0, 0));
            
            txtContraseña.setText(rs.getString("Contraseña"));
            txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
            
            txtTipoSeleccionado.setText(rs.getString("Tipo"));  // Cambiado de "Tipo_usuario" a "Tipo"
            txtTipoSeleccionado.setForeground(new java.awt.Color(0, 0, 0));
            
            // Actualizar tabla
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            modelo.addRow(new Object[]{
                rs.getInt("id_usuario"),
                rs.getString("Nombre"),  // Cambiado de "Nombre_departamento" a "Nombre"
                rs.getString("Contraseña"),
                rs.getString("Tipo")      // Cambiado de "Tipo_usuario" a "Tipo"
            });
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        txtId = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JLabel();
        btnBuscarId1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtDepartamento.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtDepartamento.setForeground(new java.awt.Color(153, 153, 153));
        txtDepartamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDepartamento.setText("DPTO.");
        txtDepartamento.setBorder(null);
        txtDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDepartamentoMouseClicked(evt);
            }
        });
        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("jPasswordField1");
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

        txtTipoSeleccionado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtTipoSeleccionado.setForeground(new java.awt.Color(153, 153, 153));
        txtTipoSeleccionado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipoSeleccionado.setText("TIPO");
        txtTipoSeleccionado.setBorder(null);
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

        txtId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtId.setText("INGRESE ID.");
        txtId.setBorder(null);
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
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

        btnBuscarId1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarId1.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarId1.setText("ACTUALIZAR");
        btnBuscarId1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarId1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarId1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarId1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarId1MouseExited(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnBuscarId1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtTipoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(btnAdmin)
                            .addGap(18, 18, 18)
                            .addComponent(btnUser)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin)
                    .addComponent(btnUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarId1)
                    .addComponent(btnRegresar))
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 300));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 276, 236));

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

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
        String depa = new String(txtDepartamento.getText());
        if (depa.equals("DPTO.")) {
            txtDepartamento.setText(""); // Limpia solo si está el texto por defecto
        }
        txtDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        // TODO add your handling code here:
        String contra = new String(txtContraseña.getPassword());
        if (contra.equals("*******")) {
            txtContraseña.setText(""); // Limpia solo si está el texto por defecto
        }
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        // TODO add your handling code here:
        txtContraseña.setText("");
        txtContraseña.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaMouseReleased

    private void txtTipoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoSeleccionadoActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
        txtTipoSeleccionado.setText("Administrador");
        txtTipoSeleccionado.setForeground(new java.awt.Color(0, 0, 0));
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
        txtTipoSeleccionado.setText("Usuario");
        txtTipoSeleccionado.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        // TODO add your handling code here:
        btnUser.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseExited
        // TODO add your handling code here:
        btnUser.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnUserMouseExited

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBuscarIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseClicked
        // TODO add your handling code here:
         //1.- Obtener el valor del txt
        String idtext = txtId.getText();
        
        //2.- Validar txt vacio
        if(idtext.isEmpty() || idtext.equals("INGRESE ID.")){
            JOptionPane.showMessageDialog(this, "ERROR, campo vacío!","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //3.- Búsqueda y llenado de la tabla
        ResultSet rs = null;
        try{
            int id = Integer.parseInt(idtext);
            rs = crud.buscarPorID(id);
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            
            if(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("id_usuario"),
                    rs.getString("Nombre"),
                    rs.getString("Contraseña"),
                    rs.getString("Tipo")
                });
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido (número)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error al buscar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIdMouseClicked

    private void btnBuscarIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseEntered
        // TODO add your handling code here:
        btnBuscarId.setForeground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_btnBuscarIdMouseEntered

    private void btnBuscarIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIdMouseExited
        // TODO add your handling code here:
        btnBuscarId.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarIdMouseExited

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        // TODO add your handling code here:
        String id = "";
        id = txtId.getText();
        if(id.equals("INGRESE ID.")){
            txtId.setText(""); //Limpia solo si está el texto por defecto
        }
        txtId.setForeground(new java.awt.Color(0, 0, 0)); //Cambia a negro 
    }//GEN-LAST:event_txtIdMousePressed

    private void btnBuscarId1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarId1MouseClicked
        //1. Validar campos
        if(txtId.getText().isEmpty() || txtId.getText().equals("INGRESE ID.")) {
            JOptionPane.showMessageDialog(this, "Debe buscar un usuario primero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String departamento = txtDepartamento.getText();
        String contraseña = new String(txtContraseña.getPassword());
        String tipoUsuario = txtTipoSeleccionado.getText();
        
        if(departamento.isEmpty() || departamento.equals("DPTO.") || 
           contraseña.isEmpty() || 
           tipoUsuario.isEmpty() || tipoUsuario.equals("TIPO")) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!tipoUsuario.equalsIgnoreCase("Administrador") && !tipoUsuario.equalsIgnoreCase("Usuario")){
            JOptionPane.showMessageDialog(this, "Tipo de usuario inválido. Debe ser 'Administrador' o 'Usuario'.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //2. Actualizar usuario
        try {
            int idUsuario = Integer.parseInt(txtId.getText());
            boolean resultado = crud.actualizarUsuario(idUsuario, departamento, contraseña, tipoUsuario);
            
            if(resultado) {
                JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarDatosUsuario(idUsuario); // Refrescar datos
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID de usuario inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarId1MouseClicked

    private void btnBuscarId1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarId1MouseEntered
        // TODO add your handling code here:
        btnBuscarId1.setForeground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_btnBuscarId1MouseEntered

    private void btnBuscarId1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarId1MouseExited
        // TODO add your handling code here:
        btnBuscarId1.setForeground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_btnBuscarId1MouseExited

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

    private void txtDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepartamentoMouseClicked
        // TODO add your handling code here:
        String depa = new String(txtDepartamento.getText());
        if (depa.equals("DPTO.")) {
            txtDepartamento.setText(""); // Limpia solo si está el texto por defecto
        }
        txtDepartamento.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtDepartamentoMouseClicked

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
    private javax.swing.JLabel btnBuscarId;
    private javax.swing.JLabel btnBuscarId1;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTipoSeleccionado;
    // End of variables declaration//GEN-END:variables
}
