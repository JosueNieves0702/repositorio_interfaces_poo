import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solicitud_Articulos extends JFrame {
    private JTextField txtPedido;
    private JTextField txtCantidad;
    private JButton btnEnviar;
    private JTextArea txtAreaResumen;

    public Solicitud_Articulos() {
        setTitle("Solicitud de Artículos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Pedido:"));
        txtPedido = new JTextField(20);
        add(txtPedido);

        add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField(5);
        add(txtCantidad);

        btnEnviar = new JButton("Enviar Solicitud");
        add(btnEnviar);

        txtAreaResumen = new JTextArea(10, 30);
        txtAreaResumen.setEditable(false);
        add(new JScrollPane(txtAreaResumen));

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarSolicitud();
            }
        });
    }

    private void enviarSolicitud() {
        String pedido = txtPedido.getText();
        String cantidad = txtCantidad.getText();

        if (pedido.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txtAreaResumen.append("Pedido: " + pedido + " - Cantidad: " + cantidad + "\n");
            txtPedido.setText("");
            txtCantidad.setText("");
        }
    }
}