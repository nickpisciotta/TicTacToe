package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private final BufferedReader reader;
    private final String mark;

    public Player(BufferedReader reader, String mark) {
        this.reader = reader;
        this.mark = mark;
    }

    public String choosePosition() throws IOException {
        return reader.readLine();
    }

    public String getMark() {return mark;}
}
