//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package MonsterMash;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		//put m in the Monster array at [spot]
		myMonsters[spot]=m;
	}

	public Monster getLargest( )
	{
		int k = 0;
		for(int i = 1; i < myMonsters.length; i++){
			if(myMonsters[i].getHeight()>myMonsters[k].getHeight()){
				k = i;
			}
		}
		return myMonsters[k];
	}

	public Monster getSmallest()
	{
		int k = 0;
		for(int i = 1; i < myMonsters.length; i++){
			if(myMonsters[i].getHeight()<myMonsters[k].getHeight()){
				k = i;
			}
		}
		return myMonsters[k];
	}

	public String toString(){
		return Arrays.toString(myMonsters);
	}
}