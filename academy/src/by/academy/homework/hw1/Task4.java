package by.academy.homework.hw1;

public class Task4 {

	public static void main(String[] args) {

		int a = 2;
		int b = 0;
		int rez = 0;

		while (rez < 1000000) {
			
			b++;
			
			rez =(int) Math.pow(a, b);

			System.out.println(b);
		}

	}

}
