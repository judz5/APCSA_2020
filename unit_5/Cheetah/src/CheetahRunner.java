public class CheetahRunner {

    public static void main(String args[]){

        Cheetah cat = new Cheetah("kitty",87.0,8);
        cat.speedUp(3);
        System.out.println(cat.isFast());

        cat.getsBigger(1);
        System.out.println(cat.isBig());

    }

}
