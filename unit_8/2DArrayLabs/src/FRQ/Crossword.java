package FRQ;
import java.util.*;

public class Crossword {


    private Sqaure[][] puzzle;

    public Crossword(boolean[][] blackSquares){}

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
        if(blackSquares[r][c]==true){
            return false;
        }
        if(r == 0 || c == 0 || (r == 0 && c == 0)){ // First row or first col garunteed to be numbered
            return true;
        }else if((blackSquares[r-1][c] == true)||(blackSquares[r-1][c] == false && blackSquares[r][c-1]==true)){ // check left and above or just one
            return true;
        }else{
            return false;
        }
    }

    public Crossword(boolean[][] blackSquares){
        int count = 1;
        puzzle = new Sqaure[blackSquares.length][blackSquares[0].length];  // loop thru
        for(int row = 0 ; row<blackSquares.length;row++){
            for(int col = 0; col<blackSquares[row].length;col++){
                if(toBeLabeled(row, col, blackSquares)){
                    puzzle[row][col] = new Square(false, count); // make count increase after so in order
                    count++;
                }else if(blackSquares[row][col]==true){   // if black make new one black
                    puzzle[row][col] = new Square(true, 0);
                 }else{ // This was not here before This is what got me -1 point
                    puzzle[row][col] = new Square(false, 0);
                }
            }
        }
    }

}


// GRADE = 8

// PART A = 3

// Checks Black Sqaure +1
// checks border +1
// Checks if should be label +1

// PART B = 5

//makes puzzle new squre +1
// Accesses all spots +1
// Does call tobeLabeld +1
// does make a new square +1
// Conesutive number order +1
// On exit it is not correct, does nothing with spots that shouldnt be labeld (needs an else ran out of time)