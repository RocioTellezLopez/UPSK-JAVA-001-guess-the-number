import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {
    ComputerPlayer computerPlayer;

    @DisplayName("El metodo getName muestra el nombre de computadora")
    @Test
    public void testGetName() {
        computerPlayer = new ComputerPlayer("Computadora");

        String nameResult = computerPlayer.getName();

        assertEquals("Computadora", nameResult);
    }


    @DisplayName("El metodo makeGuess de computerPlayer debe seleccionar un numero random")
    @Test
    public void testComputerMakeGuess() {
        computerPlayer = new ComputerPlayer("Computadora");

        int computerGuess = computerPlayer.makeGuess();

        assertNotEquals(45, computerGuess, "Número random de computerPlayer");

   }
}