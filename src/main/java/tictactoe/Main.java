package tictactoe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream stream = System.out;
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        GameBoard gameBoard = new GameBoard(stream);
        Player player1 = new Player(reader, "X");
        Player player2 = new Player(reader, "0");
        Game game = new Game(gameBoard, stream, player1, player2);

        game.start();

    }
}
