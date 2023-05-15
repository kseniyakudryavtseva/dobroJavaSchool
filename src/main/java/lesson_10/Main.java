package lesson_10;

import lesson09.DynamicArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Box> list = new LinkedList<>();
        list.add(new Box(10));
        list.add(new Box(20));
        list.add(new Box(30));
        Collection<Box> result = filterBySize(list, 20);
        Collection<Box> result2 = filterBySize(list.iterator(), 20);
        System.out.println(result); // [Box{size=10}]
        System.out.println(result2); // [Box{size=10}]

        PriorityQueue<Box> boxes = new PriorityQueue<>();
        boxes.add(new Box(10));
        boxes.add(new Box(90));
        boxes.add(new Box(40));
        boxes.add(new Box(30));
        boxes.add(new Box(60));
        while (!boxes.isEmpty()) {
            System.out.println(boxes.poll());
        }

        PriorityQueue<Box> boxes1 = new PriorityQueue<>(new BiggerBoxSizeComparator());
        boxes1.add(new Box(10));
        boxes1.add(new Box(90));
        boxes1.add(new Box(40));
        boxes1.add(new Box(30));
        boxes1.add(new Box(60));
        while (!boxes1.isEmpty()) {
            System.out.println(boxes1.poll());
        }

        DynamicArray array = new DynamicArray();
        array.add(new Box(60));
        array.add(new Box(40));
        array.add(new Box(1));
        array.add(new Box(20));
        array.add(new Box(9));
        System.out.println(filterBySize(array, 90));

        //задание 1, урок 11
        TreeSet<Box> set = new TreeSet<>(new BiggerBoxSizeComparator());
        set.add(new Box(43));
        set.add(new Box(23));
        set.add(new Box(55));
        set.add(new Box(53));
        for (Box e : set) {
            System.out.println(e);
        }

    }
    public static Collection<Box> filterBySize(Collection<Box> collection, int size){
        //Collection<Box> collectionResult = new ArrayList<>();
        return filterBySize(collection.iterator(), size);
        /*
        for (Box box : collection) {

            if (box.getSize()<size){
                collectionResult.add(box);
            }
        }
        */

    }
    public static Collection<Box> filterBySize(Iterator<Box> iterator, int size){
        Collection<Box> collectionResult = new ArrayList<>();

        while (iterator.hasNext()) {
            System.out.println("HasNext: "+ iterator.hasNext());
            Box box = iterator.next();
            System.out.println("Box: "+ box);
            if (box.getSize()<size){
                collectionResult.add(box);
            }
        }
        return collectionResult;
    }
}
