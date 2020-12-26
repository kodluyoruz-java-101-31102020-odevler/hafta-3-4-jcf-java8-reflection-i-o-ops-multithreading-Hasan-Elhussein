package soru5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import soru2.Book;

public class Application {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();

		books.add(new Book("AAA", "Ali"  , 2020, 200));
		books.add(new Book("BBB", "Bilal", 2019, 180));
		books.add(new Book("CCC", "Can"  , 2018, 160));
		books.add(new Book("DDD", "Deniz", 2017, 140));
		books.add(new Book("EEE", "Emre" , 2016, 120));
		books.add(new Book("FFF", "Faruk", 2015, 100));
		books.add(new Book("GGG", "Gamze", 2014, 80));
		books.add(new Book("HHH", "Hasan", 2013, 60));
		books.add(new Book("III", "Ihsan", 2012, 40));
		books.add(new Book("JJJ", "James", 2011, 20));

		Stream<Book> stream = books.stream();
		Consumer<? super Book> printer = (book) -> {System.out.println(book);};
		System.out.println("Books without any filter:");
		stream.forEach(printer);

		Predicate<Book> greaterThan100 = (book) -> {

			if (book.getPageCount() > 100)
				return true;

			return false;
		};

		Set<Book> greaterThan100List = books.stream().filter(greaterThan100).collect(Collectors.toSet());
		Consumer<Book> bookPrinter = (book) -> System.out.println(book);
		System.out.println("\nBooks with more than 100 pages only:");
		greaterThan100List.stream().forEach(bookPrinter);
	}

}