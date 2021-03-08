package by.academy.homework.hw5;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {

		List<Integer> listOfMarks = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			listOfMarks.add(i, (int) (1 + Math.random() * 10));
		}

		System.out.println(listOfMarks);

		Iterator<Integer> marks = listOfMarks.iterator();
		Integer max = 0;

		while (marks.hasNext()) {
			Integer temp = marks.next();
			if (temp > max) {
				max = temp;
			}

		}
		System.out.println("Максимальная оценка: " + max);

	}

}
