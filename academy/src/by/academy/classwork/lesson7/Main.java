package by.academy.classwork.lesson7;

public class Main {

	public static void main(String[] args) {

		Person seller = new Person("Smith", 200000.00);
		Person buyer = new Person("Neo", 400000.00);

		Product[] products = new Product[5];
		products[0] = new Product(100.50, "computers", "lenovo", 5);
		products[1] = new Product(89.00, "computers", "hp", 2);
		products[2] = new Product(300.00, "computers", "mac", 6);
		products[3] = new Vino(30.00, "drinks", "vine", 11, "red");
		products[4] = new Bread(11.00, "food", "bread", 23, "white");

		Deal deal1 = new Deal("01.01.2020", buyer, seller, products);
		deal1.result();

	}
}
