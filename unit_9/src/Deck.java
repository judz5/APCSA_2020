//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		stackOfCards = new ArrayList<Card>();//initialize data - stackOfCards - topCardIndex
		topCardIndex = NUMCARDS-1;
		for(int i =0; i<4; i++){//loop through suits
			for(int k = 1;k<=13;k++){	//loop through faces
				stackOfCards.add(new Card(k, SUITS[i]));//add in a new card
			}
		}
	}

	//modifiers
   public void shuffle ()
	{
		Collections.shuffle(stackOfCards);
		//shuffle the deck
		//reset variables as needed
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex+1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}