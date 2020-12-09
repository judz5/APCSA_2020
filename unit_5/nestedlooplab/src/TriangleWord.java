//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
   private String word;

	public TriangleWord(String w)
	{
		word=w;
	}

	public String toString()
	{
		String output="";
		int len = word.length()-1;
		int let = 0;
		int mid = 1;
		for(int i = len;i>0;i--){

			for(int f = len-let;f>0;f--){
				output+=" ";
			}

			if(let==0){
				output+=word.charAt(0);
			}else if(let!=0){
				output+=word.charAt(let);
				for(int f = mid;f>0;f--){
					output+=" ";
				}
				output+=word.charAt(let);
			}

			for(int y = len;y>0;y--){
				output+=" ";
			}

			output+="\n";
			if(let!=0) {
				mid += 2;
			}
			let++;
		}

		String wordy = word.substring(1);
		StringBuilder back = new StringBuilder(wordy);
		output+= back.reverse();
		output+= word.charAt(0)+wordy;
		return output;

	}



}