package model;

import java.util.ArrayList;

public class Starter {
	public static void main(String[] args) {
		Deck deck = new Deck();

		System.out.println(deck.getCards());
		ArrayList<Card> cards = deck.getCards();

		for (Card c : deck.getCards()) {
			System.out.println(c.getSuit());
			System.out.println(c.getValue());
			System.out.println(c.getName());
		}
	}
}
