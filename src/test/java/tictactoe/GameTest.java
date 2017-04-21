package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {
    private GameBoard gameBoard;
    private Game game;
    private PrintStream stream;
    private Player player;

    @Before
    public void setUp() {
        stream = mock(PrintStream.class);
        gameBoard = mock(GameBoard.class);
        player = mock(Player.class);
        game = new Game(gameBoard, stream, player);

    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws IOException {
        game.start();

        verify(gameBoard).draw();
    }

    @Test
    public void shouldPromptPlayerToMakeAMarkAfterBoardIsDrawn() throws IOException {
        game.start();

        verify(stream).println("Where would you like to place your mark?");
    }

    @Test
    public void shouldTellPlayerToChooseWhereToPlaceMark() throws IOException {
        game.start();

        verify(player).chooseWhereToPlaceMark();
    }

}