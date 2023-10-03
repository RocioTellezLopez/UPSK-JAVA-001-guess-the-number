import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberGameTest {
    GuessTheNumberGame guessTheNumberGame;
    HumanPlayer humanPlayer;

    @BeforeEach
    void setUp() {
        guessTheNumberGame = new GuessTheNumberGame();
    }

    @Test
    public void testPlayerName() {
        guessTheNumberGame = new GuessTheNumberGame();
        String name = "Patricio\n";
        System.setIn(new ByteArrayInputStream(name.getBytes()));

        String nameResult = guessTheNumberGame.playerName();

        assertEquals("Patricio", nameResult);
    }

//    @Test
//    public void testCheckGuess() {
//        guessTheNumberGame = new GuessTheNumberGame();
//        humanPlayer = new HumanPlayer("Jugador Humano");
//        String checkValue = "45\n";
//        System.setIn(new ByteArrayInputStream(checkValue.getBytes()));
//
//        boolean result = guessTheNumberGame.checkGuess(humanPlayer);
//
//        assertEquals("true", result);
//
//    }




}