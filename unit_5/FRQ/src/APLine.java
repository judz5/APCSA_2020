public class APLine {

    private int a;
    private int b;
    private int c;
    private double slp;

    public APLine(int a_, int b_, int c_){
        a = a_;
        b = b_;
        c = c_;
        slp = 0.0;
    }

    public double getSlope(){
        slp = (double)(a-(2*a))/b;
        return slp;
    }

    public Boolean isOnLine(int x, int y){
        if((a*x)+(b*y)+c==0){
            return true;
        }
        return false;
    }

}


// (a(x))+(b(y))+c==0