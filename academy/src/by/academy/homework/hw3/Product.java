package by.academy.homework.hw3;

public abstract class Product {

	protected double price;
	protected String name;
	protected String type;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(double price, String type, String name, int quantity) {
		super();
		this.price = price;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {

		return quantity * price * discount();

	}

	public abstract double discount();

}
