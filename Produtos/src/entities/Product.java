package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double valueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + valueInStock();
    }
}
