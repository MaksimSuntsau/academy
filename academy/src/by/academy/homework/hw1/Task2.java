package by.academy.homework.hw1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.print("Vvedite tip dannih : ");

		Scanner scan = new Scanner(System.in);

		String type = scan.nextLine();

		System.out.print("Vvedite peremennuyu : ");

		switch (type) {
		case "int":

			int vInt = scan.nextInt();
			System.out.println(vInt % 2);
			break;
		case "double":

			double vDub = scan.nextDouble();
			System.out.println(vDub * 0.7);
			break;
		case "float":

			float vFl = scan.nextFloat();
			System.out.println(vFl * vFl);
			break;
		case "char":

			String vCh = scan.nextLine();
			System.out.println(vCh.charAt(0));
			break;
		case "String":

			String vSt = scan.nextLine();
			System.out.println("Hello " + vSt);
			break;

		default:
			System.out.println("Unsupported type");
		}

		scan.close();
	}
}
