//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{

		int hold = ray[0];

		for(int i = 1; i<ray.length ;i++){
			if(ray[i]<hold){
				hold = ray[i];
			}
		}

		return hold;

	}
}