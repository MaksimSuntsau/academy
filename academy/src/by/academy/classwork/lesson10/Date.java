package by.academy.classwork.lesson10;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1970, 01, 01);
		d1= d1.plusYears(30);
		d1= d1.minusMonths(7);
		d1= d1.minusDays(3);
		
		System.out.println(d1);
	}

}

