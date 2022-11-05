package code.retreat;

public class Cell {
    private Location location;
    boolean isAlive;

    public Cell(Location location, boolean isAlive) {
        this.location = location;
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "location=" + location +
                ", isAlive=" + isAlive +
                '}';
    }
}

