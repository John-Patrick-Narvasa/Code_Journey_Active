package main;

import java.util.Scanner;
import Details.BankAccount;

public class MainProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		BankAccount Peter = new BankAccount();
		Peter.accountNumber = "8102948129049";
		Peter.accountHolder = "Peter Parker";
		Peter.balance = 10_000.00;
		
		boolean continueProg = true;

		while(continueProg) {
			if (continueProg = true) {
				System.out.println("Choices");
				System.out.println(
						"1. Display Bank Details" + "\n"
								+ "2. Deposit" + "\n"
								+ "3. Withdraw" + "\n"
								+ "4. Exit" + "\n"
						);
				System.out.print("Input account name: ");
				
				System.out.print("\nInput choice: ");
				int choice = input.nextInt();
				
				choicesInput(choice, Peter);				
			}
			else {
				System.out.println("Thank you for using this program :)");
				continueProg = false;
				input.close();
			}

		}
	}
	
	public static void choicesInput(int choice, BankAccount acc) {
		Scanner input = new Scanner (System.in);
		if (choice == 1) {
			acc.displayAccountInfo();
		}
		else if (choice == 2) {
			System.out.print("How much would you like to deposit: ");
			double amount = input.nextDouble();
			acc.deposit(amount);
		}
		else if (choice == 3) {
			System.out.print("How much would you like to withdraw: ");
			double amount = input.nextDouble();
			acc.withdraw(amount);
		}

	}
}
