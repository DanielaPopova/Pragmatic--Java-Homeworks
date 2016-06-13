package pragmatic.java.project.model;

public class Music extends Product {

	private String yearCreated;
	private String songsNumber;

	public Music(String title, String author, String price, String yearCreated, String songsNumber, Integer quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.yearCreated = yearCreated;
		this.songsNumber = songsNumber;
		this.quantity = quantity;
	}

	public String getYearCreated() {
		return yearCreated;
	}

	public void setYearCreated(String yearCreated) {
		this.yearCreated = yearCreated;
	}

	public String getSongsNumber() {
		return songsNumber;
	}

	public void setSongsNumber(String songsNumber) {
		this.songsNumber = songsNumber;
	}

}
