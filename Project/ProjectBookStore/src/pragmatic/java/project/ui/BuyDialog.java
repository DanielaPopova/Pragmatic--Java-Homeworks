package pragmatic.java.project.ui;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


@SuppressWarnings("serial")
public class BuyDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	public static void main(String[] args) {
		try {
			BuyDialog dialog = new BuyDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public BuyDialog() {
		setTitle("Purchase");
		setBounds(100, 100, 360, 210);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 344, 135);
		contentPanel.setBackground(new Color(255, 250, 205));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 160, 122)));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("How many would you like to buy?");
			lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
			lblNewLabel.setForeground(new Color(128, 0, 0));
			lblNewLabel.setFont(new Font("Broadway", Font.PLAIN, 15));
			lblNewLabel.setBounds(32, 24, 277, 25);
			contentPanel.add(lblNewLabel);
		}
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.setFont(new Font("Broadway", Font.PLAIN, 15));
		spinner.setBounds(143, 60, 54, 30);
		contentPanel.add(spinner);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 135, 344, 37);
			buttonPane.setBackground(new Color(255, 250, 205));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton buyButton = new JButton("Buy");
				buyButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Object o = spinner.getValue();
						Number n = (Number) o;
						int i = n.intValue();	
						
						if(i > 0){
							JOptionPane.showMessageDialog(contentPanel, "Your purchace was successful");
							
						} else {
							JOptionPane.showMessageDialog(contentPanel, "Enter a number");
						
						}
						
						//if((Integer)spinner.getValue() < )
						
						
					}
				});
				buyButton.setBackground(new Color(255, 160, 122));
				buyButton.setForeground(new Color(128, 0, 0));
				buyButton.setFont(new Font("Broadway", Font.PLAIN, 15));
				buyButton.setActionCommand("Buy");
				buttonPane.add(buyButton);
				getRootPane().setDefaultButton(buyButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Broadway", Font.PLAIN, 15));
				cancelButton.setForeground(new Color(128, 0, 0));
				cancelButton.setBackground(new Color(255, 160, 122));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
			}
		}
	}
}
