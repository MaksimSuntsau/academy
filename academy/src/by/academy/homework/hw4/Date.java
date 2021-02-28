package by.academy.homework.hw4;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
	private Day day;
	private Month month;
	private Year year;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите дату в формате (dd-mm-yyyy): ");
		in = new Scanner(System.in);
		String s = in.nextLine();
		Date date = new Date(s);
		date.whichDay();
		System.out.println("Input one more date to count the days in between: ");
		in = new Scanner(System.in);
		String t = in.nextLine();
		Date date1 = new Date(t);
		date.countDaysInBetween(date1);
		date.isLeapYear();

	}

	public void setDate(int day, int month, int year) {
		this.day = new Day(day);
		this.month = new Month(month);
		this.year = new Year(year);
	}

	public void whichDay() {

		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
		System.out.println("Day of the week: " + dayOfWeek);
	}

	public void isLeapYear() {

		if ((year.getYear() % 400 == 0) || ((year.getYear() % 4 == 0) && (year.getYear() % 100 != 0))) {
			System.out.println(year.getYear() + " is a leap year.");
		} else {
			System.out.println(year.getYear() + " is not a leap year.");
		}
	}

	public void countDaysInBetween(Date date1) {

		LocalDate localDate_1 = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		LocalDate localDate_2 = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDay());
		long noOfDaysBetween = ChronoUnit.DAYS.between(localDate_1, localDate_2);
		System.out.println("Amout of days between dates: " + noOfDaysBetween);
	}

	public Date(String date) {

		if (isDateValid(date)) {
			int a = Integer.parseInt(date.substring(0, 2));
			int b = Integer.parseInt(date.substring(3, 5));
			int c = Integer.parseInt(date.substring(6, 10));
			year = new Year(c);
			day = new Day(a);
			month = new Month(b);

		} else {

			System.exit(0);
		}
	}

	public int getYear() {

		return year.getYear();
	}

	public int getDay() {

		return day.getDay();
	}

	public int getMonth() {

		return month.getMonth();
	}

	public static boolean isDateValid(String date) {

		if (date.matches("^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$")) {

			System.out.println("Date is valid");
			return true;

		} else {
			System.out.println("Date is invalid");
			return false;

		}

	}

	public static class Year {

		private int year;

		public Year(int c) {
			year = c;
		}

		public int getYear() {
			return year;
		}

	}

	public static class Month {
		private int month;

		public Month(int b) {
			month = b;
		}

		public int getMonth() {
			return month;
		}
	}

	public static class Day {
		private int day;

		public Day(int a) {
			day = a;
		}

		public int getDay() {
			return day;
		}

	}

}
