package by.academy.homework.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {

		String textt = "abracadabra";
		char text[] = textt.toCharArray();

		Map<Character, Integer> dictionary = new HashMap<>();

		for (int i = 0; i < text.length; i++) {

			if (dictionary.get(text[i]) != null) {

				int temp = dictionary.get(text[i]);
				dictionary.put(text[i], ++temp);

			} else {

				dictionary.put(text[i], 1);
			}

		}

		System.out.println(dictionary);
		System.out.println("Key:    " + dictionary.keySet());
		System.out.println("Values: " + dictionary.values());

	}

}
