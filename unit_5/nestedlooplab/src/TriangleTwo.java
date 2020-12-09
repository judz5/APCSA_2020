//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class TriangleTwo
{
	public static String go( int size, String let ) {
		int count = size + 1;
		String output = "";
		for (int i = size; i > 0; i--) {
			count--;
			for (int j = count; j > 0; j--) {
				output += let;
			}
			output += "\n";
		}
		return output;
	}
}