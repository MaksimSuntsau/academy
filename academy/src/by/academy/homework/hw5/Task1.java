package by.academy.homework.hw5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("5");
		list.add("6");
		list.add("2");
		list.add("6");
		list.add("5");
		list.add("7");

		show(list);
		removeDuplicates(list);
	}

	public static <T> Set<T> removeDuplicates(List<T> arr) {

		Set<T> set = new HashSet<>(arr);
		show(set);
		return set;

	}

	public static <T> void show(Collection<T> arr) {

		for (T value : arr) {
			System.out.print(value + " ");
		}
		
		System.out.println();

	}
}