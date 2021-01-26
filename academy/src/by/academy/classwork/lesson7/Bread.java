package by.academy.classwork.lesson7;

public class Bread extends Product {

	String color;

	public Bread(double price, String productName, String productType, int quantity, String color) {
		super(price, productName, productType, quantity);
		this.color = color;
	}

	protected double calcDiscount() {

		if (quantity>10) {

			return 0.7;

		}
		return 1;

	}
}