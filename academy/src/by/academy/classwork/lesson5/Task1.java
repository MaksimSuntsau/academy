package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1 {
		
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vvedite koll-vo strok: ");
			
			int n = sc.nextInt();
			
			String[]arr = new String[n];
			
			sc.nextLine();
			
			System.out.println("Vvedite stroki: ");
			
			for(int i =0; i<n; i++) {
				
				arr[i] = sc.nextLine();
			}
			
			int min = arr[0].length();
			
			int max = arr[0].length();
			
			String maxString = arr[0];
			
			String minString = arr[0];
			
			for(int i = 1; i<n; i++) {
				
				if (arr[i].length()<min) {
					
					min = arr[i].length();
					
					minString = arr[i];
				} else if(arr[i].length()>max) {
					max = arr[i].length();
					maxString = arr[i];
				}
			}
			
			
			System.out.println("Min: " + min);
			System.out.println("Min string: " + minString);
			System.out.println("Max: " + max);
			System.out.println("Max string: " + maxString);
			sc.close();
		}

	

}


