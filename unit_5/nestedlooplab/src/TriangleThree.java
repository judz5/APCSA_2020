//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleThree
{
	public static String go( int size, String let )
	{
		String output="";
		for(int i = size;i>0;i--){

			for(int j = i;j>0;j--){
				output+=" ";
			}

			for(int k =1+(size-i);k>0;k--){
				output+=let;
			}

			output+="\n";

		}

		return output;

	}
}