//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {
	public static int go(int[] ray) {

		int count = 0;

		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 != 0) {

				for(int k = i+1; i<ray.length; k++){
					count++;
					if(ray[k]%2==0){
						return count;
					}

				}

			}
		}

		return -1;
	}

}