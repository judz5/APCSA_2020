//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BoxWord
{
	public static String go( String word )
	{
		int len = word.length()-1;
		int hold = 1;
		String output = "";

		output += word;

		for(hold=1;hold < word.length()-1;hold++){

			output+="\n"+word.charAt(hold);
			len--;

			for(int i=0;i<word.length()-2;i++){
				output+=" ";
					}

			output+=word.charAt(len);

		}

		StringBuffer yes = new StringBuffer(word);
		output+="\n"+yes.reverse();

		return output + "\n";
	}
}