import java.awt.*;
import java.util.Scanner;

public class HumanPlayer extends Player{

    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {
        System.out.println("--------" + "Round: " + getName() + "--------");
        System.out.print(getName() + ", ingresa tu suposición: ");
        int guess = scanner.nextInt();
//        getGuesses(guess);
        return guess;
    }
}
