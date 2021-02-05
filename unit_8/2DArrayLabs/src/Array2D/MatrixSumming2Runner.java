//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Array2D;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		//Scanner file = new Scanner (new File("matsum.dat"));
		MatrixSumming2 test = new MatrixSumming2();
		System.out.println(test);
		System.out.println(test.sum(2,2));
		System.out.println(test.sum(0,0));
		System.out.println(test.sum(4,3));
		System.out.println(test.sum(4,4));
		System.out.println(test.sum(2,4));
		System.out.println(test.sum(1,3));
		// reference slideshow 13 
		// for help on file input
	}
}



