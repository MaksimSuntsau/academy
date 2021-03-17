package by.academy.classwork.lesson12;

public class User {
	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public static class Query {
		User user;

		public Query(User user) {
			this.user = user;
		}

		public void printToLog() {

			System.out.println("Polzovatel " + user.login + " " + user.password + " sdelal zapros");
		}
	}

	public void createQuery() {

		Query q = new Query(this);
		q.printToLog();

	}

	public static final Printable p = new Printable() {
		@Override
		public void print() {
			System.out.println("print");
		}

	};

}
