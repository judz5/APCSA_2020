//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{
		List<Integer> ans;
		ans = new ArrayList<Integer>();
		if(ray.size()<=1){
			return ans;
		}
		int last = ray.get(ray.size()-1);
		for(int i = 0; i<ray.size()-1;i++){
			if(ray.get(i)>last){
				ans.add(ray.get(i));
			}
		}
		System.out.println(ray.size());
		return ans;

	}
}//List<Integer>