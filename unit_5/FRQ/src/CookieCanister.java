public class CookieCanister {

    private int max;
    private int amt;
    private String type;
    private boolean lid;

    public CookieCanister(String cookie, int mx){
        max = mx;
        type = cookie;
        amt = 0;
        lid = false;
    }

    public int Dispense(int x){
        if(x>=amt&&lid){
            amt=0;
        }else if(lid){
            amt=amt-x;
        }
        return amt;
    }

    public int add(int y){
        if((amt+y)>max&&lid){
            amt = max;
        }else if(lid){
            amt = amt + y;
        }
        return amt;
    }

    public void open(){
        lid = true;
    }

    public void close(){
        lid = false;
    }

    public String CookieType(){
        return type;
    }

    public int MaxCookies(){
        return max;
    }

    public int CookieAmount(){
        return amt;
    }

    public boolean isOpen(){
        return lid;
    }

    public String toString(){
        return "Type of Cookie : "+type+"\nMax Amount of Cookies : "+max+"\nCurrent Cookie ammount : "+amt+"\nIs the lid open : "+lid;
    }


}
