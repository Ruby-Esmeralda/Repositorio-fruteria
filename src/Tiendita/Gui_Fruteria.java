package Tiendita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_Fruteria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textPeso;
	private JTextField textColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Fruteria frame = new Gui_Fruteria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_Fruteria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 128));
		panel.setBounds(10, 11, 414, 58);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Fruteria");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		textNombre = new JTextField();
		textNombre.setBounds(173, 114, 212, 27);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(173, 152, 212, 27);
		contentPane.add(textPeso);
		
		textColor = new JTextField();
		textColor.setColumns(10);
		textColor.setBounds(173, 190, 212, 27);
		contentPane.add(textColor);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombre.setBounds(62, 118, 82, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPeso.setBounds(62, 156, 82, 14);
		contentPane.add(lblPeso);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblColor.setBounds(62, 194, 82, 14);
		contentPane.add(lblColor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(10, 88, 414, 152);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(48, 284, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_1.setBounds(173, 284, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(301, 284, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 192));
		panel_2.setBounds(10, 257, 414, 67);
		contentPane.add(panel_2);
	}
}
