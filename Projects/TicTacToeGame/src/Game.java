public class Game {

    public static void main(String[] args) {

        Board test = new Board();

        System.out.print(test);
        test.setSpot(0, 0, 1);
        System.out.print(test);
    }

}
