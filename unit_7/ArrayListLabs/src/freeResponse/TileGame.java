package freeResponse;
import java.util.*;

public class TileGame {

    private ArrayList<NumberTile> board;

    public TileGame(){
        board = new ArrayList<NumberTile>();
    }

    // part A __________________________________

    private int getIndexForFit(NumberTile tile){
        if(board.size()<1 || getRight(tile) == getLeft(board.get(0))){
            return 0;
        }
        if(getLeft(tile) == getRight(board.size()-1)){
            return board.size();
        }
        for(int i = 1; i < board.size();i++){
            if(getRight(tile) == getLeft(board.get(i))){
                if(getLeft(tile) == getRight(board.get(i-1))){
                    return i;
                }
            }
        }
        return -1;
    }

    // part B __________________________________

    public boolean insertTile(NumberTile tile){
        for(int i = 0; i<4;i++){
            if(getIndexForFit(tile)==board.size()){
                board.add(tile);
                return true;
            }else if(getIndexForFit(tile)>=0){
                board.add(getIndexForFit(tile), tile);
                return true;
            }else if(getIndexForFit(tile)<0){
                rotate(tile);
            }
        }
        return false;
    }


}
