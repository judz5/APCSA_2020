public class Cheetah {

    private String name;
    private double speed;
    private int size;

    public Cheetah(String name, Double speed, int size){
        name = name;
        speed = speed;
        size = size;
    }

    public void speedUp(int x){
        speed+=x;
    }

    public boolean isFast(){
        return speed>50;
    }

    public void getsBigger(int y){
        size+=y;
    }

    public boolean isBig(){
        return size<10;
    }

}
