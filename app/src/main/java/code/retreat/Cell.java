package code.retreat;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private boolean alive;

    public Cell(boolean isAlive) {
        this.alive = isAlive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean aliveStatus) {
        this.alive = aliveStatus;
    }

    private List<Cell> neighbours = new ArrayList<>();

    public void addNeighbours(Cell... cell) {
        this.neighbours.addAll(List.of(cell));

    }

    public int getCountOfLiveNeighbours() {
        int count = 0;
        for (Cell cell: neighbours) {
            if(cell.isAlive()){
                count++;
            }

        }
        return count;
    }
}
