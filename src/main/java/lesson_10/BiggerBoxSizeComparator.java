package lesson_10;

import java.util.Comparator;

public class BiggerBoxSizeComparator implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        if (o1.getSize() > o2.getSize()) {
            return -1;
        }
        if (o1.getSize() < o2.getSize()) {
            return 1;
        }
        return 0;
    }
}
