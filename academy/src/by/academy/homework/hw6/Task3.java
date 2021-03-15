package by.academy.homework.hw6;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Task3 {
	public static void main(String[] argc) {

		final String adress = "/Users/Admin/git/academy/academy/src/by/academy/homework/hw6/users";

		List<User> users = new ArrayList<>();

		users.add(new User("Kirill", "Melnikov", 33));
		users.add(new User("Ivan", "Dercatch", 37));
		users.add(new User("Yuliya", "Torchik", 25));
		users.add(new User("Olga", "Belik", 18));
		users.add(new User("Anton", "Poplavskiy", 40));
		users.add(new User("Anastasiya", "Malkevich", 29));
		users.add(new User("Ekaterina", "Polonnikova", 38));
		users.add(new User("Irina", "Borisevich", 47));
		users.add(new User("Vasiliy", "Druzik", 50));
		users.add(new User("Konstantin", "Moroz", 41));

		File direct = new File(adress);

		if (!direct.exists()) {
			direct.mkdir();
		}

		for (User user : users) {
			File fileOfUser = new File(direct, user.name + "_" + user.surname + ".txt");

			try (FileOutputStream outputStream = new FileOutputStream(fileOfUser);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

				objectOutputStream.writeObject(user);

			} catch (Exception e) {

				System.err.println(e.getMessage());
			}

		}

	}
}
