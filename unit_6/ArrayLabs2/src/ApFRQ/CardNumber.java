package ApFRQ;

import java.util.Arrays;

public class CardNumber {



    public int[] doublePattern(int[] num){
        int[] card = new int[num.length];
        for(int i = num.length-1;i>-1;i--){
            // n-2, n-4, n-6 == double
            // if length is even when i is even don't double
            if(num.length%2==0){
                if(i-1%2==0){
                    card[i]=num[i];
                }else if(i-1%2!=0){
                    card[i]=2*(num[i]);
                }
            } // if not even , uneven numbers don't get doubled
            if(num.length%2!=0){
                if(i-1%2!=0){
                    card[i]=num[i];
                }else if(i-1%2==0){
                    card[i]=2*(num[i]);
                }
            }
        }
        return card;
    }


    public boolean verified(int[] nums){
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10){
                count+=nums[i];
            }else if(nums[i]>=10){
                // split digits add separate
                count += nums[i]%10;
                count += nums[i]/10;
            }
        }
        if(count%10==0){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

        CardNumber test = new CardNumber();
        int[] go = new int[]{7,3,9,6,2,3};
        System.out.println(test.doublePattern(go));



    }

}
