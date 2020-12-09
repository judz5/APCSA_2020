//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your CookieJar class
//write all code for your CookieJar class here
//test your CookieJar class with the CookieJarRunner
public class CookieJar{

    private int capacity;
    private int amount;

    public CookieJar(int x){
        capacity = x;
        amount = 0;
    }

    public boolean isFull(){
        return amount >= capacity;
    }

    public int addStuff(int x_){
        amount+=x_;
        return amount - capacity;
    }

    public int spaceLeft(){
        if(capacity>amount){
            return capacity - amount;
        }else{
            return 0;
        }
    }

}