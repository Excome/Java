package ru.queues;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> smQueue = new PriorityQueue(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            smQueue.offer(rnd.nextInt(100) + 1);
        }
        System.out.println(smQueue);
        while(!smQueue.isEmpty()) {
            System.out.println("Int: " + smQueue.poll());
        }
    }
}
