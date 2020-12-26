package soru2;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<Book> books = new TreeSet<Book>();
		books.add(new Book("AAA", "Ali", 2020, 100));
		books.add(new Book("CCC", "Can", 2018, 80));
		books.add(new Book("BBB", "Bilal", 2019, 90));
		books.add(new Book("EEE", "Emre", 2016, 60));
		books.add(new Book("DDD", "Deniz", 2017, 70));
		books.add(new Book("FFF", "Faruk", 2015, 50));
		
		System.out.println("Sorted by Name:");
		
		for(Object book : books)
			System.out.println(book);
	
		BookComparatorByPageCount comp = new BookComparatorByPageCount();
		Set<Book> books2 = new TreeSet<Book>(comp);
		books2.addAll(books);
		
		System.out.println("\nSorted by PageCount:");
		for(Object book : books2)
			System.out.println(book);
		
	}
	
}