package by.academy.classwork.lesson4;

public class Array0 {

	public static void main(String[] args) {

		char[][] array = { { 85, 67 }, { 72, 73 }, { 74, 65 }, { 86, 65 } };

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");
			}

			System.out.println();
		}
	}
}