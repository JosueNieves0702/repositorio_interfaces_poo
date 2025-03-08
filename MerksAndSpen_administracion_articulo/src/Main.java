import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {
    public Main() {
        setTitle("Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1)); // Organizar botones verticalmente

        // Crear botones para las opciones
        JButton registrarButton = new JButton("Registrar Artículo");
        JButton eliminarButton = new JButton("Eliminar Artículo");
        JButton modificarButton = new JButton("Modificar Artículo");
        JButton salirButton = new JButton("Salir");

        // Agregar los botones a la ventana
        add(registrarButton);
        add(eliminarButton);
        add(modificarButton);
        add(salirButton);

        // Acción al presionar el botón "Registrar"
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new registrar_articulo().setVisible(true); // Abre la ventana de registro
            }
        });

        // Acción al presionar el botón "Eliminar"
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new eliminar_articulo().setVisible(true); // Abre la ventana de eliminación
            }
        });

        // Acción al presionar el botón "Modificar"
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new modificar_articulo().setVisible(true); // Abre la ventana de modificación
            }
        });

        // Acción al presionar el botón "Salir"
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la aplicación
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main menu = new Main();
            menu.setVisible(true);
        });
    }
}