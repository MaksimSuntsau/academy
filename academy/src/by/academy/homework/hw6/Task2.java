package by.academy.homework.hw6;

import java.io.*;

public class Task2 {

	public static void main(String[] argc) throws IOException {

		final String output_file = "/Users/Admin/git/academy/academy/src/by/academy/homework/hw6/task2.txt";

		final String input_file = "/Users/Admin/git/academy/academy/src/by/academy/homework/hw6/result.txt";

		BufferedReader reader = new BufferedReader(new FileReader(output_file));
		StringBuilder str = new StringBuilder();

		String text = null;

		for (;;) {

			String currentLine = reader.readLine();

			if (currentLine == null) {
				break;
			}
			text = str.append(currentLine).toString();
		}
		reader.close();

		text = text.replaceAll("\\s", "");
		System.out.println(text);

		File fileToWrite = new File(input_file);

		if (!fileToWrite.exists()) {
			fileToWrite.createNewFile();
		}

		FileWriter fileWrite = new FileWriter(fileToWrite);
		fileWrite.write(text);

		fileWrite.close();

	}
}