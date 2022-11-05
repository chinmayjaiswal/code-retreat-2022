package code.retreat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {
    @Test
    void shouldCreateGridOfSize10() {
        Grid grid = new Grid(10, List.of());
        assertEquals(10, grid.getSize());
    }

    @Test
    void shouldPrintGrid() {
        Grid grid = new Grid(10, List.of(new Location(0,0)));
        String gridAsString = grid.toString();
        assertNotNull(gridAsString);
        System.out.println(gridAsString);
    }
}