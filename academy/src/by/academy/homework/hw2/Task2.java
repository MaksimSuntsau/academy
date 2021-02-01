package by.academy.homework.hw2;

import java.util.Scanner;

public class Task2 {

	private static int uChars(String str) {

		StringBuilder s = new StringBuilder();

		String c;

		for (int i = 0; i < str.length(); i++) {

			c = String.valueOf(str.charAt(i));

			if (s.indexOf(c) == -1)

				s.append(c);
		}

		return s.length();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the quantity of words: ");

		int n = scan.nextInt();

		scan.nextLine();

		String a[] = new String[n];

		System.out.println("Enter words: ");

		for (int i = 0; i < a.length; i++) {

			a[i] = scan.nextLine();
		}

		String target = a[0];

		for (int i = 0; i < a.length; i++) {

			if (uChars(a[i]) < uChars(target))
				target = a[i];
		}

		System.out.println("Target word: " + target);

		System.out.println("Quantity of different symbols: " + uChars(target));

		scan.close();
	}
}