import java.util.Random;
import java.util.Scanner;

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
            System.out.println("Felicidades," + player.getName() + "! Adivinaste el número. 🥳🎉🎊");
            System.out.println("------------------------");
            System.out.println(" ");
            continueGame = false;
        }
        player.getGuesses(guess);
        return continueGame;
    };

    private static String playerName () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego - Adivina el número 🔮🔮🔮!");
        System.out.print("Jugador, ingresa tu nombre: ");
        return scanner.next();
    }

    public static void main(String[] args) {

        targetNumber = random.nextInt(100) + 1;
        continueGame = true;

//        System.out.println(targetNumber);

        HumanPlayer humanPlayer = new HumanPlayer(playerName());
        ComputerPlayer computerGame = new ComputerPlayer("Computadora");

        while (continueGame == true) {

            boolean continueHuman = checkGuess(humanPlayer);
            if(continueHuman) {
                boolean continueComputer = checkGuess(computerGame);
                if (!continueComputer) {
                    System.out.println("Intentos " + computerGame.getName() + ": " + computerGame.guesses);
                    System.out.println("Total de intentos: " + computerGame.guesses.size());
                    System.out.println("El juego termino!");
                }
            }else {
                System.out.println("Intentos " + humanPlayer.getName() + ": " + humanPlayer.guesses);
                System.out.println("Total de intentos: " + humanPlayer.guesses.size());
                System.out.println("El juego termino!");
            }

        }
    }
}
