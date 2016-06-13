package pragmatic.java.project.ui;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;


import javax.swing.border.SoftBevelBorder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import pragmatic.java.project.model.BookTable;
import pragmatic.java.project.model.MyBookModel;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.event.*;


@SuppressWarnings("serial")
public class BookMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private BookTable bookTable;
	private TableRowSorter<TableModel> rowSorter;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMenu frame = new BookMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookMenu() {
		setTitle("Book Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setForeground(new Color(128, 0, 0));
		lblSearch.setFont(new Font("Broadway", Font.PLAIN, 12));
		lblSearch.setBounds(10, 11, 66, 25);
		contentPane.add(lblSearch);

		textField = new JTextField();
		textField.setFont(new Font("Broadway", Font.PLAIN, 11));
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 160, 122), null));
		textField.setBounds(10, 40, 463, 33);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rowSorter = new TableRowSorter<>(bookTable.getModel());
				String text = textField.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {

					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
				bookTable.setRowSorter(rowSorter);
				bookTable.repaint();

			}
		});		

		btnSearch.setForeground(new Color(128, 0, 0));
		btnSearch.setBorder(new LineBorder(new Color(255, 160, 122), 1, true));
		btnSearch.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnSearch.setBackground(new Color(255, 160, 122));
		btnSearch.setBounds(491, 39, 100, 33);
		contentPane.add(btnSearch);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, new Color(255, 160, 122)));
		scrollPane.setBounds(10, 104, 964, 293);
		contentPane.add(scrollPane);
		
		bookTable = BookTable.getProductsTable();
		bookTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(bookTable);		

		JButton addButton = new JButton("Add...");
		if (LoginMenu.getPass().equals("user")) {
			addButton.setVisible(false);
		} else {
			addButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddBookMenu addBook = new AddBookMenu();
					addBook.setModal(true);
					addBook.setVisible(true);			
					addBook.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				}
			});	
		}	
		addButton.setForeground(new Color(128, 0, 0));
		addButton.setFont(new Font("Broadway", Font.PLAIN, 15));
		addButton.setBackground(new Color(255, 160, 122));
		addButton.setBounds(140, 408, 100, 33);
		contentPane.add(addButton); 

		JButton buyButton = new JButton("Buy");
		buyButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (bookTable.getSelectedRow() != -1) {
					BuyDialog buy = new BuyDialog();
					buy.setModal(true);
					buy.setVisible(true);
					buy.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
				} else {
					JOptionPane.showMessageDialog(contentPane, "Select product first!");
				}
			}
		});
		buyButton.setForeground(new Color(128, 0, 0));
		buyButton.setFont(new Font("Broadway", Font.PLAIN, 15));
		buyButton.setBackground(new Color(255, 160, 122));
		buyButton.setBounds(10, 408, 100, 33);
		contentPane.add(buyButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		cancelButton.setBackground(new Color(255, 160, 122));
		cancelButton.setFont(new Font("Broadway", Font.PLAIN, 15));
		cancelButton.setForeground(new Color(128, 0, 0));
		cancelButton.setBounds(874, 408, 100, 33);
		contentPane.add(cancelButton);
		
		JButton deleteButton = new JButton("Delete");
		if (LoginMenu.getPass().equals("user")) {
			deleteButton.setVisible(false);
		} else {
			deleteButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					if (bookTable.getSelectedRow() != -1 ) {
						removeRow();		
					} else {
						JOptionPane.showMessageDialog(contentPane, "Select product first!"); 
					}
				}		
			});
		}		
		
		deleteButton.setBackground(new Color(255, 160, 122));
		deleteButton.setFont(new Font("Broadway", Font.PLAIN, 15));
		deleteButton.setForeground(new Color(128, 0, 0));
		deleteButton.setBounds(741, 408, 100, 33);
		contentPane.add(deleteButton);
		
		JButton editButton = new JButton("Edit...");
		if (LoginMenu.getPass().equals("user")) {
			editButton.setVisible(false);
		} else {
			editButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
										
				}
			});
		}
		editButton.setFont(new Font("Broadway", Font.PLAIN, 15));
		editButton.setBorder(null);
		editButton.setBackground(new Color(255, 160, 122));
		editButton.setForeground(new Color(128, 0, 0));
		editButton.setBounds(271, 408, 100, 33);
		contentPane.add(editButton);
	}
	
	private void removeRow() {		
		
		BookTable bookTable = BookTable.getProductsTable();
		MyBookModel bm = (MyBookModel)bookTable.getModel();
		
		if (bookTable.getSelectedRow() != -1 ) {
			bm.removeRow(bookTable.getSelectedRow()); 
		}
	}
}
