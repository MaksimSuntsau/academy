package by.academy.classwork.lesson7;

public class Vino extends Product {

	String color;

	public Vino(double price, String productName, String productType, int quantity, String color) {
		super(price, productName, productType, quantity);
		this.color = color;
	}

	protected double calcDiscount() {

		if (productName.contains("i")) {

			return 0.9;

		}
		return 1;

	}
}