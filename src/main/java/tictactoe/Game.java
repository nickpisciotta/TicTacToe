package tictactoe;


import java.io.PrintStream;

public class Game {

    private final GameBoard gameBoard;
    private final PrintStream stream;

    public Game(GameBoard gameBoard, PrintStream stream) {
        this.gameBoard = gameBoard;
        this.stream = stream;
    }

    public void start() {
        gameBoard.draw();
        promptPlayerWhereToMark();
    }

    private void promptPlayerWhereToMark() {
        stream.println("Where would you like to place your mark?");
    }
}
