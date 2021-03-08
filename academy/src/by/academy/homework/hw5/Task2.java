package by.academy.homework.hw5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Task2 {

	public static void main(String[] argc) {

		final int addN = 1000000;
		final int chooseN = 100000;

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		addElements(arrayList, linkedList, addN);

		System.out.println("ArrayList: " + howMuchTime(arrayList, chooseN) + " mSec");
		System.out.println("LinkedList: " + howMuchTime(linkedList, chooseN) + " mSec");

	}

	public static void addElements(Collection<Integer> arr1, Collection<Integer> arr2, int n) {

		for (int i = 0; i < n; i++) {

			arr1.add((int) (Math.random() * 5));
			arr2.add((int) (Math.random() * 5));
		}
	}

	public static long howMuchTime(List<Integer> arr, int n) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < n; i++) {

			((List<Integer>) arr).get((int) (Math.random() * 5));

		}

		long finish = System.currentTimeMillis();

		return finish - start;
	}

}