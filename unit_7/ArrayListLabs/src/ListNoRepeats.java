//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray )
	{
		int check;
		for(int i = 0;i<ray.size();i++){
			check = ray.get(i);
			for(int k = i+1;k<ray.size();k++){
				if(ray.get(k)==check){
					return false;
				}
			}
		}
		return true;
	}
}