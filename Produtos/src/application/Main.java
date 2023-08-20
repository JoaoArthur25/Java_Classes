package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int option;
        Product[] products = new Product[100]; 
        int productCount = 0;

        do {
            System.out.println("Choose an option: ");
            System.out.println("1) Register product 2) See registered products 3) Exit");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println();
                System.out.println("Enter the name of the product: ");
                String name = scanner.nextLine();
                System.out.printf("Enter the price of %s: %n", name);
                double price = scanner.nextDouble();
                scanner.nextLine();

                Product product = new Product(name, price);
                interactWithProduct(product, scanner);

                products[productCount++] = product;

                System.out.println();
            } else if (option == 2) {
                System.out.println("Registered Products:");
                for (int i = 0; i < productCount; i++) {
                    Product product = products[i];
                    System.out.println("Product: " + product.getName());
                    System.out.println("Price: $" + product.getPrice());
                    System.out.println("Quantity in stock: " + product.getQuantity());
                    System.out.println();
                }
                sleep(1500);
            } else if (option != 3) {
                System.out.println("Invalid option");
                sleep(1500);
            }
        } while (option != 3);

        System.out.println("Thank you for using our system!");
        sleep(1500);

        scanner.close();
    }

    private static void interactWithProduct(Product product, Scanner scanner) {
        int option;
        int quantity;

        do {
            System.out.println("\nWhat would you like to do with the product?\n");
            System.out.println("1) See total value of product in stock."
                    + " 2) Add product to stock." + " 3) Remove product from stock." + " 4) Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.printf("The total value in stock of %s is $%.2f%n%n", product.getName(),
                        product.valueInStock());
                sleep(1500);

            } else if (option == 2) {
                System.out.println("Choose how much to add: ");
                quantity = scanner.nextInt();
                product.addProduct(quantity);
                System.out.println("Product successfully added");
                sleep(1500);
                System.out.println();
            } else if (option == 3) {
                System.out.println("Choose how much to remove: ");
                quantity = scanner.nextInt();
                product.removeProduct(quantity);
                System.out.println("Product successfully removed");
                sleep(1500);
                System.out.println();
            } else if (option != 4) {
                System.out.println("Invalid option");
                sleep(1500);
            }
        } while (option != 4);
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
