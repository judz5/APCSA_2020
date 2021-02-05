//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Array2D;
import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> total;
    	total = new ArrayList<Integer>();

    	for(int i = 0; i < m.length;i++){
    	    int count = 0;
    	    for(int r = 0; r<m[i].length;r++){
    	        count+=m[i][r];
            }
    	    total.add(count);
        }
    	return total;
    }
}
