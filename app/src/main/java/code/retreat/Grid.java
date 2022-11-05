package code.retreat;

import java.util.List;

public class Grid {

    private final List<Cell> cells;

    public Grid(List<Cell> cells) {
        this.cells = cells;
    }

    public int size() {
        return cells.size();
    }

    public List<Cell> getCells() {
        return cells;
    }
}
