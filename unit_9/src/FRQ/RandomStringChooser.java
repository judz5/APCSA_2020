package FRQ;
import java.util.Random;
public class RandomStringChooser {

    private String[] data;

    public RandomStringChooser(String[] s){
        data = s;
    }

    public String getNext(){
        String[] temp = data;
        Random random = new Random();
        int randomNumber = random.nextInt(data.length + 1);
        if(temp[randomNumber]!="NONE"){
            String ans = temp[randomNumber];
            temp[randomNumber] = "NONE";
            return ans;
        }
    }


}

public class RandomLetterChooser extends RandomStringChooser {

    private String word;

    public RandomLetterChooser(String str){
       word = str;
    }

    public static String[] getSingleLetters(String str){
        String[] ans = new String[str.length()];
        for(int i = 0;i<str.length();i++){
            String let = str.charAt(i)+"";
            ans[i] = let;
        }
        return ans;
    }

}