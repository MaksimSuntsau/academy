package by.academy.homework.hw2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter line 1 to compare: ");
		
		String s1 = scan.nextLine();
		
		System.out.println("Enter line 2 to compare: ");
		
		String s2 = scan.nextLine();

		if (s1.length() != s2.length()) {
			
			System.out.println("false");
			
		} else {
			
			int[] letters = new int[256];

			char[] array = s1.toCharArray();
			
			for (char c : array) {
				
				letters[c]++;
			}

			for (int i = 0; i < s2.length(); i++) {
				
				int c = (int) s2.charAt(i);
				
				if (--letters[c] < 0) {
					
					System.out.println("false");
				}
			}

			System.out.println("true");
		}
		scan.close();
	}
}