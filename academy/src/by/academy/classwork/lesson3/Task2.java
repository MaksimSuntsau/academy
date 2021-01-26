package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.print("Vvedite chislo: ");

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		if (a % 2 == 0) {

			System.out.println("Chislo chetnoe");

		} else {

			System.out.println("Chislo nechetnoe");
		}
		scan.close();

	}

}
