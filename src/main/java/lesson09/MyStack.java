package lesson09;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T>{
    List<T> list = new ArrayList<>();
    public void push(T element){
        list.add(list.size(), element);
    }
    public T pop(){
        T element = list.get(list.size()-1);
        list.remove(list.size()-1);
        return element;
    }
    public T peek(){
        return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("1");
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack); // [1, 1, 2, 3]
        System.out.println(stack.size()); // 4
        System.out.println(stack.pop()); // 3
        System.out.println(stack.size()); // 3
        System.out.println(stack.peek()); // 2
        System.out.println(stack.size()); // 3
        System.out.println(stack); // [1, 1, 2]
    }
}
