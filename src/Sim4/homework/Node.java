package Sim4.homework;


public class Node<T> {
    Node<T> prevision;
    T value;
    Node(T value){
        this.value = value;
    }
}