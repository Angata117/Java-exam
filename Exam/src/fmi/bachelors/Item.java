package fmi.bachelors;

public class Item {
	private String name;
	private int yearMade;
	
	public Item(String name, int yearMade, int pages) {
		super();
		this.name = name;
		this.yearMade = yearMade;
		this.pages = pages;
	}
	private int pages;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
