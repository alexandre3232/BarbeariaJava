package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.MenuPrincipalController;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class PaginaPrincipal extends JFrame {

	private JPanel contentPane;
	private ActionListener actionListener;
	private MenuPrincipalController controller;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaPrincipal frame = new PaginaPrincipal();
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
	public PaginaPrincipal() {
		initComponents();
		this.controller = new MenuPrincipalController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu newMenu = new JMenu("New menu");
		
		JMenuItem newMenuItem = new JMenuItem("New menu item");
		newMenu.add(newMenuItem);
		JMenuItem servicoItem = new JMenuItem("Serviço");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setBounds(0, 0, 746, 26);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		mnNewMenu.setBackground(Color.GRAY);
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/icone/cliente-icon.png")));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Servi\u00E7o");
		mntmNewMenuItem_1.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/icone/usuario-icon.png")));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Opera\u00E7\u00E3o");
		mnNewMenu_1.setBackground(Color.GRAY);
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Agendamento");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				controller.navegaParaAgenda();
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/icone/agenda-icon.png")));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		
		JMenu mnNewMenu_2 = new JMenu("Relatorio");
		mnNewMenu_2.setForeground(Color.BLACK);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Relatorios");
		mntmNewMenuItem_3.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/icone/relatorioTrabalho-icon.png")));
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/imagem/fundo-MenuPrincipal.jpg")));
		lblNewLabel.setBounds(0, 0, 746, 694);
		contentPane.add(lblNewLabel);
		setVisible(true);
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
