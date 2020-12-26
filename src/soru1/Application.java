package soru1;

public class Application {
	
	public static void main(String[] args) {
		
		LinkedList<Comparable> list = new LinkedList();
		
		int i = 2;
		
		list.AddToHead(123);
		list.addToTail("Hello");
		list.addToTail("Java");
		list.add("Hi",2);
		
		System.out.println("List size: " + list.getSize());
		System.out.println("Value at (" + i + ") : " +  list.getNode(i).getData());
		System.out.println("Value at Head: " + list.getHead().getData());
		System.out.println("Value at Tail: " + list.getTail().getData());
		
		list.remove(1);
		System.out.println("List size: " + list.getSize());
		list.removeFromTail();
		System.out.println("List size: " + list.getSize());
		list.removeFromHead();
		System.out.println("List size: " + list.getSize());
		list.removeFromHead();
		System.out.println("List size: " + list.getSize());
		
		
	}

}
