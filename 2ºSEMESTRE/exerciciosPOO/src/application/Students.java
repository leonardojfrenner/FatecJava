package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Students {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Enter the student's name : ");
		student.name= sc.nextLine();
		System.out.println("Enter the weight of the grades for the first term: ");
		student.firstQuarter = sc.nextDouble();
		System.out.println("Enter the weight of the grades for the second term:");
		student.secondQuarter = sc.nextDouble();
		System.out.println("Enter the weight of the grades for the third term:");
		student.thirdQuarter = sc.nextDouble();
		
		student.finalGrade();
		System.out.println(student);
		sc.close();
	}

}
