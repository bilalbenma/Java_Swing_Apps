package swing_tuto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;


import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class LoginForm  {

	private JFrame frame;
	private JTextField userTextField;
	private JTextField passTextField;
	private JTextField txtGhg;
	private JPasswordField passwordField_1;
	
	private InscriptionWindow reg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 370, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);// pour centrer la fen�tre
		frame.setVisible(true);
		
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(0, 0, 369, 53);
		headerPanel.setBackground(new Color(250,190,88));
		frame.getContentPane().add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 240, 31);
		headerPanel.add(lblNewLabel);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblX.setBounds(423, 11, 27, 31);
		headerPanel.add(lblX);
		
		JLabel label = new JLabel("-");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 23));
		label.setBounds(396, 11, 17, 31);
		headerPanel.add(label);
		
		JLabel jlabelClose = new JLabel("X");
		jlabelClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jlabelClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				System.exit(0);
			}
		});
		jlabelClose.setForeground(Color.WHITE);
		jlabelClose.setFont(new Font("Tahoma", Font.BOLD, 23));
		jlabelClose.setBounds(342, 11, 17, 31);
		headerPanel.add(jlabelClose);
		
		JLabel jlabelMin = new JLabel("-");
		jlabelMin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jlabelMin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 frame.setState(JFrame.ICONIFIED);
			}
		});
		jlabelMin.setForeground(Color.WHITE);
		jlabelMin.setFont(new Font("Tahoma", Font.BOLD, 23));
		jlabelMin.setBounds(315, 11, 17, 31);
		headerPanel.add(jlabelMin);
		
		JPanel bodyPanel = new JPanel();
		bodyPanel.setBounds(0, 53, 369, 261);
		bodyPanel.setBackground(new Color(58,83,155));
		frame.getContentPane().add(bodyPanel);
		bodyPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 72, 102, 22);
		bodyPanel.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(10, 139, 102, 22);
		bodyPanel.add(lblPassword);
		
		txtGhg = new JTextField();
		txtGhg.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtGhg.setForeground(new Color(255, 255, 255));
		txtGhg.setBackground(new Color(58,83,155));
		txtGhg.setBounds(122, 71, 191, 30);
		bodyPanel.add(txtGhg);
		txtGhg.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField_1.setForeground(new Color(255, 255, 255));
		passwordField_1.setBounds(122, 139, 191, 29);
		passwordField_1.setBackground(new Color(58,83,155));
		bodyPanel.add(passwordField_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color (33,150,243));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(238, 179, 89, 36);
		bodyPanel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color (229,57,53));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(119, 179, 89, 36);
		bodyPanel.add(btnCancel);
		
		JLabel lblRegister = new JLabel("Click here to create a new account");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				reg= new InscriptionWindow();
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblRegister.setForeground(new Color(229,57,53));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				lblRegister.setForeground(Color.WHITE);
			}
		});
		
		
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setBounds(116, 226, 213, 14);
		bodyPanel.add(lblRegister);
		
		JLabel label_1 = new JLabel("Login Form");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_1.setBounds(249, 11, 240, 31);
		frame.getContentPane().add(label_1);
		
		
		
		
		
		
	}
}
