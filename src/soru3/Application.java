package soru3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Student Id number: ");
		String studentNo = scan.next();
		System.out.print("Enter your Name: ");
		String name = scan.next();
		System.out.print("Enter your Last Name: ");
		String surName = scan.next();
		System.out.print("Enter your Age: ");
		String age = scan.next();
		System.out.print("Enter your Department: ");
		scan.nextLine();
		String department = scan.nextLine();
		
		scan.close();
		
		
		Map<String, List<Student>> studentInformationMap = new HashMap<String, List<Student>>();
		studentInformationMap.put(studentNo,Arrays.asList(new Student(studentNo,name, surName,age,department)));
		
		
		System.out.println(studentInformationMap);

	}

}