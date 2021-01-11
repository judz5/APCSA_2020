//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	private int[] array;
	
	public ArrayStats(String list)
	{
		//put stuff in the array
		setArray(list);
	}	
	
	public void setArray(String list)
	{
		//put stuff in the array
		array = new int[(list.length()/2)+1];
		Scanner c = new Scanner(list);
		int groupSize = 0;
		int previous = -1;
		while(c.hasNextInt()){
			int current = c.nextInt();
			if(current == previous){
				groupSize++;
			}else{
				for(int i = groupSize;i>0;i--){
					array[i]++;
				}
				groupSize = 1;

			}
			previous = current;
		}
		for(int i = groupSize;i>0;i--){
			array[i]++;
		}
	}	
			
	public int getNumGroupsOfSize(int size)
	{

		return array[size];

	}
	
	public String toString()
	{
		return (Arrays.toString(array));
	}
}
/*
	current=array[i];
			if(current==previous){
			hold++;
			previous=array[i];
			}else if(current!=previous){
			for(int k = hold;k>0;k--){
			store[k]++;
			hold=1;
			}
			}
*/

