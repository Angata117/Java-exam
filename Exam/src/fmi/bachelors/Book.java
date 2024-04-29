package fmi.bachelors;

public class Book extends Item {

	private String genre;

	public Book(String name, int yearMade, int pages, String genre) {
		super(name, yearMade, pages);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public static void printBook(Book book) {
		System.out.println(book.getName() + " " + book.getYearMade() + " " + book.getPages() + " " + book.getGenre());
	}
}
