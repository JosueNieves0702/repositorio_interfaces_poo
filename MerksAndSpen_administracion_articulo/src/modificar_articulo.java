import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modificar_articulo extends JFrame{

    private JTextField idField;

    public modificar_articulo() {
        setTitle("Modificar Artículo");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("ID del Artículo a modificar:"));
        idField = new JTextField();
        add(idField);

        JButton modificarButton = new JButton("Modificar");
        modificarButton.addActionListener(e -> modificarArticulo());
        add(modificarButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void modificarArticulo() {
        if (idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo ID no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] opciones = {"Nombre", "Descripción", "Cantidad"};
        String opcion = (String) JOptionPane.showInputDialog(this, "Seleccione el campo a modificar:",
                "Modificar Artículo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcion != null) {
            String nuevoValor = JOptionPane.showInputDialog("Ingrese el nuevo valor para " + opcion + ":");
            if (nuevoValor != null && !nuevoValor.isEmpty()) {
                JOptionPane.showMessageDialog(this, opcion + " actualizado exitosamente: " + nuevoValor);
            } else {
                JOptionPane.showMessageDialog(this, "El nuevo valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

