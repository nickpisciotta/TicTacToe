package tictactoe;


import java.io.IOException;
import java.io.PrintStream;

public class Game {

    private final GameBoard gameBoard;
    private final PrintStream stream;
    private final Player player;

    public Game(GameBoard gameBoard, PrintStream stream, Player player) {
        this.gameBoard = gameBoard;
        this.stream = stream;
        this.player = player;
    }

    public void start() throws IOException {
        gameBoard.draw();
        promptPlayerWhereToMark();
        player.chooseWhereToPlaceMark();
    }

    private void promptPlayerWhereToMark() {
        stream.println("Where would you like to place your mark?");
    }


}
