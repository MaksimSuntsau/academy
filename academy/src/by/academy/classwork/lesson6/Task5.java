package by.academy.classwork.lesson6;

import java.util.regex.Pattern;

public class Task5 {

	static Pattern p = Pattern.compile("\\w+@\\w+\\.{1}\\w+");

	public static void main(String[] args) {

		String s = "123test@_123test._123test";

		System.out.println(validate(s));
	}

	private static boolean validate(String s) {

		s = s.trim();

		return p.matcher(s).matches();

	}
}