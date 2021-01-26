package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Cycle62 {

	public static void main(String[] args) {

		System.out.print("Vvedite summu vklada : ");

		Scanner scan = new Scanner(System.in);

		double s = scan.nextDouble();

		System.out.print(" Vvedite srok vklada: ");

		Scanner scan2 = new Scanner(System.in);

		int n = scan2.nextInt();

		scan.close();
		
		scan2.close();
			
		double result = s + s * 3 / 100;
		
		for (int i = 0; i <= n; i++) {
			
			s+=(s*0.03);
			
			
			
			
		}
		
		System.out.println(" Summa vklada cherez " + n + " let ravna: " + s);

	}
}
