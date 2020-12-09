//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String go( String let, int size)
	{
		int count = 0;
		String output = "";
		for(int i=size;i>0;i--){
			count++;
			for(int j=count;j>0;j--){
				output += let;
			}
			output+="\n";
		}
		return output;
	}
}