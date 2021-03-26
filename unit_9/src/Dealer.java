//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Dealer extends Player
{
	//define a deck of cards
	Deck deck;

	public Dealer() {
		deck = new Deck();
	}

	public void  shuffle()
	{
	   deck.shuffle();
	}

	public Card  deal(){
		return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft();
	}

	public boolean hit()
	{
	   if(getHandValue()<21){
	   	this.addCardToHand(deck.nextCard());
	   	return true;
	   }
		return false;
    }
}








