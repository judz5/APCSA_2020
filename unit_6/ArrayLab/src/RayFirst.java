//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		boolean truth = false;
		if(ray.length<1){
			truth = false;
		}else{
			for(int i = 0;i<ray.length-1;i++){
				if(ray[i+1]==ray[0]){
					truth = true;
				}
			}
		}
		return truth;
	}
}