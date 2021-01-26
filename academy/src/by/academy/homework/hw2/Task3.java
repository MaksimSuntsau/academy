package by.academy.homework.hw2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		System.out.print("Vvedite chislo ot 1 do 10 : ");

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		scan.close();

		int i = 0;

		while (i < 10) {

			i++;

			System.out.println(number + " x " + i + " = " + (number * i));
		}
	}
}