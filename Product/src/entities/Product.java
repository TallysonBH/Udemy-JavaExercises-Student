package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public double totalValue() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "data: "
				+ name
				+", $ "
				+String.format("%.2f", price)
				+", "
				+quantity
				+" units, Total: $"
				+String.format("%.2f", totalValue());
	}
	
	
	
}
