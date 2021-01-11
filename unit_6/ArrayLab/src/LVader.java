import java.util.Arrays;

//make your LVader class here

public class LVader{

    private int[] ele;

    public LVader(int flr){
        ele = new int[flr];
    }

    public boolean inRange(int flr_){
        if(flr_<ele.length){
            return true;
        }
        return false;
    }

    public boolean incNumStops(int x){
        if(inRange(x)){
            ele[x]++;
        }
        return inRange(x);
    }

    public int numStops(int y){
        if(y<ele.length){
            return ele[y];
        }
        return -1;
    }

    public int floorWithMostStops(){
        int first = ele[0];
        int count = 0;
        for(int i = 1;i<ele.length;i++){
            count++;
            if (ele[i] > first) {
                first = ele[i];
            }
        }
        return count;
    }

    public String toString(){
        return (Arrays.toString(ele));
    }

}