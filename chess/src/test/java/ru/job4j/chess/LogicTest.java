package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.black.BishopBlack;

import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void shouldThrowExceptionWhenFigureNotFound()
            throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.move(C2, H6);
    }

    @Test(expected = OccupiedCellException.class)
    public void shouldThrowExceptionWhenCellOccupied()
            throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(C1));
        logic.add(new BishopBlack(H6));
        logic.move(C1, H6);
    }
}