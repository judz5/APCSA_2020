//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class BlackJackCard extends Card
{
  	//constructors
	public BlackJackCard(){}

	public BlackJackCard(int f, String s){
		super(f,s);
	}


  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
		if(super.getValue()==1){
			return 11;
		}else if(super.getValue()>9){
			return 10;
		}else{
			return super.getValue();
		}
  	}
  	
 }