package by.academy.classwork.lesson7;

public class Product {
	double price;
	String productName;
	String productType;
	int quantity;
	
	public Product() {
		super();
	}

	public Product(double price, String productName, String productType, int quantity) {
		super();
		this.price = price;
		this.productName = productName;
		this.productType = productType;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
}


