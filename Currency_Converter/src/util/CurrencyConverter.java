package util;

public class CurrencyConverter {
	
	public static final double dolarPrice = 3.10;
	
	public static double dolarToReal(double quantity) {
		
		return quantity * dolarPrice;
	}
}
