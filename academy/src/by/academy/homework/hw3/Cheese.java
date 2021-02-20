package by.academy.homework.hw3;

public class Cheese extends Product {

	String manufacturer;

	public Cheese() {
		super();
	}

	public Cheese(double price, String type, String name, int quantity, String manufacturer) {
		super(price, type, name, quantity);
		this.manufacturer = manufacturer;
	}

	@Override
	public double discount() {
		if (price * quantity > 100)
			return 0.95;
		return 1;
	}

	
	
}
