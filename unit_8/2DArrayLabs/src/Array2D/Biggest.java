//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Array2D;
public class Biggest
{
    public static int getBig(int[][] m)
    {
		int biggest = m[0][0];
		for( int[] row : m){
		    for( int num : row){
		        if(num>biggest){
		            biggest = num;
                }
            }
        }
		return biggest;
    }
}
