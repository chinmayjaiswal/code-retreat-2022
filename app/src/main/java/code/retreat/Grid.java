package code.retreat;

import java.util.List;

public class Grid {
    int size;
    Cell [][] cells;

    public Grid(int size, List<Location> liveCellLocations) {
        this.size = size;
        this.cells = new Cell[size][size];

        for(int i = 0; i < size; i++ ){
            for(int j = 0; j < size; j++ ){
                cells[i][j]  = new Cell(new Location(i,j),false);
            }
        }


        for (Location location: liveCellLocations) {
            cells[location.getRow()][location.getColumn()].setAlive(true);
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < size; i++ ){
            for(int j = 0; j < size; j++ ){
                output = output  + " "+ cells[i][j] ;
            }
        }
        return output;
    }


}
