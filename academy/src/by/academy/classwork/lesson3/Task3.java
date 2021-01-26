package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {

		System.out.print("Vvedite chilo 1: ");

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		System.out.print("Vvedite chilo 2: ");

		int b = scan.nextInt();

		if (a < b) {
			System.out.println("min: " + a + " max: " + b);
		} else {
			System.out.println("min: " + b + " max: " + a);
		}
		System.out.println("srednee arifmeticheskoe: " + (a + b) / 2);

		scan.close();
	}

}
