package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		System.out.print("Vvedite koll-vo secund : ");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		scan.close();

		int week = input / 604800;
		int day = (input % 604800) / 86400;
		int hour = ((input % 604800) % 86400) / 3600;
		int min = (((input % 604800) % 86400) % 3600) / 60;
		int sec = (((input % 604800) % 86400) % 3600) % 60;

		System.out.println(week + " nedel' " + day + " dney " + hour + " chasov " + min + " minut " + sec + " secund");

	}

}
