package lesson09;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DynamicArray <T> implements List <T>{
  public Object [] mas;

    public DynamicArray() {
        mas = new Object[10];
    }

    @Override
    public int size() {
        int size = 0;
        for (int i=0;i< mas.length; i++){
            if (mas[i]!=null){
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean flag = true;
        for (int i=0;i<mas.length;i++){
            if (mas[i] !=null){
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public boolean contains(Object o) {
        boolean flag = false;
        for (int i=0;i< mas.length;i++){
            if (mas[i] !=null && mas[i].equals(o)){
                    return true;
                }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        DynamicArrayIterator dynamicArrayIterator = new DynamicArrayIterator();
        return dynamicArrayIterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects1 = new Object[size()];
        int j=0;
        for (int i=0;i<mas.length;i++){
            if (mas[i]!= null){
                objects1[j]=mas[i];
                j++;
            }
        }
        return objects1;
    }

    @Override
    public boolean add(Object o) {

        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    class DynamicArrayIterator implements Iterator<T>{
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if (mas[currentIndex]!=null){
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            if (hasNext()){
                int i =currentIndex;
                currentIndex++;
                return (T)mas[i+1];
            }
            throw new RuntimeException();
        }
    }
}
