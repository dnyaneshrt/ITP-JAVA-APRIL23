package com.itp.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue=new ArrayDeque();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);


    }
}
