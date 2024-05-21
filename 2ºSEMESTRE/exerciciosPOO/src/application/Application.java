package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee leonardo = new Employee();
		System.out.print("Employee:  ");
		leonardo.name = sc.nextLine();
		System.out.print("Gross Salary:  ");
		leonardo.grosssalary = sc.nextDouble();
		System.out.print("Tax :  ");
		leonardo.tax = sc.nextDouble();
		System.out.println(leonardo);

		System.out.print("Which percentage to increase salary?");
		double perc = sc.nextDouble();
		leonardo.increaseSalary(perc);
		System.out.println();
		
		System.out.println("Update data: "+ leonardo);

		
		sc.close();
	}

}
