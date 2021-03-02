package soru1;

import java.util.NoSuchElementException;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty () {
		return this.size == 0;
	}
	
	// Get a Node using an index
	public Node<T> getNode(int index){
		
		Node<T> temp = head;
		
		try {
			
			if(this.size == 0) {
				System.out.println("The list is empty.");
				return null;
			}
			else if(index > this.size || index <= 0)
				throw new NoSuchElementException();
			
			for(int i = 1; i < index; i++) {
				temp = temp.getNext();
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("Input Error.");
			return null;
		}
		
		return temp;
		
	}
	
	
	// Add a node to head
	public void AddToHead(T data) {
		
		if(this.isEmpty()) {
			this.head = new Node<T>(data);
		}
		else {
			Node<T> temp = this.head;
			this.head = new Node<T>(data,null,temp);
			temp.setPrevious(head);
		}
		size++;
		
	}
	
	
	//Add a node to tail
	public void addToTail(T data) {
		
		if(this.isEmpty()) {
			this.head = new Node<T>(data);
		}
		else {
			Node<T> temp = this.head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Node<T>(data,temp,null));
			this.tail = temp.getNext();
		}
		this.size++;
		
	}
	
	//Add a node to the list using an index (adds the new node "before" the existing one)
	public void add(T data, int index) {
		
		Node<T> newNode = new Node<T>(data);
		
		try {
			if(this.size == 0 || index <= 0 || index > this.size)
				throw new NoSuchElementException();
			else if(index == 1)
				this.AddToHead(data);
			else {
				Node<T> temp = this.getNode(index);
				Node<T> prev = temp.getPrevious();
			
				temp.setPrevious(newNode);
				prev.setNext(newNode);
				newNode.setNext(temp);
				newNode.setPrevious(prev);
				
				this.size++;
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("Input error");
			return;
		}
		
	}
	
	//Remove from Head
	public void removeFromHead(){
		
		if(this.size == 1) {
			this.setHead(null);
			this.setTail(null);
			this.setSize(0);
		}
		else {
			this.head = this.head.getNext();
			this.head.setPrevious(null);
		
			this.size--;
		}
		
	}
	
	//Remove from Tail
	public void removeFromTail() {
		
		if(this.size == 1) {
			this.setHead(null);
			this.setTail(null);
			this.setSize(0);
		}
		else {
		
			this.tail = this.tail.getPrevious();
			this.tail.setNext(null);
		
			this.size--;
		}
		
	}
	
	//Remove from index
	public void remove(int index) {
		
		try {
			if(this.isEmpty())
				System.out.println("The list is empty");
			else if(index <= 0 || index > this.size)
				throw new NoSuchElementException();
			else if(index == 1)
				this.removeFromHead();
			else if(index == this.size)
				this.removeFromTail();
			else {
				Node<T> temp = this.getNode(index);
				temp.getPrevious().setNext(temp.getNext());
				temp.getNext().setPrevious(temp.getPrevious());
				
				this.size--;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Input error.");
			return;
		}

	}
	
	
	// *** Setters and Getters ***
	public Node<T> getHead() {
		return head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public Node<T> getTail() {
		return tail;
	}
	
	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	// ***************************
	
}
