package FRQ;

import java.util.*;

public class Flight {

    private Seat[][] mySeats;

    public int emptySeatCount(String seatType){
        int count = 0;
        for(int row = 0; row< mySeats.length;row++){
            for(int col = 0; col<mySeats[row].length;col++){
                if(seatType.equals("any")){
                    if(mySeats[row][col].getPassenger().getName().equals("")){ // Add getName()
                        count++;
                    }
                }else{
                    if((mySeats[row][col].getType()).equals(seatType) && mySeats[row][col].getPassenger().equals("")){
                        count++;
                    }
                  }
               }
            }
        return count;
        }


        public int findBlock(int row, int seatsNeeded){
            for(int col = 0; col<mySeats[row].length;col++){
                int count = 0;
                if(mySeats[row][col].getPassenger().getName().equals("")){ // add getName()
                    count++;
                    if((col+1) + (seatsNeeded-1) <= mySeats[row].length){
                        for(int search = col+1;search<col+(seatsNeeded-1);search++){
                            if(mySeats[row][search].getPassenger().getName().equals("")){ // add getName()
                                count++;
                                if(count == seatsNeeded){
                                    return col;
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public boolean assignGroup(List<Passenger> group){
        int count = 0;
        for(int row = 0; row<mySeats.length;row++){
                if(findBlock(row, group.size()) > -1){
                    for(int col = findBlock(row, group.size());col<=col+group.size();col++){
                        mySeats[row][col].setPassenger(group.get(count));
                        count++;
                    }
                    return true;
                }
            }
            return false;
        }

}

//public void setPassenger(Passenger passenger) { ... }



