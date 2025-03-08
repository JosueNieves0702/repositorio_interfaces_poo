import javax.swing.*;
import java.awt.*;


public class eliminar_articulo extends JFrame {

    private JTextField idField;

    public eliminar_articulo() {
        setTitle("Eliminar Artículo");
        setSize(300, 150);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("ID del Artículo a eliminar:"));
        idField = new JTextField();
        add(idField);

        JButton eliminarButton = new JButton("Eliminar");
        eliminarButton.addActionListener(e -> eliminarArticulo());
        add(eliminarButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void eliminarArticulo() {
        if (idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo ID no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = idField.getText();
        // Simulando la búsqueda de un artículo (en una implementación real, esto podría ser una consulta a una base de datos)
        String articuloInfo = "ID: " + id + "\nNombre: Artículo X\nDescripción: Ejemplo\nCantidad: 10";

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Desea eliminar el siguiente artículo?\n" + articuloInfo,
                "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "El artículo con ID " + id + " fue eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada.");
        }
    }

}//Llave public class
