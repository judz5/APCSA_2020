
// Q1 -------------------------------------------

// Part A

public static int hailstoneLength(int n){
    int i = n;
    int len = 1;
    while(i != 1){
        if(i % 2 != 0){
            i = (i*2)+1
        }else if(i % 2 == 0){
            i = i/2;
        }
        len++;
    }
    return len;
}

// Part B

public static boolean isLongSeq(int n){
    if(Hailstone.hailstoneLength(n)>n){
        return true;
    }
    return false;
}

// Part C

public static double propLong(int n){
    int total = 0;
    int big = 0;
    for(int i = 1 ; i<=n ; i++){
        if(Hailstone.isLongSeq(i)){
            big++;
        }
        total++;
    }
    return big/total;
}



// Q2 -------------------------------------------



public class GameSpinner{

    Private int sec;
    Private int spins;
    Private ArrayList<int> nums;
    Private int consec;

    public GameSpinner(int n){
        sec = n;
        spins = 0;
        consec = 0;
        nums = new ArrayList<int>();
    }

    public int currentRun(){
        if(spins==0){
            consec = 0;
        }else if(spins==1){
            consec = 1;
        }else if(nums.get(spins)==nums.get(spins-1)){
            consec++;
        }else{
            consec = 1;
        }
        return consec;
    }

    public int spin(){
        int i = (int)(math.random()*sec)+1
        nums.add(i);
        spins++;
        return i;
    }

}


// Q3 -------------------------------------------

// Part A

public void addReview(ProductReview prodReview){
    reviewList.add(prodReview);
    if(!productList.contains(prodReview.getName())){
        productList.add(prodReview.getName());
    }
}

// Part B

public int getNumGoodReviews(String prodName){
    int count = 0;
    if(productList.contains(prodName)){
        for(int i = 0; i<reviewList.size();i++){
            if(reviewList.get(i).getName().equals(prodName)){
                if(reviewList.get(i).getReview().contains("best")){
                    count++;
                }
            }
        }
    }
    return count;
}

