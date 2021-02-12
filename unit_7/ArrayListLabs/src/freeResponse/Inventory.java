package freeResponse;
import java.util.*;
public class Inventory {

    private List<InventoryItem>itemList;

    public Inventory(){    itemList = new ArrayList<InventoryItem>();  }

    public void addItem(InventoryItem newItem){

    }
                                                            // getType() , getStoreID() , getUnitCount()
    public int getTotalUnitCount(){
        int count = 0;
        if(itemList.size()==0){
            return 0;
        }
        for(int i = 0; i<itemList.size();i++){
            count+=itemList.get(i).getUnitCount();
        }
        return count;
    }

    public int removeProducts(String productType){
        int count = 0;
        for(int i = 0; i<itemList.size();i++){
            if(itemList.get(i).getType().equals(productType)){
                count+= itemList.get(i).getUnitCount();
                itemList.remove(i);
                i--;
            }
        }
        return count;
    }

}
