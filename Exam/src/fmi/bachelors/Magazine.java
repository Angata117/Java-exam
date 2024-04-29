package fmi.bachelors;

public class Magazine extends Item {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Magazine(String name, int yearMade, int pages, String type) {
		super(name, yearMade, pages);
		this.type = type;
	}

	public static void printMagazine() {
		System.out.println(this.getName() + " " + this.getYearMade() + " " + this.getPages() + " " + this.getType());
	}

}
