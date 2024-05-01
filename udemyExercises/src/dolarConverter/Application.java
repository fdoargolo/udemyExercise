package dolarConverter;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		double dollarQuantity = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.conversion(dollarPrice, dollarQuantity));
		sc.close();
	}

}
