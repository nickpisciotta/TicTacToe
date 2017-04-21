package tictactoe;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    @Test
    public void shouldDrawBoardWhenGameStarts() {
        GameBoard gameBoard = mock(GameBoard.class);
        Game game = new Game(gameBoard);

        game.start();

        verify(gameBoard).draw();
    }

}