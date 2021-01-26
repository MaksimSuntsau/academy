package by.academy.homework.hw2;

	import java.util.Scanner;

	public class Task1 {

		public static void main(String[] args) {

			System.out.print("Vvedite summu pokupki : ");

			Scanner scan = new Scanner(System.in);

			double sum = scan.nextDouble();

			System.out.print("Vvedite vozrast : ");

			int age = scan.nextInt();

			scan.close();

			if (sum < 100) {

				System.out.println("Itogo s uchetom skidki 5% : " + (sum - sum * 0.05));
			}

			if (sum >= 100 & sum < 200) {

				System.out.println("Itogo s uchetom skidki 7% : " + (sum - sum * 0.07));
			}

			if (sum >= 200 & sum < 300) {

				System.out.println("Itogo s uchetom skidki 12% : " + (sum - sum * 0.12));

				if (age > 18) {

					System.out.println("Bonus za sovershennoletie +4% k skidke : " + (sum - sum * 0.16));

				} else {

					System.out.println("Antibonus nesovershennoletnim -3% ot skidki: " + (sum - sum * 0.09));
				}
			}

			if (sum >= 300 & sum < 400) {

				System.out.println("Itogo s uchetom skidki 15% : " + (sum - sum * 0.15));
			}

			if (sum >= 400) {

				System.out.println("Itogo s uchetom skidki 20% : " + (sum - sum * 0.2));
			}

		}
	}