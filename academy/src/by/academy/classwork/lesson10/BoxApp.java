package by.academy.classwork.lesson10;

public class BoxApp {

	public static void main(String[] args) {

		GenBox<Cat> b1 = new GenBox<>(new Cat());
		System.out.println(b1);

	}

}
