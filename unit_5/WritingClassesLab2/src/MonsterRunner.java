//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("What is 1st Monsters Name : ");
		String name = keyboard.next();
		System.out.print("What is 1st monsters size : ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Monster jimmy = new Monster(name, size);
		//ask for name and size
		System.out.print("What is 2nd Monsters Name : ");
		String name2 = keyboard.next();
		System.out.print("What is 2nd monsters size : ");
		int size2 = keyboard.nextInt();
		//instantiate monster two
		Monster bobby = new Monster(name2, size2);

		if(jimmy.isBigger(bobby)==true)
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if(jimmy.isSmaller(bobby)==true)
		{
			System.out.println("Monster one is smaller than Monster two.");
		}

		if(jimmy.namesTheSame(bobby)==true)
		{
			System.out.println("Monster one has the same name as Monster two.");
		}



	}
}