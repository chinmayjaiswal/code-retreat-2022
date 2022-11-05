package code.retreat;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    public Grid nextGen(Grid currentGrid) {

        if (currentGrid.getCells().size() == 1) {
            if (currentGrid.getCells().get(0).isAlive()) {
                currentGrid.getCells().get(0).setAlive(false);
                return  currentGrid;
            }
        }
        //
        Grid nexGenGrid = new Grid(new ArrayList<>());
        for ( Cell cell : currentGrid.getCells()) {

            int countOfLiveNeighbours = cell.getCountOfLiveNeighbours();
            if(countOfLiveNeighbours == 3){
              nexGenGrid.getCells().add(cell);
            }
        }

        return nexGenGrid;
    }
}
