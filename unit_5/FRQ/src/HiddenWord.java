public class HiddenWord {

    private String word;
    private String guess;


    public HiddenWord(String x) {
        word = x;
        guess = "";
    }

    public String getHint(String gs) {
        guess = gs;
        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == word.charAt(i)) {
                hint = hint + guess.charAt(i);
            } else if ((word.indexOf(guess.charAt(i)) > -1)) {
                hint = hint + "+";
            } else {
                hint = hint + "*";
            }
        }
        return hint;
    }
}

