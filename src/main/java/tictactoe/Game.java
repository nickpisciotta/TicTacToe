package tictactoe;


public class Game {

    private final GameBoard gameBoard;

    public Game(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void start() {
        gameBoard.draw();
    }
}
