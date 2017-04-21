package tictactoe;


import java.io.PrintStream;

public class GameBoard {
    private final PrintStream stream;

    public GameBoard(PrintStream stream) {
        this.stream = stream;
    }

    public void draw() {
        stream.println("1 | 2 | 3\n- - - - -\n4 | 5 | 6\n- - - - -\n7 | 8 | 9");
    }
}
