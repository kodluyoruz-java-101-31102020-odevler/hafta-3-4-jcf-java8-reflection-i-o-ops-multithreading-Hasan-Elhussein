package soru7;

import java.util.ArrayList;
import java.util.List;

public class EvenOddThread extends Thread {

	private List<Integer> numbers;
	private List<Integer> evenNumbers = new ArrayList<Integer>();
	private List<Integer> oddNumbers = new ArrayList<Integer>();

	public EvenOddThread(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {
		
		synchronized (this) {
			
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i)%2 == 0){
					evenNumbers.add(i);
					System.out.println(Thread.currentThread().getName() + ": " + numbers.get(i) + " Even");
				}
				else {
					oddNumbers.add(i);
                    System.out.println(Thread.currentThread().getName() + ": " + numbers.get(i) + " Odd");
                }
			ThreadSleeper.sleep(10);
			}
			
		}
		
	}
	
	
	public List<Integer> getEvenNumbers() {
		return evenNumbers;
	}

	public List<Integer> getOddNumbers() {
		return oddNumbers;
	}
	
	
}