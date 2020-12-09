//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Car class
//write all code for your Car class here
//test your Car class with the CarRunner{
public class Car{

private int miles;
private int oil;
private int lastOil;

public Car(int x, int y){
    miles = x;
    oil = y;
    lastOil=0;
}

public boolean timeForOilChange(){
    if((lastOil==0)||(lastOil>=oil)){
        return true;
    }else{
        return false;
    }
}

public void addMiles(int x_){
    lastOil+=x_;
}


}
