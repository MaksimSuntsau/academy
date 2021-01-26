package by.academy.classwork.lesson7;

public class Person {
	String name;
	double cash;

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public Person() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public String getName() {
		return name;

	}

	public double getCash() {
		return cash;

	}

}
