package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double valueInStock() {

		return price * quantity;
	}

	public void addProduct(int number) {

		quantity += number;
		System.out.printf("The new total is: %d%n%n", quantity);
	}

	public void removeProduct(int number) {

		quantity -= number;
		System.out.printf("The new total is: %d%n%n", quantity);
	}
}
