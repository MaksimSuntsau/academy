package by.academy.classwork.lesson1;

public class Cat {
	int age;
	String nickname;
	double money;
	String initials;
	boolean isHomeAnimal;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;
		this.initials = this.nickname.substring(0, 1);

	}

	public Cat(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;

	}

	public void grow(int addAge) {
		System.out.println("Кот растет " + addAge + " год(а)");
		age = age + addAge;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public void printAge() {
		System.out.println("Кота зовут  " + nickname + ", его возраст - " + age);
	}

	public void setMoney(double money) {
		this.money = money;

	}

	public double getMoney() {
		return this.money;
	}

	public void setInitials(String initials) {
		this.initials = initials;

	}

	public String getInitials() {
		return this.initials;
	}

	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public boolean isHomeAnimal() {
		return this.isHomeAnimal;
	}

}
