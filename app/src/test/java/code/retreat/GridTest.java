package code.retreat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    @Test
    void shouldCreateGridOGivenSize() {
        //given
        int size = 10;
        //when
        Grid grid = new Grid(size,List.of());

        //then
        assertEquals(10, grid.size());
    }

    @Test
    void shouldCreateGridWithDeadCells() {
        //given
        int size = 10;
        Grid grid = new Grid(size, List.of());

        //when
        List<Cell> cells = grid.getCells();


        //then
        assertEquals(100, cells.size());
        for (Cell cell : cells) {
            assertEquals(true, !cell.isAlive());
        }
    }

    @Test
    void shouldCreateGridWithGivenLiveCellsPosition() {
        //given
        int size = 10;
        Position position11 = new Position(1, 1);
        Position position12 = new Position(1, 2);
        Position position21 = new Position(2, 1);
        Position position22 = new Position(2, 2);

        List<Position> liveCellPositions = new ArrayList<>();
        liveCellPositions.add(position11);
        liveCellPositions.add(position12);
        liveCellPositions.add(position21);
        liveCellPositions.add(position22);


        //when
        Grid grid = new Grid(size, liveCellPositions);

        //then
        assertTrue(grid.getCell(position11).isAlive());
        assertTrue(grid.getCell(position21).isAlive());
        assertTrue(grid.getCell(position12).isAlive());
        assertTrue(grid.getCell(position22).isAlive());
    }
}
