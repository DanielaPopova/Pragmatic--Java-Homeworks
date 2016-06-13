package pragmatic.java.homework.javaui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginSwing {
	
	private JFrame frame;                             
	private JTextField userName;
	private JLabel userNameLabel;
	private JPasswordField password;
	private JLabel passwordLabel;
	private JButton login;
	
	public void createUI(){
		
		frame = new JFrame("LoginSwingDemo");
		frame.getContentPane().setLayout(null);
		frame.setSize(400, 200);
		
		userNameLabel = new JLabel();
		userNameLabel.setText("Username");
		userNameLabel.setBounds(20, 20, 70, 30);
		frame.getContentPane().add(userNameLabel);
		
		userName = new JTextField();
		userName.setBounds(90, 20, 100, 30);
		frame.getContentPane().add(userName);
		
		passwordLabel = new JLabel();
		passwordLabel.setText("Password");
		passwordLabel.setBounds(20, 60, 70, 30);
		frame.getContentPane().add(passwordLabel);
		
		password = new JPasswordField();
		password.setBounds(90, 60, 100, 30);
		frame.getContentPane().add(password);
		
		login = new JButton("LOGIN");
		login.setBounds(220, 25, 100, 60);
		login.setFont(new Font("Arial", Font.BOLD, 20));		
		login.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {				
				if (userName.getText().equals("") || password.getText().equals("")) {
					//login.setEnabled(false);     
					JOptionPane.showMessageDialog(frame, "Enter username and password!", "Progress", JOptionPane.WARNING_MESSAGE);					 
				} else {
					//login.setEnabled(true);
					JOptionPane.showMessageDialog(frame, "You have logged in!", "Progress", JOptionPane.INFORMATION_MESSAGE);				}				
			}			
		});		
		frame.getContentPane().add(login);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void showUI() {                      
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		
		LoginSwing swingUI = new LoginSwing();
		swingUI.createUI();
		swingUI.showUI();
	}

}
