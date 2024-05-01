package dolarConverter;

public class CurrencyConverter {
	
	public static double conversion(double dollarPrice, double dollarQuantity) {
		return (dollarPrice * dollarQuantity) + ((dollarPrice * dollarQuantity) * 0.06); //6% IOF
	}
}
