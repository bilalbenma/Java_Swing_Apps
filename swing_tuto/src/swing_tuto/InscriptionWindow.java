package swing_tuto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;


import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InscriptionWindow  {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Registerwindow window = new Registerwindow();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public InscriptionWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 438, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(250, 190, 88));
		panel.setBounds(0, 0, 441, 53);
		frame.getContentPane().add(panel);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblRegister.setBounds(10, 11, 240, 31);
		panel.add(lblRegister);
		
		JLabel label_3 = new JLabel("X");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_3.setBounds(414, 11, 17, 31);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_4.setBounds(387, 11, 17, 31);
		panel.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(58, 83, 155));
		panel_1.setBounds(0, 52, 441, 600);
		frame.getContentPane().add(panel_1);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstName.setBounds(10, 72, 150, 22);
		panel_1.add(lblFirstName);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(10, 203, 102, 22);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBackground(new Color(58, 83, 155));
		textField.setBounds(202, 72, 191, 30);
		panel_1.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBackground(new Color(58, 83, 155));
		passwordField.setBounds(202, 204, 191, 29);
		panel_1.add(passwordField);
		
		JButton button = new JButton("Login");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(33, 150, 243));
		button.setBounds(246, 528, 89, 36);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(new Color(229, 57, 53));
		button_1.setBounds(127, 528, 89, 36);
		panel_1.add(button_1);
		
		JLabel lblClickHereTo = new JLabel("Click here to Login");
		lblClickHereTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				new LoginForm();
				frame.dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClickHereTo.setForeground(new Color(229,57,53));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblClickHereTo.setForeground(Color.WHITE);
			}
		});
		
		
		
		
		lblClickHereTo.setForeground(Color.WHITE);
		lblClickHereTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClickHereTo.setBounds(180, 575, 213, 14);
		panel_1.add(lblClickHereTo);
		
		JLabel lblLastname = new JLabel("LastName:");
		lblLastname.setForeground(Color.WHITE);
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLastname.setBounds(10, 138, 102, 22);
		panel_1.add(lblLastname);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(58, 83, 155));
		textField_1.setBounds(202, 138, 191, 30);
		panel_1.add(textField_1);
		
		JLabel lblRetypePassword = new JLabel("Retype Password:");
		lblRetypePassword.setForeground(Color.WHITE);
		lblRetypePassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRetypePassword.setBounds(10, 267, 182, 22);
		panel_1.add(lblRetypePassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.WHITE);
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField_1.setBackground(new Color(58, 83, 155));
		passwordField_1.setBounds(202, 268, 191, 29);
		panel_1.add(passwordField_1);
		
		JLabel lblBirthdate = new JLabel("BirthDate:");
		lblBirthdate.setForeground(Color.WHITE);
		lblBirthdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBirthdate.setBounds(10, 328, 182, 22);
		panel_1.add(lblBirthdate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(202, 328, 191, 30);
		panel_1.add(dateChooser);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(10, 406, 182, 22);
		panel_1.add(lblAddress);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBounds(202, 384, 229, 111);
		textField_2.setBackground(new Color(58, 83, 155));
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		
	}
}
