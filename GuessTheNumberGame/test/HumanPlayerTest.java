import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HumanPlayerTest {
    HumanPlayer humanPlayer;

    @BeforeEach
    void setUp() {
        humanPlayer = new HumanPlayer("Rocio");
    }

    @Test
    void getName() {
        humanPlayer = new HumanPlayer("Maria");

        String result = humanPlayer.getName();

        assertEquals("Maria", result, "El metodo devuelve el nombre del jugador");
    }

    @Test
    void makeGuess() {
        String input = "42\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        InputStream original = System.in;
        System.setIn(inputStream);

        int guess = humanPlayer.makeGuess();

        System.setIn(original);

        assertEquals(42, guess);
    }








//    @Test
//    public void testMakeGuess() {
//        // Inicializamos los mocks
//        MockitoAnnotations.initMocks(this);
//
//        // Creamos un objeto HumanPlayer
//        HumanPlayer humanPlayer = new HumanPlayer("John");
//
//        // Creamos un Scanner mock
//        Scanner scanner = mock(Scanner.class);
//
//        // Configuramos el comportamiento esperado del Scanner mock
//        when(scanner.nextInt()).thenReturn(42);
//
//        // Asignamos el Scanner mock al jugador humano
//        humanPlayer.setScanner(scanner);
//
//        // Llamamos al método makeGuess
//        int guess = humanPlayer.makeGuess();
//
//        // Verificamos que se llamó a nextInt en el Scanner mock
//        verify(scanner).nextInt();
//
//        // Verificamos que el resultado sea el esperado
//        assertEquals(42, guess);
//    }

}