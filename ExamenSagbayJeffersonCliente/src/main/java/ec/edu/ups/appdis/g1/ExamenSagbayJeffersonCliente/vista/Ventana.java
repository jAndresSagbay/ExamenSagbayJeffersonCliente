package ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.business.*;
import ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.entity.Producto;
import javax.swing.JTextArea;

public class Ventana {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	ProductoOnRemoto productoRemoto;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(62, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Descripcion");
		lblNewLabel_2.setBounds(62, 106, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);

		txtNombre = new JTextField();
		txtNombre.setBounds(200, 78, 179, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(200, 103, 179, 20);
		frame.getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();

			}
		});
		btnGuardar.setBounds(151, 134, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 185, 414, 65);
		frame.getContentPane().add(textArea);
		for (int i = 0; i < productoRemoto.getProductos().size(); i++) {
			textArea.append(productoRemoto.getProductos().get(i)+"\n");
		}
	}

	public void guardar() {
		Producto p = new Producto();
		//p.setId(1);
		p.setNombre(txtNombre.getText());
		p.setDescripcion(txtDescripcion.getText());
		productoRemoto.registrar(p);
	}
}
