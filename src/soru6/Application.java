package soru6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import soru3.Student;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		File file = new File("src\\soru6\\StudentsList.txt");
		
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("Created file: " + file.getName());
				} else {
		        System.out.println("File already exists.");
		        }
			} catch (IOException e) {
		      System.out.println("IO error.");
		      }
		
		List<Student> studentsList = new LinkedList<Student>();

		System.out.println("Enter the amount of students you want to add:");
		int count =scan.nextInt();
		
		for(int i = 1; i <= count; i++) {
			System.out.println("Enter " + i + ". student's Id Number:");
			String studentId = scan.next();
			System.out.println("Enter " + i + ". student's Name:");
			String firstName = scan.next();
			System.out.println("Enter " + i +". student's Last Name:");
			String lastName = scan.next();
			System.out.println("Enter " + i + ". student's Age:");
			String age= scan.next();
			System.out.println("Enter " + i +". student's Department:");
			scan.nextLine();
			String department = scan.nextLine();
			studentsList.add(new Student(studentId, firstName, lastName, age, department) );
		}
		
		write(studentsList);
		read(file);
		
		scan.close();
	}
	
	public static void write(List<Student> studentsList) {
		
		try {
			FileWriter writer = new FileWriter("src\\soru6\\StudentsList.txt");
			writer.write(studentsList.toString());
			writer.close();
			} catch (IOException e) {
				System.out.println("IO error.");
			}
	}
	
	public static void read(File file) {
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
	        }
			reader.close();
			} catch (IOException e) {
				System.out.println("IO error.");
			}
	}
	
	
}