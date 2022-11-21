package com.org.homework.application;

import com.org.homework.customqueue.CustomQueue;

public class Main {

    public static void main(String[] args) {
        try {
            CustomQueue<String> queue = new CustomQueue<>(7);

            String[] stringArray = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh"};

            enQueueProcessing(queue);

            for (int i = 0; i < 7; i++) {
                queue.enqueue(stringArray[i]);
                enQueueProcessing(queue);
            }

            //queue.enqueue("Eighth"); //Exception

            for (int i = 0; i < 7; i++) {
                deqQueueProcessing(queue);
            }

            //queue.dequeue(); //Exception

        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @SuppressWarnings("rawtypes")
    public static void enQueueProcessing(CustomQueue queue) {
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Queue is full: " + queue.isFull());
        System.out.println("Queue's size: " + queue.size());
        System.out.println(queue);
    }

    @SuppressWarnings("rawtypes")
    public static void deqQueueProcessing(CustomQueue queue) {
        System.out.println(queue.dequeue());
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Queue is full: " + queue.isFull());
        System.out.println("Queue's size: " + queue.size());
        System.out.println(queue);
    }

}
