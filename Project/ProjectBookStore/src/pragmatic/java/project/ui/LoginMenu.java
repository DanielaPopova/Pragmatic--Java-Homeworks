package pragmatic.java.project.ui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LoginMenu extends JFrame {

	private JPanel contentPane;
	private static JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel lblImage;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu frame = new LoginMenu();
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
	public LoginMenu() {
		
		
				
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Password:");
		lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 137, 29);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();		
		passwordField.setFont(new Font("Broadway", Font.PLAIN, 15));
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		passwordField.setBounds(10, 59, 191, 29);		
		contentPane.add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				WelcomeWindow welcome = new WelcomeWindow();
				
				char[] passWord = passwordField.getPassword();
				String pass = new String(passWord);	
				pass = passwordField.getText(); 
				if (passwordField.getPassword().length == 0) {
					JOptionPane.showMessageDialog(contentPane, "Enter password!");
				} else if (pass.equals("admin")){
					JOptionPane.showMessageDialog(contentPane, "You are logged as Admin");
					welcome.setVisible(true);					
				} else if (pass.equals("user")){
					JOptionPane.showMessageDialog(contentPane, "You are logged as User");
					welcome.setVisible(true);	
					
				} else {
					JOptionPane.showMessageDialog(contentPane, "Wrong password!");
				}
				welcome.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
			}
		});
		btnLogin.setBackground(new Color(255, 160, 122));
		btnLogin.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnLogin.setForeground(new Color(128, 0, 0));
		btnLogin.setBounds(10, 122, 137, 29);
		contentPane.add(btnLogin);
		
		ImageIcon icon = new ImageIcon("res/bookstore.png"); 
		
		lblImage = new JLabel("");
		lblImage.setBounds(239, 21, 116, 115);
		lblImage.setIcon(icon);
		contentPane.add(lblImage);
	}
	
	public static String getPass() {
		char[] passWord = passwordField.getPassword();
		String pass = new String(passWord);	
		pass = passwordField.getText();
		return pass;
	}
	
	
	public static void disableButtons(JButton button, boolean state){   //moje bi shte stane i bez tozi metod
		button.setEnabled(state);
	}
}
