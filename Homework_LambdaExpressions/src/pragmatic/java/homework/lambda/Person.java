package pragmatic.java.homework.lambda;

public class Person {
	
	private String name;
	private int height;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	
	
}
