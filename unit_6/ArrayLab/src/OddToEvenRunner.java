//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{

		System.out.println(RayOddToEven.go(new int[]{7,1,5,3,11,5,6,7,8,9,10,12345,11}));
		System.out.println(RayOddToEven.go(new int[]{11,9,8,7,6,5,4,3,2,1,-99,7}));
		System.out.println(RayOddToEven.go(new int[]{10,20,30,40,5,41,31,20,11,7}));
		System.out.println(RayOddToEven.go(new int[]{32767,70,4,5,6,7}));
		System.out.println(RayOddToEven.go(new int[]{2,4,6,8,8}));

	}
}