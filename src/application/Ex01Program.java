package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Ex01Account;
import model.exceptions.Ex01BalanceException;

public class Ex01Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Ex01Account acc = new Ex01Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount to withdraw: ");
		double amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.print("New balance:" + acc);
		} 
		catch (Ex01BalanceException e) {
			System.out.println("Withdraw error:" + e.getMessage());
		}
		
		sc.close();
	}
}
