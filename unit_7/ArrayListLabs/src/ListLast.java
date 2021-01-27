//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
		int last = ray.get(ray.size()-1);
		for(int i = 0; i<ray.size()-1;i++){
			if(ray.get(i)==last){
				return true;
			}
		}
		return false;
	}
}