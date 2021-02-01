package by.academy.classwork.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Base {

	public static void main(String[] args) {

		Scanner size = new Scanner(System.in);

		System.out.println("Enter array size: ");

		int a = size.nextInt();

		size.close();

		int[] array = new int[a];

		double sum = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * a);

			sum += array[i];

		}

		System.out.println("Array: " + Arrays.toString(array));

		System.out.println("Sum of elements: " + sum);

		System.out.println("Average: " + sum / a);

		double average = sum / a;

		for (int j = 0; j < array.length; j++) {

			if (array[j] < average) {

				System.out.print(array[j]);

			}
		}

	}
}