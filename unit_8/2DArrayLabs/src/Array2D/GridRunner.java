//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Array2D;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] pog = new String[] {"a", "b", "c", "7", "9", "x", "2"};
		Grid test = new Grid(10, 10, pog);
		System.out.println(test);
		System.out.println(test.findMax(pog));
	}
}