import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazModificar extends JFrame {

    public InterfazModificar() {
        setTitle("Modificar Usuario");
        setSize(400, 200); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        // Título en la parte superior centrado
        JLabel tituloLabel = new JLabel("Modificar Usuario");
        tituloLabel.setBounds(0, 20, 400, 30); // Centrado horizontalmente
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Fuente más grande
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        panel.add(tituloLabel);

        // Campo de Usuario
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 60, 80, 25);
        usuarioLabel.setForeground(Color.WHITE);
        panel.add(usuarioLabel);

        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(150, 60, 200, 25);
        usuarioField.setForeground(Color.WHITE);
        usuarioField.setBackground(Color.DARK_GRAY);
        panel.add(usuarioField);

        // Opciones para modificar
        JLabel opcionLabel = new JLabel("¿Qué desea modificar?");
        opcionLabel.setBounds(50, 100, 150, 25);
        opcionLabel.setForeground(Color.WHITE);
        panel.add(opcionLabel);

        JComboBox<String> opcionCombo = new JComboBox<>(new String[]{"Correo", "Contraseña"});
        opcionCombo.setBounds(200, 100, 150, 25);
        opcionCombo.setForeground(Color.WHITE);
        opcionCombo.setBackground(Color.DARK_GRAY);
        panel.add(opcionCombo);

        // Botón de Modificar
        JButton modificarButton = new JButton("Modificar");
        modificarButton.setBounds(150, 140, 100, 30);
        modificarButton.setForeground(Color.WHITE);
        modificarButton.setBackground(Color.DARK_GRAY);
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                String opcion = (String) opcionCombo.getSelectedItem();
                JOptionPane.showMessageDialog(InterfazModificar.this, 
                    "Modificando " + opcion + " del usuario: " + usuario);
                // Aquí podrías agregar la lógica para modificar el correo o la contraseña
            }
        });
        panel.add(modificarButton);

        add(panel);
    }
}