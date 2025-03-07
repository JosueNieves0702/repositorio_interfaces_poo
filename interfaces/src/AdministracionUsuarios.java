import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministracionUsuarios extends JFrame {

    public AdministracionUsuarios() {
        setTitle("Administración de Usuarios");
        setSize(400, 300); // Tamaño igual al de la interfaz anterior
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        // Título en la esquina superior izquierda
        JLabel tituloLabel = new JLabel("Administración de Usuarios");
        tituloLabel.setBounds(10, 10, 250, 30); // Posición en la esquina superior izquierda
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Fuente más pequeña
        tituloLabel.setForeground(Color.WHITE);
        panel.add(tituloLabel);

        // Botón de Alta
        JButton altaButton = new JButton("Alta");
        altaButton.setBounds(10, 50, 120, 30); // Posicionado arriba
        altaButton.setForeground(Color.WHITE);
        altaButton.setBackground(Color.DARK_GRAY);
        altaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InterfazAlta().setVisible(true); // Abre la interfaz de Alta
            }
        });
        panel.add(altaButton);

        // Botón de Baja
        JButton bajaButton = new JButton("Baja");
        bajaButton.setBounds(10, 90, 120, 30); // Posicionado en el medio
        bajaButton.setForeground(Color.WHITE);
        bajaButton.setBackground(Color.DARK_GRAY);
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InterfazBaja().setVisible(true); // Abre la interfaz de Baja
            }
        });
        panel.add(bajaButton);

        // Botón de Modificar
        JButton modificarButton = new JButton("Modificar");
        modificarButton.setBounds(10, 130, 120, 30); // Posicionado abajo
        modificarButton.setForeground(Color.WHITE);
        modificarButton.setBackground(Color.DARK_GRAY);
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InterfazModificar().setVisible(true); // Abre la interfaz de Modificar
            }
        });
        panel.add(modificarButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdministracionUsuarios().setVisible(true);
            }
        });
    }
}