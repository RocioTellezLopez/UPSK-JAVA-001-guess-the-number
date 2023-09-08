import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;
    protected List<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public abstract int makeGuess();

    public String getName() {
        return name;
    };

    public List<Integer> getGuesses(int guess) {
        guesses.add(guess);
        return guesses;
    };
}
