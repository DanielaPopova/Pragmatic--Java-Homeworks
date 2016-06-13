package pragmatic.java.project.model;

import javax.swing.JTable;

@SuppressWarnings("serial")
public class MusicTable extends JTable {

	static protected MusicTable table = null;

	MusicTable(MyMusicModel dm) {

		super(dm);

		this.setFillsViewportHeight(true);

	}

	public static MusicTable getProductsTable() {

		if (MusicTable.table instanceof MusicTable) {
			return MusicTable.table;
		}

		String[] titles = { "Title", "Author", "Recorded", "Price/€", "Number of songs", "Quantity" };

		MyMusicModel model = new MyMusicModel(titles, "res/music.csv");
		MusicTable.table = new MusicTable(model);

		return MusicTable.table;

	}
}


