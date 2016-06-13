package pragmatic.java.project.ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import pragmatic.java.project.model.MusicTable;
import pragmatic.java.project.model.MyMusicModel;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class AddMusicMenu extends JDialog {

	private final JPanel contentPane = new JPanel();
	
	private JTextField titleField;
	private JTextField authorField;
	private JTextField yearCreatedFld;
	private JTextField priceField;
	private JButton btnOk;
	private JButton btnCancel;
	private JTextField txtQuantity;
	private JSpinner spinnerNum;
	private JSpinner spinnerQty;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddMusicMenu dialog = new AddMusicMenu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public AddMusicMenu() {
		setTitle("Add Misic");
		setBounds(100, 100, 433, 300);
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setForeground(new Color(128, 0, 0));
		lblTitle.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblTitle.setBounds(10, 15, 47, 28);
		contentPane.add(lblTitle);

		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setForeground(new Color(128, 0, 0));
		lblAuthor.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblAuthor.setBounds(10, 54, 57, 28);
		contentPane.add(lblAuthor);

		JLabel lblPublisher = new JLabel("Year Created");
		lblPublisher.setForeground(new Color(128, 0, 0));
		lblPublisher.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblPublisher.setBounds(10, 93, 113, 28);
		contentPane.add(lblPublisher);

		titleField = new JTextField();
		titleField.setForeground(Color.BLACK);
		titleField.setFont(new Font("Broadway", Font.PLAIN, 13));
		titleField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		titleField.setBounds(60, 16, 337, 28);
		contentPane.add(titleField);
		titleField.setColumns(10);
		titleField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				changed();						
			}			
			@Override
			public void insertUpdate(DocumentEvent e) {
				changed();						
			}					
			@Override
			public void changedUpdate(DocumentEvent e) {
				changed();						
			}					
			
		});

		
		
		authorField = new JTextField();
		authorField.setForeground(Color.BLACK);
		authorField.setFont(new Font("Broadway", Font.PLAIN, 13));
		authorField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		authorField.setBounds(77, 55, 320, 28);
		contentPane.add(authorField);
		authorField.setColumns(10);
		authorField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				changed();						
			}			
			@Override
			public void insertUpdate(DocumentEvent e) {
				changed();						
			}					
			@Override
			public void changedUpdate(DocumentEvent e) {
				changed();						
			}					
			
		});

		yearCreatedFld = new JTextField();
		yearCreatedFld.setForeground(Color.BLACK);
		yearCreatedFld.setFont(new Font("Broadway", Font.PLAIN, 13));
		yearCreatedFld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		yearCreatedFld.setBounds(132, 95, 88, 28);
		contentPane.add(yearCreatedFld);
		yearCreatedFld.setColumns(10);
		yearCreatedFld.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				changed();						
			}			
			@Override
			public void insertUpdate(DocumentEvent e) {
				changed();						
			}					
			@Override
			public void changedUpdate(DocumentEvent e) {
				changed();						
			}					
			
		});

		priceField = new JTextField();
		priceField.setForeground(Color.BLACK);
		priceField.setFont(new Font("Broadway", Font.PLAIN, 15));
		priceField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		priceField.setBounds(334, 93, 63, 28);
		contentPane.add(priceField);
		priceField.setColumns(10);
		priceField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				changed();						
			}			
			@Override
			public void insertUpdate(DocumentEvent e) {
				changed();						
			}					
			@Override
			public void changedUpdate(DocumentEvent e) {
				changed();						
			}					
			
		});

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(128, 0, 0));
		lblPrice.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblPrice.setBounds(277, 97, 47, 21);
		contentPane.add(lblPrice);

		btnOk = new JButton("OK");
		changed();
		btnOk.setForeground(new Color(128, 0, 0));
		btnOk.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnOk.setBackground(new Color(255, 160, 122));
		btnOk.setBounds(107, 215, 89, 36);
		contentPane.add(btnOk);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		btnCancel.setForeground(new Color(128, 0, 0));
		btnCancel.setBackground(new Color(255, 160, 122));
		btnCancel.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnCancel.setBounds(233, 215, 89, 36);
		contentPane.add(btnCancel);

		spinnerNum = new JSpinner();
		spinnerNum.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerNum.setFont(new Font("Broadway", Font.PLAIN, 13));
		spinnerNum.setBounds(163, 148, 57, 28);
		spinnerNum.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				changed();				
			}
		});

		contentPane.add(spinnerNum);

		JLabel lblNumbe = new JLabel("Number of Tracks");
		lblNumbe.setForeground(new Color(128, 0, 0));
		lblNumbe.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblNumbe.setBounds(10, 150, 161, 14);
		contentPane.add(lblNumbe);

		txtQuantity = new JTextField();
		txtQuantity.setBackground(new Color(255, 250, 205));
		txtQuantity.setBorder(null);
		txtQuantity.setForeground(new Color(128, 0, 0));
		txtQuantity.setText("Quantity");
		txtQuantity.setFont(new Font("Broadway", Font.PLAIN, 15));
		txtQuantity.setBounds(245, 149, 79, 21);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);

		spinnerQty = new JSpinner();
		spinnerQty.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerQty.setFont(new Font("Broadway", Font.PLAIN, 13));
		spinnerQty.setBounds(334, 148, 63, 28);
		spinnerQty.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				changed();				
			}
		});
		contentPane.add(spinnerQty);

		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicTable table = MusicTable.getProductsTable();

				MyMusicModel model = (MyMusicModel) table.getModel();

				model.addRow(new String[] { titleField.getText(), authorField.getText(), yearCreatedFld.getText(),
						priceField.getText(), spinnerNum.getValue().toString(), spinnerQty.getValue().toString() });

				setVisible(false);

			}
		});

	}
	
	public void changed() {
		
				
		if (titleField.getText().equals("") || authorField.getText().equals("") || (!(yearCreatedFld.getText()).matches("^(1|2)\\d{3}$")) || (!(priceField.getText()).matches("([0-9]+)*.*[0-9]+"))
			|| ((Integer)spinnerQty.getValue() == 0 || spinnerNum.getValue().equals(""))) {
			btnOk.setEnabled(false);
		} else {
			btnOk.setEnabled(true);
		}
	}	
}