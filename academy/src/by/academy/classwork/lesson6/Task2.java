package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String... args) {

		String str = "2. Имеется строка с текстом! Подсчитать количество слов в тексте. Желательно\r\n"
				+ "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\r\n"
				+ "текста также могут быть пробелы, но могут и отсутствовать?";

		String regex = "[\\.,!?;]";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);

		int counter = 0;

		while (m.find()) {

			counter++;

			System.out.print(str.substring(m.start(), m.end()));

		}

		System.out.println();

		System.out.println(counter);

	}

}
