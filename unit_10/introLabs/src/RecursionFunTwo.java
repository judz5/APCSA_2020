//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		String c = "chicken";
		if(word.contains(c)){
			int index = word.indexOf(c);
			return 1 + countChickens(word.substring(0,index)+word.substring(index+c.length()));
		}
		return 0;
	}
}