package code.retreat;

public class Cell {
    private Position position;
    private boolean alive;

    public Cell(Position position, boolean alive) {
        this.position = position;
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean hasPosition(Position expectedPosition) {
        return this.position.getRow() == expectedPosition.getRow() && this.position.getColumn() == expectedPosition.getColumn();
    }
}
