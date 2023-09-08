import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public int makeGuess() {
        int computerGuess = random.nextInt(100) + 1;

        System.out.println("----- Round: " + getName() + " -----");
        System.out.print(getName() + ", ingresa tu suposición: " + computerGuess);
        System.out.println(" ");
//        getGuesses(computerGuess);
        return computerGuess;
    }
}
