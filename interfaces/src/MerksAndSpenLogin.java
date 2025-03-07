import javax.swing.*;
import java.awt.*;


public class MerksAndSpenLogin extends JFrame {
    private JTextField usuarioField;
    private JPasswordField passwordField;

    public MerksAndSpenLogin() {
        setTitle("Merks and Spen - Inicio de Sesión");
        setSize(400, 300); // Ventana más grande
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK); // Fondo negro

        // Nombre de la marca en la parte superior centrada
        JLabel marcaLabel = new JLabel("Merks and Spen");
        marcaLabel.setBounds(0, 20, 400, 40); // Centrado horizontalmente
        marcaLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Fuente más grande
        marcaLabel.setForeground(Color.WHITE); // Texto blanco
        marcaLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        panel.add(marcaLabel);

        // Etiqueta y campo de usuario
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(100, 80, 80, 25);
        usuarioLabel.setForeground(Color.WHITE); // Texto blanco
        panel.add(usuarioLabel);

        usuarioField = new JTextField(20);
        usuarioField.setBounds(180, 80, 120, 25);
        usuarioField.setForeground(Color.WHITE); // Texto blanco
        usuarioField.setBackground(Color.DARK_GRAY); // Fondo oscuro
        panel.add(usuarioField);

        // Etiqueta y campo de contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(100, 120, 80, 25);
        passwordLabel.setForeground(Color.WHITE); // Texto blanco
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(180, 120, 120, 25);
        passwordField.setForeground(Color.WHITE); // Texto blanco
        passwordField.setBackground(Color.DARK_GRAY); // Fondo oscuro
        panel.add(passwordField);

        // Botón de Iniciar Sesión centrado
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(140, 170, 120, 30); // Centrado horizontalmente
        loginButton.setForeground(Color.WHITE); // Texto blanco
        loginButton.setBackground(Color.DARK_GRAY); // Fondo oscuro
        panel.add(loginButton);

        // Texto "¿Olvidaste tu contraseña? Click aquí" centrado en la parte inferior
        JLabel olvidasteLabel = new JLabel("¿Olvidaste tu contraseña? ");
        olvidasteLabel.setBounds(0, 220, 300, 25);
        olvidasteLabel.setForeground(Color.WHITE); // Texto blanco
        olvidasteLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        panel.add(olvidasteLabel);

        JLabel clickAquiLabel = new JLabel("Click aquí");
        clickAquiLabel.setBounds(235, 220, 100, 25);
        clickAquiLabel.setForeground(Color.BLUE); // Texto azul para simular un enlace
        clickAquiLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambiar el cursor a una mano
        panel.add(clickAquiLabel);


        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MerksAndSpenLogin().setVisible(true);
            }
        });
    }
}