//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WordLab;
import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
   private String word;
	//create a constructor
	public Word(String test){
	   word = test;
    }
	//create other methods
   public int getNumVowels(){
	  int count = 0;
	   for(int i = 0; i<word.length(); i++){
	      for(int k = 0; k<vowels.length(); k++){
	         if(word.charAt(i) == vowels.charAt(k)){
	            count++;
             }
          }
       }
	   return count;
   }

   public int getLength(){
	   return word.length();
   }

   public void setWord(String w){
	   word = w;
   }

	public String toString(){
	   return word;
    }
}