/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaboker;



import java.util.Random;

public class Deck 
{
  
	private final int DECK_SIZE = 52; //pakkakoko
	private final int SHUFFLE_EXCHANGES = 2000; //sekoitusten määrä
	private final int HAND_SIZE = 5; //käden koko
	public int restOfDeck = 6;
	
	Card[] deck = new Card[DECK_SIZE];
	Random r = new Random();
	
	// tekee kortit 
	public void fillDeck()
	{
		int counter = 0;
		for (int suit = 1; suit <= 4; suit++)
		{
			for (int rank = 1; rank <= 13; rank++)
			{
				deck[counter] = new Card();
				deck[counter].suit = suit;
				deck[counter].rank = rank;
				counter++;
			}
		}
	}
	
	// sekoittaa pakan
	public void shuffle()
	{
		for (int x = 0; x <= SHUFFLE_EXCHANGES; x++)
		{
			int number1 = r.nextInt(DECK_SIZE);
			int number2 = r.nextInt(DECK_SIZE);
			Card temp = deck[number1];
			deck[number1] = deck[number2];
			deck[number2] = temp;
		}
	}
	
	// jakaa 5
	public Card[] deal()
	{
		Card[] hand = new Card[HAND_SIZE];
		for (int deckPosition = 0; deckPosition < 5; deckPosition++)
		{
			hand[deckPosition] = deck[deckPosition];
		}
		return hand;
	}
	
	// jakaa uudet kortit
	public Card redeal()
	{
		Card nextCard = deck[restOfDeck];
		restOfDeck++;
		return nextCard;
	}
	
	//asettaa poisjaetut kortit alkuperäiseen järjestykseen 
        //mutta aloittaa uusien korttien vetämisen kuudennesta kortista
	public void refreshDeckPosition()
	{
		restOfDeck = 6;
	}

}