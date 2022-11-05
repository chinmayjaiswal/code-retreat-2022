package code.retreat;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private int size;
    private List<Cell> cells;

    private Grid(int size) {
        this.size = size;
        cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells.add(new Cell(new Position(i, j), false));
            }
        }
    }

    public Grid(int size, List<Position> liveCellPositions) {
        this(size);
        for (Position position : liveCellPositions){
            getCell(position).setAlive(true);
        }
    }

    public int size() {
        return size;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public Cell getCell(Position position) {
        for (Cell cell : cells){
            if(cell.hasPosition(position)){
                return  cell;
            }
        }
        throw new IllegalArgumentException("Cell with position does not exists " + position);
    }
}
