package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(C8);
        Cell position = bishopBlack.position();
        assertEquals(C8, position);
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Cell[] cells = bishopBlack.way(Cell.G5);
        assertThat(cells, is(new Object[] {D2, E3, F4, G5}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWayWithException() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        bishopBlack.way(G4);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure copy = bishopBlack.copy(Cell.A5);
        assertEquals(Cell.A5, copy.position());
    }
}