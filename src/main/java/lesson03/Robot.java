package lesson03;

public class Robot {
    int x;
    int y;
    Direction direction;


    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void turnLeft() {
        if (this.direction == Direction.DOWN) {
            this.direction = Direction.LEFT;
        } else if (this.direction == Direction.UP) {
            this.direction = Direction.LEFT;
        } else if (this.direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
        } else {
            this.direction = Direction.UP;
        }
    }

    public void turnRight() {
        if (this.direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
        } else if (this.direction == Direction.UP) {
            this.direction = Direction.RIGHT;
        } else if (this.direction == Direction.LEFT) {
            this.direction = Direction.UP;
        } else {
            this.direction = Direction.DOWN;
        }

    }

    public void stepForward() {
        if (this.direction == Direction.DOWN) {
            this.y = this.y - 1;
        } else if (this.direction == Direction.UP) {
            this.y = this.y + 1;
        } else if (this.direction == Direction.LEFT) {
            this.x = this.x - 1;
        } else {
            this.x = this.x + 1;
        }
    }
    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
