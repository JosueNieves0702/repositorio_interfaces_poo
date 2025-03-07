import javax.swing.*;
import java.awt.*;

public class InterfazAlta extends JFrame {

    public InterfazAlta() {
        setTitle("Alta de Usuario");
        setSize(400, 300); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        // Título en la parte superior centrado
        JLabel tituloLabel = new JLabel("Alta de Usuario");
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

        // Campo de Contraseña
        JLabel contraLabel = new JLabel("Contraseña:");
        contraLabel.setBounds(50, 110, 80, 25);
        contraLabel.setForeground(Color.WHITE);
        panel.add(contraLabel);

        JPasswordField contraField = new JPasswordField();
        contraField.setBounds(150, 110, 200, 25);
        contraField.setForeground(Color.WHITE);
        contraField.setBackground(Color.DARK_GRAY);
        panel.add(contraField);

        // Campo de Correo Electrónico
        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setBounds(50, 150, 80, 25);
        correoLabel.setForeground(Color.WHITE);
        panel.add(correoLabel);

        JTextField correoField = new JTextField();
        correoField.setBounds(150, 150, 200, 25);
        correoField.setForeground(Color.WHITE);
        correoField.setBackground(Color.DARK_GRAY);
        panel.add(correoField);

        // Botón de Guardar
        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(150, 200, 100, 30);
        guardarButton.setForeground(Color.WHITE);
        guardarButton.setBackground(Color.DARK_GRAY);
        panel.add(guardarButton);

        add(panel);
    }
}