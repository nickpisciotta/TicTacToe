package tictactoe;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Main {

    public static void main(String[] args) {
        PrintStream stream = System.out;
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        GameBoard gameBoard = new GameBoard(stream);
        Player player = new Player(reader);
        Game game = new Game(gameBoard, stream);

        game.start();

    }
}
