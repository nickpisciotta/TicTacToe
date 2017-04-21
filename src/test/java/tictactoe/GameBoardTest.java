package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameBoardTest {
    private PrintStream stream;
    private GameBoard gameBoard;

    @Before
    public void setUp () {
        stream = mock(PrintStream.class);
        gameBoard = new GameBoard(stream);
    }

    @Test
    public void shouldDrawGameBoardWithCorrectFormat() {
        gameBoard.draw();

        verify(stream).println("1 | 2 | 3\n- - - - -\n4 | 5 | 6\n- - - - -\n7 | 8 | 9");
    }

}