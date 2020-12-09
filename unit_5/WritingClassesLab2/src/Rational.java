//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Rational class
//write all code for your Rational class here
//test your Rational class with the RationalRunner
public class Rational{

    private int num;
    private int den;

    public Rational(int num, int den){
        this.num = num;
        this.den = den;
    }

    public boolean isBigger(Rational other){
        if((this.num/this.den)>(other.num/other.den)){
            return true;
        }
        return false;
    }

    public boolean equals(Rational other){
        if((this.num/this.den)==(other.num/other.den)){
            return true;
        }
        return false;
    }

    public void setRational(int x, int y){
        this.num = x;
        this.den = y;
    }

    public void add(Rational other){
        int gcd=0;
        num = ((this.num * other.den)+(other.num * this.den));
        den = (this.den * other.den);
        for(int i = 1; i <= num && i <= den; i++){
            if(num%i==0 && den%i==0)gcd=i;
        }

        num = num/gcd;
        den = den/gcd;

    }

    public String toString(){
        return this.num+"/"+this.den;
    }



}