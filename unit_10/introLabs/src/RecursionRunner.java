//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class RecursionRunner
{
	public static void main(String args[])
	{
		//Count Even
		System.out.println(1%3);
		System.out.println("Count Odd");
		System.out.println(RecursionFunOne.countOddDigits(4532));
		System.out.println(RecursionFunOne.countOddDigits(11145322));
		System.out.println(RecursionFunOne.countOddDigits(224532714));
		System.out.println(RecursionFunOne.countOddDigits(2468));
		System.out.println(RecursionFunOne.countOddDigits(13579));
		//Chicken
		System.out.println("Count Chicken");
		System.out.println(RecursionFunTwo.countChickens("itatfun"));
		System.out.println(RecursionFunTwo.countChickens("itatchickenfun"));
		System.out.println(RecursionFunTwo.countChickens("chchickchickenenicken"));
		System.out.println(RecursionFunTwo.countChickens("chickchickfun"));
		System.out.println(RecursionFunTwo.countChickens("chickenbouncetheballchicken"));
		//Lucky threes
		System.out.println("lucky threes");
		System.out.println(RecursionFunThree.luckyThrees(3));
		System.out.println(RecursionFunThree.luckyThrees(31332));
		System.out.println(RecursionFunThree.luckyThrees(134523));
		System.out.println(RecursionFunThree.luckyThrees(3113));
		System.out.println(RecursionFunThree.luckyThrees(13331));
		System.out.println(RecursionFunThree.luckyThrees(777337777));
	}
}