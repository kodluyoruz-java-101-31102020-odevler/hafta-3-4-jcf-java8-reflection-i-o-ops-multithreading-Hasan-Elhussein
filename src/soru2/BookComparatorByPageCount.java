package soru2;

import java.util.Comparator;

public class BookComparatorByPageCount implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		
		int book1PageCount = o1.getPageCount();
		int book2PageCount = o2.getPageCount();
		
		if(book2PageCount > book1PageCount)
			return -1;
		else if(book1PageCount > book2PageCount)
			return 1;
		else
			return 0;
	}

}