package pragmatic.java.project.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.SoftBevelBorder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import pragmatic.java.project.model.MusicTable;
import pragmatic.java.project.model.MyMusicModel;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MusicMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private TableRowSorter<TableModel> rowSorter;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicMenu frame = new MusicMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MusicMenu() {
		setTitle("Music Menu");
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

		btnSearch.setForeground(new Color(128, 0, 0));
		btnSearch.setBorder(new LineBorder(new Color(255, 160, 122), 1, true));
		btnSearch.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnSearch.setBackground(new Color(255, 160, 122));
		btnSearch.setBounds(493, 39, 100, 33);
		contentPane.add(btnSearch);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, new Color(255, 160, 122)));
		scrollPane.setBounds(10, 104, 964, 293);
		contentPane.add(scrollPane);

		MusicTable musicTable = MusicTable.getProductsTable();

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rowSorter = new TableRowSorter<>(musicTable.getModel());
				String text = textField.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {

					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
				musicTable.setRowSorter(rowSorter);
				musicTable.repaint();

			}
		});

		scrollPane.setViewportView(musicTable);

		JButton btnAdd = new JButton("Add...");
		if (LoginMenu.getPass().equals("user")) {
			btnAdd.setVisible(false);
		} else {
			btnAdd.addActionListener(new ActionListener() {
		
				public void actionPerformed(ActionEvent e) {
					AddMusicMenu addMusic = new AddMusicMenu();
					addMusic.setModal(true);
					addMusic.setVisible(true);
					addMusic.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				}
			});
		}
		btnAdd.setForeground(new Color(128, 0, 0));
		btnAdd.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnAdd.setBackground(new Color(255, 160, 122));
		btnAdd.setBounds(137, 408, 100, 33);
		contentPane.add(btnAdd);

		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (musicTable.getSelectedRow() != -1) {
					BuyDialog buy = new BuyDialog();
					buy.setModal(true);
					buy.setVisible(true);
					buy.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
				} else {
					JOptionPane.showMessageDialog(contentPane, "Select product first!");
				}
			}
		});

		btnBuy.setForeground(new Color(128, 0, 0));
		btnBuy.setFont(new Font("Broadway", Font.BOLD, 15));
		btnBuy.setBackground(new Color(255, 160, 122));
		btnBuy.setBounds(10, 408, 100, 33);
		contentPane.add(btnBuy);
		
		JButton btnDelete = new JButton("Delete");
		if (LoginMenu.getPass().equals("user")) {
			btnDelete.setVisible(false);
		} else {
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (musicTable.getSelectedRow() != -1 ) {
						removeRow();		
					}else {
						JOptionPane.showMessageDialog(contentPane, "Select product first!");
					}	
				}
			});
		}
		btnDelete.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnDelete.setBackground(new Color(255, 160, 122));
		btnDelete.setForeground(new Color(128, 0, 0));
		btnDelete.setBounds(751, 408, 100, 33);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBackground(new Color(255, 160, 122));
		btnCancel.setForeground(new Color(128, 0, 0));
		btnCancel.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnCancel.setBounds(874, 408, 100, 33);
		contentPane.add(btnCancel);
		
		JButton btnEdit = new JButton("Edit...");
		if (LoginMenu.getPass().equals("user")) {
			btnEdit.setVisible(false);
		} else {
			btnEdit.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
										
				}
			});
		}
		btnEdit.setFont(new Font("Broadway", Font.PLAIN, 15));
		btnEdit.setBackground(new Color(255, 160, 122));
		btnEdit.setForeground(new Color(128, 0, 0));
		btnEdit.setBounds(265, 408, 100, 33);
		contentPane.add(btnEdit);
	}
	
	private void removeRow() {		
		
		MusicTable musicTable = MusicTable.getProductsTable();
		MyMusicModel bm = (MyMusicModel)musicTable.getModel();
		
		if (musicTable.getSelectedRow() != -1 ) {
			bm.removeRow(musicTable.getSelectedRow()); 
		}
	}
}