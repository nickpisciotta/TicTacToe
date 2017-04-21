package tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameBoardTest {

    @Test
    public void shouldDrawGameBoardWithCorrectFormat() {
        PrintStream stream = mock(PrintStream.class);
        GameBoard gameBoard = new GameBoard(stream);

        gameBoard.draw();

        verify(stream).println("1 | 2 | 3\n- - - - -\n4 | 5 | 6\n- - - - -\n7 | 8 | 9");
    }

}