package by.academy.classwork.lesson4;

public class Task18 {

	public static void main(String[] args) {

		int N = 100;

		int counter = 0;

		for (int i = 1; i <= N; i++) {

			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {

				counter++;
			}

		}

		System.out.println(counter);
	}

}
