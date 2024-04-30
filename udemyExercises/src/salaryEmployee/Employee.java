package salaryEmployee;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return this.grossSalary - this.tax;
		}
	public void IncreaseSalary(double percentage) {
		this.grossSalary += this.grossSalary * (percentage/100);
		this.grossSalary -= this.tax;
	}
	
	public String toString() {
		return name + ", $ " + grossSalary; 
	}
}
