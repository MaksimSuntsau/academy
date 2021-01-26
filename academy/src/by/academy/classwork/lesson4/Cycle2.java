package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Cycle2 {

	public static void main(String[] args) {

		System.out.print("Enter number n : ");

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		scan.close();

		int result = 0;

		for (int i = 1; i <= n; i++) {

			result += i;

		}
		System.out.println("Sum of numbers from 1 to " + n + " = " +result);

	}
}
