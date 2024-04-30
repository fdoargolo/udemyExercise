package salaryEmployee;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		double salary = employee.NetSalary();
		
		System.out.println("Employee: " + employee.name + ", $ "+ salary );
		
		System.out.print("Which percentage to increase salary?");
		double increase = sc.nextDouble();
		sc.close();
		
		employee.IncreaseSalary(increase);
		System.out.println("Updated data: "+ employee);
		
	}

}
