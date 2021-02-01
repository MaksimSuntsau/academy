package by.academy.homework.hw1;

	import java.util.Scanner;

	public class Task1 {

		public static void main(String[] args) {

			System.out.print("Enter purchase amount : ");

			Scanner scan = new Scanner(System.in);

			double sum = scan.nextDouble();

			System.out.print("Enter age : ");

			int age = scan.nextInt();

			scan.close();

			if (sum < 100) {

				System.out.println("Total including discount 5% : " + (sum - sum * 0.05));
			}

			if (sum >= 100 & sum < 200) {

				System.out.println("Total including discount 7% : " + (sum - sum * 0.07));
			}

			if (sum >= 200 & sum < 300) {

				System.out.println("Total including discount 12% : " + (sum - sum * 0.12));

				if (age > 18) {

					System.out.println("Bonus for majority +4% to discount : " + (sum - sum * 0.16));

				} else {

					System.out.println("Antibonus for minority -3% from discount: " + (sum - sum * 0.09));
				}
			}

			if (sum >= 300 & sum < 400) {

				System.out.println("Total including discount 15% : " + (sum - sum * 0.15));
			}

			if (sum >= 400) {

				System.out.println("Total including discount 20% : " + (sum - sum * 0.2));
			}

		}
	}