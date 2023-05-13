package com.itfactory.workshop3.problema9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Prob9 {
    /*
    Se dau două structuri de date: un queue si un stack amblee continand numere intregi.
-	Se cere sa se implementeze un program prin care la fiecare extragere a unui numar din stack, atatea elemente vor fi scoase din queue.
-	Atunci cand nu mai sunt elemente rămase intr-una din structuri se va afișa care din ele a ramas empty.

     */
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty() && !queue.isEmpty()) {
            System.out.println("Elementul extras din stack este: " + stack.pop());
            System.out.println("Elementul extras din queue este: " + queue.poll());
        }
        if (stack.isEmpty()) {
            System.out.println("Stack-ul este gol");
        }
        if (queue.isEmpty()) {
            System.out.println("Queue-ul este gol");
        }


    }
}
