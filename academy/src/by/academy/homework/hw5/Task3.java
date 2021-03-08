package by.academy.homework.hw5;

public class Task3 {

	public static void main(String[] args) {

		Integer[][] arr = { { 1, 6 }, { 9, 8 }, { 1, 5, 8 } };

		IteratorTwoDimArray<Integer> iterator = new IteratorTwoDimArray<>(arr);

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
