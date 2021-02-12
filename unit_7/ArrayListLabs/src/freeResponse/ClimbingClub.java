package freeResponse;
import java.util.*;
public class ClimbingClub {

    private List<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }


    public void addClimb(String peakName, int climbTime){ // just add the new climbo info to the list
        climbList.add(new ClimbInfo(peakName, climbTime));
    }
                                                                        // neg if before, pos if after , 0 if equal
    public void addClimb(String peakName, int climbTime){ // add alphebital order .add(index, element) >> pushes element at index right
        for(int i = 0; i < climbList.size();i++){
            if(peakName.compareTo(climbList.get(i).getName())<= 0){
                climbList.add(i, new ClimbInfo(peakName, climbTime));
                break;
            }
        }
        climbList.add(new ClimbInfo(peakName, climbTime));
    }


    // Part c
    // (i) == NO (Because It would count the same name again if it reapeared later if not organized)

    // (ii) == Yes (Because if its sorted it would re count names and it doesnt have any out of bounds errors because it checks
    // before not after so it will always be inbounds)


}




// Points = 7 total

// Part A = 2
// +2 (adds to the arrray list)

// Part B = 4
// +1 (Creates new objects using data)
// +1 (uses get name to compare)
// +1 (Adds into list based on values)
// +0 (Doesnt Check all values first it just places it in the first place it finds)
// +1 (adds into list without destroying othert data)
// +0 (doesnt maintain alphabetical order because the values arent all checkd it only does the first part also insterts multiple times)

// Part C = 1
// +1 (no , yes)