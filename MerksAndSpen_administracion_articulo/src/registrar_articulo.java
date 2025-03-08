import javax.swing.*;
import java.awt.*;


public class registrar_articulo extends JFrame  {

    private JTextField idField, nombreField, descripcionField, cantidadField;

    public registrar_articulo() {
        setTitle("Registrar Artículo");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        // Crear componentes
        add(new JLabel("ID del Artículo:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Nombre del Artículo:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Descripción del Artículo:"));
        descripcionField = new JTextField();
        add(descripcionField);

        add(new JLabel("Cantidad del Artículo:"));
        cantidadField = new JTextField();
        add(cantidadField);

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(e -> registrarArticulo());
        add(registrarButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public boolean validarCampos() {
        return !idField.getText().isEmpty() && !nombreField.getText().isEmpty()
                && !descripcionField.getText().isEmpty() && !cantidadField.getText().isEmpty();
    }

    private void registrarArticulo() {
        if (validarCampos()) {
            JOptionPane.showMessageDialog(this, "Artículo registrado:\nID: " + idField.getText() +
                    "\nNombre: " + nombreField.getText() +
                    "\nDescripción: " + descripcionField.getText() +
                    "\nCantidad: " + cantidadField.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}//llave public clas registrar_articulo
