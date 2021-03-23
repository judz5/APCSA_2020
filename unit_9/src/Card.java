//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;
public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
	public Card(){
		this(0, FACES[0]);
	}

	public Card(int f, String s){
		suit = s;
		face = f;
	}


	// modifiers


  	//accessors
	public String getSuit(){
		return suit;
	}

  	public int getValue()
  	{
		return face;
  	}

	public boolean equals(Object obj)
	{
		Card other = (Card)obj;
		if(this.getSuit().equals(other.getSuit()) && (this.getValue() == other.getValue())){
			return true;
		}
		return false;
	}

  	//toString
	public String toString(){
		return FACES[face] + " of " + getSuit() + " | value = " + getValue()+" ";
	}
  	
 }