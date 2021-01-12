//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package DoggiesLab;
import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot
		if(spot<pups.length){
			pups[spot]=new Dog(age, name);
		}
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int k = 0;
		for(int i = 1; i < pups.length; i++){
			if(pups[i].getAge()>pups[k].getAge()){
				k = i;
			}
		}
		return pups[k].getName();
	}

	public String getNameOfYoungest()
	{
		int k = 0;
		for(int i = 1; i < pups.length; i++){
			if(pups[i].getAge()<pups[k].getAge()){
				k = i;
			}
		}
		return pups[k].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}