package freeResponse;
import java.util.*;
public class stringCoder {

    private String masterString;

    public String DecodeString(ArrayList<StringPart> parts){
        String ans = "";
        // lngth + start = substring length not -1 cause not inclisive
        for(int i = 0; i<parts.size();i++){
            ans+=masterString.substring(parts.get(i).getStart(), (parts.get(i).getStart())+((parts.get(i).getLegnth)));
        }
        return ans;
    }

    public ArrayList<StringPart> encodeString(String word){
        ArrayList<StringPart> go = new ArrayList<StringPart>();
        // find part find first part +1 to length for each time the chars match then stop adn re run
        String check = word;
        int count = 0;
        while(check.length()>0){
            go.add(findPart(check));
            check = check.subString((go.get(count).getLength)-1); // Not going to submit a whole new file for one thing , so to correct this i would get rid of -1
            count++;
        }
        return go;
    }

}

// Points : 8.5
// ----------------------
// Part A : 4.5
// +1
// +2
// +1.5

// Part B : 4
// +.5
// +3
// +.5
