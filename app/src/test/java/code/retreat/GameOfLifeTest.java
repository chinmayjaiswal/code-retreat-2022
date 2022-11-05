package code.retreat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @Test
    void givenEmptyWorldThenReturnEmptyWorld() {
        GameOfLife gameOfLife = new GameOfLife();

        Grid currentGrid = new Grid(List.of());
        Grid nextGenGrid = gameOfLife.nextGen(currentGrid);

        assertEquals(0, nextGenGrid.size());
    }

    @Test
    void givenOneLiveCellInGridShouldHaveNoCellInNextGen() {
        GameOfLife gameOfLife = new GameOfLife();
        Cell livingCell = new Cell(true);
        Grid currentGrid = new Grid(List.of(livingCell));

        Grid nextGenGrid = gameOfLife.nextGen(currentGrid);

        assertFalse(nextGenGrid.getCells().get(0).isAlive());

    }

    @Test
    void givenCellsWithThreeNeighboursShouldGoToNextGen() {
        GameOfLife gameOfLife = new GameOfLife();
        Cell cell00 = new Cell(true);
        Cell cell01 = new Cell(true);
        Cell cell10 = new Cell(true);
        Cell cell11 = new Cell(true);

        cell00.addNeighbours(cell01,cell11,cell10);
        cell01.addNeighbours(cell00,cell11,cell10);
        cell10.addNeighbours(cell00,cell01,cell11);
        cell11.addNeighbours(cell00,cell01,cell10);

        Grid currentGrid = new Grid(List.of(cell00,cell01,cell10,cell11));

        Grid nextGenGrid = gameOfLife.nextGen(currentGrid);

        Assertions.assertEquals(4, nextGenGrid.size());

        nextGenGrid.getCells().forEach(
                cell -> {
                    assertTrue(cell.isAlive());

                }

        );
    }
}