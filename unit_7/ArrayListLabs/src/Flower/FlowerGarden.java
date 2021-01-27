package Flower;

import java.util.*;

public class FlowerGarden
{
	//create an arraylist instance variable
    private ArrayList<String> Flowers;
	

	public FlowerGarden(){
	    Flowers = new ArrayList<String>();
    }

	public void addFlower(String data){
		if(findFlower(data)==-1){
			Flowers.add("01 "+data);
		}else{
			int count = getCount(data);
			Flowers.remove(findFlower(data));
			if(count+1<=9){
				Flowers.add("0"+(count+1)+" "+data);
			}
			if(count+1>9){
				Flowers.add((count+1)+" "+data);
			}
		}
    }

    public int getCount(String nam){
	    if(findFlower(nam)!=-1){
	    	return Integer.parseInt(Flowers.get(findFlower(nam)).substring(0,2));
		}
	    return 0;
    }

	public String getFlowerName(int pos){
	    if(inRange(pos)){
	    	return Flowers.get(pos).substring(3);
		}
		return "out of range";
    }

	public boolean inRange(int y){
		if(y<Flowers.size()){
			return true;
		}
		return false;
	}

    public int findFlower(String x){
	    for(int i = 0; i<Flowers.size();i++){
	    	if(getFlowerName(i).equals(x)){
	    		return i;
			}
		}
	    return -1;
    }

	public String maxFlower(){
		int big = 0;
		for(int i = 1;i<Flowers.size();i++){
			if(getCount(getFlowerName(i))>getCount(getFlowerName(big))){
				big = i;
			}
		}
		return Flowers.get(big);
    }

	public String toString(){
		return ""+Flowers;
	}
}