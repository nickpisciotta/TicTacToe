package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {
    private GameBoard gameBoard;
    private Game game;
    private PrintStream stream;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        stream = mock(PrintStream.class);
        gameBoard = mock(GameBoard.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(gameBoard, stream, player1, player2);

    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws IOException {
        game.start();

        verify(gameBoard).draw();
    }

    @Test
    public void shouldPromptBothPlayersToMakeAMarkAfterBoardIsDrawn() throws IOException {
        game.start();

        verify(stream, times(2)).println("Where would you like to place your mark?");
    }

    @Test
    public void shouldAllowFirstPlayerToChooseAPosition() throws IOException {
        game.start();

        verify(player1).choosePosition();
    }
    @Test
    public void shouldAllowSecondPlayerToChooseAPosition() throws IOException {
        game.start();

        verify(player2).choosePosition();
    }

    @Test
    public void shouldTellGameBoardToReDrawTwiceAfterBothPlayersChooseAPosition() throws IOException {
        game.start();

        verify(gameBoard, times(2)).redraw(any(), any());
    }

}