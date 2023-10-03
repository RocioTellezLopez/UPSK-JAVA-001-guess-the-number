import java.util.Scanner;

public class HumanPlayer extends Player{

    private Scanner scanner = new Scanner(System.in);

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.println("--------" + "Round: " + getName() + "--------");
        System.out.print(getName() + ", ingresa tu suposición: ");
        int guess = scanner.nextInt();
        return guess;
    }
}
