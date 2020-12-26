package soru2;

public class Book implements Comparable<Book>{

	private String name;
	private String publisher;
	private int publishYear;
	private int pageCount;
	
	public Book(String name, String publisher, int publishYear, int pageCount) {
		
		this.name = name;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pageCount = pageCount;
		
	}	

	//*** Setters and Getters ***
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	//***************************

	@Override
	public int compareTo(Book o) {

		return this.getName().compareTo(o.getName());
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getName());
		builder.append("-");
		builder.append(this.getPublisher());
		builder.append("-");
		builder.append(this.getPublishYear());
		builder.append("-");
		builder.append(this.getPageCount());
		builder.append("]");
		
		return builder.toString();
		
	}

}