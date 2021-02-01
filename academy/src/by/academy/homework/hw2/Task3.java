package by.academy.homework.hw2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two words with an even number of letters :");
		String a = scan.nextLine();
		String b = scan.nextLine();

		if (a.length() % 2 != 0 && a.length() % 2 != 0) {

			System.out.println("You entered words with an odd number of letters. Try again.");

		} else {
			String c = (a.substring(0, a.length() / 2) + b.substring(b.length() / 2));
			System.out.println(c);
		}
		scan.close();

	}

}