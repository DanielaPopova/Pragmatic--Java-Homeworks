package pragmatic.java.project.ui;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.*;

@SuppressWarnings("serial")
public class WelcomeWindow extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow frame = new WelcomeWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomeWindow() {
		setTitle("Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcomeToOur = new JLabel("Welcome to our Store");
		lblWelcomeToOur.setForeground(new Color(128, 0, 0));
		lblWelcomeToOur.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		lblWelcomeToOur.setBackground(new Color(255, 160, 122));
		lblWelcomeToOur.setFont(new Font("Broadway", Font.BOLD, 25));
		lblWelcomeToOur.setBounds(40, 26, 312, 73);
		contentPane.add(lblWelcomeToOur);

		JButton btnBooks = new JButton("Books");

		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookMenu bookMenu = new BookMenu();
				bookMenu.setVisible(true);
				bookMenu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});

		btnBooks.setForeground(new Color(128, 0, 0));
		btnBooks.setBackground(new Color(255, 160, 122));
		btnBooks.setFont(new Font("Broadway", Font.BOLD, 15));
		btnBooks.setBounds(57, 110, 116, 40);
		contentPane.add(btnBooks);

		JButton btnMusic = new JButton("Music");

		btnMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicMenu musicMenu = new MusicMenu();
				musicMenu.setVisible(true);
				musicMenu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});

		btnMusic.setForeground(new Color(128, 0, 0));
		btnMusic.setBackground(new Color(255, 160, 122));
		btnMusic.setFont(new Font("Broadway", Font.BOLD, 15));
		btnMusic.setBounds(217, 110, 116, 40);
		contentPane.add(btnMusic);
	}
}
