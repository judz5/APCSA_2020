//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd;
		for(int i = 0;i<ray.size();i++){
			if((ray.get(i)%2)!=0){
				odd = ray.indexOf(ray.get(i));
				for(int p = ray.size()-1;p>odd;p--){
					if(ray.get(p)%2==0){
						return ray.indexOf(ray.get(p))-odd;
					}
				}
			}
		}
		return -1;
	}
}