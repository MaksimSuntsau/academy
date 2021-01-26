package by.academy.classwork.lesson4;

public class Cycle9 {

	public static void main(String[] args) {

		int num = 35;
		
		for (int i = num ; i <= 87; i++) {

			if (num % 7 == 1 && num % 7 == 2 && num % 7 == 5) {
				
				System.out.println(num);
				
				num++;
			}
			
		}

	}
}