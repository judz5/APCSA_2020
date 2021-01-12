//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package MonsterMash;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
			out.print("Enter the ht :: ");
			int ht = keyboard.nextInt();
			//ask for ht
			out.print("Enter the wt :: ");
			int wt = keyboard.nextInt();
			//ask for wt
			out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			//ask for age
			herd.add(i, new Monster(ht, wt, age));
			//instantiate a new Monster() and add it to the herd			
			out.println("\n");
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
	    out.println("SMALLEST :: "+herd.getSmallest());
	    out.println("LARGEST :: "+herd.getLargest());
	}
}