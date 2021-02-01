package by.academy.homework.hw2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] suits = { "of spades", "of clubs", "of diamonds", "of hearts" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		System.out.println("Enter the number of players : ");
		
		int players = scan.nextInt();
		int cards = 5;
		int a = suits.length * rank.length;

		if (players * cards > a) {
			System.out.println("Too many players");
		} else {

			String[] deck = new String[a];
			for (int i = 0; i < rank.length; i++) {
				for (int j = 0; j < suits.length; j++) {
					deck[suits.length * i + j] = rank[i] + " " + suits[j];
				}

			}
			for (int i = 0; i < players * cards; i++) {
				int r = i + (int) (Math.random() * (a - i));
				String temp = deck[r];
				deck[r] = deck[i];
				deck[i] = temp;
			}

			for (int i = 0; i < players * cards; i++) {
				System.out.println(deck[i]);
				if (i % cards == cards - 1)
					System.out.println();
			}
			scan.close();

		}

	}
}
