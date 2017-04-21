package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {
    private GameBoard gameBoard;
    private Game game;
    private PrintStream stream;

    @Before
    public void setUp() {
        stream = mock(PrintStream.class);
        gameBoard = mock(GameBoard.class);
        game = new Game(gameBoard, stream);

    }

    @Test
    public void shouldDrawBoardWhenGameStarts() {
        game.start();

        verify(gameBoard).draw();
    }

    @Test
    public void shouldPromptPlayerToMakeAMarkAfterBoardIsDrawn() {
        game.start();

        verify(stream).println("Where would you like to place your mark?");
    }



}