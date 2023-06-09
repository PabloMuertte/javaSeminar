package Sim4.homework;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> newStack = new MyStack<>();
        newStack.push(2);

        System.out.println(newStack.pop());

        Deque<Integer> deque = new Deque<>();
        deque.enqueue(4);
        deque.enqueue(6);
        deque.enqueue(3);
        System.out.println(deque.toString());
        System.out.println(deque.dequeue().toString());
        System.out.println(deque.toString());
        System.out.println(deque.first());
    }
}