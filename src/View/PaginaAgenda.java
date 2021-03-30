package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.AgendaController;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;

public class PaginaAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final AgendaController controller;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaAgenda frame = new PaginaAgenda();
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
	public PaginaAgenda() {
		
		
		this.controller = new AgendaController(this);
		iniciar();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 500, 564, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_1.setBackground(Color.WHITE);
		table_1.setForeground(Color.WHITE);
		table_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Cliente", "Servi\u00E7o", "Valor", "Data", "Hora", "Observa\u00E7\u00E3o"
			}
		));
		table_1.getColumnModel().getColumn(6).setPreferredWidth(174);
		table_1.setBounds(10, 546, 528, -161);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_9 = new JLabel("Agenda");
		lblNewLabel_9.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(238, 48, 71, 22);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Agenda");
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(272, 286, 241, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_8.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(272, 81, 85, 14);
		contentPane.add(lblNewLabel_8);
		
		JPanel panel = new JPanel();
		panel.setBounds(272, 96, 241, 179);
		contentPane.add(panel);
		
		JLabel lblNewLabel_7 = new JLabel("Hora");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(54, 258, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Data");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(51, 227, 76, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Valor R$");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_5.setBounds(54, 196, 73, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Servi\u00E7o");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(54, 164, 73, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Cliente");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(51, 135, 76, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(54, 99, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 255, 126, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 224, 125, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 193, 125, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textFieldID = new JTextField();
		textFieldID.setToolTipText("ID");
		textFieldID.setBounds(137, 96, 125, 20);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(137, 160, 125, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"lucas", "alexandre ", "maicom"}));
		comboBox.setBounds(137, 127, 125, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PaginaAgenda.class.getResource("/imagem/Agenda-PainelFundo.png")));
		lblNewLabel_1.setBounds(0, 47, 528, 416);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PaginaAgenda.class.getResource("/imagem/AgendaFundo.png")));
		lblNewLabel.setBounds(0, 0, 548, 579);
		contentPane.add(lblNewLabel);
	
}

	private void iniciar() {
		this.controller.atualizaTabela();
		
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}
	
}
