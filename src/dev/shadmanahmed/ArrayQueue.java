package dev.shadmanahmed;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int back;
    private int front;
    private int count;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }

    public void enqueue(int num) {
        if(count == queue.length){
            throw new IllegalStateException();
        }
        queue[back] = num;
        back = (back + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        var item =  queue[front];
        queue[front++] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
    }

    public int peek() {
        return (queue[0]);
    }

//    public boolean isEmpty(){
//    }
//
//    public boolean isFull() {
//
//    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
