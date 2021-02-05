//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Array2D;

import java.util.Arrays;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0 ; i<grid.length;i++){
			for(int k = 0; k<grid[i].length;k++){
				grid[i][k]= vals[(int)Math.floor(Math.random() * (vals.length))];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		for(int i = 1; i<vals.length;i++){
			System.out.println(vals[i]+" count is "+countVals(vals[i]));
			if(countVals(vals[i])>countVals(vals[max])){
				max = i;
			}
		}
		System.out.println("");
		return vals[max]+" occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i < grid.length ; i++){
			for(int k = 0; k < grid[i].length; k++){
				if(grid[i][k].equals(val)){
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		for (int i = 0; i < grid.length; i++){
			System.out.println(Arrays.toString(grid[i]));
		}
		return "";
	}
}