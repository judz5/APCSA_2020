public class Spot {

    private int xpos;
    private int ypos;
    private int val;

    public Spot(int x, int y, int z){
        xpos = x;
        ypos = y;
        val = z;
    }

    public void setXpos(int x){
        xpos = x;
    }

    public void setYpos(int y){
        ypos = y;
    }

    public void setVal(int z){
        val = z;
    }

    public int getXpos(){
        return xpos;
    }

    public int getYpos(){
        return ypos;
    }

    public int getVal(){
        return val;
    }

    public String toString(){
        return ""+val;
    }

}
