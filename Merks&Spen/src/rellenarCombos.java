/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class rellenarCombos {
       public static void llenarComboDesdeBD(JComboBox<String> combo, String tabla, String columna) {
        String sql = "SELECT " + columna + " FROM " + tabla;

        try (Connection con = Conexion_MySQL.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            combo.removeAllItems(); // Limpia el combo

            while (rs.next()) {
                combo.addItem(rs.getString(columna));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al llenar combo desde tabla " + tabla + ": " + e.getMessage());
        }
    }
}
