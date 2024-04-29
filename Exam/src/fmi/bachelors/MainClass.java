package fmi.bachelors;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void printInfo(ArrayList<Item> items) {
		for (Item i : items) {
			if (i instanceof Book) {
				Book temp = (Book) i;
				System.err.println(
						temp.getName() + " " + temp.getYearMade() + " " + temp.getPages() + " " + temp.getGenre());
			} else {
				Magazine temp = (Magazine) i;

				System.err.println(
						temp.getName() + " " + temp.getYearMade() + " " + temp.getPages() + " " + temp.getType());
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<>();

		items.add(new Book("Pod igoto", 1989, 428, "roman"));
		items.add(new Book("Neshto", 2000, 332, "roman"));
		items.add(new Book("Na proshtavane", 1899, 345, "poema"));
		items.add(new Magazine("Playboy", 2012, 36, "ednokraten"));
		items.add(new Magazine("Cars", 2011, 66, "periodichen"));
		items.add(new Magazine("Mars", 2211, 1166, "periodichen"));

		int magCount = 0;
		for (Item i : items) {
			if (i instanceof Magazine) {
				Magazine temp = (Magazine) i;
				if (temp.getType() == "periodichen") {
					magCount++;
				}
			}
		}
		System.out.println("Periodichni spisaniq sa " + magCount + " na broi");
		
		System.out.println("Enter your wanted genre: ");
		
		Scanner sc = new Scanner(System.in);
		String searchingGenre = sc.next();

		for (Item i : items) {
			if (i instanceof Book) {
				Book temp = (Book) i;
				if (temp.getGenre().equals(searchingGenre)) {
					Book.printBook(temp);
				}
			}
		}
	}

}
