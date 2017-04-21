package tictactoe;


import java.io.PrintStream;

public class GameBoard {
    private final PrintStream stream;

    public GameBoard(PrintStream stream) {
        this.stream = stream;
    }

    public void draw() {
        stream.println("1 | 2 | 3\n- - - - -\n4 | 5 | 6\n- - - - -\n7 | 8 | 9");
//        stream.println("- - - - -\n");
//        stream.println("4 | 5 | 6  ");
//        stream.println("_ _ _ _ _ \n");
//        stream.println("7 | 8 | 9 ");
    }
}
