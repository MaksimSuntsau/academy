package by.academy.classwork.lesson6;

public class Task3 {

	public static void main(String... args) {

		String text = "Имеется строка с текстом! Подсчитать количество слов в тексте. Желательно\r\n"
				+ "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\r\n"
				+ "текста также могут быть пробелы, но могут и отсутствовать?";

		String[] array = text.split("\\s+");

		System.out.println(array.length);

	}
}