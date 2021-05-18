import java.util.Arrays;

public class Board {

    private Spot[][] board;

    public Board(){
        board = new Spot[3][3];
        for(int col = 0; col<board.length; col++){
            for(int row = 0; row<board[0].length; row++){
                board[col][row] = new Spot(col, row, 0);
            }
        }
    }

    public void setSpot(int x, int y, int z){
        board[x][y].setVal(z);
    }

    public String toString(){
        for(Spot[] row : board){
            System.out.println(Arrays.toString(row));
        }
        return "";
    }

}
