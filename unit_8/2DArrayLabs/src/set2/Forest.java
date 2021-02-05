//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package set2;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Forest
{
	private Thing[][] grid;

	public Forest(int rows, int cols)
	{
		final String[] typeList = "cat dog tree rock".split(" ");
		final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
		
		//load stuff into the grid
		grid = new Thing[rows][cols];
		for(int i = 0; i<grid.length;i++){
			for(int k = 0; k<grid[i].length;k++){
				String randType = typeList[(int)Math.floor(Math.random() * (typeList.length))];
				String randName = nameList[(int)Math.floor(Math.random() * (nameList.length))];
				double randNum = Math.random() * ((35 - 10)+1)+10;
				grid[i][k] = new Thing(randType, randName, randNum);
			}
		}
	}

	public int setTrappedToNull( )
	{
		int total = 0;
		for(int i = 0; i<grid.length;i++){
			for(int k = 0; k<grid[i].length;k++){
				if((grid[i][k].getType().equals("cat")||grid[i][k].getType().equals("dog")) && isTrapped(i,k)){
					grid[i][k] = null;
					total++;
				}
			}
		}
		return total;
	}
	

	public boolean isTrapped( int r, int c)
	{
		int count = 0;
		if(inBounds(r,c)) {
			for (int i = r - 1; i <= r + 1; i++) {
				if (i >= 0 && i <= grid.length - 1) {
					for (int k = c - 1; k <= c + 1; k++) {
						if (k >= 0 && k <= grid[i].length - 1) {
							if (grid[i][k]!=null) {
								if ((grid[i][k].getType().equals("tree")|| grid[i][k].getType().equals("rock")) && grid[i][k].getSize()>=10) {
									count++;
								}
							}
						}
					}
				}
			}
		}
		if(count>=5){
			return true;
		}
		return false;
	}

	private boolean inBounds( int r, int c)
	{
		if(r<(grid.length-1) && c<(grid[0].length-1)){
			return true;
		}
		return false;
	}

	public String toString()
	{
		for (int i = 0 ; i < grid.length;i++){
			System.out.println(Arrays.toString(grid[i]));
		}
		return "";
	}
}


