import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;
    private static boolean continueGame;

    private static boolean checkGuess(Player player) {

        int guess = player.makeGuess();

        if (guess > targetNumber) {
            System.out.println("Muy alto.");
            System.out.println("------------------------");
            System.out.println(" ");
        } else if (guess < targetNumber) {
            System.out.println("Muy bajo.");
            System.out.println("------------------------");
            System.out.println(" ");
        } else if (guess == targetNumber) {
            System.out.println("Felicidades!," + player.getName() + "! Adivinaste el número.");
            System.out.println("------------------------");
            System.out.println(" ");
            continueGame = false;
        }
        player.getGuesses(guess);
        return continueGame;
    }

    public static void main(String[] args) {

        targetNumber = random.nextInt(100) + 1;
        continueGame = true;

        System.out.println(targetNumber);

        HumanPlayer humanPlayer = new HumanPlayer("Rocio");

        while (continueGame == true) {
            checkGuess(humanPlayer);
            if (continueGame == false) {
                System.out.println("Intentos " + humanPlayer.getName() + ": " + humanPlayer.guesses);
                System.out.println("El juego termino!");
            };
        }

    }
}
