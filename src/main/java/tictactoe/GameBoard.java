package tictactoe;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private final PrintStream stream;
    private List<String> boardPositions = new ArrayList<>();

    public GameBoard(PrintStream stream) {
        this.stream = stream;
        createBoardPositions();
    }

    public void draw() {
        String rows = createRows().replaceAll("\n", "\n- - - - -\n");
        String trimmedBoard = rows.substring(0, rows.length() - 3);
        stream.println(trimmedBoard);
    }

    private String createRows() {
        String row = "";

        for (String position : boardPositions) {
            Integer indexOfPosition = boardPositions.indexOf(position) + 1;
            if ((indexOfPosition) % 3 == 0 && indexOfPosition < 9) {
                row += position + "\n";
            } else {
                row += position + " | ";
            }
        }
        return row;
    }

    public void redraw(String chosenPosition, String mark) {
        if (isLocationAlreadyTaken(chosenPosition)) {
            stream.println("Location already taken. Please select another position");
        } else {
            updateBoardPositionsWithPlayersMark(chosenPosition, mark);
            draw();
        }
    }

    private boolean isLocationAlreadyTaken(String chosenPosition) {
        Integer indexOfPosition = Integer.parseInt(chosenPosition) - 1;
        String markAtPositionOnBoard = boardPositions.get(indexOfPosition);

        try {
            Integer.parseInt(markAtPositionOnBoard);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    public void createBoardPositions() {
        for (int i = 0; i < 9; i++) {
            boardPositions.add(Integer.toString(i + 1));
        }
    }

    private void updateBoardPositionsWithPlayersMark(String placeOnBoard, String mark) {
        Integer indexOfPosition = Integer.parseInt(placeOnBoard) - 1;
        boardPositions.set(indexOfPosition, mark);
    }
}
