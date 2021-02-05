//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Array2D;
import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {{1,2,3,4,5},{6,7,8,9,0},{6,7,1,2,5},{6,7,8,9,0},{5,4,3,2,1}};   //load in the matrix values

    public int sum( int r, int c )
    {
    	int total = 0;
    	for(int i = r-1; i<=r+1;i++){
        if(i>=0 && i<=m.length-1){
            for(int k = c-1; k<=c+1;k++){
            if(k>=0 && k<=m[i].length-1){
                total += m[i][k];
                     }
                }
            }
        }
    	System.out.print("The sum of "+r+","+c+" is ");
    	return total;
    }

    public String toString()
    {
    	for ( int[] row : m){
    	    System.out.println(Arrays.toString(row));
        }
    	return "";
    }
}
