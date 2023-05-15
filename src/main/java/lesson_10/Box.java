package lesson_10;

public class Box implements Comparable<Box> {
    private final int size;

    public Box(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Box o) {
        if (this.size > o.size) {
            return 1;
        } else if (this.size < o.size) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }
}
