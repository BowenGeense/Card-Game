package model;

import java.util.Scanner;

public class Game {

	private int score = 0;
	private Card currentCard;
	private Card nextCard;
	private Deck deck;

	public Game() {
		deck = new Deck();
		currentCard = deck.getNextCard();
		nextCard = deck.getNextCard();

	}

	public boolean gameTurn(String answer) {
		System.out.println("Current card = " + currentCard);
		System.out.println("higher or lower?");

		nextCard = deck.getNextCard();
		System.out.println("Next card is " + nextCard);

		System.out.println("");
		if (answer.equals("higher") && nextCard.IsHigherOrEquel(currentCard)) {
			correct();
			return true;
		} else if (answer.equals("lower") && !nextCard.IsHigherOrEquel(currentCard)) {
			correct();
			return true;
		}
		return false;

	}

	public void correct() {

		System.out.println("correct!!");
		currentCard = nextCard;
		System.out.println("de kaart was: " + deck.getNextCard());
		System.out.println("jou score is: " + score);
		System.out.println("");
		score++;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Card getCurrentCard() {
		return currentCard;
	}

	public void setCurrentCard(Card currentCard) {
		this.currentCard = currentCard;
	}

	public Card getNextCard() {
		return nextCard;
	}

	public void setNextCard(Card nextCard) {
		this.nextCard = nextCard;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

}
