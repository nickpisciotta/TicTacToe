package tictactoe;


import java.io.IOException;
import java.io.PrintStream;

public class Game {

    private final GameBoard gameBoard;
    private final PrintStream stream;
    private final Player player1;
    private final Player player2;

    public Game(GameBoard gameBoard, PrintStream stream, Player player1, Player player2) {
        this.gameBoard = gameBoard;
        this.stream = stream;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() throws IOException {
        gameBoard.draw();
        playerMakesMark(player1);
        playerMakesMark(player2);
    }

    private void playerMakesMark(Player player) throws IOException {
        promptPlayerWhereToMark(player);
        String chosenPositionOfPlayer;
        chosenPositionOfPlayer = player.choosePosition();
        gameBoard.redraw(chosenPositionOfPlayer, player.getMark());
    }

    private void promptPlayerWhereToMark(Player player) {
        stream.println("Where would you like to place your mark?");
    }


}
