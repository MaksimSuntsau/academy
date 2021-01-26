package by.academy.classwork.lesson4;

//method bubble
import java.util.Random;

public class Array2 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			System.out.println(arr[i] + " ");
		
			for(i = 0; i < arr.length; i++) {
				int temp;
				for (int n = 0; n < arr.length; n++) {

					temp = arr[i];
					arr[i] = arr[n];
					arr[n] = temp;
				}

			}

		}
	
		

		for ( i : arr) {

			System.out.println(i + " ");
		}
	}
}
