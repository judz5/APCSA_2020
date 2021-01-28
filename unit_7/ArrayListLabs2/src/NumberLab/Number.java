//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//write the Number class
//use the handout and
//sample runner code
//to guide you

package NumberLab;

import java.util.*;

public class Number {

    private int num;
    private ArrayList<Integer> ans;

    public Number(int x){
        num = x;
    }

    public boolean isOdd(){
        if((num%2)!=0){
            return true;
        }
        return false;
    }

    public boolean isEven(){
        if((num%2)==0){
            return true;
        }
        return false;
    }

    public boolean isPerfect(){
       ans = new ArrayList<Integer>();
        int total = 0;
        for(int i = 1;i<num;i++){
           if(num%i==0){
               ans.add(i);
           }
       }
       for(int i = 0;i<ans.size();i++){
           total+=ans.get(i);
       }
       if(total == num){
           return true;
       }
       return false;
    }

    public String toString(){
        return ""+num;
    }

}