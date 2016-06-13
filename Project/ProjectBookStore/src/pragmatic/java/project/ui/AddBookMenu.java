package pragmatic.java.project.ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import pragmatic.java.project.model.BookTable;
import pragmatic.java.project.model.MyBookModel;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class AddBookMenu extends JDialog {

	private JTextField titleFld;
	private JTextField authorFld;
	private JTextField publisherFld;
	private JTextField priceFld;
	private JButton btnOk, btnCancel;	
	private JTextField txtQuantity;
	private JSpinner spinner;
	private ButtonGroup group;
	private JRadioButton rdbtnLocal, rdbtnForeign;

	private final JPanel contentPane = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddBookMenu dialog = new AddBookMenu();			
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddBookMenu() {
		setTitle("Add Book");
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

		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setForeground(new Color(128, 0, 0));
		lblPublisher.setFont(new Font("Broadway", Font.PLAIN, 15));
		lblPublisher.setBounds(10, 93, 79, 28);
		contentPane.add(lblPublisher);

		titleFld = new JTextField();
		titleFld.setFont(new Font("Broadway", Font.PLAIN, 13));
		titleFld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		titleFld.setBounds(60, 16, 337, 28);
		contentPane.add(titleFld);
		titleFld.setColumns(10);
		titleFld.getDocument().addDocumentListener(new DocumentListener() {
			
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

		authorFld = new JTextField();
		authorFld.setFont(new Font("Broadway", Font.PLAIN, 13));
		authorFld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		authorFld.setBounds(77, 55, 320, 28);
		contentPane.add(authorFld);
		authorFld.setColumns(10);
		authorFld.getDocument().addDocumentListener(new DocumentListener() {
			
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

		publisherFld = new JTextField();
		publisherFld.setFont(new Font("Broadway", Font.PLAIN, 13));
		publisherFld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		publisherFld.setBounds(99, 94, 298, 28);
		contentPane.add(publisherFld);
		publisherFld.setColumns(10);
		publisherFld.getDocument().addDocumentListener(new DocumentListener() {
			
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

		priceFld = new JTextField();
		priceFld.setFont(new Font("Broadway", Font.PLAIN, 13));
		priceFld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		priceFld.setBounds(61, 155, 63, 28);
		contentPane.add(priceFld);
		priceFld.setColumns(10);
		priceFld.getDocument().addDocumentListener(new DocumentListener() {
			
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
		lblPrice.setBounds(10, 159, 47, 21);
		contentPane.add(lblPrice);

		btnOk = new JButton("OK");
		changed();
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTable table = BookTable.getProductsTable();

				MyBookModel model = (MyBookModel)table.getModel();

				model.addRow(new String[] { titleFld.getText(), authorFld.getText(), publisherFld.getText(),
						priceFld.getText(), ((rdbtnForeign.isSelected() || rdbtnLocal.isSelected()) ? rdbtnForeign.getText() : rdbtnLocal.getText()), spinner.getValue().toString()});

				table.repaint();
				setVisible(false);

			}
		});
		btnOk.setForeground(new Color(128, 0, 0));
		btnOk.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnOk.setBackground(new Color(255, 160, 122));
		btnOk.setBounds(103, 215, 89, 36);
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
		btnCancel.setBounds(216, 215, 89, 36);
		contentPane.add(btnCancel);

		txtQuantity = new JTextField();
		txtQuantity.setBorder(null);
		txtQuantity.setBackground(new Color(255, 250, 205));
		txtQuantity.setForeground(new Color(128, 0, 0));
		txtQuantity.setFont(new Font("Broadway", Font.PLAIN, 15));
		txtQuantity.setText("Quantity");
		txtQuantity.setBounds(153, 155, 79, 28);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);

		spinner = new JSpinner();
		spinner.setFont(new Font("Broadway", Font.PLAIN, 13));
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.setBounds(237, 155, 47, 28);
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				changed();				
			}
		});
		contentPane.add(spinner);

		rdbtnForeign = new JRadioButton("foreign");
		rdbtnForeign.setBackground(new Color(255, 250, 205));
		rdbtnForeign.setForeground(new Color(128, 0, 0));
		rdbtnForeign.setFont(new Font("Broadway", Font.PLAIN, 12));
		rdbtnForeign.setBounds(317, 145, 71, 23);
		rdbtnForeign.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				changed();				
			}
		});
		contentPane.add(rdbtnForeign);

		rdbtnLocal = new JRadioButton("local");
		rdbtnLocal.setForeground(new Color(128, 0, 0));
		rdbtnLocal.setFont(new Font("Broadway", Font.PLAIN, 12));
		rdbtnLocal.setBackground(new Color(255, 250, 205));
		rdbtnLocal.setBounds(317, 171, 63, 23);
		rdbtnLocal.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				changed();				
			}
		});
		contentPane.add(rdbtnLocal);

		group = new ButtonGroup();
		group.add(rdbtnForeign);
		group.add(rdbtnLocal); 

		List<String> bookList = new ArrayList<>();
		bookList.add(titleFld.getText());
		bookList.add(authorFld.getText());
		bookList.add(priceFld.getText());
		bookList.add(publisherFld.getText());
		bookList.add(spinner.getValue().toString());

		if (group.equals(rdbtnForeign)) {
			bookList.add(rdbtnForeign.getText());
		} else {
			bookList.add(rdbtnLocal.getText());
		}

	}
	
	public void changed() {
		if (titleFld.getText().equals("") || authorFld.getText().equals("") || publisherFld.getText().equals("") || (!(priceFld.getText()).matches("([0-9]+)*.*[0-9]+"))
			|| ((Integer)spinner.getValue() == 0 || spinner.getValue().equals("")) || (!rdbtnForeign.isSelected() && !rdbtnLocal.isSelected())) {
			btnOk.setEnabled(false);
		} else {
			btnOk.setEnabled(true);
		}
	}	
}