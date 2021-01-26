package by.academy.classwork.lesson4;

public class Cycle12 {

	public static void main(String[] args) {

		long n = 1;

		for (int i = 10; i <= 99; i++) {

			if (i % 13 == 0) {

				n *= i;

			}

		}
		
		System.out.println(n);

	}

}
