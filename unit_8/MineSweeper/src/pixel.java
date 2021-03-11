import java.util.*;

public class pixel {

    private boolean bomb = false;
    private int row;
    private int col;

    public pixel(int r, int c){
        row = r;
        col = c;
    }

    public void setBomb(){
        bomb = true;
    }

    public boolean getBomb(){
        return bomb;
    }

}
