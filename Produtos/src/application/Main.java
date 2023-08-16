package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Product firstProduct = new Product();
		Product secondProduct = new Product();
		int option;
		int quantity;

		System.out.println("Enter the name of the first product: ");
		firstProduct.name = scanner.nextLine();
		System.out.printf("Enter the price of %s: %n", firstProduct.name);
		firstProduct.price = scanner.nextDouble();
		System.out.printf("%nEnter the quantity of %s in stock: %n", firstProduct.name);
		firstProduct.quantity = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name of the second product: ");
		secondProduct.name = scanner.nextLine();
		System.out.printf("Enter the price of %s: %n", secondProduct.name);
		secondProduct.price = scanner.nextDouble();
		System.out.printf("Enter the quantity of %s in stock: %n", secondProduct.name);
		secondProduct.quantity = scanner.nextInt();
		sleep(1000);

		System.out.println(firstProduct);
		System.out.println(secondProduct);

		do {
			System.out.println("\nWhat would you like to do with the products?\n");
			System.out.println(
					"1) See total value in stock. 2) Add products to stock. 3) Remove products from stock. 4) Exit.");

			option = scanner.nextInt();
			sleep(1000);

			if (option == 1) {
				System.out.println("Choose which product's total value in stock you want to see: ");
				System.out.printf("1) %s. 2) %s.%n", firstProduct.name, secondProduct.name);
				option = scanner.nextInt();
				sleep(1000);

				if (option == 1) {
					System.out.printf("The total value in stock of %s is $%.2f%n%n", firstProduct.name,
							firstProduct.valueInStock());
					sleep(1000);
				} else if (option == 2) {
					System.out.printf("The total value in stock of %s is $%.2f%n%n", secondProduct.name,
							secondProduct.valueInStock());
					sleep(1000);
				}
			} else if (option == 2) {
				System.out.println("Choose which product you want to add to stock: ");
				System.out.printf("1) %s. 2) %s.%n", firstProduct.name, secondProduct.name);
				option = scanner.nextInt();
				sleep(1000);

				if (option == 1) {
					System.out.println("Choose how much to add: ");
					quantity = scanner.nextInt();
					firstProduct.addProduct(quantity);
					System.out.println(firstProduct);
					System.out.println();
					sleep(1000);
				} else if (option == 2) {
					System.out.println("Choose how much to add: ");
					quantity = scanner.nextInt();
					secondProduct.addProduct(quantity);
					System.out.println(secondProduct);
					System.out.println();
					sleep(1000);
				}
			} else if (option == 3) {
				System.out.println("Choose which product you want to remove from stock: ");
				System.out.printf("1) %s. 2) %s.%n", firstProduct.name, secondProduct.name);
				option = scanner.nextInt();
				sleep(1000);

				if (option == 1) {
					System.out.println("Choose how much to remove: ");
					quantity = scanner.nextInt();
					firstProduct.removeProduct(quantity);
					System.out.println(firstProduct);
					System.out.println();
					sleep(1000);
				} else if (option == 2) {
					System.out.println("Choose how much to remove: ");
					quantity = scanner.nextInt();
					secondProduct.removeProduct(quantity);
					System.out.println(secondProduct);
					System.out.println();
					sleep(1000);
				}
			} else if (option != 4) {
				System.out.println("Invalid option");
				sleep(1000);
			}
		} while (option != 4);

		System.out.println("Thank you for using our system!");

		scanner.close();
	}

	private static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
