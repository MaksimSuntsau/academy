package by.academy.classwork.lesson1;

public class Application {

	public static void main(String[] args) {
		Cat cat = new Cat("Varsik");
		Cat cat1 = new Cat("Shark", 3);

		cat.eat();
		cat.sleep();
		cat.walk();

		cat.printAge();
		cat.grow(3);
		cat.printAge();

		cat.grow(2);
		cat.printAge();

		cat.grow(1);
		cat.printAge();

		cat1.printAge();

		int catAge = cat.getAge();
		System.out.println(catAge);

		cat1.setMoney(10000.25);
		System.out.println(cat1.getMoney());

		System.out.println(cat.getInitials());

		cat.setHomeAnimal(false);
		System.out.println(cat.isHomeAnimal()+"\n"+"\n"+ "finish");
		
		
		

	}

}
