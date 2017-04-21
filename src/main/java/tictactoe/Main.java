package tictactoe;


import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream stream = System.out;
        GameBoard gameBoard = new GameBoard(stream);
        Game game = new Game(gameBoard);

        game.start();

    }
}
