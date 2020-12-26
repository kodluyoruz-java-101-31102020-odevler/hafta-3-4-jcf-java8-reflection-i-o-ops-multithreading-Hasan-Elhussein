package soru7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Application {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10000; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);

		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		int start = 0, end = 2500;
		for (int i = 0; i < 4; i++) {
			EvenOddThread evenOddArray = new EvenOddThread(numbers.subList(start, end));
			start = end;
			end = end + 2500;
			threadPoolExecutor.execute(evenOddArray);
		}
		threadPoolExecutor.shutdown();
	}
	
}