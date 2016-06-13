package pragmatic.java.project.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import pragmatic.java.project.utils.FileService;

@SuppressWarnings("serial")
public class MyBookModel extends AbstractTableModel {
	protected String[] columnNames;
	protected Vector<String[]> data = new Vector<String[]>();
	protected File dataFile;

	public MyBookModel(String[] columnNames, String file) {

		super();
		this.columnNames = columnNames;

		FileService rd = new FileService();

		dataFile = new File(file);

		Vector<String[]> rs2 = rd.readCSVfile(dataFile);
		addCSVData(rs2);

		MyBookModel dm = this;

		addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {

				OutputStream os = null;

				try {
					os = new FileOutputStream(dataFile);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}

				StringBuilder tmp = new StringBuilder();

				for (int c = 0; c < dm.getRowCount(); c++) {

					for (int c1 = 0; c1 < dm.getColumnCount(); c1++) {

						tmp.append(dm.getValueAt(c, c1).toString());
						if (dm.getColumnCount() - 1 != c1) {
							tmp.append(",");
						}

					}
					tmp.append("\n");

				}

				try {
					os.write(tmp.toString().getBytes());
					os.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});

	}

	public void addCSVData(Vector<String[]> data) {

		this.data = data;
		this.fireTableDataChanged();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
		return data.get(row)[col];
	}

	public void addRow(String[] row) {
		data.add(row);
		this.fireTableDataChanged();
	}
	
	public void removeRow(int row){
		data.remove(row);
		this.fireTableDataChanged();
	}
}