//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import static java.lang.System.*;
import java.util.*;

public class BlackJack
{
	private Dealer dealer;//add in Player instance variable
	private Player player;//add in Dealer instance variable

	public BlackJack()
	{
		dealer = new Dealer();
		player = new Player();
	}

	public void playGame()
	{
		String choice = "n";
		String playGame = "y";

		do{

			player.resetHand();
			dealer.resetHand();

			try { Thread.sleep(1000);
			} catch(InterruptedException e){}

			System.out.println("BlackJack Starting, Good luck!");

			try { Thread.sleep(1000);
			} catch(InterruptedException e){}

			Scanner keyboard = new Scanner(System.in);

			System.out.println("Shuffling Cards! please wait...");

			try { Thread.sleep(1000);
			} catch(InterruptedException e){}

			for(int i = 0; i<10; i++){
				out.print("*");
				try
				{
					Thread.sleep(500);
				} catch(InterruptedException e){}
			}
			dealer.shuffle();
			out.println("\n");
			player.addCardToHand(dealer.deal()); // deal player 2 cards
			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal()); // Deal dealer 2 cards
			dealer.addCardToHand(dealer.deal());

			// START OF PLAYER TURN
			System.out.println("PLAYER");
			System.out.println(player);
			if(player.getHandValue()!=21) {
				System.out.print("Want to hit?(y/n) :: "); // Sees if player wants to hit
				choice = keyboard.nextLine();
			}else{
				choice = "n";
				System.out.println("Player has a blackjack!");
				try { Thread.sleep(2000);
				} catch(InterruptedException e){}
			}
			while(player.hit()&&choice.equals("y")){ // if they havent busted already and they want to hit
				player.addCardToHand(dealer.deal()); // give card
				System.out.println("Hand Value : "+player.getHandValue()); // show hand value now
				if(player.getHandValue()>21){
					System.out.println("Player Busted!\n");// tell them they busted if they did
					break;
				}else if(player.getHandValue()==21){
					System.out.println("Player has a blackjack!");
					try { Thread.sleep(2000);
					} catch(InterruptedException e){}
					break;
				}
				System.out.print("Want to hit again?(y/n) :: "); // check if wants to hit again
				choice = keyboard.nextLine();
				System.out.println("\n");
			}

			// START OF DEALER TURN
			System.out.println("DEALER"); // Dealers turn same thing now with dealer
			out.println(dealer);
			if(dealer.getHandValue()!=21) {
				out.print("Want to hit?(y/n) :: ");
				choice = keyboard.nextLine();
			}else{
				choice = "n";
				System.out.println("Dealer has a blackjack!");
				try { Thread.sleep(2000);
				} catch(InterruptedException e){}
			}
			if(choice.equals("y")){
				while(dealer.getHandValue()<21&&choice.equals("y")){
					dealer.hit();
					System.out.println("Hand Value : "+dealer.getHandValue());
					if(dealer.getHandValue()>21){
						System.out.println("Dealer Busted!");
						break;
					}else if(dealer.getHandValue()==21){
						System.out.println("Dealer has a blackjack!");
						try { Thread.sleep(2000);
						} catch(InterruptedException e){}
						break;
					}
					System.out.print("Want to hit again?(y/n) :: ");
					choice = keyboard.nextLine();
					System.out.println("\n");
				} // Dealer done
			}

			// END , CALC WHO WIN
			out.print("\n");
			out.println("Final Score");
			out.println("-----------------------");// Final score for fun effect
			int playhand = player.getHandValue(); // now time to check who won
			int dealhand = dealer.getHandValue();
			// THIS CALC WHO WINS
			if(playhand>21 && dealhand>21){
				out.println("Both Busted, Draw!");
			}else if(playhand>21){
				out.println("Player Busted, Dealer Wins!");
				dealer.win();
			}else if(dealhand>21){
				out.println("Dealer Busted, Player Wins!");
				player.win();
			}else if(dealhand>playhand){
				out.println("Dealer has Higher Score, Dealer Wins!");
				dealer.win();
			}else if(playhand>dealhand){
				out.println("Player has Higher Score, Player Wins!");
				player.win(); // Done deciding winners
			}else if(playhand==dealhand){
				out.println("Same score, Draw!");
			}

			System.out.println("Player Wins : "+player.getWinCount());
			System.out.println("Dealer Wins : "+dealer.getWinCount());

			out.print("Want to play again :: ");// now check if they want to play again
			playGame = keyboard.nextLine();
			if(playGame.equals("n")){
				out.println("Thanks for Playing!");
			}
			out.print("\n");
		}while(playGame.equals("y"));
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}