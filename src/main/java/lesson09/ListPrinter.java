package lesson09;

import java.util.ArrayList;
import java.util.List;

public class ListPrinter<T> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void printList(boolean isOdd) {
        for (int i = 0; i < list.size(); i++) {
            if (isOdd) {
                if (i % 2 == 0) {
                    System.out.println(list.get(i));
                }
            } else if (i % 2 != 0) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ListPrinter<String> stringListPrinter = new ListPrinter<>();
        stringListPrinter.add("1");
        stringListPrinter.add("2");
        stringListPrinter.add("3");
        stringListPrinter.add("4");
        stringListPrinter.add("5");
        stringListPrinter.printList(true);
        stringListPrinter.printList(false);
    }
}
