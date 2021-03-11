package FRQ;
import java.util.*


public class Posistion {

    public Posistion(int r, int c){}


    public static Posistion findPosistion(int num, int[][] intArr){
        for(int row = 0;row< intArr.length;row++){
            for(int col = 0;col<intArr[row].length;col++){ // go thru and check if value is equal
                if(intArr[row][col] == num){
                    Posistion answer = new Posistion(row,col);
                    return answer; // return if it is
                }
            }
        }
        return null; // will come here if it never finds one
    }

    public static Posistion[][] getSuccessorArray(int[][] intArr){
        Posistion[][] ans = new Posistion[intArr.length][intArr[0].length];
         for(int row = 0;row< intArr.length;row++){ // loop thru and add a posistion to 2d array of posistions for the value of it +1
             for(int col = 0;col<intArr[row].length;col++){
                 ans[row][col] = findPosistion((intArr[row][col])+1, intArr);
             }
         }
         return ans;
    }

}

// POINTS == 9 (code is exact to the example code)