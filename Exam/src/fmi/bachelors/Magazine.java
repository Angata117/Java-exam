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

	public static void printMagazine(Magazine mag) {
		System.out.println(mag.getName() + " " + mag.getYearMade() + " " + mag.getPages() + " " + mag.getType());
	}

}
