//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		int spot = 0;
		int[] ans = new int[3];

		for(int i=0;i<ray.length;i++){
			if(ray[i]>11){
				ans[spot]=ray[i];
				spot++;
				if(spot==3){
					break;
				}
			}
		}
		System.out.print((Arrays.toString(ans))+"\n");
		return null;
	}
}