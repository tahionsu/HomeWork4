package com.org.homework.customqueue;


import java.util.Arrays;

public class CustomQueue<T> {

    private final T[] array;
    private int front;
    private int rear;
    private final int capacity;
    private int count;

    @Override
    public String toString() {
        return "CustomQueue{" +
                "array=" + Arrays.toString(array) +
                ", front=" + front +
                ", rear=" + rear +
                ", capacity=" + capacity +
                ", count=" + count +
                '}';
    }

    @SuppressWarnings("unchecked")
    public CustomQueue(int size) {
        array = (T[]) new Object[size];
        rear = size - 1;
        capacity = size;
        count = 0;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == capacity);
    }

    public void enqueue(T element) {
        if (!isFull()) {
            rear = (rear + 1) % array.length;
            array[rear] = element;
            count++;
        } else {
            throw new IndexOutOfBoundsException("Queue if full");
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            T deqValue = array[front];
            array[front] = null;
            front = (front + 1) % array.length;
            count--;
            return deqValue;
        } else {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
    }

    public int size() {
        return count;
    }

}
