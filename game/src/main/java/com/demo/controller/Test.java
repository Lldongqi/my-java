package com.demo.controller;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(4);
        priorityQueue.add(0);
        priorityQueue.add(2);

        while (priorityQueue.size() != 0){
            System.out.println(priorityQueue.remove());
        }

    }
}
