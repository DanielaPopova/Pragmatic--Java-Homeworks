package pragmatic.java.project.model;

import javax.swing.JTable;

@SuppressWarnings("serial")
public class BookTable extends JTable {

	static protected BookTable table = null;

	BookTable(MyBookModel dm) {

		super(dm);

		this.setFillsViewportHeight(true);

	}

	public static BookTable getProductsTable() {

		if (BookTable.table instanceof BookTable) {
			return BookTable.table;
		}

		String[] titles = { "Title", "Author", "Publisher", "Price/€", "Origins", "Quantity" };

		MyBookModel model = new MyBookModel(titles, "res/book.csv");
		BookTable.table = new BookTable(model);

		return BookTable.table;

	}
}


