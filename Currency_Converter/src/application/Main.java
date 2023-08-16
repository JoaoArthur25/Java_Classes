package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many dollars are you going to buy?");
		double quantity = scanner.nextDouble();
		
		double price = CurrencyConverter.dolarToReal(quantity);
		System.out.println("It will cost R$ " + price);
		
		scanner.close();

	}

}
