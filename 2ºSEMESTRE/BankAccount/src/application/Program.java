package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the account number: ");
		final int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the account holder: ");
		String name = sc.nextLine();
		
		
		System.out.println();
		System.out.println("Is there a initial deposit? y/n");
		char dep = sc.next().charAt(0);
		BankAccount account = new BankAccount(number,name);
		
		if (dep == 'y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			account.deposit(value);
		}
		
		System.out.println("Account data:\n " + account);
		
		System.out.println("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Upgrade account data:\n " + account);
		
		System.out.println("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());

		System.out.println("Upgrade account data:\n " + account);

		
		sc.close();
	}

}
