package by.academy.classwork.lesson7;

public class Deal {
	String date;
	Person seller;
	Person buyer;
	Product[] products;
	Product[] calcDiscount;

	public Deal() {
		super();

	}

	public Deal(String date, Person seller, Person buyer, Product[] products) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Product[] getDiscount() {
		return calcDiscount;
	}
	public void setDiscount(Product[] calcDiscount) {
		this.calcDiscount = calcDiscount;
	}
	

	public void result() {
		double sum = 0;
		for (Product product : products) {

			sum += product.getPrice() * product.getQuantity();
		}

		if (sum > buyer.getCash()) {
			System.out.println("Out of cash!");
		} else {
			printBill();
		}

	}

	private void printBill() {
		double summ = 0;
		System.out.println("Deal OK");
		for (Product product : products) {
			
			double totalProductPrice = product.getPrice() * product.getQuantity();
			summ+=totalProductPrice;
			System.out.println("Name: " + product.getProductName() + " " + product.getProductType() +" "+ product.getPrice() + "X"
					+ product.getQuantity() + "=" + totalProductPrice);
		}
		buyer.setCash(buyer.getCash() - summ);
		seller.setCash(seller.getCash() + summ);
		System.out.println("Buyer's cash: " + buyer.getCash());
		System.out.println("Seller's cash: " + seller.getCash());
	}
}
