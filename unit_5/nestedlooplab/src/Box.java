//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Box
{
	public static String go( int size )
	{
		String output="";
		for(int i = size;i>0;i--){

			for(int j = i;j>0;j--){
			output = output+"*";
			}

			for(int k = 1+(size-i);k>0;k--){
			output = output+"#";
			}

			output = output+"\n";

		}

		return output;

	}

}