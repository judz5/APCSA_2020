//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package NumberLab;
import java.util.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
	public NumberAnalyzer(int[] k){
		list = new ArrayList<Number>();
		for(int i = 0;i<k.length;i++){
			list.add(new Number(k[i]));
		}
	}
	//write count odds
	public int countOdds(){
		int count = 0;
		for(int i = 0;i<list.size();i++){
			if(list.get(i).isOdd()){
				count++;
			}
		}
		return count;
	}
	//write count evens
	public int countEvens(){
		int count = 0;
		for(int i = 0;i<list.size();i++){
			if(list.get(i).isEven()){
				count++;
			}
		}
		return count;
	}
	//write count perfects
	public int countPerfects(){
		int count = 0;
		for(int i = 0;i<list.size();i++){
			if(list.get(i).isPerfect()){
				count++;
			}
		}
		return count;
	}
	//write a toString
	public String toString(){
		return ""+list;
	}
}