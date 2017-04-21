package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private final BufferedReader reader;

    public Player(BufferedReader reader) {
        this.reader = reader;
    }

    public String chooseWhereToPlaceMark() throws IOException {
        return reader.readLine();
    }
}
