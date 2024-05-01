package bankAccount;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Update account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		System.out.print("Is there any initial deposit (y/n)?");
		char answear = sc.next().charAt(0);
		
		if(answear == 'y') {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Update(accountNumber, holderName, initialDeposit);
		} else {
			account = new Update(accountNumber, holderName);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.bankDeposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.bankWithdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();

	}

}
