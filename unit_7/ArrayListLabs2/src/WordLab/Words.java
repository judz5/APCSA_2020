//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WordLab;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
		words = new ArrayList<Word>();
		for(int i = 0;i<wordList.length;i++){
			words.add(new Word(wordList[i]));
		}
	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
		for(int i = 0;i<words.size();i++){
			if(words.get(i).getLength() == size){
				count++;
			}
		}
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		ArrayList<Integer> blah = new ArrayList<Integer>();
		int vowels = 0;
		for(int i = 0;i<words.size();i++){
			if(words.get(i).getLength() == size){
				vowels += words.get(i).getNumVowels();
				words.remove(i);
				i--;
			}
		}
		return vowels;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		for(int i = 0;i<words.size();i++){
			if(words.get(i).getNumVowels() == numVowels){
				count++;
			}
		}
		return count;
	}
	
	//add in a toString
	public String toString(){
		return ""+words;
	}
}