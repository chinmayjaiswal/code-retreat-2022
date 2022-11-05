package code.retreat;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {
    @Test
    void shouldReturnTrueWhenCellHasGivenPosition() {

        Cell cell = new Cell(new Position(0,0), true);

        boolean hasPosition = cell.hasPosition(new Position(0,0));

        assertTrue(hasPosition);
    }

    @Test
    void shouldReturnFalseWhenCellDoesNotHaveGivenPosition() {

        Cell cell = new Cell(new Position(0,0), true);

        boolean hasPosition = cell.hasPosition(new Position(0,1));

        assertFalse(hasPosition);
    }


}