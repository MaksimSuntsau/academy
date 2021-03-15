package by.academy.homework.hw6;

import java.io.*;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws IOException {

		final String nameOfFile = "task1.txt";
		String text = null;

		File file = new File(nameOfFile);
		Scanner scan = new Scanner(System.in);

		if (!file.exists()) {
			file.createNewFile();
		}

		try (FileWriter fileWrite = new FileWriter(file)) {

			text = scan.nextLine();

			while (!text.equals("break")) {
				fileWrite.append(text + " ");
				System.out.println("Next line: ");
				text = scan.nextLine();

			}
			fileWrite.close();
		}
		scan.close();

	}
}
