package by.academy.homework.hw6;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {

	public static void main(String[] argc) throws IOException {

		final String adr = "/Users/Admin/git/academy/academy/src/by/academy/homework/hw6/task4";

		final String output_file = "/Users/Admin/git/academy/academy/src/by/academy/homework/hw6/task2.txt";

		BufferedReader reader = new BufferedReader(new FileReader(output_file));
		String line = reader.readLine();

		int size = line.length();

		File direct = new File(adr);

		if (!direct.exists()) {
			direct.mkdir();
		}

		for (int i = 1; i < 101; i++) {

			File file = new File(direct, i + ".txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			int rand = (int) (Math.random() * size);

			try (FileWriter fileWrite = new FileWriter(file)) {

				fileWrite.write(line.substring(0, rand));
			}

		}

		File fileResult = new File(direct, "result.txt");

		try (FileWriter filefolder = new FileWriter(fileResult)) {

			for (File files : direct.listFiles()) {

				StringBuilder str = new StringBuilder();
				String out = str.append("Name: ").append(files.getName()).append(" Length:").append(files.length())
						.toString();
				System.out.println(out);
				filefolder.write(out);

			}
		}

	}

}