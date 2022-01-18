package dev.shadmanahmed;


import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    //addFirst
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }
    //addLast
    public void addLast(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
         else {
            last.next = node;
            last = node;
        }

    }
    //deleteFirst
    public void deleteFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last){
            first = last =null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }
    //deleteLast
    public void deleteLast() {
        var current = first;
        while (current != null) {
            if (current.next == last)
                break;
                current = current.next;
        }
    }
    //contains
    public boolean contains(int item){
        var current = first;

        while (current != null){
            if (current.value == item)
                return true;
            current = current.next;
        }
        return false;
    }

    //indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;

        while (current != null){
           if (current.value == item)
               return index;
                current = current.next;
                index++;
        }
        return -1;
    }

    public void reverse(){
        if (isEmpty()){
            return;
        }

        var current = first.next;
        var previous = first;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        var a = first;
        var b = first;

        if (isEmpty()){
            throw new IllegalStateException();
        }

        int distance = k - 1;
        for (int i = distance; i > 0; i--) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }
        while (b != last){
            a = a.next;
            b = b.next;
        }

        return a.value;


    }

}
