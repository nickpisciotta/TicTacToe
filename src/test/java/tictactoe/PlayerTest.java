package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {
    private BufferedReader reader;
    private Player player;

    @Before
    public void setUp() {
        reader = mock(BufferedReader.class);
        player = new Player(reader);
    }

    @Test
    public void shouldAllowPlayerToEnterWhereToPlaceAMark() throws IOException {
        when(reader.readLine()).thenReturn("1");

        String playerInput = player.chooseWhereToPlaceMark();

        assertThat(playerInput, is("1"));
    }
}