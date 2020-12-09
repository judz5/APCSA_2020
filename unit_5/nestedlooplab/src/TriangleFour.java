//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFour
{
	public static String go( int size, String let ) {
		String output = "";
		int count = 0;
		for (int i = size;i>0;i--) {

			for (int s = count;s > 0;s--){
				output += " ";
			}

		for (int k = size - count;k > 0;k--){
			output += let;
			}

		count++;
		output+="\n";

		}

		return output;
	}
}