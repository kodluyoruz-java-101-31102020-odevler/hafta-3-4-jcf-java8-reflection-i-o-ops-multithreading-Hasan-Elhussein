package soru5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import soru2.Book;

public class Application {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Java", "Steve", 2020, 260));
		books.add(new Book("PHP", "Mahmud", 2015, 66));
		books.add(new Book("Python", "Chuck", 2016, 510));
		books.add(new Book("ML", "Sami", 2012, 70));
		books.add(new Book("AI", "Ed", 2002, 480));
		
		books.add(new Book("DS", "Onur", 2020, 260));
		books.add(new Book("CS", "Muhammed", 2015, 88));
		books.add(new Book("SE", "Mahmud", 2016, 220));
		books.add(new Book("CE", "Ahmed", 2012, 200));
		books.add(new Book("CV", "Najeeb", 2002, 99));
		

				System.out.println("Sayfa sayisi 100'den fazla olan kitaplar");
				
				Predicate<Book> pageCountMoreThan100 = (book) -> {
					return (book.getPageCount() > 100 );
				};
				
				Consumer<Book> printer = (book) -> {
					System.out.println(book);
				};
				
				//Map<String, String> booksMap = books.stream().forEach(collect(Collectors.toMap(books.ge, valueMapper)));


				List<Book> pageCountMoreThan100List = books.stream().filter(pageCountMoreThan100).collect(Collectors.toList());

				pageCountMoreThan100List.stream().forEach(printer);
				
				
				
				
	}

}