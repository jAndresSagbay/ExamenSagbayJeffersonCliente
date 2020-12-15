package ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.business;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.entity.Producto;
import ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.views.*;

public class Ventana {

	private JFrame frame;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	ProductoON productoRemoto;

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
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(62, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(62, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descripcion");
		lblNewLabel_2.setBounds(62, 136, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtID = new JTextField();
		txtID.setBounds(200, 53, 86, 20);
		frame.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(200, 99, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(200, 133, 86, 20);
		frame.getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto p= new Producto();
				p.setNombre(txtNombre.getText());
				p.setDescripcion(txtDescripcion.getText());
			productoRemoto.registrar(p);
			}
		});
		btnGuardar.setBounds(155, 185, 89, 23);
		frame.getContentPane().add(btnGuardar);
	}
	

}
