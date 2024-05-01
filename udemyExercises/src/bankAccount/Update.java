package bankAccount;

public class Update {
	private int ID;
	private String name;
	private double bankBalance;

	public Update() {
	}
	
	public Update(int iD, String name, double initialDeposit) {
		super();
		ID = iD;
		this.name = name;
		bankDeposit(initialDeposit);
	}

	public Update(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void bankDeposit(double value) {
		bankBalance += value;
	}
	public void bankWithdraw(double value) {
		bankBalance -= value;
	}
	public String toString() {
		return "Account " + this.ID + ", Holder: " + this.name + ", Balance: " + String.format("%.2f", bankBalance);
	}
	
	
}
