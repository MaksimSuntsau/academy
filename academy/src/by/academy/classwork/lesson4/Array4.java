package by.academy.classwork.lesson4;

import java.util.Random;

public class Array4 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[][] array = new int[5][8];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(10) + 1;
			}

		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");
			}

			System.out.println();
		}
	}
}
