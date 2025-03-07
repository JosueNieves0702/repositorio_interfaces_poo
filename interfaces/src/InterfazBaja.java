import javax.swing.*;
import java.awt.*;

public class InterfazBaja extends JFrame {

    public InterfazBaja() {
        setTitle("Baja de Usuario");
        setSize(400, 200); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        // Título en la parte superior centrado
        JLabel tituloLabel = new JLabel("Baja de Usuario");
        tituloLabel.setBounds(0, 20, 400, 30); // Centrado horizontalmente
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Fuente más grande
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        panel.add(tituloLabel);

        // Campo de Usuario
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 70, 80, 25);
        usuarioLabel.setForeground(Color.WHITE);
        panel.add(usuarioLabel);

        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(150, 70, 200, 25);
        usuarioField.setForeground(Color.WHITE);
        usuarioField.setBackground(Color.DARK_GRAY);
        panel.add(usuarioField);

        // Botón de Eliminar
        JButton eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(150, 120, 100, 30);
        eliminarButton.setForeground(Color.WHITE);
        eliminarButton.setBackground(Color.DARK_GRAY);
        panel.add(eliminarButton);

        add(panel);
    }
}