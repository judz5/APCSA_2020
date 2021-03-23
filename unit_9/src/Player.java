//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class Player
{
   private ArrayList<Card> hand;
   private int winCount;

   public Player ()
   {
      hand = new ArrayList<Card>();
      winCount = 0;
   }

   public Player (int score)
   {
      hand = new ArrayList<Card>();
      winCount = score;
   }

   public void addCardToHand( Card temp )
   {
      hand.add(temp);
   }

   public void resetHand( )
   {
      hand.clear();
   }

   public  void setWinCount( int numwins )
   {
      winCount = numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() {
      return hand.size();
   }

   public int getHandValue()
   {
      int val = 0;
      for(int i = 0; i<hand.size();i++){
         val += hand.get(i).getValue();
      }
      return val;
   }

   public  boolean  hit( )
   {
      return false;
   }

   public String toString()
   {
      System.out.println("Hand = ");
      for(int i = 0;i<hand.size();i++){
         System.out.println(hand.get(i));
      }
      return " - "+getHandValue();
   }
}